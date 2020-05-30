package in.abvss.relationengine.service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.commons.graph.MutableDirectedGraph;
import org.apache.commons.graph.domain.basic.DirectedGraphImpl;
import org.apache.commons.graph.visualize.TouchGraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

    public void createRelationshipGraph() {
        
        List<RelationFinder<Member>> finders = relationFinderFactory.getAllPrimaryRelationFinder();
        
        for (Member member : memberList) {
            
            for (RelationFinder<Member> relationFinder : finders) {
                RelationshipHolder<Member> result =  relationFinder.find(member, memberList);
                if (result != null) {
                    populateGraph(result);
                }
            }
        }
        
    }

    private void populateGraph(RelationshipHolder<Member> result) {
        
        Member member = result.getMember();
        List<Member> list = result.getList();

        graph.addVertex(member);
        
        for (Member member2 : list) {
            graph.addVertex(member2);
            graph.addEdge(result.getRelation(), member, member2);
        }
        
    }
}