package shogi;

public class Koma {
	private boolean ev = false;//成
	private boolean enemy = false;//敵味方
	private Pos pos;
	public enum Komainf{
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
	Komainf koma;
	//駒の動き
	int direct[][] =
		{
			// 8方向
			{0,1},		// ↓
			{1,1},		// ←↓
			{1,0},		// ←
			{1,-1},		// ←↑
			{0,-1},		// ↑
			{-1,-1},	// →↑
			{-1,0},		// →
			{-1,1},		// →↓
			//桂馬飛び
			{-2,1},
			{-2,-1},
		};
	Koma(Komainf k,int suji,int dan)
	{
		koma = k;
		pos = new Pos();
		this.pos.suji = suji;
		this.pos.dan = dan;
	}

	String name[] = {
			"","歩","香","桂","銀","角","飛","金","玉",
			"と","杏","圭","全","馬","竜",
	};

	void setenemy(boolean enemy)
	{
		this.enemy = enemy;
	}

	boolean isSelf()
	{
		return enemy;
	}

	@Override
	public String toString()
	{
		String s="";
		if(enemy)
		{
			s+="e";
		}
		if(ev)
		{
			return s+=name[koma.getnum()+8];
		}
		return s+=name[koma.getnum()];
	}

}
