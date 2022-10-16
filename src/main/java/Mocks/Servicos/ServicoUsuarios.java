package Mocks.Servicos;

import Mocks.Dtos.UsuarioDto;
import Mocks.Entidades.Usuario;
import Mocks.ExcecaoEntidadeNaoEncontrada;
import Mocks.Interfaces.IServicoUsuarios;
import Mocks.Interfaces.IRepositorioUsuarios;
import Mocks.Interfaces.ITransacao;

import java.util.UUID;

public class ServicoUsuarios implements IServicoUsuarios {
    private IRepositorioUsuarios repositorio;
    private ITransacao transacao;

    public ServicoUsuarios(IRepositorioUsuarios repositorio, ITransacao transacao) {
        this.repositorio = repositorio;
        this.transacao = transacao;
    }

    @Override
    public void criarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario(usuarioDto.nome, usuarioDto.login, usuarioDto.senha);
        repositorio.adicionar(usuario);
        transacao.commit();
    }

    @Override
    public void atualizarUsuario(UsuarioDto usuarioDto) {

    }

    @Override
    public void excluir(UUID id) {

    }
}
