package com.chao.arithmetic.chapter1;

import java.util.Stack;

/**
 * 设计一个有 getMin 功能的栈
 */
public class Example1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Example1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum < this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            // do nothing here
        }
        int value = this.stackData.pop();
        if(value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }
    public int getmin(){
        if(this.stackMin.isEmpty()){
            // do nothing here
        }
        return this.stackMin.peek();
    }

}
