package jjyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunwei0427 on 2018/1/16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class Service2Application {
    @RequestMapping("/service2")
    public String service1(){
        return "service2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }
}
