/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

/**
 * Test with bad modifiers.
 *
 * @author Phillip Webb
 */
public class JUnit5BadModifier {

	@BeforeAll
	public static void publicBeforeAll() {

	}

	@BeforeEach
	public void publicBeforeEach() {

	}

	@AfterAll
	public static void publicAfterAll() {

	}

	@AfterEach
	public void publicAfterEach() {

	}

	@BeforeAll
	private static void privateBeforeAll() {

	}

	@BeforeEach
	private void privateBeforeEach() {

	}

	@AfterAll
	private static void privateAfterAll() {

	}

	@AfterEach
	private void privateAfterEach() {

	}

	@Test
	public void doSomethingWorks() {
		// test here
	}

	@Test
	private void doSomethingElseWorks() {
		// test here
	}

	@TestTemplate
	public void doSomethingWithTemplateWorks() {
		// test here
	}

	@TestTemplate
	private void doSomethingElseWithTemplateWorks() {
		// test here
	}

	@Nested
	public static class PublicNestedTests {

		@Test
		public void nestedPublicTest() {

		}

	}

	@Nested
	private static final class PrivateNestedTests {

	}

}
