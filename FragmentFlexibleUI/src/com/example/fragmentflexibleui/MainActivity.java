package com.example.fragmentflexibleui;

import com.example.fragmentflexibleui.ListFragments.ICommunicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements ICommunicator {

	ListFragments listFragments;
	DetailsFragment detailsFragment;
	FragmentManager manager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		manager = getSupportFragmentManager();
		listFragments = (ListFragments) manager
				.findFragmentById(R.id.list_fragment);
		listFragments.setCommunicator(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void respond(int i) {
		// TODO Auto-generated method stub
		detailsFragment = (DetailsFragment) getSupportFragmentManager()
				.findFragmentById(R.id.detail_fragment);

		if (detailsFragment != null&&detailsFragment.isVisible()) {
			detailsFragment.changeText(i);
		} else {
			Intent intent = new Intent(this, DetailActivity.class);
			intent.putExtra("index", i);
			startActivity(intent);
		}

	}

}
