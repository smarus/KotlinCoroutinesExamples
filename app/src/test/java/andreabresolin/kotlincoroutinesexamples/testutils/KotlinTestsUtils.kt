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

package andreabresolin.kotlincoroutinesexamples.testutils

import org.mockito.ArgumentMatchers.eq
import org.mockito.Mockito.`when`
import org.mockito.stubbing.OngoingStubbing

interface KotlinTestsUtils {
    companion object {
        fun eqString(string: String): String {
            eq(string)
            return string
        }

        fun <T> whenever(methodCall: T): OngoingStubbing<T> {
            return `when`(methodCall)
        }
    }
}