package nlp_classifier.domain;

/**
 * Representa uma requisição para classificação de texto.
 *
 * @param text O texto a ser classificado.
 */
public record ClassifierRequest(String text) {}
