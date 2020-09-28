package com.example.dwi_intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity2);
		
		Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		String value1 = extras.getString("value1");
		if (value1 != null){
			EditText text1 = (EditText) findViewById(R.id.editTextdr1);
			text1.setText(value1);
		}
		
		
		Button btnOpen = (Button) findViewById(R.id.btnClose);
		btnOpen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			finish();//close activty
			}
		});
	}

	@Override
	public void finish() {
		Intent data = new Intent();
		EditText text2 = (EditText) findViewById(R.id.editText2);
		String dataactivity_2 = text2.getText().toString();
		data.putExtra("return_value1", dataactivity_2);
		setResult(RESULT_OK, data);
		super.finish();
		
	}

}
