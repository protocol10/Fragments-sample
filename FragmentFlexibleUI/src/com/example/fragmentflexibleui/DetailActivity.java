package com.example.fragmentflexibleui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class DetailActivity extends FragmentActivity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		Intent intent=getIntent();
		int index=intent.getIntExtra("index", 0);
		DetailsFragment detailsFragment=(DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
		if(detailsFragment!=null)
			detailsFragment.changeText(index);
		
	}
}
