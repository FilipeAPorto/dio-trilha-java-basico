import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "HOME", matches = "Filipe Porto")
    void validarAlgoSomenteNoUsuarioFilipe() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
