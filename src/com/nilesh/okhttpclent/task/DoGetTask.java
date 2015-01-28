package com.nilesh.okhttpclent.task;

import java.io.IOException;

import com.nilesh.okhttpclent.webservice.WebClient;

import android.os.AsyncTask;

public class DoGetTask extends AsyncTask<String, Void, String>{

	@Override
	protected String doInBackground(String... params) {
		 WebClient mClient = new WebClient();
	      String getResponse = null;
		try {
			getResponse = mClient.doGetRequest(params[0]);
			System.out.println(getResponse);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return getResponse;
	}
	
	 @Override
     protected void onPostExecute(String result) {
			System.out.println(result);
     }


}
