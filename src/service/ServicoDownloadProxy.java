package service;

public class ServicoDownloadProxy implements Baixar{
    @Override
    public void baixarMusica(String tipoConta) {
        if(tipoConta.equalsIgnoreCase("premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixarMusica(tipoConta);
            System.out.println("Download permitido.");
        }else{
            System.out.println("Sua conta é Free, para baixar música contrate o serviço Premium.");
        }
    }
}
