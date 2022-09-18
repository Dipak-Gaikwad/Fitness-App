package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness_app.R;

import java.util.ArrayList;

import Models.sub_course_model;

public class sub_course_adapter extends RecyclerView.Adapter<sub_course_adapter.viewHolder>
{

    ArrayList<sub_course_model> list;
    Context context;

    public sub_course_adapter(ArrayList<sub_course_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview_sub_course,parent,false);
        return new viewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        sub_course_model model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.subImageView);
            textView = itemView.findViewById(R.id.subTextView);
        }
    }

}
