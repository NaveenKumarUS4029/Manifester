package ran.am.manifester.topic;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


import ran.am.manifester.R;

import ran.am.manifester.s3_v2_viewmodeldemo.MainActivity2;

public class AndroidManifesterCodes extends AppCompatActivity {

    RecyclerView recyclerViewCodes;
    ArrayList<AndroidManifesterModel> modelArrayList2;
    AndroidCodesAdapter androidCodesAdapter;

    String[] title2 = new String[]{
            "Simple Button Click Event and Menu Example",//0
            "Getting data  from EditText",//1
            "Passing Data Between Activity",//2
            "ListView Example",//3
            "Widgets Radio checkbox",//4
            "Date Time Picker",//5
            "Audio Video in Example",//6
            "Start Activity for Result Example",//7
            "Alert and Custom Dialogs",//8
            "WebView Example",//9
            "Turn On Off Wifi Bluetooth",//10
            "Gmap Find current Location",//11
            "SharedPreference Example",//12
            "Notification Example",//13
            "Internal External Storage Example",//14
            "Activity Life Cycle Example",//15
            "Animation in Android",//16
            "Sending Sms and Mail",//17
            "Sensor Example",//18
            "Android Service",//19
            "Fragment Example",//20
            "Fragment with Navigation",//21
            "SQLite Database! CURD operation",//22
            "Internet Based App - Getting data from API/URL using REST API",//23
            "RecyclerView",//24
            "Retrofit Example",//25
            "Ola Uber Swiggy\\nLive location\\nTracking",//26
            "Work Manager Example",//27
            "Simple ROOM Database Example",//28
            "Livedata Example",//29
            "MVVM Example",//30
    };
    String[] subTitle2 = new String[]{
            "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform", "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform",
    };

    int[] image2 = new int[]{

            R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning, R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_manifester_codes);

        recyclerViewCodes = findViewById(R.id.recyclerview_codes);

        recyclerViewCodes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewCodes.setHasFixedSize(true);
        modelArrayList2 = new ArrayList<>();

        androidCodesAdapter = new AndroidCodesAdapter(modelArrayList2,new AndroidCodesAdapter.ItemClickListener(){

            @Override
            public void onItemClick(AndroidManifesterModel details) {

            Toast.makeText(AndroidManifesterCodes.this, "You have selected " + modelArrayList2, Toast.LENGTH_SHORT).show();

                String sel = details.title2;
                switch (sel) {
                    case "Simple Button Click Event and Menu Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, SimpleButtonClickEventListener.class));
                        break;
                    case "Getting data from EditText":
                        startActivity(new Intent(AndroidManifesterCodes.this, GettingDatafromEditText.class));
                        break;
                    case "Passing Data Between Activity":
                        startActivity(new Intent(AndroidManifesterCodes.this, PassingDataBwActivity.class));
                        break;
                    case "ListView Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, ListViewExpl.class));
                        break;
                    case "Widgets Radio checkbox":
                        startActivity(new Intent(AndroidManifesterCodes.this, WidgetsRadioCheck.class));
                        break;
                    case "Date Time Picker":
                        startActivity(new Intent(AndroidManifesterCodes.this, DataTimePicker.class));
                        break;
                    case "Audio Video in Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, AudioVideoExample.class));
                        break;
                    case "Start Activity for Result Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, StartActivityForResultExample.class));
                        break;
                    case "Alert and Custom Dialogs":
                        startActivity(new Intent(AndroidManifesterCodes.this, SimpleAlertDialog.class));
                        break;
                    case "WebView Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, WebviewExample.class));
                        break;
                    case "Turn On Off Wifi Bluetooth":
                        startActivity(new Intent(AndroidManifesterCodes.this, WifiBluetooth.class));
                        break;
                    case "Gmap Find current Location":
                        startActivity(new Intent(AndroidManifesterCodes.this, MapsExpl.class));
                        break;
                    case "SharedPreference Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, SharedPreferenceExample.class));
                        break;
                    case "Notification Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, NotificationExample.class));
                        break;
                    case "Internal External Storage Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, InternalExternalStorage.class));
                        break;
                    case "Activity Life Cycle Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, ActivityLifeCycleExample.class));
                        break;
                    case "Animation in Android":
                        startActivity(new Intent(AndroidManifesterCodes.this, AnimationInAndroid.class));
                        break;
                    case "Sending Sms and Mail":
                        startActivity(new Intent(AndroidManifesterCodes.this, SendingSmsMail.class));
                        break;
                    case "Sensor Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, SensorsInAndroid.class));
                        break;
                    case "Android Service":
                        startActivity(new Intent(AndroidManifesterCodes.this, AndroidServiceExample.class));
                        break;
                    case "Fragment Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, FragmentsExample.class));
                        break;
                    case "Fragment with Navigation":
                        startActivity(new Intent(AndroidManifesterCodes.this, NavigationActivity.class));
                        break;
                    case "SQLite Database! CURD operation":
                        startActivity(new Intent(AndroidManifesterCodes.this, LoginActivity.class));
                        break;
                    case "Internet Based App - Getting data from API/URL using REST API":
                        startActivity(new Intent(AndroidManifesterCodes.this, WebBased.class));
                        break;
                    case "RecyclerView":
                        startActivity(new Intent(AndroidManifesterCodes.this, ReCycleViewExpl.class));
                        break;
                    case "Retrofit Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, SimpleRetrofitExpl.class));
                        break;

                    case "Ola Uber Swiggy\\nLive location\\nTracking":
                        startActivity(new Intent(AndroidManifesterCodes.this, GmapLiveTracking.class));
                        Toast.makeText(AndroidManifesterCodes.this, "it will keep updating when your location changes", Toast.LENGTH_LONG).show();
                        break;

                    case "Work Manager Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, WorkMngrExpl.class));
                        //Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();
                        break;

                    case "Simple ROOM Database Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, MainActivity2.class));
                        //Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();
                        break;

                    case "Livedata Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, MainActivity2.class));
                        //Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();
                        break;

                    case "MVVM Example":
                        startActivity(new Intent(AndroidManifesterCodes.this, ran.am.manifester.s3_v2_viewmodeldemo.MainActivity.class));
                        Toast.makeText(AndroidManifesterCodes.this, "even if rotate the device , data is not lost", Toast.LENGTH_LONG).show();
                        break;

                    // content provider example
                    // firebase examples (all whatever is possible)

                }
            }
        });
        recyclerViewCodes.setAdapter(androidCodesAdapter);
        for (int i = 0; i < title2.length;i++){
            AndroidManifesterModel androidManifesterModel = new AndroidManifesterModel(title2[i],subTitle2[i],image2[i]);
            modelArrayList2.add(androidManifesterModel);
            Log.i("abcd", "onCreate: "+modelArrayList2);
        }
        androidCodesAdapter.notifyDataSetChanged();
    }
}
