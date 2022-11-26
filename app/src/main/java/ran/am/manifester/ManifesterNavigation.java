package ran.am.manifester;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.navigation.NavigationView;

import ran.am.manifester.s3_v2_viewmodeldemo.MainActivity;


public class ManifesterNavigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifester_navigation);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        toggle.syncState();
        drawerLayout.addDrawerListener(toggle);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                break;
//            case R.id.nav_setting:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingFragment()).commit();
//                break;
//            case R.id.nav_share:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ShareFragment()).commit();
//                Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.nav_about:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutFragment()).commit();
//                break;
//            case R.id.nav_exit:
//                Toast.makeText(this, "Successfully Logout!", Toast.LENGTH_SHORT).show();
//                finish();
//                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void logout(MenuItem item) {

        AlertDialog.Builder quit = new AlertDialog.Builder(ManifesterNavigation.this);
        quit.setTitle("Alert");
        quit.setMessage("Are you sure quit the app");
        quit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                Toast.makeText(ManifesterNavigation.this, "Thanks", Toast.LENGTH_SHORT).show();
            }
        });
        quit.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ManifesterNavigation.this, "Continue this Platform", Toast.LENGTH_SHORT).show();
            }
         });
        quit.setNegativeButton("No", null);
        quit.show();


//       MaterialAlertDialogBuilder quit = new MaterialAlertDialogBuilder(ManifesterNavigation.this);
//         quit.setTitle("Alert");
//         quit.setMessage("Are you sure quit the app");
//         quit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                finish();
//                Toast.makeText(ManifesterNavigation.this, "Thanks", Toast.LENGTH_SHORT).show();
//            }
//         });
//         quit.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(ManifesterNavigation.this, "Continue this Platform", Toast.LENGTH_SHORT).show();
//            }
//         });
//         quit.setNegativeButton("No", null);
//         quit.show();
    }

    public void share(MenuItem item) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String Body = "Download this App";
        String Sub = "http://play.google.com";
        intent.putExtra(Intent. EXTRA_TEXT, Body) ;
        intent.putExtra(Intent. EXTRA_TEXT, Sub);
        startActivity(Intent.createChooser(intent,"share using"));
 }

    public void contact(MenuItem item) {
        String uri = "https://maps.app.goo.gl/ztKMhdEWzjAN5MTGA";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }

    public void about(MenuItem item) {
        String uri = "https://www.androidmanifester.in/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }
}