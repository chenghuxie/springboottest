package com.sun3d.why.demo;

/**
 * Created by xiech on 2018/2/23 0023.
 */
@FunctionalInterface
public interface DemoInterface {
    //这个方法可以在实现类中直接使用
    default double sqrt(int a){
        return Math.sqrt(a);
    }

    double calculate(int a);

    //int aaa();
}
