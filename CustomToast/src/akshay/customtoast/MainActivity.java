package akshay.customtoast;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button click;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		click=(Button) findViewById(R.id.click);
		click.setOnClickListener(this);
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
		Toast toast=new Toast(this);
		toast.setDuration(Toast.LENGTH_SHORT);
		LayoutInflater inflater=getLayoutInflater();
		View appearance=inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.root));
		toast.setView(appearance);
		toast.show();
	}

}
