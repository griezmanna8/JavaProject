package project.model;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/5/9
 */
public abstract class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String username() {
        return this.username;
    }
}
