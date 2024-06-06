package com.harshit1108;

import javax.swing.border.Border;
import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        //First we typecast the object into in wrapper class
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;
//        I1.compareTo(I2)-->Natural sorting order [ASE] -->if we add -I1 than it will become reverse
//         I2.compareTo(I1)--> Customized sorting order [DES] //[6, 5, 4]
        return -I1.compareTo(I2); //[6, 5, 4]
    }
}

/*
Note:
Comparable ment for default natural sorting order--compareTo()
- return -ve [if obj1 comes before obj2] -->2 5
- return +ver [if obj1 comes after obj2] -->5 2
- return 0 if both object are equal

Comparator is ment for customized sorting order--> int compare( Object o1, Object o2)
//same properties in case for natural sorting - vice-versa for opposite
equal method implementation is not required because is by default available
*/
