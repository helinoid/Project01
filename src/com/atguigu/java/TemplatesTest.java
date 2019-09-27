

package com.atguigu.java;
/**
 * @author Helin
 * @date 19/09/27 - 19:16
 *
 *
 *
 *
 */
public class TemplatesTest {
    public static void main(String[] args) {
        System.out.println("hello");


    //模板三：fori
        String[] arr = new String[]{ "Tom","jerry","Hanmeimei","LIlei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter   【增强for循环】
        for (String s : arr) {
            System.out.println(s);
        }



   
   
    }
   
        



}

