package shogi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Shogi extends JFrame{
	final int cell_num = 9;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shogi s = new Shogi();
		s.setVisible(true);
	}

	Shogi()
	{
		SpringLayout layout = new SpringLayout();
		setTitle("将棋");
		setBounds(200,200,640,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(layout);


		JPanel b = new JPanel();
		b.setLayout(new GridLayout(cell_num,cell_num));
		b.setPreferredSize(new Dimension(400, 400));
		b.setBackground(Color.ORANGE);

		JButton board[][] = new JButton[cell_num][cell_num];
		for(int i=0;i<cell_num;i++)
		{
			for(int j=0;j<cell_num;j++)
			{
				board[i][j] = new JButton(i + "-" + j);
				//board[i][j].setPreferredSize(new Dimension(10,10));
				b.add(board[i][j]);
			}
		}

		JPanel ehand = new JPanel();
		ehand.setPreferredSize(new Dimension(100, 100));
		ehand.setBackground(Color.RED);
		JPanel phand = new JPanel();
		phand.setPreferredSize(new Dimension(100, 100));
		phand.setBackground(Color.YELLOW);

		layout.putConstraint(SpringLayout.NORTH, b, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b, 120, SpringLayout.WEST, this);

		layout.putConstraint(SpringLayout.NORTH,ehand , 0, SpringLayout.NORTH, b);
		layout.putConstraint(SpringLayout.EAST,ehand , -10, SpringLayout.WEST, b);

		layout.putConstraint(SpringLayout.SOUTH, phand, 0, SpringLayout.SOUTH, b);
		layout.putConstraint(SpringLayout.WEST, phand, 10, SpringLayout.EAST, b);

		add(ehand);
		add(b);
		add(phand);

	}
}
