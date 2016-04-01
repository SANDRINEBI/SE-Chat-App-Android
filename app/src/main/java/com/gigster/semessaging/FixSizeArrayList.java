package com.gigster.semessaging;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by anthonylobko on 3/31/16.
 */
public class FixSizeArrayList extends ArrayList<Chat> {
    private int maxSize;
    public FixSizeArrayList(int capacity) {
        super();
        maxSize = capacity;
    }

    public void insertOrdered(Chat c){
        if(this.size()==0)
        {
            this.add(c);
        }
        long cMillis = c.getMillisSinceLastMessage();
        if(cMillis==-1)
        {
            if (this.size()<maxSize) {
                this.add(this.size(), c);
            }
            return;
        }
        for(int index = 0; index<this.size(); index++){
            long thisMillis = this.get(index).getMillisSinceLastMessage();
            if(thisMillis!= -1 && cMillis>thisMillis) {
                this.add(index + 1, c);
                break;
            }else if (thisMillis==-1 || thisMillis>cMillis){
                this.add(index, c);
                break;
            }
        }

        if (this.size() >maxSize) {
            this.remove(this.size()-1);
        }
    }
}
