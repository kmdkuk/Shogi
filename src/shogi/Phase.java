package shogi;

import java.util.ArrayList;

import shogi.Koma.Komainf;

public class Phase {
	Komainf first_board[][] =
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
				board[i][j] = new Koma(first_board[i][j],i,j);
				if(i<4&&first_board[i][j] != Komainf.OUT_OF_BOARD && first_board[i][j] != Komainf.OUT_OF_BOARD)
					board[i][j].setenemy(true);
			}
		}
		hands = new int[2][8];
		moves = new ArrayList<Move>();
	}

	//move update
}
