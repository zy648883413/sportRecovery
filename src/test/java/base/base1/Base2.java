package base.base1;

import org.testng.annotations.Test;

public class Base2 {
    @Test(groups = "3")
    public void test3() {
        System.out.println("Base2当前线程：" + Thread.currentThread().getId() + "：this is test3");
    }

    @Test(groups = "4")
    public void test4() {
        System.out.println("Base2当前线程：" + Thread.currentThread().getId() + "：this is test4");
    }
}