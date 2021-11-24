package adapter;

import service.Quandl;

public class QuandlAdapter implements IAlvo {
    private final Quandl quandl;

    public QuandlAdapter() {
        quandl = new Quandl();
    }//construtor

    @Override
    public void cotacao(String param) {
        String prefixo = "WIKI/";
        if (!param.startsWith(prefixo))
            param = param.replace(param, prefixo.concat(param));
        quandl.cotacaoUsandoQuandl(param.toUpperCase());
    }//metodo

}//classe
