package com.company;

/**
 * Created by hERO on 5/27/16.
 */
public class nullNode implements Node_Base {

    @Override
    public int display_all() {
        return 0;
    }

    @Override
    public Node_Base add(int to_add) {
        Node_Base t = new lNode(to_add);
        return t;
    }

    @Override
    public Node_Base remove(int to_remove) {
        return this;
    }
}
