/*
 *  Copyright 2018 Andrea Bresolin
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

package andreabresolin.kotlincoroutinesexamples.app.network.model

import com.google.gson.annotations.SerializedName

data class Sys(
        @SerializedName("type") val type: Int?,
        @SerializedName("id") val id: Int?,
        @SerializedName("message") val message: Double?,
        @SerializedName("country") val country: String?,
        @SerializedName("sunrise") val sunrise: Int?,
        @SerializedName("sunset") val sunset: Int?,
        @SerializedName("pod") val pod: String?)