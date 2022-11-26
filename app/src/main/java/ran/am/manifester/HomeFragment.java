package ran.am.manifester;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ran.am.manifester.topic.AndroidManifesterCodes;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<RCModel> modelArrayList;
    RCAdapter rcAdapter;

    String[] title = new String[]{
            "Topics to be Learned \n and its output",
            "Course Syllabus",
            "Reviews",
            "About us",
            "Start Learning",
            "Contact us",
            "Training Album",
            "Github"
    };
    String[] subTitle = new String[]{
          "Contains basic Topics programs",
          "Contains Syllabus",
          "You can review here",
          "About us With my profile",
          "Start Learn in this Platform",
          "Contact us of our Location",
          "Here you can see my Training Album",
          "Get a android codes from Github"
    };
    int[] image = new int[]{
            R.drawable.checklist, R.drawable.syllabus,
            R.drawable.comment, R.drawable.personaldata,
            R.drawable.read, R.drawable.phone,
            R.drawable.gallery_img, R.drawable.github
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        getActivity().setTitle("Dashboard");


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        modelArrayList = new ArrayList<>();

        rcAdapter = new RCAdapter(modelArrayList, new RCAdapter.ItemClickListener() {
            @Override
            public void onItemClick(RCModel details) {

                showToast(details.title + " Clicked!");
                String sel = details.title;

                switch (sel){
                    case "Topics to be Learned \n and its output":
                        Intent topics = new Intent();
                        topics.setClass(getActivity(), AndroidManifesterCodes.class);
                        getActivity().startActivity(topics);
                        Log.e("aaaa", "onItemClick: "+AndroidManifesterCodes.class);
                        break;

                    case "Course Syllabus":
                        Intent sylabus = new Intent();
                        sylabus.setClass(getActivity(),PDFActivity.class);
                        getActivity().startActivity(sylabus);
                        break;

                    case "Reviews":
                        Intent reviews = new Intent();
                        reviews.setClass(getActivity(),ContactUs.class);
                        getActivity().startActivity(reviews);
                        break;

                    case "About us":

                        Intent about = new Intent();
                        about.setClass(getActivity(),ManifesterGoogWeb.class);
                        getActivity().startActivity(about);
                        break;

                    case "Start Learning":
                        Intent Learning = new Intent();
                        Learning.setClass(getActivity(),StartLearn.class);
                        getActivity().startActivity(Learning);
                        break;

                    case "Contact us":
//                        Intent Contact = new Intent();
//                        Contact.setClass(getActivity(),ContactUs.class);
//                        getActivity().startActivity(Contact);
                        String uri = "https://maps.app.goo.gl/ztKMhdEWzjAN5MTGA";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);
                        break;

                    case "Training Album":
                        Intent Album = new Intent();
                        Album.setClass(getActivity(),TrainingAlbum.class);
                        getActivity().startActivity(Album);
                        break;

                    case "Github":
                        Intent Github = new Intent();
                        Github.setClass(getActivity(),GithubWeb.class);
                        getActivity().startActivity(Github);
                        break;

                }
            }
        });

        recyclerView.setAdapter(rcAdapter);

        for (int i = 0; i < title.length; i++) {
            RCModel rcModel = new RCModel(title[i],subTitle[i], image[i] );
            modelArrayList.add(rcModel);
        }
        rcAdapter.notifyDataSetChanged();

        return view;
    }
    public void showToast(String msg){
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}