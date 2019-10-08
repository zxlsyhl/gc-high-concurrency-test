package zxl.com.gchighconcurrency.gchighconcurrencytest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zxl.com.gchighconcurrency.gchighconcurrencytest.service.OutOfStackService;

@RestController
public class StackController {
    @Autowired
    private OutOfStackService outOfStackService;

    @GetMapping("/testOutOfStack")
    public String testOutOfStack(){
        outOfStackService.testOutOfStack();
        return "success";
    }

    @GetMapping("/test1")
    public String test1(){
        outOfStackService.test1();
        return "success";
    }
}
