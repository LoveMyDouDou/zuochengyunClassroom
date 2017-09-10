/**
 * Created by YangGang on 2017/9/9.
 */
class Node{
    Node left;
    Node right;
}

public class CompleteTree {


    public static int nodeNum(Node head){
        if(head==null){
            return  0;
        }
        return bs(head,1,mostLeftLevel(head,1));
    }

    //node在level层，树的深度是h（不变的）
    //返回以node为根的树一共有多少个节点
    public static int bs(Node node,int l,int h){
        if(l==h){
            return 1;
        }
        if(mostLeftLevel(node.right,l+1)==h){
            return (1<<(h-l))+bs(node.right,l+1,h);
        }
        else {
            return (1<<(h-l-1))+bs(node.left,l+1,h);
        }
    }

    //求一个节点的最左边界是到第几层
    public static int mostLeftLevel(Node node,int level){
        while (node!=null){
            level++;
            node=node.left;
        }
        return level-1;
    }


    //求完全二叉树的节点个数
    public static void main(String [] args){

    }


}
