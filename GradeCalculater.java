import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GradeCalculater extends JFrame implements ActionListener {

    // instance Variables
    Container   con,subContainer,resulContainer;
    JFrame      home,subjectWindow,resultWindow;
    JLabel      title,name,rollNumber,dateOfBirth,SRemark,SGrade,SAverage;
    JLabel      note,note2,totalMark,totalMarksObtain;
    JLabel      physics,chemistry,mathematics,python,english;
    JTextField  nameText,rollText,dateOfBirthText;
    JTextField  physicsText,chemistryText,mathematicsText,pythonText,englishText;
    JButton     marks,generate;
    int[]       markslist= new int[5];
    int         average;
    String      grade,studentName,studentRollNumber,studentDOB,remarks;   
    JTable      resultTable; 
    int         totalMarks;
    

    // Labels 
    public void note() {
        String noteText = "*Please Enter your details*";
        note = new JLabel(noteText);
        note.setFont(new Font("Arial",Font.BOLD,25));
        note.setBounds(320,240,400,30);
        note.setForeground(Color.RED);
        con.add(note);
    }

    public void title() {
        title = new JLabel("Student Grade Calculator");
        title.setBounds(300,50,500,35);
        title.setForeground(Color.BLUE.darker());
        title.setFont(new Font("Arial",Font.BOLD,32));
        con.add(title);
    }

    public void name() {
        name = new JLabel("Name");
        name.setBounds(270,100,200,35);
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Arial",Font.BOLD,28));
        con.add(name);
    }

    public void rollNumber() {
        rollNumber = new JLabel("Roll Number ");
        rollNumber.setBounds(270,150,200,35);
        rollNumber.setForeground(Color.BLACK);
        rollNumber.setFont(new Font("Arial",Font.BOLD,28));
        con.add(rollNumber);
    }

    public void dateOfBirth() {
        dateOfBirth = new JLabel("Date of Birth");
        dateOfBirth.setBounds(270,200,200,35);
        dateOfBirth.setForeground(Color.BLACK);
        dateOfBirth.setFont(new Font("Arial",Font.BOLD,28));
        con.add(dateOfBirth);
    }

    // Text area
    public void nameText() {
        nameText = new JTextField();
        nameText.setBounds(500,100,200,35);
        nameText.setFont(new Font("Arial",Font.BOLD,20));
        con.add(nameText);
    }

    public void rollText() {
        rollText = new JTextField();
        rollText.setBounds(500,150,200,35);
        rollText.setFont(new Font("Arial",Font.BOLD,20));
        con.add(rollText);
    }
    public void dateOfBirthText() {
        dateOfBirthText = new JTextField();
        dateOfBirthText.setBounds(500,200,200,35);
        dateOfBirthText.setFont(new Font("Arial",Font.BOLD,20));
        con.add(dateOfBirthText);
    }

    // Button
    public void generate() {
        marks=new JButton("Get Marks");
        marks.setBounds(380,280,200,30);
        marks.setFont(new Font("Arial",Font.BOLD,24));
        marks.setBackground(Color.GREEN);
        marks.setForeground(Color.WHITE);
        con.add(marks);
    }

    // Constructor
    GradeCalculater() {
        // Frame home
        home = new JFrame("Student Grade Calculater");
        home.setBounds(100,100,1000,500);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
        home.setResizable(false);
        ImageIcon ico = new ImageIcon("images.png");
        home.setIconImage(ico.getImage());
            con=home.getContentPane();            //Container 
            con.setLayout(null);
            con.setBackground(Color.GRAY);
            title();                              //Text Label
            name();
            rollNumber();
            dateOfBirth();
            nameText();                           //Text Area
            rollText();
            dateOfBirthText();
            note();           
            generate();                           //Button
            marks.addActionListener(this);
    }

    // New Window
    public void subjectWindow() {
        subjectWindow = new JFrame("Student Grade Calculater");
        subjectWindow.setBounds(100,100,1000,500);
        subjectWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subjectWindow.setVisible(true);
        subjectWindow.setResizable(false);
        ImageIcon ico = new ImageIcon("images.png");
        subjectWindow.setIconImage(ico.getImage());
            // Container
            subContainer=subjectWindow.getContentPane();
            subContainer.setBackground(Color.GRAY);
            subContainer.setLayout(null);
            // title
             title = new JLabel("Student Grade Calculator");
             title.setBounds(340,50,500,35);
             title.setForeground(Color.BLUE.darker());
             title.setFont(new Font("Arial",Font.BOLD,32));
             subContainer.add(title);

            //  Subjects
            // Chemistry
            chemistry = new JLabel("Chemistry");
            chemistry.setBounds(300, 100,200,30);
            chemistry.setForeground(Color.black.darker());
            chemistry.setFont(new Font("Arial",Font.BOLD,28));
            subContainer.add(chemistry);
            // Physics
            physics = new JLabel("Physics");
            physics.setBounds(300,145,200,30);
            physics.setForeground(Color.black.darker());
            physics.setFont(new Font("Arial",Font.BOLD,28));
            subContainer.add(physics);
            // English
            english = new JLabel("English");
            english.setBounds(300,190,200,30);
            english.setForeground(Color.BLACK.darker());
            english.setFont(new Font("Arial",Font.BOLD,28));
            subContainer.add(english);
            // Python
            python = new JLabel("Python");
            python.setBounds(300,235,200,30);
            python.setForeground(Color.BLACK.darker());
            python.setFont(new Font("Arial",Font.BOLD,28));
            subContainer.add(python);
            // Mathematics
            mathematics = new JLabel("Mathematics");
            mathematics.setBounds(300,280,200,30);
            mathematics.setForeground(Color.BLACK.darker());
            mathematics.setFont(new Font("Arial",Font.BOLD,28));
            subContainer.add(mathematics);

            // Subject text area
            // chemistry
            chemistryText = new JTextField();
            chemistryText.setBounds(540,100, 200,30);
            chemistryText.setFont(new Font("Arial",Font.BOLD,20));
            subContainer.add(chemistryText);
            // Physics
            physicsText = new JTextField();
            physicsText.setBounds(540,145,200,30);
            physicsText.setFont(new Font("Arial",Font.BOLD,20));
            subContainer.add(physicsText);
            // english
            englishText = new JTextField();
            englishText.setBounds(540,190,200,30);
            englishText.setFont(new Font("Arial",Font.BOLD,20));
            subContainer.add(englishText);
            // python
            pythonText = new JTextField();
            pythonText.setBounds(540,235,200,30);
            pythonText.setFont(new Font("Arial",Font.BOLD,20));
            subContainer.add(pythonText);
            // Mathematics
            mathematicsText = new JTextField();
            mathematicsText.setBounds(540,280,200,30);
            mathematicsText.setFont(new Font("Arial",Font.BOLD,20));
            subContainer.add(mathematicsText);

            // Note
            note2 = new JLabel("* Enter Details *");
            note2.setFont(new Font("Arial",Font.BOLD,25));
            note2.setForeground(Color.RED);
            note2.setBounds(400,325,200,30);
            subContainer.add(note2);

            // generate button
            generate = new JButton("Generate");
            generate.setBounds(415,370,150,30);
            generate.setFont(new Font("Arial",Font.BOLD,24));
            generate.setBackground(Color.GREEN);
            generate.setForeground(Color.WHITE);
            subContainer.add(generate);
            generate.addActionListener(this);
    }

    // Making the result
    public void result() {
        
        // Calculating Average
        markslist[0] = Integer.parseInt(physicsText.getText());
        markslist[1] = Integer.parseInt(chemistryText.getText());
        markslist[2] = Integer.parseInt(mathematicsText.getText());
        markslist[3] = Integer.parseInt(pythonText.getText());
        markslist[4] = Integer.parseInt(englishText.getText());
        totalMarks   = markslist[0]+markslist[1]+markslist[2]+markslist[3]+markslist[4];
        average = (int) totalMarks/5;
        // Calculation of  grade
        if(average>95) {
           grade="A+";
           remarks="Excelent";
        }
        else if(average>90 && average<=95) {
           grade="A";
           remarks="Very Good";
        }
        else if(average>85 && average<=90) {
           grade="B+";
           remarks="Good";
        }
        else if(average>80 && average<=85) {
           grade="B";
           remarks="Above Average";
        }
        else if(average>75 && average<=80) {
           grade="C+";
           remarks="Average";
        }
        else if(average>70 && average<=75) {
           grade="C";
           remarks="Below Average";
        }
        else if(average>65 && average<=70) {
           grade="D+";
           remarks="Can do better";
        }
        else if(average>60 && average<=65) {
           grade="D";
           remarks="Work Hard";
        }
        else {
           grade="E";
           remarks="Work Hard";
        }
        // Result Window
        resultWindow = new JFrame("Student Grade Calculator");
        resultWindow.setBounds(100,100,1000,700);
        resultWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        resultWindow.setVisible(true);
        resultWindow.setResizable(false);
        ImageIcon ico = new ImageIcon("images.png");
        resultWindow.setIconImage(ico.getImage());
            // Container
            resulContainer = resultWindow.getContentPane();
            resulContainer.setBackground(Color.GRAY);
            resulContainer.setLayout(null);
            // Title
            title = new JLabel("Student Grade Calculator");
            title.setBounds(340,50,500,35);
            title.setForeground(Color.BLUE.darker());
            title.setFont(new Font("Arial",Font.BOLD,32));
            resulContainer.add(title);

            // Personal Details
            // Name label
             name = new JLabel("Name");
             name.setBounds(270,100,200,35);
             name.setForeground(Color.BLACK);
             name.setFont(new Font("Arial",Font.BOLD,28));
             resulContainer.add(name);
            //  Roll number
            rollNumber = new JLabel("Roll Number ");
            rollNumber.setBounds(270,150,200,35);
            rollNumber.setForeground(Color.BLACK);
            rollNumber.setFont(new Font("Arial",Font.BOLD,28));
            resulContainer.add(rollNumber);
            // Date of birth
           dateOfBirth = new JLabel("Date of Birth");
           dateOfBirth.setBounds(270,200,200,35);
           dateOfBirth.setForeground(Color.BLACK);
           dateOfBirth.setFont(new Font("Arial",Font.BOLD,28));
           resulContainer.add(dateOfBirth);

           // Labels
           studentName = nameText.getText();
           studentRollNumber = rollText.getText();
           studentDOB = dateOfBirthText.getText();

           name = new JLabel(studentName);
           name.setBounds(500,100,300,35);
           name.setForeground(Color.BLACK);
           name.setFont(new Font("Arial",Font.BOLD,28));
           resulContainer.add(name);

           rollNumber = new JLabel(studentRollNumber);
           rollNumber.setBounds(500,150,200,35);
           rollNumber.setForeground(Color.BLACK);
           rollNumber.setFont(new Font("Arial",Font.BOLD,28));
           resulContainer.add(rollNumber);

           dateOfBirth = new JLabel(studentDOB);
           dateOfBirth.setBounds(500,200,200,35);
           dateOfBirth.setForeground(Color.BLACK);
           dateOfBirth.setFont(new Font("Arial",Font.BOLD,28));
           resulContainer.add(dateOfBirth);

        //    Displaying the result
        String[][] resultData = {{"Chemistry","100",String.valueOf(markslist[1])},{"English","100",String.valueOf(markslist[4])},{"Mathematics","100",String.valueOf(markslist[2])},{"Physics","100",String.valueOf(markslist[0])},{"Python","100",String.valueOf(markslist[3])}};

        String[] resultColumn = {"Subjects","Maximum Marks","Marks Obtain"};
        resultTable = new JTable(resultData,resultColumn);
        resultTable.setBounds(200,250,600,180);
        // Column width
        TableColumn column1 = resultTable.getColumnModel().getColumn(0);
        TableColumn column2 = resultTable.getColumnModel().getColumn(1);
        TableColumn column3 = resultTable.getColumnModel().getColumn(2);
        column1.setPreferredWidth(80);
        column2.setPreferredWidth(80);
        column3.setPreferredWidth(80);
        // Row height
        resultTable.setRowHeight(30);
        resultTable.setFont(new Font("Arial",Font.BOLD,18));
        resulContainer.add(resultTable);

        // Remarks and grade
        SGrade = new JLabel("Grade         "+grade);
        SGrade.setBounds(270,440,300,35);
        SGrade.setForeground(Color.BLACK);
        SGrade.setFont(new Font("Arial",Font.BOLD,28));
        resulContainer.add(SGrade);

        SAverage = new JLabel("Average      "+average); 
        SAverage.setBounds(270,490,300,35);
        SAverage.setForeground(Color.BLACK);
        SAverage.setFont(new Font("Arial",Font.BOLD,28));
        resulContainer.add(SAverage);  

        SRemark = new JLabel("Remarks     "+remarks);
        SRemark.setBounds(270,540,400,35);
        SRemark.setForeground(Color.BLACK);
        SRemark.setFont(new Font("Arial",Font.BOLD,28));
        resulContainer.add(SRemark);

        totalMark = new JLabel("Total Marks ");
        totalMark.setBounds(600,440,200,30);
        totalMark.setForeground(Color.red);
        totalMark.setFont(new Font("Arial",Font.BOLD,24));
        resulContainer.add(totalMark); 

        totalMarksObtain = new JLabel(String.valueOf(totalMarks));
        totalMarksObtain.setBounds(850,440,200,30); 
        totalMarksObtain.setForeground(Color.red);
        totalMarksObtain.setFont(new Font("Arial",Font.BOLD,24));
        resulContainer.add(totalMarksObtain);     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==marks) {
                subjectWindow();
            }
            else if(e.getSource()==generate) {
                result();
            }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    public static void main(String[] args) {
        GradeCalculater g =new GradeCalculater();
        System.out.println(g);
    }  
}