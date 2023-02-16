import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame_Puzzle extends Frame implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    Frame_Puzzle() {
        super("Puzzle Frame");
        b1 = new Button("1");
        b1.setBounds(50, 100, 40, 50);
        b2 = new Button("2");
        b2.setBounds(100, 100, 40, 50);
        b3 = new Button("3");
        b3.setBounds(150, 100, 40, 50);
        b4 = new Button("4");
        b4.setBounds(50, 150, 40, 50);
        b5 = new Button("5");
        b5.setBounds(100, 150, 40, 50);
        b6 = new Button("6");
        b6.setBounds(150, 150, 40, 50);
        b7 = new Button("7");
        b7.setBounds(50, 200, 40, 50);
        b8 = new Button("8");
        b8.setBounds(100, 200, 40, 50);
        b9 = new Button("9");
        b9.setBounds(150, 200, 40, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);



    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            String label=b1.getLabel();
            if(b2.getLabel().equals(""));{
                b2.setLabel(label);
                b1.setLabel("");
            }
            if(b4.getLabel().equals(""));{
                b4.setLabel(label);
                b1.setLabel("");
            }
        }
        if(e.getSource()==b2){
            String label=b2.getLabel();
            if(b1.getLabel().equals(""));{
                b1.setLabel(label);
                b2.setLabel("");
            }
            if(b3.getLabel().equals(""));{
                b3.setLabel(label);
                b2.setLabel("");
            }
            if(b5.getLabel().equals(""));{
                b5.setLabel(label);
                b2.setLabel("");
            }
        }

    }

    public static void main(String[] args) {
        //TODO
        new Frame_Puzzle();
    }


}