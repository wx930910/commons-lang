/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

/**
 * Test case for ToStringStyle.
 */
public class ToStringStyleTest {

	public static ToStringStyle mockToStringStyle1() {
		long mockFieldVariableSerialVersionUID = 1L;
		ToStringStyle mockInstance = spy(ToStringStyle.class);
		return mockInstance;
	}

	// -----------------------------------------------------------------------
	@Test
	public void testSetArrayStart() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setArrayStart(null);
		assertEquals("", style.getArrayStart());
	}

	@Test
	public void testSetArrayEnd() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setArrayEnd(null);
		assertEquals("", style.getArrayEnd());
	}

	@Test
	public void testSetArraySeparator() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setArraySeparator(null);
		assertEquals("", style.getArraySeparator());
	}

	@Test
	public void testSetContentStart() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setContentStart(null);
		assertEquals("", style.getContentStart());
	}

	@Test
	public void testSetContentEnd() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setContentEnd(null);
		assertEquals("", style.getContentEnd());
	}

	@Test
	public void testSetFieldNameValueSeparator() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setFieldNameValueSeparator(null);
		assertEquals("", style.getFieldNameValueSeparator());
	}

	@Test
	public void testSetFieldSeparator() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setFieldSeparator(null);
		assertEquals("", style.getFieldSeparator());
	}

	@Test
	public void testSetNullText() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setNullText(null);
		assertEquals("", style.getNullText());
	}

	@Test
	public void testSetSizeStartText() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setSizeStartText(null);
		assertEquals("", style.getSizeStartText());
	}

	@Test
	public void testSetSizeEndText() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setSizeEndText(null);
		assertEquals("", style.getSizeEndText());
	}

	@Test
	public void testSetSummaryObjectStartText() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setSummaryObjectStartText(null);
		assertEquals("", style.getSummaryObjectStartText());
	}

	@Test
	public void testSetSummaryObjectEndText() {
		final ToStringStyle style = ToStringStyleTest.mockToStringStyle1();
		style.setSummaryObjectEndText(null);
		assertEquals("", style.getSummaryObjectEndText());
	}

	/**
	 * An object used to test {@link ToStringStyle}.
	 *
	 */
	static class Person {
		/**
		 * Test String field.
		 */
		String name;

		/**
		 * Test integer field.
		 */
		int age;

		/**
		 * Test boolean field.
		 */
		boolean smoker;
	}
}
