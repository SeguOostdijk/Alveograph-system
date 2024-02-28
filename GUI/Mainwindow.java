package GUI;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;


public class Mainwindow extends JFrame{
   public Mainwindow(){ 
     setSize(500,500);
     setVisible(true);
     setTitle("Alveolink");
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLocationRelativeTo(null); 
     getContentPane().setBackground(Color.BLUE.darker());
     initializecomponents();
   }
   private void initializecomponents(){
     JPanel panel=new JPanel();
     getContentPane().add(panel);
     panel.setLayout(null);
     panel.setBackground(Color.BLUE.darker());
     panel.setBounds(550,150,800,900);
     JLabel title=new JLabel("ALVEOLINK");
     labels(title);
     title.setBounds(150, 0, 500,50);
     panel.add(title);
     buttons(panel);  
     LocalDate datenow = LocalDate.now();
     int day=datenow.getDayOfMonth();
     int month=datenow.getMonthValue();
     int year=datenow.getYear();
     String datenowstr=day+"/"+month+"/"+year; 
     JLabel labeldatenow=new JLabel(datenowstr);
     labels(labeldatenow);
     labeldatenow.setBounds(150,650, 500,50);
     panel.add(labeldatenow);
     LocalTime time=LocalTime.now();
     String timestr=time.toString();
     timestr=timestr.substring(0, 8);
     JLabel timelabel=new JLabel(timestr);
     labels(timelabel);
     timelabel.setBounds(150, 750, 500, 50);
     panel.add(timelabel);
   }
   private void labels(JLabel label){
    label.setForeground(Color.BLACK);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setFont(new Font("arial",Font.PLAIN,50));
   }
    private void buttons(JPanel panel){
    JPanel Panelbuttons=new JPanel();
    Panelbuttons.setBackground(Color.BLUE.darker()); 
    Panelbuttons.setLayout(new GridLayout(2,2,100,80));
    Panelbuttons.setBounds(50,150,700,400); 
    for(int i=1;i<6;i++){
       JButton button=new JButton();
       JLabel Description=new JLabel();
       Description.setForeground(Color.WHITE);
       Description.setHorizontalAlignment(SwingConstants.CENTER);
       Description.setFont(new Font("arial",Font.PLAIN,16));
       Panelbuttons.add(button);
       button.setSize(200,200);
       button.setBorder( new MatteBorder(3,3,3,3,Color.GRAY));
       button.setBackground(Color.WHITE);
       panel.add(Description);
       switch (i) {
        case 1:
        {
          ImageIcon curve=new ImageIcon("GUI/MW-icons/curvesicon.png");
          button.setIcon(new ImageIcon(curve.getImage().getScaledInstance(button.getWidth(),button.getHeight(), Image.SCALE_SMOOTH)));
          Description.setText("Curvas ALVEO");
          Description.setBounds(60, 310, 150, 50);
          break;
        }
        case 2:
        {
          ImageIcon clients=new ImageIcon("GUI/MW-icons/clientsicon.png");
          button.setIcon(new ImageIcon(clients.getImage().getScaledInstance(button.getWidth(),button.getHeight(), Image.SCALE_SMOOTH)));
          Description.setText("Clientes");
          Description.setBounds(350, 310, 100, 50);
          break;
        }
        case 3:
        {
          ImageIcon calibration=new ImageIcon("GUI/MW-icons/calibrationicon.png");
          button.setIcon(new ImageIcon(calibration.getImage().getScaledInstance(button.getWidth(),button.getHeight(), Image.SCALE_AREA_AVERAGING)));
          Description.setText("Calibración");
          Description.setBounds(620, 310, 100, 50);
          break;
        }
        case 4:{
          ImageIcon settings=new ImageIcon("GUI/MW-icons/settingsicon.png");
          button.setIcon(new ImageIcon(settings.getImage().getScaledInstance(button.getWidth(),button.getHeight(), Image.SCALE_SMOOTH)));
          Description.setText("Configuración");
          Description.setBounds(60, 550, 150, 50);
          break;
        }
        default:{
          ImageIcon backup=new ImageIcon("GUI/MW-icons/backupicon.png");
          button.setIcon(new ImageIcon(backup.getImage().getScaledInstance(button.getWidth(),button.getHeight(), Image.SCALE_SMOOTH)));
          Description.setText("Transferencia");
          Description.setBounds(325, 550, 150, 50);
        }
       }
    
    }
     panel.add(Panelbuttons);
  }
}
