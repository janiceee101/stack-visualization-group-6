/* Description: Swing GUI that visualizes an array-based stack in 2D. Every button
   calls a method of ArrayStack, then the panel is repainted from the stack's state.

   Programmed by: Kristel Angel R. Protacio, BSIT, 48079, CC104

   Last Modified: October 19, 2026

   Version: 1.2

   Acknowledgements: Claude Sonnet 5.5 (Anthropic) was used to draft this code.
   Prompt: Help me connect the Stack Visualizer GUI buttons to their corresponding methods in ArrayStack, 
   including PUSH, POP, PEEK, CLEAR, CHECK STACK, and RANDOM, and refresh the display after each operation.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class StackGUI extends JFrame {

    private ArrayStack stack = new ArrayStack();

    private StackPanel stackPanel = new StackPanel();
    private JTextField inputField = new JTextField(8);
    private JLabel statusLabel = new JLabel("Welcome! Enter a value and click PUSH.");

    public StackGUI() {
        super("Stack Visualizer (Array-based, capacity 10)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // ---------- controls (right side) ----------
        JPanel controls = new JPanel(new GridLayout(9, 1, 5, 5));
        controls.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 10));

        JButton pushBtn = new JButton("PUSH");
        JButton popBtn = new JButton("POP");
        JButton peekBtn = new JButton("PEEK");
        JButton clearBtn = new JButton("CLEAR");
        JButton checkBtn = new JButton("CHECK STACK");
        JButton randomBtn = new JButton("RANDOM");

        controls.add(new JLabel("Enter a value:"));
        controls.add(inputField);
        controls.add(pushBtn);
        controls.add(popBtn);
        controls.add(peekBtn);
        controls.add(clearBtn);
        controls.add(checkBtn);
        controls.add(randomBtn);

        // ---------- status (bottom) ----------
        statusLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 8, 10));
        statusLabel.setFont(new Font("SansSerif", Font.BOLD, 13));

        add(stackPanel, BorderLayout.CENTER);
        add(controls, BorderLayout.EAST);
        add(statusLabel, BorderLayout.SOUTH);

       // ---------- button actions ----------
       pushBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doPush(); }
       });
       popBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doPop(); }
       });
       peekBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doPeek(); }
       });
       clearBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doClear(); }
       }); 
       checkBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doCheck(); }
       });
       randomBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doRandom(); }
       });
       // pressing Enter in the text field also pushes
       inputField.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { doPush(); }
       });
       
        pack();
        setLocationRelativeTo(null);
    }

       // ================= operations (GUI -> ArrayStack methods) =================

   private void doPush() { }
   private void doPop() { }
   private void doPeek() { }
   private void doClear() { }
   private void doCheck() { }
   private void doRandom() { }

   private void status(String msg) {
      statusLabel.setText(msg);
   }

   private void refresh() { 
      stackPanel.repaint();
   }

    private class StackPanel extends JPanel {
        public StackPanel() {
            setPreferredSize(new Dimension(280, 10 * (40 + 4) + 40));
            setBackground(Color.WHITE);
        }
    }

    // ================= main =================

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StackGUI().setVisible(true);
            }
        });
    }
}
