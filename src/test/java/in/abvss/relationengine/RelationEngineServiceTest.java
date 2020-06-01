package in.abvss.relationengine;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.graph.MutableDirectedGraph;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import in.abvss.relationengine.model.Member;
import in.abvss.relationengine.model.Relation;
import in.abvss.relationengine.service.RelationEngineService;

@SpringBootApplication
@SpringBootTest("service.message=ABVSS")
public class RelationEngineServiceTest {

  @Autowired
  private RelationEngineService service;
  
  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
  
  private Logger logger = LoggerFactory.getLogger(RelationEngineService.class);


  @Test
  public void contextLoads() {
    assertThat(service).isNotNull();
  }

  @Test
  public void testRelation() {

      List<Member> memberList = new ArrayList<Member>();
      
      Member m1 = new Member(1L, "AMEY", "SHAMKANT", "JADIYE", "SHAMKANT", "MURLIDHAR", "JADIYE", "SHAILA", "SHAMKANT", "JADIYE", "APURVA", "AMEY", "JADIYE", "M", new GregorianCalendar(1988, Calendar.DECEMBER, 9).getTime());
      Member m2 = new Member(2L, "SHAMKANT", "MURLIDHAR", "JADIYE", "MURLIDHAR", "RAGHUNATH", "JADIYE", "INDIRA", "MURLIDHAR", "JADIYE", "SHAILA", "SHAMKANT", "JADIYE", "M", new GregorianCalendar(1953, Calendar.AUGUST, 19).getTime());
      Member m3 = new Member(3L, "SHAILA", "SHAMKANT", "JADIYE", "PANDURANG", "SADASHIV", "WADALKAR", "SUSHILA", "PANDURANG", "WADALKAR", "SHAMKANT", "MURLIDHAR", "JADIYE", "F", new GregorianCalendar(1957, Calendar.SEPTEMBER, 3).getTime());
      Member m4 = new Member(4L, "APURVA", "AMEY", "JADIYE", "PRADIP", "PURUSHOTTAM", "BALAPURE", "SANGITA", "PRADIP", "BALAPURE", "AMEY", "SHAMKANT", "JADIYE", "F", new GregorianCalendar(1993, Calendar.JANUARY, 29).getTime());
      Member m5 = new Member(5L, "PRADNYA", "VIJAY", "PATNE", "SHAMKANT", "MURLIDHAR", "JADIYE", "SHAILA", "SHAMKANT", "JADIYE", "VIJAY", "SUDHAKAR", "PATNE", "F", new GregorianCalendar(1984, Calendar.DECEMBER, 17).getTime());
      Member m6 = new Member(6L, "PRAJWAL", "PRADIP", "BALAPURE", "PRADIP", "PURUSHOTTAM", "BALAPURE", "SANGITA", "PRADIP", "BALAPURE", "", "", "", "M", new GregorianCalendar(1999, Calendar.OCTOBER, 19).getTime());
      
      memberList.add(m1);
      memberList.add(m2);
      memberList.add(m3);
      memberList.add(m4);
      memberList.add(m5);
      memberList.add(m6);
      
      
      service.setMemberList(memberList);
      
      
      MutableDirectedGraph g = service.createRelationshipGraph();
      
       for (Object rel : g.getEdges()) {
           Relation<Member> relation = (Relation<Member>)rel;
        
        logger.info(relation.getMember2().getFirstName() +" is a "+ relation.getRelationName() + " of " + relation.getMember1().getFirstName());

       } 
          
      
      
      
      assertThat(g.getVertices().size()).isEqualTo(6);
      assertThat(g.getEdges().size()).isEqualTo(16);
      
  }
  
}