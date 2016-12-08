package cloud.simple.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
@EnableEurekaClient
//http://192.168.1.129:8081/user/
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
