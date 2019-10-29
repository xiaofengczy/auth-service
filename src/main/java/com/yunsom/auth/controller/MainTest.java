package com.yunsom.auth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caozhongyu
 * @FileName: MainTest
 * @Description:
 * @create 2019/10/29
 */
@RestController
@Api(tags = {"流程配置相关"})
public class MainTest {

  @GetMapping("/test")
  @ApiOperation(value = "测试项目搭建")
  public String test1(){
    return "success";
  }

}
