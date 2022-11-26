package ran.am.manifester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StartLearnAdapter extends RecyclerView.Adapter<StartLearnAdapter.RCViewHolder> {

    Context context;
    ArrayList<RCModelLearn> modelArrayList1;
    ItemClickListener mItemClickListener;

    public StartLearnAdapter(ArrayList<RCModelLearn> modelArrayList1, ItemClickListener itemClickListener) {
        this.context = context;
        this.modelArrayList1 = modelArrayList1;
        this.mItemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public RCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rc_start_learn_item, parent, false);
        return new RCViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RCViewHolder holder, int position) {

        RCModelLearn rcModelLearn = modelArrayList1.get(position);
        holder.rc_title1.setText(rcModelLearn.title1);
        holder.rc_subTitle1.setText(rcModelLearn.subTitle1);
        holder.rc_image1.setImageResource(rcModelLearn.image1);

        holder.rc_cardView1.setOnClickListener(view -> {
            mItemClickListener.onItemClick(modelArrayList1.get(position));

        });
    }

    @Override
    public int getItemCount() {
        return modelArrayList1.size();
    }

    public interface ItemClickListener {
        void onItemClick(RCModelLearn details);// we have to create interface for listener
    }


    public class RCViewHolder extends RecyclerView.ViewHolder {

        ImageView rc_image1;
        TextView rc_title1, rc_subTitle1;
        CardView rc_cardView1;

        public RCViewHolder(@NonNull View itemView) {
            super(itemView);
            this.rc_image1 = itemView.findViewById(R.id.rc_img1);
            this.rc_title1 = itemView.findViewById(R.id.rc_title1);
            this.rc_subTitle1 = itemView.findViewById(R.id.rc_subtitle1);
            this.rc_cardView1 = itemView.findViewById(R.id.rc_cardvieww1);

        }
    }
}
