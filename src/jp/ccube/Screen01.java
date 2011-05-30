package jp.ccube;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Screen01 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //show Toast
        Toast.makeText(this, "トースト", Toast.LENGTH_LONG).show();
    }
}