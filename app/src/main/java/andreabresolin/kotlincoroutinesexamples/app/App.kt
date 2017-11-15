/*
 *  Copyright 2017 Andrea Bresolin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package andreabresolin.kotlincoroutinesexamples.app

import andreabresolin.kotlincoroutinesexamples.app.di.AppComponent
import andreabresolin.kotlincoroutinesexamples.app.di.AppModule
import andreabresolin.kotlincoroutinesexamples.app.di.DaggerAppComponent
import android.app.Application

class App: Application() {
    companion object {
        private lateinit var app: App

        fun get(): App = app
    }

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        app = this

        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
        appComponent.inject(this)
    }

    fun getAppComponent(): AppComponent? = appComponent
}