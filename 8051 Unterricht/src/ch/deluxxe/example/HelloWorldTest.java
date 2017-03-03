package ch.deluxxe.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {
	HelloWorld a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new HelloWorld();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testHelloWorld() {
		HelloWorld b = new HelloWorld();
		fail("Not yet implemented");
	}

	@Test
	public void testHelloWorldString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOutput() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOutput() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testTestHelloWorld() {
		fail("Not yet implemented");
	}

}
