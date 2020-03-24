package View;

import Controllers.PrimaryController;
import Models.Student;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.border.EmptyBorder;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class PrimaryView extends JFrame{
    
    private final PrimaryController controller;    
    private Label studentIDLabel,studentFirstNameLabel, studentLastNameLabel,
                  studentAverageLabel;
    private JLabel infoLabel;
    private TextBox studentIDValue, studentFirstNameValue, studentLastNameValue, studentAverageValue;
    private Button getData, setData, resetData;
    
    // My Inner Classes To Help With Common Tasks ******************************
    
    class Label extends JLabel{
        public Label(String title){
            super(title, RIGHT);
            super.setPreferredSize(new Dimension(120, 20));
        }
    }
    
    class TextBox extends JTextField{
        public TextBox(){
            super(20);
        }
    }
    
    class Button extends JButton{
        public Button(String buttonText){
            super(buttonText);
        }
    }
    
    // Public Default Constructor **********************************************
    
    public PrimaryView(){
        controller = new PrimaryController();
    }
    
    // Methods
    
    private JPanel constructorFramePanel(){
        
        // Main Panel With BorderLayout ****************************************
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(5, 0, 0, 0));
        
        // Panel For Labels And TextBoxes With GridBagLayout *******************
        
        JPanel displayPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        // Student ID Information **********************************************
        
        studentIDLabel = new Label("Student ID:  ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        displayPanel.add(studentIDLabel, constraints);
        
        studentIDValue = new TextBox();
        constraints.gridx = 2;
        constraints.gridy = 1;
        displayPanel.add(studentIDValue, constraints);
        
        // Student First Name Information **************************************
        
        studentFirstNameLabel = new Label("First Name:  ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        displayPanel.add(studentFirstNameLabel, constraints);
        
        studentFirstNameValue = new TextBox();
        constraints.gridx = 2;
        constraints.gridy = 2;
        displayPanel.add(studentFirstNameValue, constraints);
        
        // Student Last Name Information **************************************
        
        studentLastNameLabel = new Label("Last Name:  ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        displayPanel.add(studentLastNameLabel, constraints);
        
        studentLastNameValue = new TextBox();
        constraints.gridx = 2;
        constraints.gridy = 3;
        displayPanel.add(studentLastNameValue, constraints);
        
        // Student Average Information *****************************************
        
        studentAverageLabel = new Label("Student Average:  "); 
        constraints.gridx = 0;
        constraints.gridy = 4;
        displayPanel.add(studentAverageLabel, constraints);
        
        studentAverageValue = new TextBox();
        constraints.gridx = 2;
        constraints.gridy = 4;
        displayPanel.add(studentAverageValue, constraints);
        
        // Panel For Buttons With Flowlayout
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        getData = new Button("Get Data");
        getData.addActionListener(e -> {
            try {
                refreshStudentData();
            } catch (IOException ex) {
                Logger.getLogger(PrimaryView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        buttonPanel.add(getData);
        
        setData = new Button("Set Data");
        setData.addActionListener(e -> {
            try {
                updateStudentData();
            } catch (IOException ex) {
                Logger.getLogger(PrimaryView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        buttonPanel.add(setData);
        
        resetData = new Button("Reset Data");
        resetData.addActionListener(e -> {
            try {
                resetStudentData();
            } catch (IOException ex) {
                Logger.getLogger(PrimaryView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        buttonPanel.add(resetData);
        
        // Information Panel With BorderLayout *********************************
        // Used To Diplay Feedback To User Upon Clicking Buttons
        
        JPanel infoPanel = new JPanel(new BorderLayout());
        infoLabel = new JLabel("", LEFT);
        infoLabel.setPreferredSize(new Dimension(270, 20));
        infoLabel.setForeground(Color.blue);
        infoPanel.add(infoLabel, BorderLayout.WEST);
        
        // Add Panels To Main Panel And Return The Main Panel To Caller ********
        
        mainPanel.add(displayPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(infoPanel, BorderLayout.SOUTH);
        
        return mainPanel;
    }
    
    private void refreshStudentData() throws IOException{
        Student student = controller.getStudentData();
        studentIDValue.setText(String.valueOf(student.getStudentID()));
        studentFirstNameValue.setText(student.getFirstName());
        studentLastNameValue.setText(student.getLastName());
        studentAverageValue.setText(Double.toString(student.getStudentAverage()));
        
        infoLabel.setText("   Student Data Has Been Successfully Retrieved");
    }
    
    private void updateStudentData() throws IOException{
        Student student = new Student();
        student.setStudentID(Integer.parseInt(studentIDValue.getText()));
        student.setFirstName(studentFirstNameValue.getText());
        student.setLastName(studentLastNameValue.getText());
        student.setStudentAverage(Double.parseDouble(studentAverageValue.getText()));
        
        controller.setStudentData(student);
        infoLabel.setText("   Student Data Has Been Successfully Updated");
        
    }
    
    private void resetStudentData() throws IOException{
        controller.resetStudentData();
        infoLabel.setText("   Student Data Has Been Successfully Reset");
    }
    
    public void showApplication(){
        setTitle("Student Form Data");
        setSize(600, 180);
        add(constructorFramePanel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
