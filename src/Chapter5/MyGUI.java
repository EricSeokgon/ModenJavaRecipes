package Chapter5;

import javax.swing.*;

/**
 * Project: ModenJavaRecipes
 * FileName: Exmaple5_4
 * Date: 2017-12-21
 * Time: 오전 9:46
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MyGUI extends JFrame {
    private JTextField name = new JTextField("Please enter your name");
    private JTextField response = new JTextField("Greeting");
    private JButton button = new JButton("Say Hi");

    public MyGUI() {
        // ... unrelated GUI setup code ...
        String greeting = "Hello, %s!";
        button.addActionListener(e ->
                response.setText(String.format(greeting, name.getText())));
    }
}
