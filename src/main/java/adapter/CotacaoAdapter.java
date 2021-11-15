package adapter;

import service.AlphaVantage;
import service.Quandl;
import service.YahooFinance;

import java.util.Locale;

public class CotacaoAdapter implements IAlvo {
    private final AlphaVantage alphaVantage;
    private final Quandl quandl;
    private final YahooFinance yahooFinance;

    public CotacaoAdapter() {
        alphaVantage = new AlphaVantage();
        quandl = new Quandl();
        yahooFinance = new YahooFinance();
    }//construtor

    @Override
    public void cotacaoYahoo(String param) {
        final String sufixo = ".SA";
        if (!param.endsWith(sufixo))
            param = param.concat(sufixo);
        yahooFinance.cotacaoUsandoYahooFinance(param.toUpperCase());
    }//metodo

    @Override
    public void cotacaoAlphaVantage(String param) {
        alphaVantage.cotacaoUsandoAlphaVantage(param);
    }//metodo

    @Override
    public void cotacaoQuandl(String param) {
        final String prefixo = "WIKI/";
        if (!param.startsWith(prefixo))
            param = param.replace(param, prefixo.concat(param));
        quandl.cotacaoUsandoQuandl(param.toUpperCase());
    }//metodo

}//classe
