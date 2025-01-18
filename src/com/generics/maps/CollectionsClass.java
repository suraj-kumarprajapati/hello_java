package com.generics.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/


class ListItem implements Comparable<ListItem>{
    private int x;

    public ListItem(int x) {
        this.x = x;
    }

    public void setItem(int x) {
        this.x = x;
    }

    public int getItem() {
        return this.x;
    }

    @Override
    public int compareTo(ListItem o) {
        return this.x - o.x;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "x=" + x +
                '}';
    }
}



public class CollectionsClass {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(88);
        list1.add(342);
        list1.add(1);
        list1.add(32);

        Collections.sort(list1);
        int ind = Collections.binarySearch(list1, 1);
        System.out.println("1 is present at : " + ind);  // -ve value means not found

        Collections.shuffle(list1);
        System.out.println(list1);

        System.out.println("Freq of 1 in list1 is : " + Collections.frequency(list1, 1));

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.rotate(list1, 2);
        System.out.println(list1);


        List<ListItem> list2 = new ArrayList<>();
        list2.add(new ListItem(1));
        list2.add(new ListItem(4));
        list2.add(new ListItem(2));
        list2.add(new ListItem(20));


        // using comparator
//        Collections.sort(list2, (a, b) -> a.getItem() - b.getItem());

        // using comparable
        Collections.sort(list2);

        System.out.println(list2);

    }
}
