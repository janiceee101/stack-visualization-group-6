/* Description: Swing GUI that visualizes an array-based stack in 2D. Every button
   calls a method of ArrayStack, then the panel is repainted from the stack's state.

   Programmed by: Kristel Angel R. Protacio, Kayen Faith S. Antiporta, BSIT, 48079, CC104

   Last Modified: October 20, 2026

   Version: 1.4

   Acknowledgements: Claude Sonnet 5.5 (Anthropic) was used to draft this code.
   Kristel Prompt: Help me connect the Stack Visualizer GUI buttons to their corresponding methods in ArrayStack, 
   including PUSH, POP, PEEK, CLEAR, CHECK STACK, and RANDOM, and refresh the display after each operation.
   Kayen Prompt: 
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

      // ================= drawing panel =================

    private class StackPanel extends JPanel {

        private final int SLOT_H = 40;
        private final int GAP = 4;
        private final int BLOCK_W = 140;
        private final int LEFT = 70;

        public StackPanel() {
            setPreferredSize(new Dimension(280, 10 * (SLOT_H + GAP) + 40));
            setBackground(Color.WHITE);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int[] items = stack.toArray();          // read a copy from the stack
            int base = getHeight() - 15;            // bottom of the stack

            // empty slots (outline)
            g2.setColor(Color.LIGHT_GRAY);
            for (int i = 0; i < ArrayStack.CAPACITY; i++) {
                int y = base - (i + 1) * (SLOT_H + GAP) + GAP;
                g2.drawRect(LEFT, y, BLOCK_W, SLOT_H);
            }

            // filled blocks, bottom to top
            g2.setFont(new Font("SansSerif", Font.BOLD, 18));
            for (int i = 0; i < items.length; i++) {
                int y = base - (i + 1) * (SLOT_H + GAP) + GAP;
                boolean isTop = (i == items.length - 1);

                if (isTop) {
                    g2.setColor(new Color(120, 190, 120));
                } else {
                    g2.setColor(new Color(130, 170, 230));
                }
                g2.fillRect(LEFT, y, BLOCK_W, SLOT_H);
                g2.setColor(Color.BLACK);
                g2.drawRect(LEFT, y, BLOCK_W, SLOT_H);

                String s = String.valueOf(items[i]);
                FontMetrics fm = g2.getFontMetrics();
                g2.drawString(s, LEFT + (BLOCK_W - fm.stringWidth(s)) / 2,
                        y + (SLOT_H + fm.getAscent()) / 2 - 3);

                if (isTop) {
                    g2.drawString("Top ->", 5, y + (SLOT_H + fm.getAscent()) / 2 - 3);
                }
            }

            if (items.length == 0) {
                g2.setColor(Color.GRAY);
                g2.drawString("(empty)", LEFT + 35, base - SLOT_H / 2);
            }
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
