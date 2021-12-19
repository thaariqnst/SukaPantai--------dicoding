package com.thaariq.sukapantai

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thaariq.sukapantai.data.Beach


class ListBeachAdapter(private val listbeach : ArrayList<Beach>) : RecyclerView.Adapter<ListBeachAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_name)
        var tvLocation : TextView = itemView.findViewById(R.id.tv_location)
        var imgItem : ImageView = itemView.findViewById(R.id.img_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        val view: View= LayoutInflater.from(parent.context).inflate(R.layout.item_row_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListBeachAdapter.ListViewHolder, position: Int) {
        val beach = listbeach[position]
        holder.tvName.text = beach.name
        holder.tvLocation.text = beach.location
        holder.imgItem.setImageResource(beach.image)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA_BEACH,listbeach[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listbeach.size
    }
}