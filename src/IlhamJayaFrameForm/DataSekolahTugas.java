import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class frameEmptyTable extends JFrame
{
	private JPanel contentPane;
	private JTextField txtNama;
	private JLabel lblNama;
	private JTextField txtAlamat;
	private JTextField txtEmail;
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel tabelModel;
	String header[] = {"No","Nama", "Alamat", "Email"};
	private JButton btnTambah;
	private JButton btnClean;
	private JLabel lblIcon;
	private JLabel lblIcon2;
	private JLabel lblWall;

	/**
	 * Create the frame.
	 */
	public frameEmptyTable() 
	{
		setTitle("Clean Table");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNama = new JLabel("Nama : ");
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNama.setBounds(12, 18, 70, 15);
		contentPane.add(lblNama);
		
		txtNama = new JTextField();
		txtNama.setBounds(86, 12, 196, 27);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblAlamat = new JLabel("Alamat : ");
		lblAlamat.setForeground(new Color(255, 255, 255));
		lblAlamat.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblAlamat.setBounds(12, 71, 60, 15);
		contentPane.add(lblAlamat);
		
		txtAlamat = new JTextField();
		txtAlamat.setBounds(86, 65, 290, 27);
		contentPane.add(txtAlamat);
		txtAlamat.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEmail.setBounds(12, 117, 60, 15);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(86, 111, 203, 27);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 211, 440, 142);
		contentPane.add(scrollPane);
		
		tabelModel = new DefaultTableModel(null, header);
		table = new JTable();
		table.setModel(tabelModel);
		scrollPane.setViewportView(table);
		
		btnTambah = new JButton("Tambah");
		btnTambah.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/noTable/Simpan.png"));
		btnTambah.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent act)
			{
				Object obj[] = new Object[4];
				obj[1] = txtNama.getText();
				obj[2] = txtAlamat.getText();
				obj[3] = txtEmail.getText();
				
				tabelModel.addRow(obj);
				noTable(); // Method No Urut Table
			}
		});
		btnTambah.setBounds(96, 160, 126, 39);
		contentPane.add(btnTambah);
		
		btnClean = new JButton("Clean");
		btnClean.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/noTable/refresh.png"));
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act)
			{
				txtNama.setText("");
				txtAlamat.setText("");
				txtEmail.setText("");
				txtNama.requestFocus();
				cleanTable();
			}
		});
		btnClean.setBounds(236, 160, 117, 39);
		contentPane.add(btnClean);
		
		lblIcon2 = new JLabel("Pelanggan");
		lblIcon2.setForeground(new Color(204, 255, 255));
		lblIcon2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblIcon2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIcon2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblIcon2.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/EmptyDataTable/icon3.png"));
		lblIcon2.setBounds(530, 18, 93, 125);
		contentPane.add(lblIcon2);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/EmptyDataTable/icon1.png"));
		lblIcon.setBounds(487, -12, 148, 164);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/EmptyDataTable/AirWallpaper.png"));
		lblWall.setBounds(0, -12, 635, 440);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
	}
	
	//No Urut Table
	public void noTable()
	{
		int baris = tabelModel.getRowCount();
		for(int a=0; a<baris; a++)
		{
			String nomor = String.valueOf(a+1);
			tabelModel.setValueAt(nomor + ".", a, 0);
		}
	}
	
	//Mengosongkan isi JTable
	public void cleanTable()
	{
		int baris = tabelModel.getRowCount();
		for(int a=0;a<baris;a++)
		{
			tabelModel.removeRow(0);
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.setTheme("Large-Font", "Java Swing", "");
			        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			        frameEmptyTable frame = new frameEmptyTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}