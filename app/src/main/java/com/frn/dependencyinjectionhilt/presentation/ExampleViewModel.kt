package com.frn.dependencyinjectionhilt.presentation

import androidx.lifecycle.ViewModel
import com.frn.dependencyinjectionhilt.domain.ExampleUseCase
import com.frn.dependencyinjectionhilt.domain.Item

class ExampleViewModel(
    private val useCase: ExampleUseCase
) : ViewModel(){

    fun exampleMethod(){
        useCase(Item(id = 0))
    }

}