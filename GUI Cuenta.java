import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*;

class GuiCuenta extends JFrame {
  //*Atributos de instancia, objetos gráficos y de la aplicación*/
  private CuentaBancaria saldoPesos, saldoUSD; //Estos atributos creo no se usan
  private Container contenedor;

  //Paneles
  private JPanel panelPesos;
  private JPanel panelUSD;

  //Labels y textFiled
  private JTextField montoAExtraer;
  private JTextField montoADepositar;
  private JLabel tituloPesos;
  private JLabel tituloUSD;
  private JLabel etiquetaSaldoPesos;
  private JLabel etiquetaSaldoUSD;
  private JLabel USDDisponibles;

  //Botones
  private JButton botonExtraerPesos;
  private JButton botonDepositarPesos;
  private JButton botonConsultarPesos;
  private JButton botonExtraerUSD;
  private JButton botonDepositarUSD;
  private JButton botonConsultarUSD;

  
  public GuiCuenta(){
    super ("Cuenta");
    //Inicializa variables
    saldoPesos = new CuentaBancaria();
    saldoUSD = new CuentaEspecial();
    //Establece los valores de los atributos del frame
    contenedor = getContentPane();
    contenedor.setLayout(new GridLayout(1,2));
    setSize(500, 600);
    panelPesos = new JPanel();
    panelUSD = new JPanel();
    Color colorFondo = new Color(204, 229, 255);
    panelPesos.setBackground(colorFondo);  
    //panelPesos.setLayout(new GridLayout(4, 2));
    panelPesos.setPreferredSize(new Dimension(200, 200));
    panelUSD.setBackground(colorFondo);
    panelUSD.setLayout(new GridLayout(4, 2));
    panelUSD.setPreferredSize(new Dimension(200, 200));
    contenedor.add(panelPesos);
    contenedor.add(panelUSD);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
    //Invoca a un método interno que completa la GUI
	  hacerGUI();
    setVisible(true);
  }
  //Implementa las clases oyente
  private void hacerGUI(){
    //Crea las etiquetas para mostrar los dos fondos
    tituloPesos = new JLabel("Cuenta pesos");
    tituloUSD = new JLabel("Cuenta USD");
    etiquetaSaldoPesos = new JLabel(saldoPesos.saldo());
    etiquetaSaldoUSD = new JLabel("Saldo USD");
    //Crea los botones
    botonConsultarPesos = new JButton("Consultar fondo en pesos");
    botonConsultarPesos.setPreferredSize(new Dimension(200, 30));
    botonExtraerPesos = new JButton("Extraer pesos");
    botonExtraerPesos.setPreferredSize(new Dimension(100, 30));;
    botonDepositarPesos = new JButton("Depositar pesos");
    botonDepositarPesos.setPreferredSize(new Dimension(100, 30));
    botonExtraerUSD = new JButton("Extraer USD");
    botonDepositarUSD = new JButton("Depositar USD");
    botonConsultarUSD = new JButton("Consultar fondo en USD");
    montoAExtraer = new JTextField();
    montoAExtraer.setPreferredSize(new Dimension(100, 30));
    montoADepositar = new JTextField();
    montoADepositar.setPreferredSize(new Dimension(100, 30));
    //Registra los botones en sus respectivos oyentes
    OyenteBotonExtraerPesos EP = new OyenteBotonExtraerPesos();
    botonExtraerPesos.addActionListener(EP);
    OyenteBotonDepositarPesos DP = new OyenteBotonDepositarPesos();
    botonDepositarPesos.addActionListener(DP);
    OyenteBotonConsultarPesos CP = new OyenteBotonConsultarPesos();
    botonConsultarPesos.addActionListener(CP);
    OyenteBotonExtraerUSD EU = new OyenteBotonExtraerUSD();
    botonExtraerUSD.addActionListener(EU);
    OyenteBotonDepositarUSD DU = new OyenteBotonDepositarUSD();
    botonDepositarUSD.addActionListener(DU);
    OyenteBotonConsultarUSD CU = new OyenteBotonConsultarUSD();
    botonConsultarUSD.addActionListener(CU);

    //Inserta las componentes en los paneles	
    //panelPesos
    panelPesos.add(tituloPesos);
    panelPesos.add(etiquetaSaldoPesos);
    //panelPesos.add(botonConsultarPesos);
    panelPesos.add(botonExtraerPesos);
    panelPesos.add(montoAExtraer);
    panelPesos.add(botonDepositarPesos);
    panelPesos.add(montoADepositar);


    //panelUSD
    panelUSD.add(tituloUSD);
    panelUSD.add(botonConsultarUSD);
    panelUSD.add(botonExtraerUSD);
    panelUSD.add(botonDepositarUSD);
    //panelUSD.add(USDDisponibles);
 }
  //Implementa las oyentes
  private class OyenteBotonExtraerPesos implements ActionListener {
    public void actionPerformed(ActionEvent event) {

    }  
  }
  private class OyenteBotonDepositarPesos implements ActionListener {
    public void actionPerformed(ActionEvent event) {

    }  
  }
  private class OyenteBotonConsultarPesos implements ActionListener {
    public void actionPerformed(ActionEvent event) {

    }  
  }
  private class OyenteBotonExtraerUSD implements ActionListener {
    public void actionPerformed(ActionEvent event) {

    }  
  }
  private class OyenteBotonDepositarUSD implements ActionListener {
    public void actionPerformed(ActionEvent event) {

    }  
  }
  private class OyenteBotonConsultarUSD implements ActionListener {
    public void actionPerformed(ActionEvent event) {

    }  
  }
}