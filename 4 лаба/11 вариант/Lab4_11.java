
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Lab4_11 extends Frame {
    Lab4_11(String s){
        setLayout(null);
        setSize(300,300);
        setVisible(true);
        MenuBar menubar = new MenuBar();
        setMenuBar(menubar);
        Menu file = new Menu("File");
        menubar.add(file);
        Menu edit = new Menu("Edit");
        MenuItem probel = new MenuItem(" ");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        MenuItem sep = new MenuItem("-");
        Menu special = new Menu("Special");
        MenuItem first = new MenuItem("First");
        MenuItem second = new MenuItem("Second");
        MenuItem third = new MenuItem("Third");
        MenuItem debug = new MenuItem("Debug");
        MenuItem testing = new MenuItem("Testing");



        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(sep);
        edit.add(special);
        special.add(first);
        special.add(second);
        special.add(third);
        edit.add(debug);
        edit.add(testing);

        

        menubar.add(edit);
    }
    public static void main(String[] args) {
        new Lab4_11("Demo Frame"); 
    }
}
