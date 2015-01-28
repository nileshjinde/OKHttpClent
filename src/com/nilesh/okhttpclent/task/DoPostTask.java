package com.nilesh.okhttpclent.task;

import java.io.IOException;

import com.nilesh.okhttpclent.webservice.WebClient;

import android.os.AsyncTask;

public class DoPostTask extends AsyncTask<String, Void, String>{

	@Override
	protected String doInBackground(String... params) {
		 WebClient mClient = new WebClient();
	      String json = params[0];
	      String postResponse = null;
		try {
			postResponse = mClient.doPostRequest("http://www.roundsapp.com/post", json);
			System.out.println(postResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return postResponse;
	}
	
	 @Override
     protected void onPostExecute(String result) {
			System.out.println(result);
     }


}
