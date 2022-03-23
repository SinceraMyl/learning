package com.bjsxt.testInterface;

/**
 * 这是一个飞行器的接口
 */
public interface Volant {
    /**
     * 表示飞行器在地球这个星球上的最高高度，单位是：公里
     */
    public static final int MAX_HEIGHT = 100;

    /**
     * 飞行方法，飞行器可以起飞。
     */
    public abstract void fly();

    /**
     * 可以让飞行器停止，如果在空中就是悬停，如果在地上就是静止。
     */
    void stop();
}

/**
 * 善良接口
 */
interface Honest{
    void helpOther();
}




































