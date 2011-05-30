package jp.ccube;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.CycleInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Screen11 extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//ボタンを追加して、クリックイベント紐付け
		Button button = new Button(this);
		button.setText("Click!");
		button.setWidth(LayoutParams.WRAP_CONTENT);
		button.setHeight(LayoutParams.WRAP_CONTENT);
		button.setGravity(Gravity.CENTER);
		
		// TODO layout_gravityをどうやって設定する？
//		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//		params.gravity = Gravity.CENTER;
//		button.setLayoutParams(params);
//		button.
		
		button.setOnClickListener(this);
		TextView text = (TextView)findViewById(R.id.text);
		text.setText("Screen11");
		
		LinearLayout parent = (LinearLayout)findViewById(R.id.parent);
		parent.addView(button);
	}

	@Override
	public void onClick(View v) {
		//アニメーション定義（サイズ変更）
		ScaleAnimation scale = new ScaleAnimation(
				0.5f,
				5.0f,
				0.5f,
				5.0f,
				v.getWidth() / 2,
				v.getHeight() / 2
		);
		
		//時間指定
		scale.setDuration(200);
		
		//繰り返し回数
		scale.setInterpolator(new CycleInterpolator(0.5f));
		
		v.startAnimation(scale);
	}
}
