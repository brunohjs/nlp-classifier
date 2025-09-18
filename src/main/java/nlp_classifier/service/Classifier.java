package nlp_classifier.service;

/**
 * Interface para classificação de texto.
 */
public interface Classifier {
    /**
     * Classifica o texto em uma intenção.
     *
     * @param text O texto a ser classificado.
     * @return Retorna a intenção detectada ou "No intent detected" se nenhuma intenção for encontrada.
     */
    public String classify(String text);
}
