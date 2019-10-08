package zxl.com.gchighconcurrency.gchighconcurrencytest.service;

import org.springframework.stereotype.Service;
import zxl.com.gchighconcurrency.gchighconcurrencytest.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class OutOfHeapService {
    public void test2(){
        int b = 0;
        int c = 0;
        while (b<1000000000){
            System.out.println("*************************b:"+b);
            List<Student> students = new ArrayList<>();
            for(int i=0;i<100000;i++){
                b+=1;
                c = b-1;
                Student student = new Student(b,"stu"+b,c,"class"+b);
                students.add(student);
            }

        }
    }
}
