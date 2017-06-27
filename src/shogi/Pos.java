package shogi;

public class Pos {
	int suji,dan;
	Pos(int suji,int dan)
	{
		this.suji = suji;
		this.dan = dan;
	}
	@Override
	public String toString()
	{
		return "suji="+suji+", dan="+dan;
	}
}
