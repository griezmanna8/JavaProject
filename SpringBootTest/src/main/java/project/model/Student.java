package project.model;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/5/9
 */
public class Student extends User {

    private String school;

    private Student(String username) {
        super(username);
    }

    public static Student valueOf(String username) {
        return new Student(username);
    }
}
