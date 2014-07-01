package com.example.fragmentflexibleui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFragments extends Fragment implements OnItemClickListener {

	ICommunicator communicator;
	ListView list_view;
	View view;
	ArrayAdapter<String> adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.list_fragment, container, false);
		list_view = (ListView) view.findViewById(R.id.list_view);
		adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Data.items);
		list_view.setAdapter(adapter);
		list_view.setOnItemClickListener(this);
		return view;
	}
	
	public void setCommunicator(ICommunicator communicator)
	{
		this.communicator=communicator;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int index, long id) {
		// TODO Auto-generated method stub
		communicator.respond(index);
	}
	
	public interface ICommunicator{
		
		public void respond(int i);
	}

}
