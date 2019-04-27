package com.chao.leetcode.middle;

/**
 * 两数相加
 */
public class Question2 {

    public static void main(String[] args) {
        NodeList l1 = new NodeList(2);
        l1.next = new NodeList(4);
        System.out.println(l1);
        NodeList l2 = new NodeList(5);
        l2.next = new NodeList(6);
        System.out.println(l2);
        NodeList sum = sum(l1, l2);
        System.out.println(sum);
    }

    public static NodeList sum(NodeList l1, NodeList l2){
        NodeList result = new NodeList(0);
        int carryVal = 0; //表示进位，取值0或者1
        while(l1 != null && l2 != null){
            int v1 = l1==null?0:l1.val;
            int v2 = l2==null?0:l2.val;
            result.next = new NodeList((v1+v2+carryVal)%10);
            result = result.next;
            carryVal = ((v1+v2+carryVal)>9)?1:0;
            l1= l1.next;
            l2=l2.next;
        }
        return result;
    }
}

class NodeList{
    int val;
    NodeList next;
    NodeList(int val){
        this.val = val;
    }
    public String toString(){
        return "val="+ val;
    }
}
