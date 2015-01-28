package com.nilesh.okhttpclent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.nilesh.okhttpclent.task.DoGetTask;
import com.nilesh.okhttpclent.task.DoPostTask;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void doGetApiCall(View v){
		//GET request
		new DoGetTask().execute(new String[]{"http://www.vogella.com"});
	}

	public void doPostApiCall(View v){
		// issue the post request
		String json = bowlingJson("Jesse", "Jake");
		new DoPostTask().execute(new String[]{json});
	}

	// test data
	private String bowlingJson(String player1, String player2) {
		return "{'winCondition':'HIGH_SCORE',"
				+ "'name':'Bowling',"
				+ "'round':4,"
				+ "'lastSaved':1367702411696,"
				+ "'dateStarted':1367702378785,"
				+ "'players':["
				+ "{'name':'" + player1 + "','history':[10,8,6,7,8],'color':-13388315,'total':39},"
				+ "{'name':'" + player2 + "','history':[6,10,5,10,10],'color':-48060,'total':41}"
				+ "]}";
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
