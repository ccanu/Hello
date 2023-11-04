package com.hspedu.System_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        //exit今のプログラムを終了
/*
        System.out.println("ok1");
        //1.exit(0)プログラムを終了とします
        //2. 0，状況を表す、正常な状態
        System.exit((0));
        System.out.println("ok2");
        */
         int[] src = {1,2,3};
         int[] dest = new int[3];//dest当前は{0,0,0,}
        System.arraycopy(src, 0, dest, 1, 3);
        //int[] = src{1,2,3};
        System.out.println("dest=" + Arrays.toString(dest));
    }
}
