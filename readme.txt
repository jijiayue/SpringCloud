启动类  +  @EnableFeignClients   Feign

熔断器  application.properties添加这一条：   feign.hystrix.enabled=true
     在HelloRemote类添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
     @FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
