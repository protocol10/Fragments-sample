package com.akshay.dialogfragments;

import com.akshay.dialogfragments.MyFragment.ICommunicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickListener,ICommunicator{

	Button show_dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		show_dialog=(Button) findViewById(R.id.Dialog);
		show_dialog.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		FragmentManager manager=getSupportFragmentManager();
		MyFragment fragment=new MyFragment();
		fragment.show(manager, "MyFragment"); 
	}

	@Override
	public void showDialogMessage(String messaage) {
		// TODO Auto-generated method stub
		Log.i("message", messaage);
		Toast.makeText(getApplicationContext(), messaage, Toast.LENGTH_SHORT).show();
	}

}
