import com.Susana.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
  @Test
  public void comprobacionSumaDeDosPositivos(){
    Assertions.assertEquals(5, Calculadora.opcion(1,4f,1f));
  }

  @Test
  public void comprobacionSumaDeUnPositivoYUnNegativo(){
    Assertions.assertEquals(-4,Calculadora.opcion(1,-5f,1f));
  }

  @Test
  public void comprobacionSumaDeDosNegativos(){
    Assertions.assertEquals(-5,Calculadora.opcion(1,-4f,-1f));
  }

  @Test
  public void comprobacionRestaDeDosPositivos(){
    Assertions.assertEquals(2, Calculadora.opcion(2,4f,2f));
  }

  @Test
  public void comprobacionRestaDeUnpositivoYUnNegativo(){
    Assertions.assertEquals(6, Calculadora.opcion(2,4f,-2f));
  }

  @Test
  public void comprobacionRestaDeDosNegativos(){
    Assertions.assertEquals(-3, Calculadora.opcion(2,-4f,-1f));
  }

  @Test
  public void comprobacionMultiplicacionDeDosPositivos(){
    Assertions.assertEquals(10, Calculadora.opcion(3,5f,2f));
  }

  @Test
  public void comprobarMultiplicacionDeUnPositivoYUnNegativo(){
    Assertions.assertEquals(-6, Calculadora.opcion(3,2f,-3f));
  }

  @Test
  public void comprobacionMultiplicacionDeDosNegativos(){
    Assertions.assertEquals(8, Calculadora.opcion(3,-4f,-2f));
  }

  @Test
  public void comprobacionDivisionDeDosPositivos(){
    Assertions.assertEquals(5, Calculadora.opcion(4,15f,3f));
  }

  @Test
  public void comprobarDivisionDeUnPositivoYUnNegativo(){
    Assertions.assertEquals(-5, Calculadora.opcion(4,10f,-2f));
  }

  @Test
  public void comprobacionDivisionDeDosNegativos(){
    Assertions.assertEquals(2, Calculadora.opcion(4,-4f,-2f));
  }
}
