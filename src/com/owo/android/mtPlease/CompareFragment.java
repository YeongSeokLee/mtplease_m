package com.owo.android.mtPlease;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CompareFragment extends Fragment {

	WebView webViewCompare;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View mainView = inflater.inflate(R.layout.fragment_compare, container,
				false);

		webViewCompare = (WebView) mainView.findViewById(R.id.webViewCompare);
		WebSettings webSettings = webViewCompare.getSettings();
		webSettings.setJavaScriptEnabled(true);

		webViewCompare.setWebViewClient(new WebViewClient() {

		});
		webViewCompare.setWebChromeClient(new WebChromeClient() {

		});

		webViewCompare.loadUrl("file:///android_asset/pensions_compare_m.html");

		Log.i("CompareFragment - onCreateView", "loaded");

		// TODO Auto-generated method stub
		return mainView;
	}

}