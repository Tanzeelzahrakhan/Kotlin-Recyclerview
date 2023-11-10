package com.hs.islamic.recyclerviewinkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class FoodAdapter(private  var foodList:ArrayList<FoodModelClass>):RecyclerView.Adapter<FoodAdapter.ViewHolder>(){



    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.imageview)
        val name: TextView = itemView.findViewById(R.id.tvName)

    }



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)

        return ViewHolder(view)


    }


    override fun getItemCount(): Int {
        return foodList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food=foodList[position]

        holder.img.setImageResource(food.image)
        holder.name.text=food.name



        holder.itemView.setOnClickListener{

            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)

            intent.putExtra("food",foodList[position].name)
            intent.putExtra("image",foodList[position].image)

            holder.itemView.context.startActivity(intent)

        }

    }

}
