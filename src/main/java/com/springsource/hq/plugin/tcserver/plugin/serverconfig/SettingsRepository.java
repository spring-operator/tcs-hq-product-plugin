/*
        Copyright (C) 2010-2014 Pivotal Software, Inc.


        All rights reserved. This program and the accompanying materials
        are made available under the terms of the under the Apache License,
        Version 2.0 (the "License”); you may not use this file except in compliance
        with the License. You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */

package com.springsource.hq.plugin.tcserver.plugin.serverconfig;

import org.hyperic.hq.product.PluginException;
import org.hyperic.util.config.ConfigResponse;

import com.springsource.hq.plugin.tcserver.serverconfig.Settings;
import com.springsource.hq.plugin.tcserver.serverconfig.configuration.jvm.Environment;

public interface SettingsRepository {

    void copyFile(ConfigResponse config) throws PluginException;

    boolean fileExists(ConfigResponse config) throws PluginException;

    void prepareFile(ConfigResponse config) throws PluginException;

    void putFile(ConfigResponse config) throws PluginException;

    void revertToPreviousConfiguration(ConfigResponse config) throws PluginException;

    void saveConfiguration(ConfigResponse config, Settings settings) throws PluginException;

    void saveEnvironment(ConfigResponse config, Environment environment) throws PluginException;

}
