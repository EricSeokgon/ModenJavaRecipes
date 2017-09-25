package Chapter1;

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
        //Anonymous inner class implementation of Runnable
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable using an anonymous inner class");
            }
        }).start();*/

        //Using a lambda expression in a Thread constructor
        /*new Thread(() -> System.out.println("inside Thread constructor using lambda")).start();*/

        //Assigning a lambda expression to a variable
        Runnable r = () -> System.out.println("lambda expression implementing the run method");
        new Thread(r).start();
    }
}
