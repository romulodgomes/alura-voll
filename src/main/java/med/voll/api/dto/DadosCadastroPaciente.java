package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.model.Endereco;

public record DadosCadastroPaciente
        (
            @NotBlank
            String nome,
            @NotBlank
            String email,
            @NotBlank
            String telefone,
            @NotBlank
            String cpf,
            @NotNull @Valid
            DadosEndereco endereco
        ) {

}
