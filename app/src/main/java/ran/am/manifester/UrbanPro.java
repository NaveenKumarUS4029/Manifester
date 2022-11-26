package ran.am.manifester;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class UrbanPro extends AppCompatActivity {

    WebView urbanpro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urban_pro);

        urbanpro = findViewById(R.id.urbanweb);
        urbanpro.setWebViewClient(new WebViewClient());
        urbanpro.loadUrl("https://www.urbanpro.com/chennai/ranjith-k-p/reviews/7238194");


        urbanpro.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(UrbanPro.this);
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