package com.company;

/**
 * Created by hERO on 5/27/16.
 */
public class lNode implements Node_Base{

    int data;
    Node_Base next;

    public lNode(int to_add){
        data = to_add;
        next = new nullNode();
    }

    @Override
    public int display_all() {
        System.out.println(data+"\n");
        return next.display_all();
    }

    //enabled with sorting
    @Override
    public Node_Base add(int to_add) {

        if(data > to_add){
            lNode temp = new lNode(to_add);
            temp.next = this;
            return temp;
        }
        else {
            next = next.add(to_add);
        }

        return this;
    }

    @Override
    public Node_Base remove(int to_remove) {
        if(data == to_remove)
        {
            return next.remove(to_remove);
        }
        else{
            next = next.remove(to_remove);
            return this;
        }
    }

    @Override
    public Node_Base reverse(Node_Base ptr) {
        Node_Base p = next.reverse(this);
        next = ptr;
        return  p;
    }
}
