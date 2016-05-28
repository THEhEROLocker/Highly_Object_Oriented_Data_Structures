package com.company;

/**
 * Created by hERO on 5/27/16.
 */
public class LLL {
    private Node_Base head;

    public LLL(){
        head = new nullNode();
    }

    public void add(int data){

        head = head.add(data);
    }

    public void display_all(){
        head.display_all();
    }

    public void remove(int to_remove){
        head = head.remove(to_remove);
    }

    public void reverse(){
        head = head.reverse(new nullNode());
    }
}
