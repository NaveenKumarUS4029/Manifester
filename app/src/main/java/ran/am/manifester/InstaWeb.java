package ran.am.manifester;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InstaWeb extends AppCompatActivity {

    WebView instaWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_web);


       instaWeb = findViewById(R.id.instaweb);
        ///instaWeb.setWebViewClient(new WebViewClient());
        instaWeb.loadUrl("https://www.instagram.com/androidmanifester/");
        instaWeb.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(InstaWeb.this);
                    mProgress.show();
                }
                mProgress.setMessage("Loading " + progress + "%");
                if (progress == 100) {
                    Toast.makeText(InstaWeb.this, "hi", Toast.LENGTH_SHORT).show();
                    mProgress.dismiss();
                    mProgress = null;
                }
            }
        });
    }
}