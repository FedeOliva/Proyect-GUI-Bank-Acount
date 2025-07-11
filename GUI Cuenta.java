import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class GuiCuenta extends JFrame {
  /*Atributos de instancia, objetos gráficos y de la aplicación*/
  private int saldoPesos, saldoUSD;
  private Container contenedor;
  private JLabel tituloPesos, tituloUSD, saldoPesosEtiqueta, saldoUSDEtiqueta;
  private JPanel panelPesos, panelUSD;
  private JButton botonExtraerPesos, botonDepositarPesos, botonConsultarPesos, botonExtraerUSD, botonDepositarUSD, botonConsultarUSD;
  private JTextField montoAExtraer, montoADepositar;
  public GuiCuenta(){
    super ("Cuenta");
    //Inicializa variables
    saldoPesos = 0;
    saldoUSD = 0;
    //Establece los valores de los atributos del frame
    contenedor = getContentPane(); 
    contenedor.setLayout(new GridLayout(1,2));
    setLayout(new GridLayout());
    setSize(640, 480);  
    panelPesos.setLayout(new GridLayout(4,1));   
    panelPesos.getContentPane().setBackground(Color.BLUE); 
    panelUSD.setLayout(new GridLayout(4,1));   
    panelUSD.getContentPane().setBackground(Color.GREEN); 
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
    //Invoca a un método interno que completa la GUI
	  hacerGUI();
  }
  //Implementa las clases oyente
  private void hacerGUI(){
    //Crea las etiquetas para mostrar los dos fondos
    tituloPesos = new JLabel("Cuenta pesos");
    tituloUSD = new JLabel("Cuenta USD");
    saldoPesosEtiqueta = new JLabel(saldoPesos);
    saldoUSDEtiqueta = new JLabel(saldoUSD);
    //Crea los botones
    botonExtraerPesos = new JButton("Extraer pesos");
    botonDepositarPesos = new JButton("Depositar pesos");
    botonConsultarPesos = new JButton("Consultar fondo en pesos");
    botonExtraerUSD = new JButton("Extraer USD");
    botonDepositarUSD = new JButton("Depositar USD");
    botonConsultarUSD = new JButton("Consultar fondo en USD");
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
    //Inserta las componentes en los paneles del frame	
    panelPesos.getContentPane().add(tituloPesos);
    panelPesos.getContentPane().add(botonExtraerPesos);
    panelPesos.getContentPane().add(botonDepositarPesos);
    panelPesos.getContentPane().add(botonConsultarPesos);
    panelUSD.getContentPane().add(tituloUSD);
    panelUSD.getContentPane().add(botonExtraerUSD);
    panelUSD.getContentPane().add(botonDepositarUSD);
    panelUSD.getContentPane().add(botonConsultarUSD);
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