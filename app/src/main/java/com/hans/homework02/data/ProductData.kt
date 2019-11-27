package com.hans.homework02.data

import com.hans.homework02.model.Product

object ProductData {
    fun getProductList(): List<Product> {
        val mList: MutableList<Product> = arrayListOf()
        mList.add(Product("Lapicero", 1.0, 10, 0))
        mList.add(Product("Borrador", 0.5, 10, 0))
        mList.add(Product("Folders", 1.5, 10, 0))
        mList.add(Product("Cuadernos", 2.0, 10, 0))
        mList.add(Product("Tajador", 0.5, 10, 0))
        mList.add(Product("Hojas Bond", 1.5, 10, 0))
        mList.add(Product("Tajador", 0.5, 10, 0))
        mList.add(Product("Tajador", 0.5, 10, 0))
        return mList.toList()
    }
}