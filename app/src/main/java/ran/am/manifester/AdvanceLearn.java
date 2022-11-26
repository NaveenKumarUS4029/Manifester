package ran.am.manifester;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class AdvanceLearn extends AppCompatActivity {

    WebView webViewAdvance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_learn);

        webViewAdvance = findViewById(R.id.advanceweb);

        webViewAdvance.setWebViewClient(new WebViewClient());
        webViewAdvance.loadUrl("https://learn.androidmanifester.info/courses/Android-App-Development-by-AndroidManifester-Mr-K-P-Ranjith-62ebc9e80cf2ffa728159d39");
        webViewAdvance.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(AdvanceLearn.this);
                    mProgress.show();
                }
                mProgress.setMessage("Loading " + progress + "%");
                if (progress == 100) {
                    mProgress.dismiss();
                    mProgress = null;
                }
            }
        });
    }
}