/*
 *    Copyright 2018 esfak47(esfak47@qq.com)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.esfak47.common.utils

import java.util.*


/**
 * @author Tony
 * Created by tony on 2018/1/16.
 */
object CollectionUtils {
    /**
     * 判断集合是否为空
     * <pre class="code">CollectionUtils.isEmpty(list);</pre>
     *
     * @param collection 集合
     * @return 如果集合为{@code null}或为空是则返回`true`，否则返回`false`
     */
    @JvmStatic
    fun isEmpty(collection: Collection<*>?): Boolean {
        return collection == null || collection.isEmpty()
    }

    @JvmStatic
    fun toStringMap(vararg pairs: String): Map<String, String> {
        val parameters = HashMap<String, String>()
        if (pairs.isNotEmpty()) {
            if (pairs.size % 2 != 0) {
                throw IllegalArgumentException("pairs must be even.")
            }
            var i = 0
            while (i < pairs.size) {
                parameters[pairs[i]] = pairs[i + 1]
                i += 2
            }
        }
        return parameters
    }

    /**
     * 判断map是否为空
     * <pre class="code">CollectionUtils.isEmpty(hashmap);</pre>
     *
     * @param map map集合
     * @return 如果map为{@code null}或为空是则返回`true`，否则返回`false`
     */
    @JvmStatic
    fun isEmpty(map: Map<*, *>?): Boolean {
        return map == null || map.isEmpty()
    }


}
