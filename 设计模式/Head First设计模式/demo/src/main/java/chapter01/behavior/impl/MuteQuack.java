package chapter01.behavior.impl;

import chapter01.behavior.QuackBehavior;

/**
 * 具体的“叫”行为类，实现“叫”行为
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...(不会叫)");
    }
}
