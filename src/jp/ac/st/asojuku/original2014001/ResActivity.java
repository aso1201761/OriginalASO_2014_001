package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;

public class ResActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		
		//Randomクラスのインスタンスを作る
		Random rnd = new Random();
		//0から3の4パターンの数字をranに取得
		int ran = rnd.nextInt(4);
		
		switch(ran){
		case 0:
			setContentView(R.layout.daikiti);
			break;
		case 1:
			setContentView(R.layout.chukiti);
			break;
		case 2:
			setContentView(R.layout.kyou);
			break;
		case 3:
			setContentView(R.layout.daikyou);
			break;
		}
	}

}
