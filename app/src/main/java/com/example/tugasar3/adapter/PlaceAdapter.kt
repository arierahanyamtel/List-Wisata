package com.example.tugasar3.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasar3.databinding.ItemPlaceBinding
import com.example.tugasar3.model.Place

class PlaceAdapter(
    private val items: Array<Place>,
    private val onSelect: (Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {


    inner class ViewHolder(private val binding: ItemPlaceBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Place) {
            binding.apply {
                imagePlace.setImageResource(item.image)
                tvTitle.text = item.title
                root.setOnClickListener { onSelect(item) }
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPlaceBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
