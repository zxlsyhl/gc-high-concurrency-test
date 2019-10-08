package zxl.com.gchighconcurrency.gchighconcurrencytest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zxl.com.gchighconcurrency.gchighconcurrencytest.service.OutOfHeapService;

@RestController
public class HeapController {
    @Autowired
    private OutOfHeapService outOfHeapService;

    @GetMapping("/test2")
    public void test2(){
        outOfHeapService.test2();
    }
}
