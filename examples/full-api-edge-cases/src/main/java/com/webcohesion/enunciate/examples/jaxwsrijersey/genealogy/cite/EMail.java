/**
 * Copyright © 2006-2016 Web Cohesion (info@webcohesion.com)
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
package com.webcohesion.enunciate.examples.jaxwsrijersey.genealogy.cite;

import javax.xml.bind.annotation.XmlValue;

/**
 * An email address.
 *
 * @author Ryan Heaton
 */
public class EMail {

  private String value;

  /**
   * The value of the e-mail.
   *
   * @return The value of the e-mail.
   */
  @XmlValue
  public String getValue() {
    return value;
  }

  /**
   * The value of the e-mail.
   *
   * @param value The value of the e-mail.
   */
  public void setValue(String value) {
    this.value = value;
  }
}