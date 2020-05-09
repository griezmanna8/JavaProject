package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.model.ApiResult;
import project.service.TestService;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/5/9
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/api/test")
    public ApiResult test() {
        testService.test();
        return new ApiResult("ok");
    }
}
