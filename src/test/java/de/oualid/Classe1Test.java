package de.oualid;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Classe1Test {
    @Test
    void lengthShouldBeGreaterThan100() {

        String a = "jklasjfljdlvslkjsbdkbkjsdbvkjsdbvkjbsdkjvbkjdsbvkjdsbvkjbdskjvbkdjsbvkjdsbvkjdsbvkjsdbvkjsdvlksdvksdvnkdsvlsdklvnkldsnvkdsnvlksndvlkndlvknsldknvlksdnvlkdsnvlkdsnvlkdsnvlkdsvnlkdsnvlsa";
        boolean result = Classe1.checkvalue(a);
        assertTrue(result);
    }

    @Test
    void lengthShouldNotBeGreaterThan100() {

        String a = "jklasjsblsa";
        boolean result = Classe1.checkvalue(a);
        assertFalse(result);
    }

    @Test
    void lengthShouldBe10() {

        String a = "jklasjblsa";
        boolean result = Classe1.checkvalue(a);
        assertFalse(result);
    }

    @Test
    void lengthShouldBe11() {

        String a = "jklasjblsa1";
        boolean result = Classe1.checkvalue(a);
        assertTrue(result);
    }
}