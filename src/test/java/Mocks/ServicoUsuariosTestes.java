package Mocks;

import Mocks.Dtos.UsuarioDto;
import Mocks.Interfaces.IRepositorioUsuarios;
import Mocks.Interfaces.ITransacao;
import Mocks.Servicos.ServicoUsuarios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class ServicoUsuariosTestes {
    @Mock
    private IRepositorioUsuarios repositorioUsuarios;
    @Mock
    private ITransacao transacao;
    private ServicoUsuarios sut;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);

        sut = new ServicoUsuarios(repositorioUsuarios, transacao);
    }

    @Test
    public void deveCriarUsuario() {
        //arrange
        UsuarioDto usuarioDto = new UsuarioDto();

        //act
        sut.criarUsuario(usuarioDto);

        //assert
        verify(repositorioUsuarios, times(1))
            .adicionar(
                argThat(usuario ->
                        usuario.getNome() == usuarioDto.nome
                        && usuario.getLogin() == usuarioDto.login
                        && usuario.getSenha() == usuarioDto.senha
                )
            );
        verify(transacao).commit();
    }
}
