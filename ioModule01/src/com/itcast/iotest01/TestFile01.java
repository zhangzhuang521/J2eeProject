package com.itcast.iotest01;

import java.io.File;
import java.io.IOException;

public class TestFile01 {
    public static void main(String[] args) throws IOException {
        //创建file对象
        File f1 = new File("D:\\日常练习\\a.txt");
        File f2 = new File("D:\\日常练习\\aaa");
        File f3 = new File("aa.txt");
        //使用方法
//        String absolutePath = f1.getAbsolutePath();
//        String path = f1.getPath();
//        System.out.println(absolutePath);
//        System.out.println(path);
//        String name = f1.getName();
//        System.out.println(name);
//        String absolutePath = f3.getAbsolutePath();
//        String path = f3.getPath();
//        System.out.println(absolutePath);
//        System.out.println(path);
//        File ioModule01 = new File("ioModule01\\bb.txt");
//        boolean newFile = ioModule01.createNewFile();
        File ioModule01 = new File("ioModule01\\bb.txt");
//        boolean directory = ioModule01.isDirectory();
//        System.out.println(directory);
//        boolean file = ioModule01.isFile();
//        System.out.println(file);
        File file = new File("D:\\");
        File[] listFiles = file.listFiles();
        System.out.println(listFiles);
        for (File listFile : listFiles) {
            System.out.println(listFile);
        }
    }
}
