import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class Resume extends JFrame implements ActionListener {
    JTextField namee=null, gender=null, fathernamee=null, cityy=null,
    emaill=null,skills=null,college=null,degree=null,contact=null,experience=null,education=null,project=null, language=null,
    publication=null, awards=null;
    JPasswordField  password=null,cpassword=null;
    JFrame p=new JFrame("ONLINE RESUME BUILDER By ABHISHEK KUMAR CHAUHAN");
    JComboBox cb;
    Resume()
    {
        super("ONLINE RESUME BUILDER");
        p.getContentPane().setBackground(Color.white);
        // p.setBackground(Color.yellow);
        // create textfield
        String[] optionsToChoose = {"Male", "Female"};
        cb  = new JComboBox(optionsToChoose);
        cb.setBounds(200, 60, 200, 30);
        p.add(cb);
 
        namee = new JTextField(3);
        fathernamee = new JTextField(3);
        password = new JPasswordField(3);
        cpassword = new JPasswordField(3);
        cityy = new JTextField(3);
        emaill = new JTextField(3);
        skills = new JTextField(3);
        college = new JTextField(3);
        degree = new JTextField(3);
        contact = new JTextField(3);
        experience = new JTextField(3);
        education = new JTextField(3);
        project = new JTextField(3);
        language = new JTextField(3);
        publication = new JTextField(3);
        awards = new JTextField(3);
        
        namee.setBounds(200,10, 200,30);  
        fathernamee.setBounds(200,110, 200,30);  
        password.setBounds(200,160, 200,30);
        cpassword.setBounds(200,210, 200,30);  
        cityy.setBounds(200,260, 200,30);  
        emaill.setBounds(200,310, 200,30);
        skills.setBounds(200,360, 200,30);
        college.setBounds(700,10, 200,30);  
        degree.setBounds(700,60, 200,30);
        experience.setBounds(700,110, 200,30);
        education.setBounds(700,160, 200,30);
        project.setBounds(700,210, 200,30);
        language.setBounds(700,260, 200,30);
        publication.setBounds(700,310, 200,30);
        awards.setBounds(700,360, 200,30);
        contact.setBounds(200,410, 200,30);

        p.add(namee);
        p.add(fathernamee);
        p.add(password);
        p.add(cpassword);
        p.add(cityy);
        p.add(emaill);
        p.add(skills);
        p.add(college);
        p.add(degree);
        p.add(contact);
        p.add(experience);
        p.add(education);
        p.add(project);
        p.add(language);
        p.add(publication);
        p.add(awards);

        JLabel nameJLabel= new JLabel("NAME");
        JLabel genderJLabel= new JLabel("GENDER");
        JLabel fathernameJLabel= new JLabel("FATHERNAME");
        JLabel passwordJLabel= new JLabel("PASSWORD");
        JLabel cpasswordJLabel= new JLabel("CONFIRM PASSWORD");
        JLabel cityJLabel= new JLabel("CITY");
        JLabel emailJLabel= new JLabel("Email");
        JLabel emailJLabe= new JLabel("");
        JLabel skilJLabel= new JLabel("Skills");
        JLabel collegeJLabel= new JLabel("College");
        JLabel degreeJLabel= new JLabel("Degree");
        JLabel contactJLabel= new JLabel("Contact");
        JLabel experienceLabel= new JLabel("Experience");
        JLabel educationLabel= new JLabel("education");
        JLabel projectLabel= new JLabel("project");
        JLabel languageLabel= new JLabel("language");
        JLabel publicationLabel= new JLabel("publication");
        JLabel awardsLabel= new JLabel("awards");
        // set location
		nameJLabel.setBounds(10, 10, 150, 30);
		genderJLabel.setBounds(10, 60, 150, 30);
		fathernameJLabel.setBounds(10, 110, 150, 30);
		passwordJLabel.setBounds(10, 160, 150, 30);
		cpasswordJLabel.setBounds(10, 210, 150, 30);
		cityJLabel.setBounds(10, 260, 150, 30);
		emailJLabel.setBounds(10, 310, 150, 30);
		emailJLabe.setBounds(10, 310, 150, 30);
        skilJLabel.setBounds(10, 360, 150, 30);
        contactJLabel.setBounds(10, 410, 150, 30);
        experienceLabel.setBounds(500, 110, 150, 30);
        educationLabel.setBounds(500, 160, 150, 30);
        projectLabel.setBounds(500, 210, 150, 30);
        languageLabel.setBounds(500, 260, 150, 30);
        publicationLabel.setBounds(500, 310, 150, 30);
        awardsLabel.setBounds(500, 360, 150, 30);
        collegeJLabel.setBounds(500, 10, 150, 30);
        degreeJLabel.setBounds(500, 60, 150, 30);

        p.add(nameJLabel);
        p.add(genderJLabel);
        p.add(fathernameJLabel);
        p.add(passwordJLabel);
        p.add(cpasswordJLabel);
        p.add(cityJLabel);
        p.add(emailJLabel);
        p.add(emailJLabe);
        p.add(skilJLabel);
        p.add(collegeJLabel);
        p.add(degreeJLabel);
        p.add(collegeJLabel);
        p.add(contactJLabel);
        p.add(experienceLabel);
        p.add(educationLabel);
        p.add(projectLabel);
        p.add(languageLabel);
        p.add(publicationLabel);
        p.add(awardsLabel);
        JButton b = new JButton("REGISTER");
        JButton b1 = new JButton("RESET");
        b.setBounds(1200, 200,100,30);
        b1.setBounds(1200, 300,100,30);
        p.add(b);
        p.add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
        p.setLayout(null);  
        p.setVisible(true);
        p.setSize(1550, 500);
    }
    public void actionPerformed(ActionEvent evt)
    {
        String s = evt.getActionCommand();
        String password1 = password.getText();
        String password2 = cpassword.getText();
        String name = namee.getText();
        String fathername = fathernamee.getText();
        String city = cityy.getText();
        String email = emaill.getText();
        String gender = (String)cb.getSelectedItem();
        String uskills = skills.getText();
        String ucollege = college.getText();
        String udegree = degree.getText();
        String ucontact = contact.getText();
        String uexperience = experience.getText();
        String ueducation = education.getText();
        String uproject = project.getText();
        String ulanguage = language.getText();
        String upublication = publication.getText();
        String uawards = awards.getText();
        if (s.equals("REGISTER")) 
        {
            JFrame f;
            if(name.equals("")||fathername.equals("")||city.equals("")||
            email.equals("")||gender.equals("")|| password1.equals("")||
             password2.equals("")||ucollege.equals("")||udegree.equals("")||
             ucontact.equals("")||uexperience.equals("")||ueducation.equals("")||uproject.equals("")||ulanguage.equals("")||upublication.equals("")||uawards.equals(""))
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"ENTER ALL DETAILS");
            }
            else if(password1.equals(password2))
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"DATA REGISTERED SUCCESSFULLY");
                try
                {
                    FileOutputStream filee = new FileOutputStream(name+"_Resume.pdf",true);
                    String in = "Name: "+name+"\nGender: "+gender+"\nFather name: "+fathername+"\nPassword: "+password1+"\nCity: "+city+"\nEmail: "+email+
                                "\nSkills: "+uskills+"\nCollege: "+ucollege+"\nDegree: "+udegree+"\nContact: "+ucontact+
                                "\nExperience: "+uexperience+"\neducation: "+ueducation+"\nproject: "+uproject+"\nlanguage: "+ulanguage+"\npublication: "+upublication+"\nawards: "+uawards;
                    char ch[] =in.toCharArray();
                    for(int i=0;i<in.length();i++)
                    {
                        filee.write(ch[i]);
                    }
                    filee.close();
                }
                catch(Exception e){}
            }
            else
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"Password did not match");  
            }
        }
        else if(s.equals("RESET"))
        {
            namee.setText("");
            fathernamee.setText("");
            password.setText("");
            cpassword.setText("");
            emaill.setText("");
            cityy.setText("");
            skills.setText("");
            experience.setText("");
            education.setText("");
            project.setText("");
            language.setText("");
            publication.setText("");
            awards.setText("");
            degree.setText("");
            contact.setText("");
        }
    }
    public static void main(String args[])
    {
        Resume r = new Resume();
    }
}
