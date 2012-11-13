package belajar.com.event;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseEventDemo extends JPanel
        implements MouseListener {
    BlankArea blankArea;
    JTextArea textArea;
    static final String NEWLINE = System.getProperty("line.separator");
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Mouse Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent newContentPane = new MouseEventDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public MouseEventDemo() {
        super(new GridLayout(0,1));
        blankArea = new BlankArea(Color.YELLOW);
        add(blankArea);
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(200, 75));
        add(scrollPane);
        
        blankArea.addMouseListener(this);
        addMouseListener(this);
        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
    
    void eventOutput(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " terdeteksi di "
                + e.getComponent().getClass().getName()
                + "." + NEWLINE);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
    
    public void mousePressed(MouseEvent e) {
        eventOutput("Mousenya dipencet (# di klik sebanyak: "
                + e.getClickCount() + ")", e);
    }
    
    public void mouseReleased(MouseEvent e) {
        eventOutput("Mousenya dirilis (# di klik sebanyak: "
                + e.getClickCount() + ")", e);
    }
    
    public void mouseEntered(MouseEvent e) {
        eventOutput("Mousenya masuk", e);
    }
    
    public void mouseExited(MouseEvent e) {
        eventOutput("Mousenya keluar", e);
    }
    
    public void mouseClicked(MouseEvent e) {
        eventOutput("Mousenya diklik (# di klik sebanyak: "
                + e.getClickCount() + ")", e);
    }
}
