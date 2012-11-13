package belajar.com.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventDemo {

  public static void main(String args[]) {
    JFrame frame = new JFrame("Conto Tombol");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final JButton button1 = new JButton("Kau yang memilih aku");
    final JButton button2 = new JButton("Jangan pilih aku");
    final Random random = new Random();

    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        JButton button = (JButton) actionEvent.getSource();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        button.setBackground(new Color(red, green, blue));
      }
    };

    PropertyChangeListener pcl = new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent pce) {
        String property = pce.getPropertyName();
        if ("background".equals(property)) {
          button2.setBackground((Color) pce.getNewValue());
        }
      }
    };

    button1.addActionListener(actionListener);
    button1.addPropertyChangeListener(pcl);
    button2.addActionListener(actionListener);

    frame.add(button1, BorderLayout.NORTH);
    frame.add(button2, BorderLayout.SOUTH);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }

}
