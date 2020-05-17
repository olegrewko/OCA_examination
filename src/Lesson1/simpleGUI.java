package Lesson1;

import javax.swing.*;

public class simpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(button);
        frame.setSize(200,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        ArrayList myList = new ArrayList();
//        String a = new String("Hura");
//        myList.add("Hura");
//        String b = new String("Frog");
//        myList.add(b);
//        int SIZE = myList.size();
//        Object o = myList.get(1);
//        myList.remove(1);
//        boolean isIN = myList.contains(b);
//        System.out.println(isIN);
//        System.out.println(SIZE);
    }


}
