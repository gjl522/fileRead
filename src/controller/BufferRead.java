package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {

    public static void main(String[] args) {
        //定义一个空的缓冲流
        BufferedReader buff = null;

        try {
            //将具体文件通过FileReader读取出来
            FileReader fileReader = new FileReader("D:\\WorkCode\\File\\gjl.txt");
            //进行赋值
            buff = new BufferedReader(fileReader);
            String line;
        try {
            while ((line = buff.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("假如这是一条异常信息");
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (buff != null){
                try {
                    buff.close();
                } catch (IOException e) {
                    System.out.println("这又是一条异常信息");
                }
            }
        }
        System.out.println("这是002号分支666666666666666666666");


    }
    }