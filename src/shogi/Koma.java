package shogi;

public class Koma {
	private boolean ev = false;//成
	private boolean enemy = false;//敵味方
	private int pos_x;
	private int pos_y;
	enum komainf{
		FU,
		KY,
		KE,
		GI,
		KI,
		KA,
		HI,
		OU,
	}
	komainf koma;

	Koma(komainf k,int x,int y)
	{
		koma = k;
		pos_x = x;
		pos_y = y;
	}

	String name[] = {
			"歩","香","桂","銀","角","飛","金","玉",
			"と","杏","圭","全","馬","竜",
	};

	boolean isSelf()
	{
		return enemy;
	}

	@Override
	public String toString()
	{
		if(ev)
		{
			return name[koma.ordinal()+8];
		}
		return name[koma.ordinal()];
	}

}
