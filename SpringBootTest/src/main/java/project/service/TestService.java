package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    public void TestServiceS() {
        System.out.println("hehe");
    }

    public void test() {
        System.out.println("start");
    }
}
