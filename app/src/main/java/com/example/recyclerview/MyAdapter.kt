package com.example.recyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs : List<Song>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = songs[position].title
        holder.description.text = songs[position].description
        var color = "#CCCCCC"
        if(position % 2 == 0){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.title_tv)
        var description = itemView.findViewById<TextView>(R.id.description_tv)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }

}

/* In the onCreateViewHolder method, a LayoutInflater is used to inflate the layout file R.layout.item_view into a View object. This layout file defines the appearance of a single item in the RecyclerView. The inflated view is then passed to the constructor of MyViewHolder, which holds references to the views within the item layout.

The onBindViewHolder method is overridden to bind data to the views of a ViewHolder. This method is called by the RecyclerView to populate the item views with data from the songs list. The position parameter represents the index of the item in the list.
Inside the onBindViewHolder method, the title property of the MyViewHolder is set to the corresponding song title from the songs list using the position parameter. This means that for each item in the RecyclerView, the appropriate song title will be set as the text in the title TextView.

The getItemCount method is overridden to return the size of the songs list. This tells the RecyclerView how many items it needs to display.

The MyViewHolder class is a static inner class that represents a single item view in the RecyclerView. It extends RecyclerView.ViewHolder, which provides the basic functionality for holding references to the views within an item.

n the MyViewHolder class, title and description properties are declared to hold references to the TextView views with IDs title_tv and description_tv, respectively, in the item layout.

 */
