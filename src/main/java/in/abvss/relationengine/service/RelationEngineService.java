package in.abvss.relationengine.service;

import java.util.List;

import org.apache.commons.graph.MutableDirectedGraph;
import org.apache.commons.graph.domain.basic.DirectedGraphImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import in.abvss.relationengine.ServiceProperties;
import in.abvss.relationengine.finder.RelationFinder;
import in.abvss.relationengine.finder.RelationFinderFactory;
import in.abvss.relationengine.model.Member;
import in.abvss.relationengine.model.RelationshipHolder;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class RelationEngineService {

    private ServiceProperties serviceProperties;
    private List<Member> memberList;

    private Logger logger = LoggerFactory.getLogger(RelationEngineService.class);
    
    @Autowired
    RelationFinderFactory relationFinderFactory;
    
    MutableDirectedGraph graph = new DirectedGraphImpl();

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
    public MutableDirectedGraph getGraph() {
        return graph;
    }

    public MutableDirectedGraph createRelationshipGraph() {
        
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

        graph.addVertex(member);
        
        for (Member member2 : list) {
            graph.addVertex(member2);
            
            result.getRelation().setMember1(member);
            result.getRelation().setMember2(member2);
            
            graph.addEdge(result.getRelation(), member, member2);
        }
        
    }
}