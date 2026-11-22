package com.frn.dependencyinjectionhilt.data

import android.util.Log
import com.frn.dependencyinjectionhilt.domain.Item

class Database {
    fun exampleMethod(item: Item){
        Log.i("ExampleLog", "Database exampleMethod: $item")
    }
}