package jp.blogspot.mohammedari.sensortest;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

import android.hardware.Sensor;
import android.hardware.SensorManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		SensorManager sm = (SensorManager)getSystemService(SENSOR_SERVICE);
		List<Sensor> list = sm.getSensorList(Sensor.TYPE_ALL);
		
		StringBuilder sb = new StringBuilder();	
		for(Sensor s : list)
		{
			sb.append(s.getName() + "\n");
		}
		
		TextView tv = (TextView)findViewById(R.id.list_text);
		tv.setText(sb.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
