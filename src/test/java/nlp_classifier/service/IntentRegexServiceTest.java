package nlp_classifier.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntentRegexServiceTest {
    private IntentRegexService service;

    @BeforeEach
    void setUp() {
        service = new IntentRegexService();
    }

    @Test
    void testClassify() {
        assertEquals("greeting", service.classify("olá"));
        assertEquals("greeting", service.classify("bom dia"));
        assertEquals("farewell", service.classify("tchau"));
        assertEquals("farewell", service.classify("até logo"));
        assertEquals("No intent detected", service.classify("como vai?"));
        assertEquals("No intent detected", service.classify("hello world"));
    }
}
