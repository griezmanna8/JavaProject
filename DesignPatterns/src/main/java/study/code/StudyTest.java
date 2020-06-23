package study.code;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/5/28
 */
public class StudyTest {
    public static final void main(String[] args) throws UnsupportedEncodingException {
//        Driver driver = new Driver();
//        ICar benz = new Benz();
//        driver.driver(benz);
//        ICar bmw = new BMW();
//        driver.driver(bmw);
        String index = "审计系统(fit_auidt_mgr)";
        index = "";
        index = index.substring(index.indexOf("(") + 1, index.indexOf(")"));
        System.out.println(index);
    }
}
