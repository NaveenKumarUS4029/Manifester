package ran.am.manifester.topic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


import ran.am.manifester.R;

public class AndroidCodesAdapter extends RecyclerView.Adapter <AndroidCodesAdapter.RCViewHolder>{

    AndroidManifesterCodes context;
    ArrayList<AndroidManifesterModel> modelArrayList2;
    ItemClickListener mItemClickListner;

    public AndroidCodesAdapter(ArrayList<AndroidManifesterModel> modelArrayList2, ItemClickListener ItemClickListner) {
        this.context = context;
        this.modelArrayList2 = modelArrayList2;
        this.mItemClickListner = ItemClickListner;
    }

    @NonNull
    @Override
    public RCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rc_android_manifester_item,parent,false);
        return new RCViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RCViewHolder holder, int position) {
        AndroidManifesterModel androidManifesterModel = modelArrayList2.get(position);
        holder.rc_title2.setText(androidManifesterModel.title2);
        holder.rc_subTitle2.setText(androidManifesterModel.subTitle2);
        holder.rc_image2.setImageResource(androidManifesterModel.image2);


        holder.rc_cardView2.setOnClickListener(view -> {

            mItemClickListner.onItemClick(modelArrayList2.get(position));
        });
    }


    @Override
    public int getItemCount() {
        return modelArrayList2.size();
    }
    public interface ItemClickListener {

        void onItemClick(AndroidManifesterModel details);// we have to create interface for listener
    }

    public class RCViewHolder extends RecyclerView.ViewHolder {

        ImageView rc_image2;
        TextView rc_title2, rc_subTitle2;
        CardView rc_cardView2;

        public RCViewHolder(@NonNull View itemView) {
            super(itemView);


            this.rc_image2 = itemView.findViewById(R.id.rc_img2);
            this.rc_title2 = itemView.findViewById(R.id.rc_title2);
            this.rc_subTitle2 = itemView.findViewById(R.id.rc_subtitle2);
            this.rc_cardView2 = itemView.findViewById(R.id.rc_cardvieww2);

        }
    }
}

//public class AndroidCodesAdapter extends RecyclerView.Adapter<AndroidCodesAdapter.RCViewHolder> {
//    AndroidManifesterCodes context;
//    ArrayList<AndroidManifesterModel> modelArrayList2;
//    ItemClickListener mItemClickListener;
//
//    public AndroidCodesAdapter(ArrayList<AndroidManifesterModel> modell, AndroidCodesAdapter.ItemClickListener itemClickListener) {
//        this.context = context;
//        this.modelArrayList2 = modell;
//        this.mItemClickListener = itemClickListener;
//    }
//
//    @NonNull
//    @Override
//    public AndroidCodesAdapter.RCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View view = layoutInflater.inflate(R.layout.rc_android_manifester_item, parent, false);
//        return new AndroidCodesAdapter.RCViewHolder(view);
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AndroidCodesAdapter.RCViewHolder holder, int position) {
//
//        AndroidManifesterModel androidManifesterModel = modelArrayList2.get(position);
//        holder.rc_title2.setText(androidManifesterModel.title2);
//        holder.rc_subTitle2.setText(androidManifesterModel.subTitle2);
//        holder.rc_image2.setImageResource(androidManifesterModel.image2);
//
//
//        holder.rc_cardView2.setOnClickListener(view -> {
//            mItemClickListener.onItemClick(modelArrayList2.get(position));
//
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return modelArrayList2.size();
//    }
//
//    public interface ItemClickListener {
//        void onItemClick(AndroidManifesterModel details);// we have to create interface for listener
//    }
//
//    public class RCViewHolder extends RecyclerView.ViewHolder {
//
//        ImageView rc_image2;
//        TextView rc_title2, rc_subTitle2;
//        CardView rc_cardView2;
//
//        public RCViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            this.rc_image2 = itemView.findViewById(R.id.rc_img2);
//            this.rc_title2 = itemView.findViewById(R.id.rc_title2);
//            this.rc_subTitle2 = itemView.findViewById(R.id.rc_subtitle2);
//            this.rc_cardView2 = itemView.findViewById(R.id.rc_cardvieww2);
//
//        }
//    }
//}
