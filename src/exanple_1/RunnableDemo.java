package exanple_1;

/**
 * Project: ModenJavaRecipes
 * FileName: RunnableDemo
 * Date: 2017-09-13
 * Time: 오전 11:15
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable using an anonymous inner class");
            }
        }).start();*/

        new Thread(() -> System.out.println("inside runnable using an anonymous inner class")).start();
    }
}
