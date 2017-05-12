package exemplogitnetbeans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Manipulacao {
    public static void gravarDados(ArrayList<Produtos> lista) {
        File dadosArquivo = new File("dados.txt");
        FileWriter fw;

        try {
            fw = new FileWriter(dadosArquivo);
            for (Produtos item : lista) {
                String linha;
                linha = String.format("%f;%s;%.2f\n",
                        item.getCodigo(),
                        item.getDescricao(),
                        item.getValor());
                fw.write(linha);
            }
            fw.flush();
        } catch (IOException e) {
            System.out.println("Não foi possivel gravar o arquivo");

        }

    }

    public static ArrayList<Produtos> lerArquivo() {
        File arq = new File("dados.txt");
        String linhaDoArquivo;
        String[] banco;
        Produtos x;
        ArrayList<Produtos> lista;
        lista = new ArrayList<>();
        try {
            Scanner leia = new Scanner(arq);
            while (leia.hasNext()) {
                linhaDoArquivo = leia.nextLine();
                banco = linhaDoArquivo.split(";");
                x = new Produtos();
                x.setCodigo(Double.parseDouble(banco[0]));
                x.setDescricao(banco[1]);
                x.setValor(Double.parseDouble(banco[2]));
                lista.add(x);
            }
            return lista;

        } catch (FileNotFoundException e) {
            System.out.println("O arquivo especificado não foi encontrado");

            return null;
        }

    }

}
