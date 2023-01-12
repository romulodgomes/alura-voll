package med.voll.api.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.model.Endereco;

public record DadosAtualizaMedico(@NotNull Long id, String nome, String telefone, String email, DadosEndereco endereco) {
}
