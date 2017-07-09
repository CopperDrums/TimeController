import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame  {
        int width;
        int height;

        JPanel panel;
        public static void main(String[] args)  {
                run();
        }
        public UserInterface()  {
                setup();
        }

        private void setup()  {
            width=800;
            height=600;

            panel=new UserInterfacePanel();
            add(panel);

            setSize(width, height);
            setTitle("Real work timer");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        public static void run()  {
                UserInterface gui=new UserInterface();
                gui.setVisible(true);
        }
}

class UserInterfacePanel extends JPanel {
            private JToggleButton startButton;
            private JToggleButton stopButton;

            public static void main(String[] args)  {

            }

            public UserInterfacePanel()  {
                setup();
            }

            private void setup()  {
                setLayout(new GridLayout(1,2));
             //   setCursor(new Cursor(Cursor.HAND_CURSOR));

                setupButtons();
                setupButtonsActions();
                add(startButton);
                add(stopButton);
            }

            private void setupButtons()  {

                    ImageIcon iconStartButton = new ImageIcon("C:\\Users\\parsecer\\Desktop\\" +
                                    "temp10\\dev\\projects\\getjavajob\\TimeControler\\imgs\\greenReleased.png");
                    ImageIcon iconStopButton=new ImageIcon("C:\\Users\\parsecer\\Desktop\\"+
                                    "temp10\\dev\\projects\\getjavajob\\TimeControler\\imgs\\redReleased.png");

                    startButton=new JToggleButton(iconStartButton);
                    stopButton=new JToggleButton(iconStopButton);

                    startButton.setHorizontalAlignment(JButton.CENTER);
                    stopButton.setHorizontalAlignment(JButton.CENTER);
                    startButton.setAlignmentX(CENTER_ALIGNMENT);
                    stopButton.setAlignmentX(CENTER_ALIGNMENT);
                    startButton.setAlignmentY(CENTER_ALIGNMENT);
                    stopButton.setAlignmentY(CENTER_ALIGNMENT);

                    setupButtonIcon(startButton);
                    setupButtonIcon(stopButton);

                    ImageIcon iconStartButtonPressed=new ImageIcon("C:\\Users\\parsecer\\Desktop\\" +
                            "temp10\\dev\\projects\\getjavajob\\TimeControler\\imgs\\greenPressed.png");
                    startButton.setDisabledIcon(iconStartButton);
                    startButton.setPressedIcon(iconStartButtonPressed);
                    startButton.setSelectedIcon(iconStartButtonPressed);

                    ImageIcon iconStopButtonPressed=new ImageIcon("C:\\Users\\parsecer\\Desktop\\" +
                            "temp10\\dev\\projects\\getjavajob\\TimeControler\\imgs\\redPressed.png");
                    stopButton.setDisabledIcon(iconStopButton);
                    stopButton.setPressedIcon(iconStopButtonPressed);
                    stopButton.setSelectedIcon(iconStopButtonPressed);

            }

            private void setupButtonsActions()  {
                        startButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                        stopButton.setSelected(false);
                                        startButton.setSelected(true);
                                        repaint();
                            }
                        });

                        stopButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                    startButton.setSelected(false);
                                    stopButton.setSelected(true);
                                    repaint();
                            }
                        });
            }

            private void setupButtonIcon(JToggleButton button)  {
                button.setBorder(BorderFactory.createEmptyBorder());
                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                button.setFocusable(false);
                button.setPreferredSize(new Dimension(80, 80));
                button.setFocusPainted(false);
                button.setOpaque(false);
            }
        }

