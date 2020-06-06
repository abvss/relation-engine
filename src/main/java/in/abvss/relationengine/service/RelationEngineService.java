package in.abvss.relationengine.service;

import java.util.List;

import org.apache.commons.graph.model.DirectedMutableGraph;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import in.abvss.relationengine.ServiceProperties;
import in.abvss.relationengine.finder.RelationFinder;
import in.abvss.relationengine.finder.RelationFinderFactory;
import in.abvss.relationengine.model.Member;
import in.abvss.relationengine.model.Relation;
import in.abvss.relationengine.model.RelationshipHolder;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class RelationEngineService {

    private ServiceProperties serviceProperties;
    private List<Member> memberList;

    private Logger logger = LoggerFactory.getLogger(RelationEngineService.class);
    
    @Autowired
    RelationFinderFactory relationFinderFactory;
    
    DirectedMutableGraph<Member, Relation<Member>> graph = new DirectedMutableGraph();

    public RelationEngineService() {
    }

    public RelationEngineService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public RelationEngineService(List<Member> list, ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
        this.memberList = list;
    }

    public RelationEngineService(List<Member> list) {
        this.memberList = list;
    }

    /**
     * @return the memberList
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /**
     * @param memberList the memberList to set
     */
    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    /**
     * @return the graph
     */
    public DirectedMutableGraph getGraph() {
        return graph;
    }

    public DirectedMutableGraph createRelationshipGraph() {
        
        List<RelationFinder<Member>> finders = relationFinderFactory.getAllPrimaryRelationFinder();
        
        for (Member member : memberList) {
            
            for (RelationFinder<Member> relationFinder : finders) {
                RelationshipHolder<Member> result =  relationFinder.find(member, memberList);
                if (result != null) {
                    populateGraph(result);
                }
            }
        }
        return graph;
    }

    private void populateGraph(RelationshipHolder<Member> result) {
        
        Member member = result.getMember();
        List<Member> list = result.getList();

        if (!graph.containsVertex(member)) {
            graph.addVertex(member);
        }
        
        for (Member member2 : list) {
            if (!graph.containsVertex(member2)) {
                graph.addVertex(member2);
            }
            
            result.getRelation().setMember1(member);
            result.getRelation().setMember2(member2);
            
            graph.addEdge(member,result.getRelation(), member2);
        }
        
    }
}