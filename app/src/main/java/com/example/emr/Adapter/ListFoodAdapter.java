package com.example.emr.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.emr.Activity.DetailActivity;
import com.example.emr.Domain.Foods;
import com.example.emr.R;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.viewholder> {
    ArrayList<Foods> items;
    Context context;

    public ListFoodAdapter(ArrayList<Foods> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ListFoodAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_list_food, parent, false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFoodAdapter.viewholder holder, int position) {
        holder.titleTxt.setText(items.get(position).getTitle());
        holder.priceTxt.setText(items.get(position).getPrice() + " TL");
        holder.timeTxt.setText(items.get(position).getTimeValue()+" dk");
        holder.starTxt.setText(""+items.get(position).getStar());


        Glide.with(context)
                .load(items.get(position).getImagePath())
                .transform( new RoundedCorners(30))
                .into(holder.pic);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("object", items.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView titleTxt, priceTxt, starTxt, timeTxt;
        ImageView pic;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            priceTxt = itemView.findViewById(R.id.priceTxt);
            starTxt = itemView.findViewById(R.id.starTxt);
            timeTxt = itemView.findViewById(R.id.timeTxt);
            pic = itemView.findViewById(R.id.img);
        }
    }
}
