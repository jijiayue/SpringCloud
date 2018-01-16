package jjyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sunwei0427 on 2018/1/15.
 */
@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyEurekaServerApplication.class, args);
    }
}
