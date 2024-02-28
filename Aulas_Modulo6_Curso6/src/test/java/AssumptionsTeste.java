import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioFilipe() {
        Assumptions.assumeTrue("Filipe Porto".equals(System.getenv("USER"))); // Suposição
        Assertions.assertEquals(10, 5 + 5);
    }
}
