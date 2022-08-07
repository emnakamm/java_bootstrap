package biz.picosoft.Java_bootstrap;
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "biz.picosoft.javabootstrap.controllers")
public class JavaBootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBootstrapApplication.class, args);
	}

}
