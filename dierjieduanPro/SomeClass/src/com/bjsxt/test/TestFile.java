package com.bjsxt.test;

import java.io.File;
import java.io.IOException;

public class TestFile {

    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/movies/功夫熊猫.mp4");
        File f2 = new File("d/movies");

        System.out.println(System.getProperty("user.dir")); // 项目的路径
        File f3 = new File(System.getProperty("user.dir"));

        f1.createNewFile();

    }
}
