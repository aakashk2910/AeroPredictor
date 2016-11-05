package com.aerotron.aeropredictor.ui.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.aerotron.aeropredictor.R;

public class NewsFragment extends Fragment {

    public NewsFragment() {}

    public static NewsFragment newInstance() {
        return new NewsFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("News");
        View view = inflater.inflate(R.layout.news_fragment, container, false);

        WebView mWebView = (WebView) view.findViewById(R.id.webview);
        mWebView.loadUrl("http://stockcharts.com/articles/");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());


        return view;
    }
}
