package com.unospace.empirespace.data

import com.unospace.empirespace.R
import com.unospace.empirespace.model.ItemModel

class ItemData {
    fun loadData(): List<ItemModel>{
        return listOf<ItemModel>(ItemModel(R.string.string1, R.drawable.image1),
            ItemModel(R.string.string2, R.drawable.image2),
            ItemModel(R.string.string3, R.drawable.image3),
            ItemModel(R.string.string4, R.drawable.image4),
            ItemModel(R.string.string5, R.drawable.image5),
            ItemModel(R.string.string6, R.drawable.image6),
            ItemModel(R.string.string7, R.drawable.image7),
            ItemModel(R.string.string8, R.drawable.image8),
            ItemModel(R.string.string9, R.drawable.image9))
    }
}