import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char operadormatematico;

    private JPanel Calculadora;
    private JTextField Display;
    private JButton Botaodivisao;
    private JButton Botaoum;
    private JButton Botaodois;
    private JButton Botaoquatro;
    private JButton Botaosete;
    private JButton Botaozero;
    private JButton Botaotres;
    private JButton Botaocinco;
    private JButton Botaooito;
    private JButton Botaoponto;
    private JButton Botaosoma;
    private JButton Botaoseis;
    private JButton Botaonove;
    private JButton Botaoclear;
    private JButton Botaomenos;
    private JButton Botaomultiplicacao;
    private JButton Botaoigual;

    private void getOperador (String BotaoTexto){
            operadormatematico = BotaoTexto.charAt (0);
            total1 = total1 + Double.parseDouble(Display.getText());
            Display.setText("");
    }


    public Calculadora() {
        Botaoum.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoumTexto = Display.getText() + Botaoum.getText();
                Display.setText(BotaoumTexto);
            }
        } );
        Botaodois.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaodoisTexto = Display.getText() + Botaodois.getText();
                Display.setText(BotaodoisTexto);
            }
        } );
        Botaotres.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaotresTexto = Display.getText() + Botaotres.getText();
                Display.setText(BotaotresTexto);
            }
        } );
        Botaoquatro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoquatroTexto = Display.getText() + Botaoquatro.getText();
                Display.setText(BotaoquatroTexto);
            }
        } );
        Botaocinco.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaocincoTexto = Display.getText() + Botaocinco.getText();
                Display.setText(BotaocincoTexto);
            }
        } );
        Botaoseis.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoseisTexto = Display.getText() + Botaoseis.getText();
                Display.setText(BotaoseisTexto);
            }
        } );
        Botaosete.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoseteTexto = Display.getText() + Botaosete.getText();
                Display.setText(BotaoseteTexto);
            }
        } );
        Botaooito.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaooitoTexto = Display.getText() + Botaooito.getText();
                Display.setText(BotaooitoTexto);
            }
        } );
        Botaonove.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaonoveTexto = Display.getText() + Botaonove.getText();
                Display.setText(BotaonoveTexto);
            }
        } );
        Botaozero.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaozeroTexto = Display.getText() + Botaozero.getText();
                Display.setText(BotaozeroTexto);
            }
        } );

        Botaoponto.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Display.getText().equals( "" )){
                    Display.setText( "0." );
                }
                else if (Display.getText().contains( "." )) {
                    Botaoponto.setEnabled( false );
                }
                else
                {String Botaopontotexto = Display.getText() + Botaoponto.getText();
                  Display.setText( Botaopontotexto );
            }
                Botaoponto.setEnabled( true );
            }
        } );

        Botaosoma.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoTexto = Botaosoma.getText();
                getOperador( BotaoTexto );
            }
        } );
        Botaoigual.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operadormatematico){
                    case '+':
                        total2 = total1 + Double.parseDouble( Display.getText() );
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble( Display.getText() );
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble( Display.getText() );
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble( Display.getText() );
                        break;
                }

                Display.setText( Double.toString( total2 ) );
                total1 = 0;
            }
        } );
        Botaoclear.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                Display.setText( "" );
            }
        } );
        Botaomenos.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoTexto = Botaomenos.getText();
                getOperador( BotaoTexto );
            }
        } );
        Botaomultiplicacao.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoTexto = Botaomultiplicacao.getText();
                getOperador( BotaoTexto );
            }
        } );
        Botaodivisao.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BotaoTexto = Botaodivisao.getText();
                getOperador( BotaoTexto );
            }
        } );
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame( "Calculadora" );
        frame.setContentPane( new Calculadora().Calculadora );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }
}
