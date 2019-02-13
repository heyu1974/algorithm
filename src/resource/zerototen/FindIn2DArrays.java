package resource.zerototen;

/**
 * auth:heyu
 * email:heyu.ambition@gmal.com
 *
 *
 * 4. 二维数组中的查找
 *
 *
 * 题目描述
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 * Consider the following matrix:
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 * Given target = 5, return true.
 * Given target = 20, return false.
 **/
public class FindIn2DArrays {

    private static int[][] list = {{1, 4, 7, 11, 15}
                                ,{2, 5,  8, 12, 19}
                                ,{3,   6,  9, 16, 22}
                                ,{10, 13, 14, 17, 24}
                                ,{18, 21, 23, 26, 30}};

    /**
     *
     * @param target
     * @return
     *
     * 从左下角开始比较
     */
    public static boolean find(int[][] li,int target){
        if (li == null || li.length == 0 || li[0].length==0){
            return false;
        }
        int rows = li.length, cols = li[0].length;
        int r = rows-1, c = 0;
        while (r>=0 && c<=cols-1){
            if (target==li[r][c]){
                return true;
            }
            else if (target > li[r][c]){
                c++;
            }
            else r--;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] li = list;
        System.out.println(find(list,5));
        System.out.println(find(list,20));
    }
}
