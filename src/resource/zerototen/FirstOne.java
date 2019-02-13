package resource.zerototen;

import java.util.Arrays;

/**
 * auth:heyu
 * email:heyu.ambition@gmal.com
 *
 * 3. 数组中重复的数字
 *
 * 题目描述
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 (关键点) 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 **/
public class FirstOne {

    /**
     *
     * @param array
     * @param length
     * @return
     *
     * todo 一个bug 在替换之后会有再次替换的可能 导致1个重复数字打印多次
     * 比如 1 0 2 5 3 2  5和2替换之后 会处理一次2  然后到3的时候会和2替换 然后再次处理2 导致打印两次 可添加断点自行测试
     *
     * 好吧 不是bug 没认真读题...以后再做
     */
    public static boolean sort(int[] array,int length){
        if (array==null||length==0){
            return false;
        }
        for (int i =0;i<length;i++){
            while (array[i]!=i){
                if (array[i] == array[array[i]]&&array[i]!=i){
                    System.out.print(array[i]+" ");
                    break;
                }
                try {
                    swap(array,i,array[i]);
                }
                catch (IndexOutOfBoundsException e){
                    return false;
                }
            }
        }
        return true;
    }

    public static void swap(int[] array,int i,int j){
        array[i]^=array[j];
        array[j]^=array[i];
        array[i]^=array[j];
    }


    public static void main(String[] args) {
        int[] li = {1, 0, 2, 5, 3, 2};
        if (!sort(li,li.length)){
            System.out.println("不合法的数组");
        }

        System.out.println();
        for (int i:li) {
            System.out.print(i+" ");
        }
    }
}
