package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Base64;

@Service
public class TestService {

//    @Autowired
    public void TestServiceS() {
        System.out.println("hehe");
    }

    @Autowired
    public void test2() {

    }

//    @Autowired
    public void test1() {
        LocalDate localDate = LocalDate.now();
        LocalDateTime start = LocalDateTime.of(localDate.plusDays(-1), LocalTime.MIN);
        LocalDateTime end = LocalDateTime.of(localDate.plusDays(-1), LocalTime.MAX);
        System.out.println(start);
        System.out.println(end);
    }

    public void test() {
        String str = "chenxiliu";
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedStr = new String(decodedBytes);
        System.out.println(decodedStr);

        String afterCmd = "ZXhwb3J0IFJVTl9GTE9XX0xJTks9Jyc7ZXhwb3J0IFJVTl9UT09MX1VTRVI9am9sbHlmYW47ZXhwb3J0IEZJVF9QWV9DT01NT05fTElCPS9kYXRhL2ljYWZlL2ZpdF9vcF90b29sL2xpYi9jdXN0b21fbW9kdWxlcztleHBvcnQgUFlUSE9OUEFUSD0ke0ZJVF9QWV9DT01NT05fTElCfToke1BZVEhPTlBBVEh9O2NkIC9kYXRhL2ljYWZlL29wdG9vbHMvL3RfdXBkYXRlX3RzY19hZ2VudCAmJiBzaCBpbnN0YWxsX3RzY19hZ2VudF82NC5zaA==";
        decodedBytes = Base64.getDecoder().decode(afterCmd);
        decodedStr = new String(decodedBytes);
        System.out.println(decodedStr);
    }

//    public void test() {
//        System.out.println("start");
//    }
}
