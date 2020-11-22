package io.lositha.swaggersample.resource.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class Stage {
  private String id, name, phone;
  private MultipartFile multipartFile;
}
