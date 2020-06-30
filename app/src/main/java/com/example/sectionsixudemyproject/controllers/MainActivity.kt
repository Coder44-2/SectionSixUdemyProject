package com.example.sectionsixudemyproject.controllers

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sectionsixudemyproject.R
import com.example.sectionsixudemyproject.adapters.categoryNormalPortraitAdapter
import com.example.sectionsixudemyproject.services.categoryDataService
import com.example.sectionsixudemyproject.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var adapter: categoryNormalPortraitAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cartProductsImageButton.setOnClickListener {
            val cart_products_activity = Intent(this, CartProductsActivity::class.java)
            startActivity(cart_products_activity)
        }
        seeAllProductsButton.setOnClickListener {
            val all_products_act = Intent(this, AllProductsActivity::class.java)
            startActivity(all_products_act)
        }
        adapter = categoryNormalPortraitAdapter(this, categoryDataService.category) { category ->
            var product_activity = Intent(this, ProductActivity::class.java)
            product_activity.putExtra(EXTRA_CATEGORY, category.name)
            startActivity(product_activity)
        }
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        categoryRecyclerView.layoutManager = layoutManager
        categoryRecyclerView.adapter = adapter
        categoryRecyclerView.setHasFixedSize(true)
    }
}