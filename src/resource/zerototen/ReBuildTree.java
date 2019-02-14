package resource.zerototen;

/**
 * auth:heyu
 * email:heyu.ambition@gmal.com
 * date: 2019/02/14
 *
 *7. 重建二叉树
 *
 *
 * 题目描述
 * 根据二叉树的先序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 * preorder = [3,9,20,15,7]
 * inorder =  [9,3,15,20,7]
 *
 **/
public class ReBuildTree {

    static class Tree{
        private Tree lTree;
        private Tree rTree;
        private int val;
        public Tree(int a){
            this.val=a;
        }
    }

    public static Tree reBuild(int[] pre, int preStart, int preEnd,int[] in, int inStart, int inEnd){
        if (preStart>preEnd||inStart>inEnd){
            return null;
        }
        Tree root = new Tree(pre[preStart]);
        for (int i=inStart;i<=inEnd;i++){
            if (pre[preStart]==in[i]){
                //i-inStart实际上就是当前根的左子树的个数
                root.lTree=reBuild(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.rTree=reBuild(pre,i-inStart+preStart+1,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return root;
    }
    public static Tree rebuid(int [] pre,int [] in) {
        Tree root=reBuild(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }


    public static void main(String[] args) {

        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Tree tree = rebuid(pre,in);
        print(tree);

    }

    public static void print(Tree tree) {
        if (tree.lTree!=null){
            print(tree.lTree);
        }
        System.out.println(tree.val);
        if (tree.rTree!=null){
            print(tree.rTree);
        }
    }
}
