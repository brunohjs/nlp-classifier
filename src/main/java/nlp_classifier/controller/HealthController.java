package nlp_classifier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nlp_classifier.domain.APIResponse;

import org.springframework.http.ResponseEntity;


/**
 * Controller responsável por expor o endpoint de verificação de saúde da aplicação.
 * Permite verificar se a aplicação está em funcionamento.
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    /**
     * Endpoint para verificar a saúde da aplicação.
     *
     * @return Retorna a resposta da API indicando que a aplicação está saudável.
     */
    @GetMapping
    public ResponseEntity<APIResponse> healthCheck() {
        return ResponseEntity.ok(
            new APIResponse("OK")
        );
    }
}
