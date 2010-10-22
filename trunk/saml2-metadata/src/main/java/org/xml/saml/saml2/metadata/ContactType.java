/*
 * Copyright 2010 Katasoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xml.saml.saml2.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="technical"/>
 *     &lt;enumeration value="support"/>
 *     &lt;enumeration value="administrative"/>
 *     &lt;enumeration value="billing"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactTypeType")
@XmlEnum
public enum ContactType {

    @XmlEnumValue("technical")
    TECHNICAL("technical"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("administrative")
    ADMINISTRATIVE("administrative"),
    @XmlEnumValue("billing")
    BILLING("billing"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactType fromValue(String v) {
        for (ContactType c: ContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
