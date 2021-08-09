package com.itcast.iotest01;

import java.io.File;

public class TestFile02 {
    public static void main(String[] args) {
        //删除一个文件夹
        File file1 = new File("D:\\日常练习\\a");
        deleteDir(file1);
    }
    private static void deleteDir(File file1) {
        File[] listFiles = file1.listFiles();
        for (File file : listFiles) {
            if(file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }

        file1.delete();
    }


}
