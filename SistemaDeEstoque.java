import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class SistemaDeEstoque extends JFrame implements ActionListener{


    Font fonte = new Font("Courier New",Font.ITALIC, 30);

    JMenuBar menuP = new JMenuBar();
    JMenu menuUm = new JMenu("Opçoẽs");
    JMenuItem itemUm = new JMenuItem("Sair");

    JMenu menuDois = new JMenu("Sobre");
    JMenuItem itemDois = new JMenuItem("Sobre o autor");
    JMenuItem itemTres = new JMenuItem("Sobre o projeto");
    JMenu menuTres = new JMenu("Documentação");
    JMenuItem itemQuatro = new JMenuItem("Documentação completa");


    JButton botaoCadastroUm, botaoCadastroDois, botaoCadastroTres, botaoCadastroQuatro;
    JLabel labelUm, labelDois;
    ImageIcon img = new ImageIcon(getClass().getResource("clienteE.png"));
    ImageIcon img2 = new ImageIcon(getClass().getResource("fornecedoR.png"));
    ImageIcon img3 = new ImageIcon(getClass().getResource("produtoO.png"));
    ImageIcon img4 = new ImageIcon(getClass().getResource("vendasS.png"));
    public SistemaDeEstoque(){
        setSize(1366,720);
        setTitle("Sistema de Estoque");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(Color.GRAY);
        botaoCadastroUm = new JButton("Cadastro de Cliente", img);
        botaoCadastroDois = new JButton("Cadastro de fornecedor", img2);
        botaoCadastroTres = new JButton("Cadastro de produtos", img3);
        botaoCadastroQuatro = new JButton("Produtos", img4);
        labelUm = new JLabel("Em connstrução por: CHAMELEON");
        labelDois = new JLabel("Sistema de estoque pré-alpha");

        setJMenuBar(menuP);
        menuP.add(menuUm);
        menuP.add(menuDois);
        menuP.add(menuTres);

        menuUm.add(itemUm);
        menuDois.add(itemDois);
        menuDois.add(itemTres);
        menuTres.add(itemQuatro);





        add(botaoCadastroUm);
        add(botaoCadastroDois);
        add(botaoCadastroTres);
        add(botaoCadastroQuatro);
        add(labelUm);
        add(labelDois);

        botaoCadastroUm.setBounds(50, 100, 300, 100);
        botaoCadastroDois.setBounds(50,230, 300, 100);
        botaoCadastroTres.setBounds(50, 360, 300, 100);
        botaoCadastroQuatro.setBounds(50, 490, 300, 100);
        labelUm.setBounds(460, 600, 520, 100);
        labelDois.setBounds(500, -10, 500, 100);
        labelDois.setFont(fonte);
        labelUm.setFont(fonte);

    }



    public static void main(String[] args){


        SistemaDeEstoque c = new SistemaDeEstoque() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        c.setVisible(true);




    }


}
