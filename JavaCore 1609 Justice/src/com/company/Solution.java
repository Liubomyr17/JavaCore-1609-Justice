package com.company;

/*

1609 Justice
1. Understand what the program does.
2. All mice should be eaten at the same time.
3. Consider what method allows the alpha male mouse to be the first, and why other mice wait.
4. Remove the call to this method.

Requirements:
1. The output of the program should show that first all the mice started eating, and then all finished.
2. The join method should not be called on Mouse objects.
3. The program must create 3 Mouse objects.
4. Do not change the methods that are responsible for output to the console.
 */

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
        //alpha.join();
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eating() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " starts eating");
            eating();
            System.out.println(getName() + " finished eating");
        }
    }
}



