package jp.ccube;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Screen15 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.autocomp_sample);
		
		//候補の文字列
		String[] data = getResources().getStringArray(R.array.sweets);
		//候補はアダプタで提供
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, data);
		
		//AutoCompleteTextViewに設定
		AutoCompleteTextView view = (AutoCompleteTextView)findViewById(R.id.AutoCompleteTextView01);
		view.setAdapter(adapter);
	}
}
