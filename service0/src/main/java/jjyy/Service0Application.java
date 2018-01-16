package jjyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunwei0427 on 2018/1/16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service0Application {
    @GetMapping("/service0")
    public String service0(){
        return "service0";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service0Application.class, args);
    }
}
