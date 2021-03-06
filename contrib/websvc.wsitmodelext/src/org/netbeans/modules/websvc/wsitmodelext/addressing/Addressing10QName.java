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


package org.netbeans.modules.websvc.wsitmodelext.addressing;

import java.util.HashMap;
import javax.xml.namespace.QName;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Martin Grebac
 */
public enum Addressing10QName {
    ENDPOINTREFERENCE(createAddressingQName("EndpointReference")),              //NOI18N
    ANONYMOUS(createAddressingQName("Anonymous")),                              //NOI18N
    ADDRESS(createAddressingQName("Address")),                                  //NOI18N
    ADDRESSINGMETADATA(createAddressingQName("Metadata")),                      //NOI18N
    REFERENCEPROPERTIES(createAddressingQName("ReferenceProperties"));          //NOI18N

    public static final String ADDRESSING10_NS_PREFIX = "wsaw";                 //NOI18N

    public static final String ADDRESSING10_NS_URI = "http://www.w3.org/2005/08/addressing";  //NOI18N
    public static final String ADDRESSING10_NS_URI_EXT = "http://www.w3.org/2006/03/addressing/ws-addr.xsd";  //NOI18N
    public static final String ADDRESSING10_NS_URI_LOCAL = "nbres:/org/netbeans/modules/websvc/wsitmodelext/catalog/resources/ws-addr.xsd";  //NOI18N
    
    public static QName createAddressingQName(String localName){
        return new QName(ADDRESSING10_NS_URI, localName, ADDRESSING10_NS_PREFIX);
    }
    
    Addressing10QName(QName name) {
        qName = name;
    }
    
    public QName getQName(){
        return qName;
    }
    private static Set<QName> qnames = null;
    public static Set<QName> getQNames() {
        if (qnames == null) {
            qnames = new HashSet<QName>();
            for (Addressing10QName wq : values()) {
                qnames.add(wq.getQName());
            }
        }
        return qnames;
    }
    private final QName qName;

    public Map<String, String> getSchemaLocations(boolean local) {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put(ADDRESSING10_NS_URI, local ? ADDRESSING10_NS_URI_LOCAL : ADDRESSING10_NS_URI_EXT);
        return hmap;
    }

    public String getSchemaLocation(String namespace, boolean local) {
        if (ADDRESSING10_NS_URI.equals(namespace)) {
            return local ? ADDRESSING10_NS_URI_LOCAL : ADDRESSING10_NS_URI_EXT;
        }
        return null;
    }

}
