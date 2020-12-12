
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class PRINCIPAL extends JFrame {

	Double pago;
	public void settotal(Double total) {
		 pago=total;
	}
	
	public Double gettotal() {
		 return pago;
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL frame = new PRINCIPAL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public PRINCIPAL() {
		
		
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 204, 204));
		menuBar.setBounds(0, 0, 434, 30);
		contentPane.add(menuBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(30, 55, 356, 181);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 42, 264, 116);
		panel.add(textArea);
		
		
		
		JMenu mnNewMenu = new JMenu("LISTA");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(Color.RED);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmProductos = new JMenuItem("PRODUCTOS");
                PRINCIPAL P = this;
		mntmProductos.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
                        
                            FACTURA F = new FACTURA(P);
                            F.show();
			}
		});
		mnNewMenu.add(mntmProductos);
		
		JMenu mnNewMenu_2 = new JMenu("PAGO");
		mnNewMenu_2.setBackground(Color.WHITE);
		mnNewMenu_2.setForeground(Color.RED);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("EFECTIVO");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mousePressed(MouseEvent e) {
				
				Double p=gettotal();
				textArea.append("El total pagado es "+p+"\n");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("TARJETA");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JMenuItem mntmBcp = new JMenuItem("BCP");
		mnNewMenu_3.add(mntmBcp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("VISA");
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenuItem mntmMastercard = new JMenuItem("MASTERCARD");
		mnNewMenu_3.add(mntmMastercard);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("SCOTIABANK");
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_5 = new JMenu("SALIR");
		mnNewMenu_5.setBackground(Color.WHITE);
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JMenu mnNewMenu_1 = new JMenu("CUENTA");
		mnNewMenu_1.setBackground(Color.WHITE);
		mnNewMenu_1.setForeground(Color.RED);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.setForeground(Color.RED);
		menuBar.add(mnNewMenu_5);
		
	
		
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS A TOTTUS");
		lblNewLabel.setForeground(new Color(51, 153, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(75, 11, 208, 20);
		panel.add(lblNewLabel);
		

	}
}