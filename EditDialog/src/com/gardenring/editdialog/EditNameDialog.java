package com.gardenring.editdialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class EditNameDialog extends DialogFragment implements
		OnEditorActionListener, TextWatcher {

	EditText edit_text_view;
	TextView name;
	ICommunicator communicator;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		communicator = (ICommunicator) activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.edit_fragment, container, false);
		edit_text_view = (EditText) view.findViewById(R.id.edit_text);
		name = (TextView) view.findViewById(R.id.name);
		getDialog().setTitle("Hello");
		edit_text_view.requestFocus();
		
		edit_text_view.setOnEditorActionListener(this);
		name.addTextChangedListener(this);
		return view;
	}

	public interface ICommunicator {

		public void respond(String message);
	}

	@Override
	public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
		// TODO Auto-generated method stub
		// name.setText(edit_text_view.getText().toString());
		communicator.respond(edit_text_view.getText().toString());
		dismiss();
		return false;
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		name.setText(s.toString());
	}

}
