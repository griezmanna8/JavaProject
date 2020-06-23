package study.code;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/5/29
 */
public class Driver implements IDriver {
    public void driver(ICar car) {
        car.run();
    }
}
