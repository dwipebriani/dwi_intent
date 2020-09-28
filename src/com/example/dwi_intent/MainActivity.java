package com.example.dwi_intent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen = (Button) findViewById(R.id.btnOpen);
        
        btnOpen.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v){
        		callIntent();
        	}
			
			
		});
    }
        
 
    
//    method for call SecondActivity
    public void callIntent(){
    	Intent i = new Intent(this,MainActivity2.class);
    	EditText text1 = (EditText) findViewById(R.id.editText1);   
    	String dataactivity_1 = text1.getText().toString();
    	
    	i.putExtra("value1", dataactivity_1);
    	startActivityForResult(i, REQUEST_CODE);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
    	if(resultCode == RESULT_OK && requestCode == REQUEST_CODE){
    		if(data.hasExtra("return_value1")){
    			EditText text2 = (EditText) findViewById(R.id.editTextdr2);
    			text2.setText(data.getExtras().getString("return_value1"));
    		}
    	}
    }
}


 
