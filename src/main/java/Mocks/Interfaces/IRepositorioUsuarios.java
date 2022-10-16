package Mocks.Interfaces;

import Mocks.Entidades.Usuario;
import java.util.UUID;

public interface IRepositorioUsuarios {
    void adicionar(Usuario usuario);
    void atualizar(Usuario usuario);
    void excluir(Usuario usuario);
    Usuario buscarPorId(UUID id);
}