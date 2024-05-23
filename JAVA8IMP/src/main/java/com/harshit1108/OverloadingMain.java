package com.harshit1108;
/*
Method Overloading
Method overloading occurs when multiple methods with the same name exist in the same class
but have different parameter lists (different number of parameters or different types of parameters).
Overloading is determined at compile-time.
Key Points:
Used to increase the readability of the program.
It is a compile-time polymorphism (static binding).
Overloaded methods can have different return types.
Overloaded methods are differentiated based on the method signature (method name + parameter list).
*/
public class OverloadingMain {

    public void m1(OverloadingParent overloadingParent){
        System.out.println("Overloading_Parent");
    }
    public void m1(OverloadingChild overloadingChild){
        System.out.println("Overloading_Child");
    }

    public static void main(String[] args) {

        //Take care by referncetype
        OverloadingMain t = new OverloadingMain();
        OverloadingParent p = new OverloadingParent();
        t.m1(p); //Overloading_Parent
        OverloadingChild c = new OverloadingChild();
        t.m1(c); //Overloading_Child
        OverloadingParent p1 = new OverloadingChild();
        t.m1(p1); //Overloading_Parent
//      OverloadingChild c1 = new OverloadingParent(); -- >Not Possible
    }
}
