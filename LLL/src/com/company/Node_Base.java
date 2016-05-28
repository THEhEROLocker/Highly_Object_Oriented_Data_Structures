package com.company;

/**
 * Created by hERO on 5/26/16.
 */
public interface Node_Base {

    Node_Base remove(int to_remove);
    Node_Base add(int to_add);
    int display_all();
}
