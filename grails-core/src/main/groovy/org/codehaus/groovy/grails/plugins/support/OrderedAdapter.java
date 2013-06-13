/*
 * Copyright 2003-2007 GoPivotal, Inc. All Rights Reserved.
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
package org.codehaus.groovy.grails.plugins.support;

import org.springframework.core.Ordered;

/**
 * Convenience adapter implementation of the Spring {@link Ordered} interface.
 *
 * @author Steven Devijver
 * @since 0.2
 */
public abstract class OrderedAdapter implements Ordered {

    private int order = Integer.MAX_VALUE;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
