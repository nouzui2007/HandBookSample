package jp.ccube;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class Screen10 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		LinearLayout parent = (LinearLayout)findViewById(R.id.parent);
		
		//MyButtonを配置
		MyButton button = new MyButton(this);
		button.setText("Button!");
		parent.addView(button);
	}
	
	//Buttonクラスを継承したクラス
	class MyButton extends Button {

		public MyButton(Context context) {
			super(context);
		}
		
		/**
		 * 描画時に呼ばれるイベント
		 * <p>
		 * ここで赤字で文字を書く処理を記述する
		 * </p>
		 * @param canvas
		 */
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			
			Paint paint = new Paint();
			paint.setARGB(255, 255, 0, 0);
			canvas.drawText("Draw Text", 20, 20, paint);
		}
	}
}
