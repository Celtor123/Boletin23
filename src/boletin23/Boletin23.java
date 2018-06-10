
package boletin23;

import javax.swing.JOptionPane;

public class Boletin23 {

    public static void main(String[] args) {
        int g=Integer.parseInt(JOptionPane.showInputDialog("elixa o boletin preciso\n"+"1\n"+"2\n"+"3\n"+"4\n"));
        switch(g){
            case 1:
 Bln31 a= new Bln31();
       a.setVisible(true);
       break;
            case 2:
 Bln32 b= new Bln32();
         b.setVisible(true);
         break;
            case 3:
  Bln33 c= new Bln33();
            c.setVisible(true);
                break;
            case 4:
  Bln341 d= new Bln341();
        d.setVisible(true);
        break;
    
        default:
        break;
     }
    }    
}
