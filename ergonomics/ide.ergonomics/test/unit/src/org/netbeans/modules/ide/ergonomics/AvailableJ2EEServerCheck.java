/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.ide.ergonomics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.junit.NbTestCase;
import org.netbeans.modules.server.ServerRegistry;
import org.netbeans.spi.server.ServerWizardProvider;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Pavel Flaska
 */
public class AvailableJ2EEServerCheck extends CommonServersBase {

    public AvailableJ2EEServerCheck(final String name) {
        super(name);
    }
    
    //
    // for CloudNodeCheck
    //
    
    @Override
    protected String forPath() {
        return ServerRegistry.SERVERS_PATH;
    }
    
    @Override
    protected String propPrefix() {
        return "serverwizard.";
    }
    
    //
    // test methods
    //
    
    public void testGetAllServerWizardsReal() {
        doGetAllInstancesReal();
    }

    public void testGetAllServerWizardsErgo() {
        doGetAllInstancesErgo();
    }
}
