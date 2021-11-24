package adapter;

import service.AlphaVantage;

public class AlphaVantageAdapter implements IAlvo {
    private final AlphaVantage alphaVantage;

    public AlphaVantageAdapter() {
        alphaVantage = new AlphaVantage();
    }//construtor

    @Override
    public void cotacao(String param) {
        alphaVantage.cotacaoUsandoAlphaVantage(param);
    }//metodo

}//classe
