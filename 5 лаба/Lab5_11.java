import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner; 
public class Lab5_11 extends Frame {
    int i = 0;
    Button b1 = new Button("Add");
    TextField tf1 = new TextField();
    Label label1 = new Label("Введите ФИО");
    List lf = new List();
    List li = new List();
    List lo = new List();
    public Lab5_11(){
        setLayout(null);
        setSize(600,400);
        setTitle("Demo");
        setBackground(Color.cyan);
        add(b1);
        b1.setBounds(220,200,84,24);
        b1.setForeground(Color.black);
        b1.setBackground(Color.magenta);
        add(tf1);
        tf1.setBounds(200,80,120,20);
        add(label1);
        label1.setBounds(200,55,120,20);
        add(lf);
        lf.setBackground(Color.white);
        lf.setBounds(350,120,50,216);
        add(li);
        li.setBackground(Color.white);
        li.setBounds(405,120,50,216);
        add(lo);
        lo.setBackground(Color.white);
        lo.setBounds(460,120,50,216);
        addWindowListener(new WindowClose());
        b1.addActionListener(new ButtonAdd());
    }
    public void DialogFrame(String tex){
        DemoDialog d=new DemoDialog(this, "Диалоговое окно", true, tex);
    }


    class DemoDialog extends Dialog implements ActionListener{
        Button btn;
        public DemoDialog(Lab5_11 ff, String title, boolean b, String te){
            super(ff, title,b);
            setLayout(new FlowLayout(FlowLayout.LEFT));
            Label er = new Label(te);
            add(er);
            btn=new Button("Закрыть");
            setSize(300,200);
            add(btn);
            btn.addActionListener(this);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent ae){
            setVisible(false);
        }
    }

    class WindowClose extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            setVisible(false);
        }
    }
    
    class ButtonAdd implements ActionListener {
        public void actionPerformed(ActionEvent event){
            if (i < 10){
                String s = tf1.getText();
                String[] fio = s.split(" ");
                if (fio.length == 3){
                    lf.add(fio[0],2);
                    li.add(fio[1],2);
                    lo.add(fio[2],2);
                    i = i + 1;
                }
                else{
                    DialogFrame("Введите в формате Ф И О");
                }
            }
            else {
                DialogFrame("Кол-во фамилий больше 10");
            }
        }
    }



    public static void main(String[] args) {
        Lab5_11 MyFrame = new Lab5_11();
        MyFrame.setVisible(true);
    }
}