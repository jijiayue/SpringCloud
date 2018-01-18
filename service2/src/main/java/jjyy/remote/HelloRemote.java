package jjyy.remote;

import jjyy.remote.remoteImpl.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sunwei0427 on 2018/1/17.
 */

@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
