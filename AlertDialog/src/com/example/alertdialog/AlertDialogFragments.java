package com.example.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class AlertDialogFragments extends DialogFragment {

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		final String[] list = { "James", "Jason", "Sherlock", "Robben",
				"Zidane", "Bryan" };

		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle("Dialog");
		// builder.setMessage("How is my Dialog");
		builder.setItems(list, new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), list[which] + " was clicked",
						Toast.LENGTH_SHORT).show();
			}
		});
		builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "Negative was clicked",
						Toast.LENGTH_SHORT).show();
			}
		});

		builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "Positive Button was clicked",
						Toast.LENGTH_SHORT).show();
			}
		});

		return builder.create();
	}
}
