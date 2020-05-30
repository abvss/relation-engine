package in.abvss.relationengine;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("relation.service")
public class ServiceProperties {

  /**
   * A message for the service.
   */
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}