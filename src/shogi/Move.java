package shogi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Move implements ActionListener{
	//from to what prmote?
	Pos from,to;
	Koma koma;
	boolean prmote;
	public void actionPerformed(ActionEvent e){
		/* 処理したい内容をここに記述する */
		koma = (Koma)e.getSource();
		System.out.println("ボタン"+koma.toString()+"が押されました．");
	}
}
