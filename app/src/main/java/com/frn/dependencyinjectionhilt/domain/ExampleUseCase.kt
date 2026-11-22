package com.frn.dependencyinjectionhilt.domain

import android.util.Log

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke(item: Item){
        Log.i("ExampleLog", "ExampleUseCase invoke: $item")
        repository.exampleMethod(item)
    }
}