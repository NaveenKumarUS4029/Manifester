package ran.am.manifester;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class TrainingAlbum extends AppCompatActivity {

    WebView trainingAlbm;
    String TAG = "acccc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_album);
      /*Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.google.android.apps.photos"));
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.google.android.apps.photos");
        startActivity(intent);*/

        trainingAlbm = findViewById(R.id.train_albm_web);
        trainingAlbm.setWebViewClient(new WebViewClient());
        trainingAlbm.loadUrl("https://photos.google.com/share/AF1QipOEWqyo79ngdnT8zjSdzL56elzDyVJU6JJXJ7oQs-ST1hRGvSx9gIHp2vTiPLdjNw?pli=1&key=QWwzSVhrOWdxV3QxdmZYVy1sRUYxek94UnlCWnlB");
        trainingAlbm.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;
            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(TrainingAlbum.this);
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