package com.yunsom.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author caozhongyu
 * @FileName: AuthApplication
 * @Description:
 * @create 2019/10/29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthApplication {
  public static void main(String[] args){
    SpringApplication.run(AuthApplication.class);
  }


}
