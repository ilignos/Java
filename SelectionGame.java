import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SelectionGame extends JFrame implements ActionListener {
    JFrame window = new JFrame("TITAN");
    JLabel l = new JLabel("VRES TON BILLARA");
    JButton b[] = new JButton[25];
    JPanel up = new JPanel();
    JPanel down = new JPanel();
    Random rand = new Random();
    int ran;
    public TITAN_1()
    {
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        up.setLayout(new GridLayout(1,1));
        down.setLayout(new GridLayout(5,5));
        up.add(l);
        ran=1+rand.nextInt(25);
        System.out.println(ran);
        for (int i=0;i<25;i++){
            b[i]= new JButton(""+(i+1));
            down.add(b[i]);
            b[i].addActionListener(this);
            }
        window.setLayout(new GridLayout(2,1));
        window.add(up);
        window.add(down);
        
        window.pack();  //you need to put this here so when you run the program you wont need to resize to appear
        window.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b[ran]){
            JOptionPane.showMessageDialog(null,"OP TON TSAKWSES","OP TON TSAKWSES",JOptionPane.ERROR_MESSAGE);}
        else{
            JOptionPane.showMessageDialog(null,"DN EINAI EDW O BILLARAS","DN EINAI EDW O BILLARAS",JOptionPane.ERROR_MESSAGE);}
        ran = 1+rand.nextInt(25);
        System.out.println(ran);
    
    
    }
    public static void main(String[] args){
        TITAN_1 g = new TITAN_1(); 
                }
}
