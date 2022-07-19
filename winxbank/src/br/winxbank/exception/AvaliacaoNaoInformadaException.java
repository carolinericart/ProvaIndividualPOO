package br.winxbank.exception;

public class AvaliacaoNaoInformadaException extends RuntimeException{
    public AvaliacaoNaoInformadaException(){
        super("Feedback ainda nao foi inserido! ");
    }
}
