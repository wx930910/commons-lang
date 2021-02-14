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
package org.apache.commons.lang3.concurrent;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;

/**
 * Test class for {@code LazyInitializer}.
 */
public class LazyInitializerTest extends AbstractConcurrentInitializerTest {
	public static LazyInitializer<Object> mockLazyInitializer1() {
		LazyInitializer<Object> mockInstance = spy(LazyInitializer.class);
		try {
			doReturn(new Object()).when(mockInstance).initialize();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return mockInstance;
	}

	/** The initializer to be tested. */
	private LazyInitializer<Object> initializer;

	@BeforeEach
	public void setUp() {
		initializer = LazyInitializerTest.mockLazyInitializer1();
	}

	/**
	 * Returns the initializer to be tested. This implementation returns the
	 * {@code LazyInitializer} created in the {@code setUp()} method.
	 *
	 * @return the initializer to be tested
	 */
	@Override
	protected ConcurrentInitializer<Object> createInitializer() {
		return initializer;
	}
}
