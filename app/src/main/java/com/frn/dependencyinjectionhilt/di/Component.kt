package com.frn.dependencyinjectionhilt.di

import com.frn.dependencyinjectionhilt.data.Database
import com.frn.dependencyinjectionhilt.data.ExampleRepositoryImpl
import com.frn.dependencyinjectionhilt.domain.ExampleUseCase
import com.frn.dependencyinjectionhilt.presentation.ExampleViewModel
import com.frn.dependencyinjectionhilt.presentation.MainActivity

class Component {

    private val database = Database()
    private val exampleRepository = ExampleRepositoryImpl(database)
    private val exampleUseCase = ExampleUseCase(exampleRepository)
    private val exampleViewModel = ExampleViewModel(exampleUseCase)

    fun inject(mainActivity: MainActivity){
        mainActivity.exampleViewModel = exampleViewModel
    }
}