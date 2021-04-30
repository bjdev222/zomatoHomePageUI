package com.wolcnore.zomatoui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.holder> {


    private FoodData[] foodData;

    public foodAdapter(FoodData[] foodData) {
        this.foodData = foodData;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.food_layout,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.foodImage.setImageResource(foodData[position].getFoodImage());
        holder.foodName.setText(foodData[position].getFoodName());


    }

    @Override
    public int getItemCount() {
        return foodData.length;
    }

    class  holder extends RecyclerView.ViewHolder{


        CircleImageView foodImage;
        TextView foodName;
        public holder(@NonNull View itemView) {
            super(itemView);

            foodImage=itemView.findViewById(R.id.foodImage);
            foodName=itemView.findViewById(R.id.foodName);
        }
    }
}
