package ran.am.manifester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class StartLearn extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RCModelLearn> modelArrayList1;
    StartLearnAdapter startLearnAdapter;


    String[] title1 = new String[]{
            "Basic",
            "Advance",
            "Learning Platform",
    };
    String[] subTitle1 = new String[]{
            "Start Learn with basic level",
            "Start Learn with advance level",
            "Start Learn with this Platform",
    };

    int[] image1 = new int[]{
            R.drawable.readingbook, R.drawable.book,
            R.drawable.onlinelearning,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_learn);


        recyclerView = findViewById(R.id.recycler);
//        StartLearn.this.setTitle("Learning Platform");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        modelArrayList1 = new ArrayList<>();

        startLearnAdapter = new StartLearnAdapter(modelArrayList1,new StartLearnAdapter.ItemClickListener() {
            @Override
            public void onItemClick(RCModelLearn details) {

//                Toast.makeText(StartLearn.this, "clicked", Toast.LENGTH_SHORT).show();


                showToast(details.title1+ " Clicked!");
                String sel = details.title1;
                switch (sel){
                    case "Basic":
                        Intent basic = new Intent(StartLearn.this,BasicsActivity.class);
                        startActivity(basic);
                        break;
                    case "Advance":
                        Intent advance = new Intent(StartLearn.this,AdvanceLearn.class);
                        startActivity(advance);
                        break;

                    case "Learning Platform":
                        Intent learn = new Intent(StartLearn.this,LearnWeb.class);
                        startActivity(learn);
                        break;
                }
            }
    });

        recyclerView.setAdapter(startLearnAdapter);

        for (int i = 0; i < title1.length; i++) {
            RCModelLearn rcModelLearn = new RCModelLearn(title1[i], subTitle1[i], image1[i]);
            modelArrayList1.add(rcModelLearn);
        }
        startLearnAdapter.notifyDataSetChanged();
    }

    public void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}