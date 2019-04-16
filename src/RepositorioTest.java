import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RepositorioTest {
	
	Repositorio repositorio = new Repositorio();
	
	
	@Test
	void testAddFilme() {
		repositorio.addFilme();
		assertEquals(1,repositorio.getFilmes().size());
	}

	@Test
	void testAddAtor() {
		repositorio.addFilme();
		repositorio.addAtor();
		
	}

	@Test
	void testFilmografia() {
		fail("Not yet implemented");
	}

}
