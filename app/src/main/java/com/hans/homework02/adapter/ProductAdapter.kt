package com.hans.homework02.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hans.homework02.R
import com.hans.homework02.listener.OnItemClickListener
import com.hans.homework02.model.Product

class ProductAdapter(val productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.Companion.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("LLEGO A PRODUCT ADAPTER", "1")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_product, parent, false)
        Log.d("LLEGO A PRODUCT ADAPTER", "2")
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Product = productList[position]

        val name = item.name
        val price = item?.price
        val stock = item.stock

        holder.tvName.text = name
        holder.tvPrice.text = "S/".plus("$price")
        holder.tvStock.text = "Stock".plus("$stock")


    }


    companion object {
        class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            val tvName: TextView = v.findViewById(R.id.tvName)
            val tvPrice: TextView = v.findViewById(R.id.tvPrice)
            val tvStock: TextView = v.findViewById(R.id.tvStock)
        }
    }
}