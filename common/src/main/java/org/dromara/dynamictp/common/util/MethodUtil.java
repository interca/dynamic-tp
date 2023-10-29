/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.dynamictp.common.util;

import java.lang.reflect.Method;

/**
 * MethodUtil related.
 *
 * @author yanhom
 * @since 1.1.5
 */
public final class MethodUtil {

    private MethodUtil() { }

    /**
     * Invoke method and return double value.
     *
     * @param method target method
     * @param targetObj the object the underlying method is invoked from
     * @return result
     */
    public static double invokeAndReturnDouble(Method method, Object targetObj) {
        try {
            return method != null ? (double) method.invoke(targetObj) : 0;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Invoke method and return long value.
     *
     * @param method target method
     * @param targetObj the object the underlying method is invoked from
     * @return result
     */
    public static long invokeAndReturnLong(Method method, Object targetObj) {
        try {
            return method != null ? (long) method.invoke(targetObj) : -1;
        } catch (Exception e) {
            return -1;
        }
    }
}
