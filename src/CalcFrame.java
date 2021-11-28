import javax.swing.*;

public class CalcFrame extends JFrame {

    CalcFrame(){

        //IKONKA
        ImageIcon icon = new ImageIcon("calcIcon.png");

        //OKNO
        this.setTitle("Kalkulator");
        this.setBounds(200, 200, 195, 218);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(icon.getImage());

    }

}
