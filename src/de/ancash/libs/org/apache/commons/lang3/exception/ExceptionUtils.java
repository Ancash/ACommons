/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.ancash.libs.org.apache.commons.lang3.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Provides utilities for manipulating and examining
 * {@code Throwable} objects.
 *
 * @since 1.0
 */
public class ExceptionUtils {

    /**
     * Used when printing stack frames to denote the start of a
     * wrapped exception.
     *
     * <p>Package private for accessibility by test suite.</p>
     */
    static final String WRAPPED_MARKER = " [wrapped] ";

    /**
     * Gets the stack trace from a Throwable as a String.
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
     *
     * @param throwable  the {@code Throwable} to be examined
     * @return the stack trace as generated by the exception's
     *  {@code printStackTrace(PrintWriter)} method
     */
    public static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

    /**
     * Public constructor allows an instance of {@code ExceptionUtils} to be created, although that is not
     * normally necessary.
     */
    public ExceptionUtils() {
    }
}