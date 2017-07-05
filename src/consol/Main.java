package consol;

public class Main {
	enum Komainf{
		OUT_OF_BOARD(-1),
		EMPTY(0),
		FU(1),
		KY(2),
		KE(3),
		GI(4),
		KI(5),
		KA(6),
		HI(7),
		OU(8);
		private int num;
		private Komainf(int n)
		{
			this.num = n;
		}
		public int getnum()
		{
			return num;
		}
	}
	final Komainf firstBoard[][] =
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
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
