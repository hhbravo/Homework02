package com.hans.homework02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hans.homework02.adapter.ProductAdapter
import com.hans.homework02.data.ProductData
import com.hans.homework02.listener.OnItemClickListener
import com.hans.homework02.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var productAdapter: ProductAdapter
    private var productList: List<Product> = emptyList()
    private var mLayoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewProduct.layoutManager = mLayoutManager

        productList = ProductData.getProductList()
        Log.d("size list", productList.size.toString())


        productAdapter = ProductAdapter(productList)
        recyclerViewProduct.adapter = productAdapter

    }

}
