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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import in.abvss.relationengine.model.Member;
import in.abvss.relationengine.service.RelationEngineService;

@SpringBootApplication
@SpringBootTest("service.message=ABVSS")
public class RelationEngineServiceTest {

  @Autowired
  private RelationEngineService service;
  
  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

  @Test
  public void contextLoads() {
    assertThat(service).isNotNull();
  }

  @Test
  public void testRelation() {

      List<Member> memberList = new ArrayList<Member>();
      
      Member m1 = new Member(1L, "AMEY", "SHAMKANT", "JADIYE", "SHAMKANT", "MURLIDHAR", "JADIYE", "SHAILA", "SHAMKANT", "JADIYE", "APURVA", "AMEY", "JADIYE", "M", new GregorianCalendar(1988, Calendar.DECEMBER, 9).getTime());
      Member m2 = new Member(1L, "SHAMKANT", "MURLIDHAR", "JADIYE", "MURLIDHAR", "RAGHUNATH", "JADIYE", "INDIRA", "MURLIDHAR", "JADIYE", "SHAILA", "SHAMKANT", "JADIYE", "M", new GregorianCalendar(1953, Calendar.AUGUST, 19).getTime());
      Member m3 = new Member(1L, "SHAILA", "SHAMKANT", "JADIYE", "PANDURANG", "SADASHIV", "WADALKAR", "SUSHILA", "PANDURANG", "WADALKAR", "SHAMKANT", "MURLIDHAR", "JADIYE", "F", new GregorianCalendar(1957, Calendar.SEPTEMBER, 3).getTime());
      Member m4 = new Member(1L, "APURVA", "AMEY", "JADIYE", "PRADIP", "PURUSHOTTAM", "BALAPURE", "SANGITA", "PRADIP", "BALAPURE", "AMEY", "SHAMKANT", "JADIYE", "F", new GregorianCalendar(1993, Calendar.JANUARY, 29).getTime());
      
      memberList.add(m1);
      memberList.add(m2);
      memberList.add(m3);
      memberList.add(m4);
      
      service.setMemberList(memberList);
      service.createRelationshipGraph();
      
      MutableDirectedGraph g = service.getGraph();
      
      
      assertThat(g.getEdges().size()).isEqualTo(8);
      assertThat(g.getVertices().size()).isEqualTo(4);
      
  }

  
  
}