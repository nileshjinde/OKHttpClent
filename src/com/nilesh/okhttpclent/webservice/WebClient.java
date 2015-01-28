package com.nilesh.okhttpclent.webservice;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class WebClient {

	private OkHttpClient client;
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	public WebClient() {
		client = new OkHttpClient();
	}

	public String doGetRequest(String url) throws IOException {
		Request request = new Request.Builder()
		.url(url)
		.build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	public String doPostRequest(String url, String json) throws IOException {
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder()
		.url(url)
		.post(body)
		.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

}
