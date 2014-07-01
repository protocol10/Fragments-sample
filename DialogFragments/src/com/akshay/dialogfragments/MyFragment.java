package com.akshay.dialogfragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragment extends DialogFragment implements OnClickListener {

	Button yes, no;

	ICommunicator com;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		com = (ICommunicator) activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.dialog_fragment, null);
		yes = (Button) view.findViewById(R.id.yes);
		no = (Button) view.findViewById(R.id.no);
		yes.setOnClickListener(this);
		no.setOnClickListener(this);
		setCancelable(false);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.no:
			com.showDialogMessage("No");
			dismiss();
			break;
		case R.id.yes:
			com.showDialogMessage("Yes");
			dismiss();
			break;
		default:
			break;
		}
	}

	public interface ICommunicator {
		public void showDialogMessage(String messaage);
	}
}
