package in.abvss.relationengine;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import in.abvss.relationengine.service.RelationEngineService;

@SpringBootTest("service.message=Hello")
public class RelationEngineServiceTest {

  @Autowired
  private RelationEngineService service;

  @Test
  public void contextLoads() {
    assertThat(service).isNotNull();
  }

  @SpringBootApplication
  static class TestConfiguration {
  }

}