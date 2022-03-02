package model;

import org.junit.jupiter.api.Test;
import service.Baixar;
import service.ServicoDownloadProxy;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void verificar(){
        User user1 = new User("A4578", "Free");
        Baixar baixar = new ServicoDownloadProxy();
        baixar.baixarMusica(user1.getTipoConta());
        System.out.println(user1.toString());

        System.out.println("----------------------------------------------------------------");

        User user2 = new User("A8751","Premium");
        Baixar baixar2 = new ServicoDownloadProxy();
        baixar2.baixarMusica(user2.getTipoConta());
        System.out.println(user2.toString());
    }
}