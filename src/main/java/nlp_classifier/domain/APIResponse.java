package nlp_classifier.domain;

/**
 * Representa uma resposta padrão da API.
 * <p>
 * Contém uma mensagem de resposta para o cliente.
 * </p>
 *
 * @param message Mensagem de resposta.
 */
public record APIResponse(String message) {}
