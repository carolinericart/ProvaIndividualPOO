package br.winxbank.geradordedocumentos;
import br.winxbank.sistemabancario.Conta;

import java.io.*;


/** @author Carol */
public class ArquivoFeedback {

    private static ArquivoFeedback instancia;

    public void gerarDocFeedback(Conta conta) throws FileNotFoundException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(conta.getNumeroConta() + "Feedback.txt"))) {
            writer.write("\n"+conta.getAvaliacaoOO2022().getMatricula());
            writer.write("\n"+conta.getAvaliacaoOO2022().getNome());
            writer.write("\n"+String.valueOf(conta.getAvaliacaoOO2022().getNota()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static ArquivoFeedback getInstancia () {
        if (instancia == null) {
            instancia = new ArquivoFeedback();
        }
        return instancia;
    }
    public void LerDocFeedback(Conta conta) throws IOException {
        try{
            FileReader fileReader = new FileReader(conta.getNumeroConta()+"Feedback.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = bufferedReader.readLine();
            String matricula = null;
            String nome = null;
            String nota = null;
            int i=0;
            while(linha != null){
                linha = bufferedReader.readLine();
                if (i==0){
                    matricula=linha;
                    System.out.println(linha);
                }else if (i==1){
                    nome=linha;
                    System.out.println(linha);
                }else if(i==2){
                    nota=linha;
                    System.out.println(linha);
                }
                i++;
            }
            conta.setAvaliacao(nome.toString(),Integer.valueOf(matricula), Float.valueOf(nota));
        }catch (IOException e){

        }

    }
}
