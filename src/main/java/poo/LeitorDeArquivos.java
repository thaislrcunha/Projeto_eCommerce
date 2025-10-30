package poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivos {
    public static void main(String[] args) {
        BufferedReader leitor = null;
        try {
            FileReader fileReader = new FileReader("produtos.cvs");
            leitor = new BufferedReader(fileReader);

            //cabecalho
            String linha = leitor.readLine();
            System.out.println(linha);

            while((linha = leitor.readLine())!=null){
                System.out.println(linha);
                String[] colunas = linha.split(",");
                String id = (colunas[0]);
                String nome = (colunas[1]);
                double preco = Double.valueOf(colunas[2]);
//                int estoque = colunas[3];
//
//                String descricao;
//                Produto p = new Produto(id, nome, preco, estoque, descricao);

            }

        } catch (IOException e) {
            System.err.printf("Arquivo não encontrado!\n");
        } finally{
            try {
                leitor.close();
            } catch (IOException e) {

            }
            System.out.println("Entrou no finally!\n");
//            leitor.close();
        }

    }
}
