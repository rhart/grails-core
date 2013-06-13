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
package org.codehaus.groovy.grails.web.taglib.jsp;

/**
 * @author Graeme Rocher
 * @since 28-Feb-2006
 */
public class JspDatePickerTag extends JspInvokeGrailsTagLibTag {
    private static final long serialVersionUID = 3331667092741188327L;

    private static final String TAG_NAME = "datePicker";

    private String name;
    private String value;
    private String precision;

    public JspDatePickerTag() {
        setTagName(TAG_NAME);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }
}
