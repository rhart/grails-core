/*
 * Copyright 2004-2005 GoPivotal, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.grails.web.servlet.mvc.exceptions;

/**
 * Thrown when a closure has an incompatible parameter count for a controller implementation.
 *
 * @author Steven Devijver
 */
public class IncompatibleParameterCountException extends GrailsMVCException {

    private static final long serialVersionUID = -4640531429945836401L;

    public IncompatibleParameterCountException() {
        super();
    }

    public IncompatibleParameterCountException(String message) {
        super(message);
    }

    public IncompatibleParameterCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncompatibleParameterCountException(Throwable cause) {
        super(cause);
    }
}
