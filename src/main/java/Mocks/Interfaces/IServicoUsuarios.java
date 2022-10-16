package Mocks.Interfaces;

import Mocks.Dtos.UsuarioDto;
import Mocks.ExcecaoEntidadeNaoEncontrada;

import java.util.UUID;

public interface IServicoUsuarios {
    void criarUsuario(UsuarioDto usuarioDto);
    void atualizarUsuario(UsuarioDto usuarioDto);
    void excluir(UUID id);
}
