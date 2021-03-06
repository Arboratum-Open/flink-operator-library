/**
 * Copyright 2016 Otto (GmbH & Co KG)
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
package com.ottogroup.bi.streaming.operator.json.converter;

import org.apache.sling.commons.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link JsonObjectToString}
 * @author mnxfst
 * @since May 3, 2016
 *
 */
public class JsonObjectToStringTest {
	
	/**
	 * Test case for {@link JsonObjectToString#map(org.apache.sling.commons.json.JSONObject)} being provided
	 * null as input
	 */
	@Test
	public void testMap_withNullInput() throws Exception {
		Assert.assertEquals("{}", new JsonObjectToString().map(null));
	}
	
	/**
	 * Test case for {@link JsonObjectToString#map(org.apache.sling.commons.json.JSONObject)} being provided
	 * a valid JSON document as input
	 */
	@Test
	public void testMap_withValidInput() throws Exception {
		Assert.assertEquals("{\"test\":\"value\"}", new JsonObjectToString().map(new JSONObject("{\"test\":\"value\"}")));
	}

}
