/*
 * Copyright (C) 2017-2018 Hazuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.hazuki.yuzubrowser.utils.extensions

inline fun <reified T> Any?.isInstanceOf(action: (T) -> Unit) {
    if (this is T) action(this)
}

fun StringBuilder.replace(oldValue: String, newValue: String) {
    var index = indexOf(oldValue)
    while (index >= 0) {
        replace(index, index + oldValue.length, newValue)
        index += newValue.length - oldValue.length
        index = indexOf(oldValue, index)
    }
}