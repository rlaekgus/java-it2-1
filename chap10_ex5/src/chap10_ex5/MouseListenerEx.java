package chap10_ex5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
        private JLabel la = new JLabel("Hello");
        
        public MouseListenerEx() {
        	setTitle("Mouse 이벤트 예제");
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	Container c = getContentPane();
        	c.addMouseListener(new MyMouseListener());
        	
        	c.setLayout(null);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
