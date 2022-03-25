package generadorip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	GeneradorIp gi = new GeneradorIp();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGenerarNumero() {
		for(int i = 0; i < 1000; i++) {
		int actual = gi.generarNumero(0, 254);
		
		assertTrue(actual >= 0 && actual < 255);
	}}

	@Test
	void testGenerarIp() {
		String actual = gi.generarIp();
		assertTrue(actual.charAt(0) > 0 && actual.charAt(actual.length()-1) > 0);
	}

}
