import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 */

class Mestests {

	/**
	 * Test method for {@link Car#Car(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testCar() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertNotNull(mycar);
        assertEquals("Porsche", mycar.getMarque());
        assertEquals("911 Carrera", mycar.getModele());
        assertEquals(0, mycar.getPrixAchat());
        assertEquals(0, mycar.getPrixVente());
        assertEquals(0, mycar.getNbportes());
        assertEquals(0, mycar.getQteStock());
        assertEquals(0, mycar.getPuissanceCv());
        assertEquals(0, mycar.getKilometrage());
        assertTrue(mycar.getNeuve());
	}

	/**
	 * Test method for {@link Car#getMarque()}.
	 */
	@Test
	void testGetMarque() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals("Porsche", mycar.getMarque());
	}

	/**
	 * Test method for {@link Car#getModele()}.
	 */
	@Test
	void testGetModele() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals("911 Carrera", mycar.getModele());
	}

	/**
	 * Test method for {@link Car#getPrixAchat()}.
	 */
	@Test
	void testGetPrixAchat() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals(0, mycar.getPrixAchat());
	}

	/**
	 * Test method for {@link Car#getPrixVente()}.
	 */
	@Test
	void testGetPrixVente() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals(0, mycar.getPrixVente());
	}

	/**
	 * Test method for {@link Car#getNbportes()}.
	 */
	@Test
	void testGetNbportes() {
        Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals(0, mycar.getNbportes());
	}

	/**
	 * Test method for {@link Car#getQteStock()}.
	 */
	@Test
	void testGetQteStock() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Porsche", "911 Carrera 4");
		assertEquals(0,mycar1.getQteStock());
	}

	/**
	 * Test method for {@link Car#getPuissanceCv()}.
	 */
	@Test
	void testGetPuissanceCv() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals(0, mycar.getPuissanceCv());
	}

	/**
	 * Test method for {@link Car#getKilometrage()}.
	 */
	@Test
	void testGetKilometrage() {
		Car mycar = new Car("Porsche", "911 Carrera");
        assertEquals(0, mycar.getKilometrage());
	}

	/**
	 * Test method for {@link Car#getNeuve()}.
	 */
	@Test
	void testGetNeuve() {
        Car mycar = new Car("Porsche", "911 Carrera");
        assertTrue(mycar.getNeuve());
	}

	/**
	 * Test method for {@link Car#setMarque(java.lang.String)}.
	 */
	@Test
	void testSetMarque() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setMarque("Ferrari");
        assertEquals("Ferrari", mycar.getMarque());
	}

	/**
	 * Test method for {@link Car#setModele(java.lang.String)}.
	 */
	@Test
	void testSetModele() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setModele("911 Turbo");
        assertEquals("911 Turbo", mycar.getModele());
	}

	/**
	 * Test method for {@link Car#setPrixAchat(float)}.
	 */
	@Test
	void testSetPrixAchat() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setPrixAchat(95000);
        assertEquals(95000, mycar.getPrixAchat());
	}

	/**
	 * Test method for {@link Car#setPrixVente(float)}.
	 */
	@Test
	void testSetPrixVente() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setPrixVente(80000);
        assertEquals(80000, mycar.getPrixVente());
	}

	/**
	 * Test method for {@link Car#setNbportes(int)}.
	 */
	@Test
	void testSetNbportes() {
		Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setNbportes(5);
        assertEquals(5, mycar.getNbportes());
	}

	/**
	 * Test method for {@link Car#setQteStock(int)}.
	 */
	@Test
	void testSetQteStock() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setQteStock(7);
        assertEquals(7, mycar.getQteStock());
	}

	/**
	 * Test method for {@link Car#setPuissanceCv(int)}.
	 */
	@Test
	void testSetPuissanceCv() {
	    Car mycar = new Car("Porsche", "911 Carrera");
	    mycar.setQteStock(5);
	    assertEquals(5, mycar.getQteStock());
	}

	/**
	 * Test method for {@link Car#setKilometrage(int)}.
	 */
	@Test
	void testSetKilometrage() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setKilometrage(25000);
        assertEquals(25000, mycar.getKilometrage());
	}

	/**
	 * Test method for {@link Car#setNeuve(java.lang.Boolean)}.
	 */
	@Test
	void testSetNeuve() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setNeuve(false);
        assertFalse(mycar.getNeuve());
	}

	/**
	 * Test method for {@link Car#setQteStockplus(int)}.
	 */
	@Test
	void testSetQteStockplus() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setQteStock(10);  
        mycar.setQteStockplus(5);  

        assertEquals(15, mycar.getQteStock());
	}

	/**
	 * Test method for {@link Car#verifStocksuffisant(int)}.
	 */
	@Test
	void testVerifStocksuffisant() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setQteStock(10);  

        assertTrue(mycar.verifStocksuffisant(5));  
        assertFalse(mycar.verifStocksuffisant(15));  
    }

	/**
	 * Test method for {@link Car#setQteStockMoins(int)}.
	 */
	@Test
	void testSetQteStockMoins() {
        Car mycar = new Car("Porsche", "911 Carrera");
        mycar.setQteStock(10);  

        assertFalse(mycar.setQteStockMoins(5));  
        assertTrue(mycar.setQteStockMoins(15)); 
        
        assertEquals(10, mycar.getQteStock());
    }

	/**
	 * Test method for {@link Car#CarEnChaine()}.
	 */
	@Test
	void testCarEnChaine() {
	      Car mycar = new Car("Porsche", "911 Carrera");
	        mycar.setPrixAchat(95000);
	        mycar.setPrixVente(80000);
	        mycar.setNbportes(5);
	        mycar.setQteStock(7);
	        mycar.setPuissanceCv(400);
	        mycar.setKilometrage(25000);
	        mycar.setNeuve(false);

	        String expected = 
	        "\n Marque :Porsche" +
	        "\n Modele :911 Carrera" +
	        "\n Prix d'achat :95000.0" +
	        "\n Prix de vente :80000.0" +
	        "\n nombre de portes :5" +
	        "\n Quantité en stock :7" +
	        "\n puissance en chevaux :400" +
	        "\n Kilometrage :25000" +
	        "\n etat Neuf :false";

	        assertEquals(expected, mycar.CarEnChaine());
	    }

	
}
