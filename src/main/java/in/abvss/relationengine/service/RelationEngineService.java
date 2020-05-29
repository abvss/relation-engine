package in.abvss.relationengine.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import in.abvss.relationengine.ServiceProperties;

@SpringBootApplication
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class RelationEngineService {

  private final ServiceProperties serviceProperties;

  public RelationEngineService(ServiceProperties serviceProperties) {
    this.serviceProperties = serviceProperties;
  }

}