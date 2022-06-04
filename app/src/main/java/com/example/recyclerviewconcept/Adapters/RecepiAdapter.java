package com.example.recyclerviewconcept.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewconcept.Models.RecepiModel;
import com.example.recyclerviewconcept.R;

import java.util.ArrayList;

public class RecepiAdapter extends RecyclerView.Adapter<RecepiAdapter.viewHolders> {
    ArrayList<RecepiModel> list;
    Context context;

    public RecepiAdapter(ArrayList<RecepiModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new viewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolders holder, int position) {
        RecepiModel model=list.get(position);
        holder.imageView.setImageResource(model.getImage());
        holder.textView.setText(model.getText());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewHolders extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView textView;
    public viewHolders(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
    }



}


}
