package shogi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import shogi.Koma.Komainf;

public class Shogi extends JFrame{
	static final int cellNum = 9;
	static final int cellSize = 40;
	static final int handSize = 100;
	static final int margin = 10;
	static final int boardSize = cellNum*cellSize+margin*(cellNum+1);
	static final int windowWidth = margin+handSize+margin+boardSize+margin+handSize+margin;
	static final int windowHeight = margin+boardSize+margin;
	static final Komainf firstBoard[][] =
		{
				{Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.KY,Komainf.KE,Komainf.GI,Komainf.KI,Komainf.OU,Komainf.KI,Komainf.GI,Komainf.KE,Komainf.KY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.EMPTY,Komainf.HI,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.KA,Komainf.EMPTY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.FU,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.EMPTY,Komainf.KA,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.EMPTY,Komainf.HI,Komainf.EMPTY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.KY,Komainf.KE,Komainf.GI,Komainf.KI,Komainf.OU,Komainf.KI,Komainf.GI,Komainf.KE,Komainf.KY,Komainf.OUT_OF_BOARD},
				{Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD,Komainf.OUT_OF_BOARD},
		};
	SpringLayout layout;
	JPanel b;
	Koma board[][];
	JPanel ehand;
	JPanel phand;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shogi s = new Shogi();
		s.pack();
		s.setVisible(true);
		Phase kyokumen = new Phase();
		for(int i=0;i<cellNum;i++)
		{
			for(int j=0;j<cellNum;j++)
			{
				System.out.println(s.board[i][j].toString());
				s.board[i][j].setText(s.board[i][j].toString());
			}
		}

	}

	Shogi()
	{
		layout = new SpringLayout();
		setTitle("将棋");
		//setBounds(200,200,windowWidth,windowHeight);
		getContentPane().setPreferredSize(new Dimension(windowWidth, windowHeight));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(layout);


		b = new JPanel();
		b.setLayout(new GridLayout(cellNum,cellNum));
		b.setPreferredSize(new Dimension(boardSize, boardSize));
		b.setBackground(Color.ORANGE);

		board = new Koma[cellNum][cellNum];
		for(int i=0;i<cellNum;i++)
		{
			for(int j=0;j<cellNum;j++)
			{
				board[i][j] = new Koma(firstBoard[i+1][j+1],i,j);
				if(i<3&&board[i][j].koma!=Komainf.EMPTY)board[i][j].setenemy(true);
				board[i][j].setPreferredSize(new Dimension(cellSize,cellSize));
				if(i==0&&j==0)
				{
					layout.putConstraint(SpringLayout.EAST, board[i][j], margin, SpringLayout.EAST, b);
					layout.putConstraint(SpringLayout.NORTH, board[i][j], margin, SpringLayout.NORTH, b);
				}else if(i==0)
				{
					layout.putConstraint(SpringLayout.EAST, board[i][j], margin, SpringLayout.EAST, b);
					layout.putConstraint(SpringLayout.NORTH, board[i][j], margin, SpringLayout.NORTH, board[i][j-1]);
				}else if(j==0)
				{
					layout.putConstraint(SpringLayout.EAST, board[i][j], margin, SpringLayout.EAST, board[i-1][j]);
					layout.putConstraint(SpringLayout.NORTH, board[i][j], margin, SpringLayout.NORTH, b);
				}else
				{
					layout.putConstraint(SpringLayout.EAST, board[i][j], margin, SpringLayout.EAST, board[i-1][j]);
					layout.putConstraint(SpringLayout.NORTH, board[i][j], margin, SpringLayout.NORTH, board[i][j-1]);
				}
				board[i][j].addActionListener(new Move());
				b.add(board[i][j]);
			}
		}

		ehand = new JPanel();
		ehand.setPreferredSize(new Dimension(handSize, handSize));
		ehand.setBackground(Color.RED);

		phand = new JPanel();
		phand.setPreferredSize(new Dimension(handSize, handSize));
		phand.setBackground(Color.YELLOW);

		layout.putConstraint(SpringLayout.NORTH, b, margin, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b, margin+handSize+margin, SpringLayout.WEST, this);

		layout.putConstraint(SpringLayout.NORTH,ehand , 0, SpringLayout.NORTH, b);
		layout.putConstraint(SpringLayout.EAST,ehand , -margin, SpringLayout.WEST, b);

		layout.putConstraint(SpringLayout.SOUTH, phand, 0, SpringLayout.SOUTH, b);
		layout.putConstraint(SpringLayout.WEST, phand, margin, SpringLayout.EAST, b);

		add(ehand);
		add(b);
		add(phand);

	}
	void setKomaLayout()
	{

	}
}
