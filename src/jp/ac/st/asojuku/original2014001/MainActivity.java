package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		//ボタンをIDで探してボタン変数をつくる
		Button btnOK = (Button)findViewById(R.id.btnOK);
		//ボタン変数にリスナーを登録する
		btnOK.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){//どのボタンが押されたか判定
		case R.id.btnOK://btnOKが押された

			//インテントのインスタンス生成
			Intent intent =new Intent(MainActivity.this, ResActivity.class);
			//次画面のアクティビティ起動
			startActivity(intent);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
