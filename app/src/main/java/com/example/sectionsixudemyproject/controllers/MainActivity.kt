package com.example.sectionsixudemyproject.controllers

import android.content.Intent
import android.os.Bundle
import com.example.sectionsixudemyproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
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
    }
}