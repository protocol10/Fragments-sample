package com.gardenring.editdialog;

import com.gardenring.editdialog.EditNameDialog.ICommunicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements ICommunicator {

	TextView display_text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		display_text=(TextView) findViewById(R.id.display_text);
		showEditDialog();
	}

	private void showEditDialog() {
		// TODO Auto-generated method stub
		FragmentManager mFragmentManager = getSupportFragmentManager();
		EditNameDialog dialog = new EditNameDialog();
		dialog.show(mFragmentManager, "editDialog");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void respond(String message) {
		// TODO Auto-generated method stub
		display_text.setText(message.toString());
	}

}
