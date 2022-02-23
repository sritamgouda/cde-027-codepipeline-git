package com.ms.codepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CdeAwsCodepipelineGitApplication {
   @GetMapping("/")
   public String hello()
   {
	   return "HelloWorld";
   }
   @GetMapping("/welcome")
   public String welcome()
   {
	   return"code pipeline";
   }
   
   @PostMapping("/hello")
   public String sayhello(@RequestBody String name)
   {
	   return name+"welcome to codepipeline ";
   }
	public static void main(String[] args) {
		SpringApplication.run(CdeAwsCodepipelineGitApplication.class, args);
	}

}
