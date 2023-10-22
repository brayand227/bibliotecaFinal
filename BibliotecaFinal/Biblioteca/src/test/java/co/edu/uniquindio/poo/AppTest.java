package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    // EN ESTA PRUEBA PROBAMOS EL NOMBRE DE LIBRO 1
    public void ProbarDatosLibroNombre() {
        LOG.info("PROBANDO NOMBRE DE LIBRO");
        Autor autor = new Autor("Brayan CORDOBA ", "COLOMBIANO");
        Editorial editorial = new Editorial("LIBROS PIPE ", "212212");
        LibroImpreso libro1 = new LibroImpreso("LA VUELTA AL MUNDO EN 80 DIAS", "29/06/2010", autor, editorial, 25);
        assertEquals("LA VUELTA AL MUNDO EN 80 DIAS", libro1.getNombreLibro());
        LOG.info("Fin de prueba de nombre del libro...");

    }

    @Test
    // EN ESTA PRUEBA PROBAMOS EL NOMBRE DEL AUTOR DE LIBRO 1
    public void ProbarDatosLibroNacionalidad() {
        LOG.info("probando nombre  del autor");
        Autor autor = new Autor("Brayan CORDOBA ", "COLOMBIANO");
        Editorial editorial = new Editorial("LIBROS PIPE ", "212212");
        LibroImpreso libro1 = new LibroImpreso("LA VUELTA AL MUNDO EN 80 DIAS", "29/06/2010", autor, editorial, 25);
        assertEquals("COLOMBIANO", libro1.getAutor().getNacionalidad());
        LOG.info("Fin de prueba de nombre del libro...");

    }

}
