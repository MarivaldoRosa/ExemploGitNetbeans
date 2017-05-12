
package exemplogitnetbeans;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploGitNetbeans {

    public static void main(String[] args) {
            ArrayList<Produtos> lista = new ArrayList<Produtos>();
        int opcao;
        Produtos novo;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    novo = inserir();
                    lista.add(novo);
                    Manipulacao.gravarDados(lista);
                    break;
                case 2:
                    novo = imprimir();
                    lista.add(novo);
                    Manipulacao.lerArquivo();
                    break;
                    

            }

        } while (opcao != 0);

    }

    private static int menu() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n 0 - Sair\n 1- Inserir\n 2 - Imprimir\n "));

        } while (op < 0 || op > 3);
        return op;
    }

    private static Produtos inserir() {
        Produtos x = new Produtos();
        x.setCodigo(Double.parseDouble(JOptionPane.showInputDialog("Digite o codigo do produto: ")));
        x.setDescricao(JOptionPane.showInputDialog("Digite a descirção do Produto: "));
        x.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
        
        return x;
    }

    private static Produtos imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
