package com.example.sectionsixudemyproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sectionsixudemyproject.R
import com.example.sectionsixudemyproject.models.category

class categoryNormalPortraitAdapter(var context: Context, var categoryList: List<category>, var itemClick: (category) -> Unit) : RecyclerView.Adapter<categoryNormalPortraitAdapter.VwHolder>(){
    inner class VwHolder(itemView: View, var itemClick: (category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        var category_image_view = itemView.findViewById<ImageView>(R.id.categoryImageView)
        var category_name_txt_vw = itemView.findViewById<TextView>(R.id.categoryNameTxtVw)
        fun bindVwHolder(context: Context, category: category) {
            val resourceId = context.resources.getIdentifier(category.img, "drawable", context.packageName)
            category_image_view.setImageResource(resourceId)
            category_name_txt_vw.text = category.name
            itemView.setOnClickListener { itemClick(category) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VwHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.category_recycler_view, parent, false)
        return VwHolder(inflater, itemClick)
    }

    override fun getItemCount(): Int {
        return categoryList.count()
    }

    override fun onBindViewHolder(holder: VwHolder, position: Int) {
        holder.bindVwHolder(context, categoryList[position])
    }
}