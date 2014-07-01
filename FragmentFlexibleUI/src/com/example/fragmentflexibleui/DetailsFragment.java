package com.example.fragmentflexibleui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

	TextView detail_text;
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.detail_fragment, container, false);
		detail_text=(TextView) view.findViewById(R.id.display_text);
		return view;
	}
	
	public void changeText(int i)
	{
		detail_text.setText(Data.details[i].toString());
		
	}

}
