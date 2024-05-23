package com.harshit1108;

//Parent class method override in child class
/*
Method Overriding
Method overriding occurs when a subclass provides a specific implementation of a method
that is already defined in its superclass. The overridden method in the subclass should
have the same name, return type, and parameters as the method in the superclass.
Key Points:
Used for runtime polymorphism.
The access level of the overriding method cannot be more restrictive than the overridden method.
The overriding method can throw narrower or fewer checked exceptions than the overridden method.
The @Override annotation is often used to indicate that a method is being overridden, though it's optional.
*/
public class OverridingMain {

    public static void main(String[] args) {
        OverridingParent p = new OverridingParent();
        p.m1();  //Parent class method m1
        OverridingParent p1 = new OverridingChild();
        p1.m1(); //Child class method m1
        OverridingChild c = new OverridingChild();
        c.m1();  //Child class method m1
//      OverridingChild c1 = new OverridingParent(); -->Not Possible with child reference we can not create parent object

    }
}
