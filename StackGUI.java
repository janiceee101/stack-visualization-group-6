/* Description: Swing GUI that visualizes an array-based stack in 2D. Every button
   calls a method of ArrayStack, then the panel is repainted from the stack's state.

   Programmed by: Kristel Angel R. Protacio, BSIT, 48079, CC104

   Last Modified: October 19, 2026

   Version: 1.0

   Acknowledgements: Claude Sonnet 5.5 (Anthropic) was used to draft this code.
   Prompt:  Help me create a basic Java Swing GUI for our Stack Visualizer with a main window, 
   stack display placeholder, input field, and status label, and explain the code simply.
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

        // ---------- status (bottom) ----------
        statusLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 8, 10));
        statusLabel.setFont(new Font("SansSerif", Font.BOLD, 13));

        add(stackPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
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
