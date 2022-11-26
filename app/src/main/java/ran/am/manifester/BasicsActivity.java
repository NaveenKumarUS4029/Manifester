package ran.am.manifester;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class BasicsActivity extends AppCompatActivity {

    WebView basicWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);


        basicWeb=findViewById(R.id.basicswebview);

        basicWeb.setWebViewClient(new WebViewClient());
        basicWeb.loadUrl("https://learn.androidmanifester.info/courses/Android-Basics-by-AndroidManifester-Mr-K-P-Ranjith-63297724e4b02ef68054efb9");

        basicWeb.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(BasicsActivity.this);
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