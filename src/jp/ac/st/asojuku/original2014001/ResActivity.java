package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		
		//intent取得
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		//Randomクラスのインスタンスを作る
		Random rnd = new Random();
		//0から3の4パターンの数字をranに取得
		int ran = rnd.nextInt(4);
		
		switch(ran){
		case 0:
			setContentView(R.layout.daikiti);
			TextView tv_daikiti = (TextView)findViewById(R.id.name_daikiti);
			tv_daikiti.setText(name+"さん");
			break;
		case 1:
			setContentView(R.layout.chukiti);
			TextView tv_chukiti = (TextView)findViewById(R.id.name_chukiti);
			tv_chukiti.setText(name+"さん");
			break;
		case 2:
			setContentView(R.layout.kyou);
			TextView tv_kyou = (TextView)findViewById(R.id.name_kyou);
			tv_kyou.setText(name+"さん");
			break;
		case 3:
			setContentView(R.layout.daikyou);
			TextView tv_daikyou = (TextView)findViewById(R.id.name_daikyou);
			tv_daikyou.setText(name+"さん");
			break;
		}
	}

}
