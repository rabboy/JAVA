import java.awt.*; //импортируем библиотеку Awt
import javax.swing.*; //импортируем библиотеку swing
public class Lab2_House extends JFrame {
    Lab2_House(String s) {//создаем конструктор класса Lab2_House
        super(s);
        setLayout(null); //отключение менеджера компонентов окна
        setSize(300,500); //указываем размеры окна
        setVisible(true); //делаем окно видимым
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //закрытие окна
    }
    public void paint(Graphics my_picture){ //метод paint()
        my_picture.setColor(Color.LIGHT_GRAY); 
        my_picture.fillRect(0, 0, 300, 800);
        my_picture.setColor(Color.BLACK);
        my_picture.drawLine(140, 100, 50, 250);
        my_picture.drawLine(140, 100, 230, 250);
        my_picture.drawLine(50, 250, 230, 250);
        my_picture.drawRect(65, 250, 150, 170);
        my_picture.drawOval(85, 310, 40, 40);
        my_picture.drawRect(145, 280, 55, 140);
        my_picture.drawOval(155, 340, 10, 10);
    }
    public static void main(String[] args) {
        new Lab2_House(""); //создаем экземпляр класса Lab2_House
    }
} 