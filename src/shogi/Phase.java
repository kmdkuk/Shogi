package shogi;

import java.util.ArrayList;

import shogi.Koma.Komainf;

public class Phase {

	//盤面　　型はKoma?
	Koma board[][] = new Koma[11][11];
	//持ち駒
	int hands[][];
	//手
	ArrayList<Move> moves;

	//初期盤面の作成
	Phase()
	{
		for(int i=0;i<11;i++)
		{
			for(int j=0;j<11;j++)
			{
				board[i][j] = new Koma(Shogi.firstBoard[i][j],i,j);
				if(i<4&&Shogi.firstBoard[i][j] != Komainf.OUT_OF_BOARD && Shogi.firstBoard[i][j] != Komainf.EMPTY)
					board[i][j].setenemy(true);
			}
		}
		hands = new int[2][8];
		moves = new ArrayList<Move>();
	}

	//move update
}
