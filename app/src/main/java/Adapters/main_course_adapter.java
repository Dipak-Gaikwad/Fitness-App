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

import Models.main_course_model;

public class main_course_adapter extends RecyclerView.Adapter<main_course_adapter.viewHolder>
{
    ArrayList<main_course_model> list;
    Context context;

    public main_course_adapter(ArrayList<main_course_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview_main_course,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        main_course_model model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
//        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
