package com.harshit1108.Threads;

/*when harshit accquire hasha key and harha accquire harshit key and
 both not releasing the key that time deadlock occurs*/

public class DeadlockDemo {

    public static void main(String[] args) {
        Object harshit_key = new Object();
        Object harsha_key = new Object();

        Thread harshit = new Thread(() -> {
            synchronized (harshit_key  ){
                System.out.println("Harshit has acquired harsha's key");
                try {
                    System.out.println("Harshit sleeping fr 3 secs");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("harshit woke up");
                synchronized (harsha_key){
                    System.out.println("harshit has got her key");
                }
            }
        });

        /*Above code comment and below code uncomment out to avoid deadlock*/

//        Thread harshit = new Thread(() -> {
//            synchronized (harsha_key){
//                System.out.println("Harshit has acquired harsha's key");
//                try {
//                    System.out.println("harshit sleeping fr 3 secs");
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("harshit woke up");
//                synchronized (harshit_key){
//                    System.out.println("harshit has got her key");
//                }
//            }
//        });


        Thread harsha = new Thread(() -> {
            synchronized (harsha_key){
                System.out.println("Harsha has acquired harshit's key");
                try {
                    System.out.println("Harsha sleeping fr 3 secs");

                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("harsha woke up");

                synchronized (harshit_key){
                    System.out.println("harsha has got her key");
                }
            }
        });

        harshit.start();
        harsha.start();
    }
}


