import javax.swing.*;

import java.awt.*;

public class SwingEx extends JFrame {
	public SwingEx() {
		setTitle("스윙 컴포넌트 보이기 예제");
		createMenu();
		createToolBar();
		createRootPane();
		setSize(500, 400);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("File"));
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));

		this.setJMenuBar(mb);
	}
	
	private void createToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		
		bar.setBackground(Color.LIGHT_GRAY);
		bar.add(new JButton("New"));
		bar.add(new JButton(new ImageIcon("images/open.jpg")));
		bar.addSeparator();
		bar.add(new JButton(new ImageIcon("images/save.jpg")));
		bar.add(new JLabel("search"));
		bar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		bar.add(combo);
		add(bar, BorderLayout.NORTH);
	}
	
	prin\vate void createSplitPane() {