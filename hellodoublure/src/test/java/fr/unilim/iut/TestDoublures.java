package fr.unilim.iut;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestDoublures {
    @Test
    void test_UnPremierStub() {
        User user = mock(User.class);
        when (user.getLogin()).thenReturn("alice");
    }
}
