package nlp_classifier.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nlp_classifier.domain.APIResponse;
import nlp_classifier.domain.ClassifierRequest;
import nlp_classifier.service.IntentRegexService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Controller responsável por expor o endpoint de classificação de texto.
 * Recebe requisições para identificar intenções em textos enviados pelo cliente.
 */
@RestController
@RequestMapping("/classify")
public class ClassifierController {
    private IntentRegexService intentRegexService = new IntentRegexService();

    /**
     * Endpoint para classificar um texto.
     *
     * @param request O objeto contendo o texto a ser classificado.
     * @return Retorna a resposta da API com a intenção detectada.
     */
    @PostMapping
    public ResponseEntity<APIResponse> classifyText(@RequestBody ClassifierRequest request) {
        String intent = intentRegexService.classify(request.text());
        return ResponseEntity.ok(new APIResponse(intent));
    }
}
