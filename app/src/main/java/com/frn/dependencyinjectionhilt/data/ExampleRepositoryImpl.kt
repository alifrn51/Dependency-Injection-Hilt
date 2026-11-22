package com.frn.dependencyinjectionhilt.data

import android.util.Log
import com.frn.dependencyinjectionhilt.domain.ExampleRepository
import com.frn.dependencyinjectionhilt.domain.Item

class ExampleRepositoryImpl(
    private val database: Database
): ExampleRepository {
    override fun exampleMethod(item: Item) {
        database.exampleMethod(item)
        Log.i("ExampleLog", "ExampleRepositoryImpl exampleMethod: $item")
    }
}