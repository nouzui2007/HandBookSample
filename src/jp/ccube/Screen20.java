package jp.ccube;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class Screen20 extends Activity implements OnCheckedChangeListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiobutton);
		
		//Firstを選択しておく
		RadioGroup rg = (RadioGroup)findViewById(R.id.RadioGroup01);
		
		rg.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int index) {
		Toast.makeText(this, "Selected " + String.valueOf(index), Toast.LENGTH_LONG);
	}

}
