package nlp_classifier.service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Serviço para classificação de intenções usando expressões regulares.
 */
public class IntentRegexService {

    private Map<String, List<String>> intents = new HashMap<>() {
        {
            put(
                "greeting",
                List.of(
                    "olá",
                    "oi",
                    "bom dia",
                    "boa tarde",
                    "boa noite",
                    "eai",
                    "fala",
                    "salve",
                    "saudações"
                )
            );
            put(
                "farewell",
                List.of(
                    "tchau",
                    "até mais",
                    "até logo",
                    "até breve",
                    "adeus",
                    "falou"
                )
            );
        }
    };

    /**
     * Classifica o texto em uma das intenções pré-definidas.
     *
     * @param text
     *            O texto a ser classificado.
     * @return Retorna a intenção detectada ou "No intent detected" se nenhuma
     *         intenção for encontrada.
     */
    public String classify(String text) {
        for (Map.Entry<String, List<String>> entry : intents.entrySet()) {
            if (entry.getValue().contains(text.toLowerCase())) {
                return entry.getKey();
            }
        }
        return "No intent detected";
    }
}
