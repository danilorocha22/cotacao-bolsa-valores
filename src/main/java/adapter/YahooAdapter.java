package adapter;

import service.YahooFinance;

public class YahooAdapter implements IAlvo {
    private final YahooFinance yahooFinance;

    public YahooAdapter() {
        yahooFinance = new YahooFinance();
    }//construtor

    @Override
    public void cotacao(String param) {
        String sufixo = ".SA";
        if (!param.endsWith(sufixo))
            param = param.concat(sufixo);
        yahooFinance.cotacaoUsandoYahooFinance(param.toUpperCase());
    }//metodo

}//classe
