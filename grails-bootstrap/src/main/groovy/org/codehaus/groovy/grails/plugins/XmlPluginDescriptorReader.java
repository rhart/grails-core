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
package org.codehaus.groovy.grails.plugins;

import grails.util.PluginBuildSettings;
import org.codehaus.groovy.grails.io.support.Resource;

/**
 * Reads plugin information from the plugin.xml descriptor.
 *
 * @author Graeme Rocher
 * @since 1.3
 */
public class XmlPluginDescriptorReader implements PluginDescriptorReader {

    private PluginBuildSettings pluginSettings;

    public XmlPluginDescriptorReader(PluginBuildSettings pluginSettings) {
        this.pluginSettings = pluginSettings;
    }

    public GrailsPluginInfo readPluginInfo(Resource pluginDescriptor) {
        try {
            Resource pluginXml = pluginDescriptor.createRelative("plugin.xml");
            if (pluginXml.exists()) {
                return new PluginInfo(pluginXml, pluginSettings);
            }
        }
        catch (Exception e) {
            // ignore
        }
        return null;
    }
}
