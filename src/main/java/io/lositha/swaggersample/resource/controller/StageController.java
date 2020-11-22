package io.lositha.swaggersample.resource.controller;

import io.lositha.swaggersample.resource.model.Stage;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class StageController {


  @PostMapping(
      value = "resolve",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE} )
  public void resolve(
      @RequestParam final MultipartFile file) {
    System.out.println(file.getOriginalFilename());
  }


  @PostMapping(
      value = "load",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE} )
  public void load(
      @RequestParam final Stage stage,
      @RequestParam final MultipartFile file) {
    System.out.println(stage.toString());
    System.out.println(file.getOriginalFilename());
  }


  @PostMapping( value = "stageObject" )
  public void resolve(
      @RequestBody final Stage stage) {
    System.out.println(stage.getMultipartFile().getOriginalFilename());
  }

  @PostMapping( value = "stageObjectWithMultipart" )
  public void stageObjectWithParameter(
      @RequestBody final Stage stage,
      @RequestParam final MultipartFile file) {
    System.out.println(stage.getMultipartFile().getOriginalFilename());
    System.out.println(file.getOriginalFilename());
  }
}
