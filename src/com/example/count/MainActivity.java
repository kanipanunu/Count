package com.example.count;

import java.security.PublicKey;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	int n=0;
	TextView textView,nabeatuText;
	boolean nabeatu=false;
	boolean nabecheck=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView=(TextView) findViewById(R.id.textView);
		nabeatuText=(TextView)findViewById(R.id.textView1);
	}
	public void nabecheck(){
		if((n/3*3)==n){
			nabecheck=true;
		}else if(n/10==3){
			nabecheck=true;
		}else if (n-n/10==3) {
			nabecheck=true;
		}else{
			nabecheck=false;
		}
		
		if(nabeatu==true){
			if(nabecheck==true){
				textView.setTextColor(Color.RED);
			}else{
				textView.setTextColor(Color.BLACK);
			}
		}
	}
	public void plus(View v) {
		n++;
		textView.setText(""+n);
		nabecheck();
}
	public void mainasu(View v) {
		n--;
		textView.setText(""+n);

		nabecheck();
}
	public void clear(View v) {
		n=0;
		textView.setText(""+n);	

		textView.setTextColor(Color.BLACK);
}
	public void nabeatu(View v) {
		nabeatu=!nabeatu;
		if(nabeatu==true){
			nabeatuText.setText("Ç»Ç◊Ç†Ç¬Ç‡Å[Ç«Ç»Ç§");
			nabecheck();
		}else{
			nabeatuText.setText("");
			textView.setTextColor(Color.BLACK);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
