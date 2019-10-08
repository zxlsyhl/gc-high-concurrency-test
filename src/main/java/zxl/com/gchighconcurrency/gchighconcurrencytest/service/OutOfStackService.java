package zxl.com.gchighconcurrency.gchighconcurrencytest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OutOfStackService {
    private int num =0;
    //递归调用 栈溢出
    public void testOutOfStack()
    {
        System.out.println(num);
        testOutOfStack();
        num++;
    }

    @Autowired
    private RestTemplate restTemplate;

    public void test1(){
        int b = 0;
        int c = 0;
        while (b<1000000000){
            System.out.println("*************************b:"+b);
            for(int i=0;i<10000;i++){
                b+=1;
                c = b-1;
                System.out.println("sayHello:"+sayHello());
            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

    }

    public String sayHello(){
        return restTemplate.getForObject("http://192.168.1.2:8887/hello",String.class);
    }



}
