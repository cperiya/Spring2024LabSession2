/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP PC
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        photoTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        fileChooserButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        setPreferredSize(new java.awt.Dimension(400, 550));

        MainPanel.setBackground(new java.awt.Color(204, 255, 204));
        MainPanel.setPreferredSize(new java.awt.Dimension(383, 388));

        titleLabel.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("USER PROFILE");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        phoneLabel.setText("PhoneNumber");

        emailLabel.setText("Email");

        photoLabel.setText("Photo");

        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusLost(evt);
            }
        });

        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusLost(evt);
            }
        });

        ageTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageTextFieldFocusLost(evt);
            }
        });

        phoneNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberTextFieldFocusLost(evt);
            }
        });

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSubmitButtonClick(evt);
            }
        });

        fileChooserButton.setText("Choose File");
        fileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastNameLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(photoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fileChooserButton)))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(imageLabel))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(submitButton)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titleLabel))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(imageLabel)))
                .addGap(21, 21, 21)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoLabel)
                    .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileChooserButton))
                .addGap(31, 31, 31)
                .addComponent(submitButton)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSubmitButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSubmitButtonClick
        // TODO add your handling code here:
        User newObj = new User();
        boolean validInput = true;
        if(!isValidName(firstNameTextField.getText()))
        {
            validInput = false;
            JOptionPane.showMessageDialog(this, "Invalid First Name. Please update and resubmit."  );
        }
        if(!isValidName(lastNameTextField.getText()))
        {
            validInput = false;
            JOptionPane.showMessageDialog(this, "Invalid Last Name. Please update and resubmit."  );
        }
        if(!isValidAge(ageTextField.getText()))
        {
            validInput = false;
            JOptionPane.showMessageDialog(this, "Invalid Age. Please update and resubmit."  );
        }
        if (!isValidPhoneNumber(phoneNumberTextField.getText()))
        {
            validInput = false;
            JOptionPane.showMessageDialog(this, "Invalid Phone#. Please enter a valid Phone# and resubmit."  );
        }
        if (!isValidEmail(emailTextField.getText()))
        {
            validInput = false;
            JOptionPane.showMessageDialog(this, "Invalid EmailId. Please enter a valid EmailId and resubmit."  );
        }
        if (validInput)
        {
            newObj.setFirstName(firstNameTextField.getText());
            newObj.setLastName(lastNameTextField.getText());
            newObj.setAge(ageTextField.getText());
            newObj.setPhoneNumber(phoneNumberTextField.getText());
            newObj.setEmail(emailTextField.getText());
            newObj.setPhoto(photoTextField.getText());

            ImageIcon imageIcon = new ImageIcon(newObj.getPhoto());
            Image image = imageIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
             newObj.setUserPhoto(new ImageIcon(image));
             JLabel imgLabel = new JLabel(new ImageIcon(image));



            StringBuilder details = new StringBuilder();
            details.append("First Name: ").append(newObj.getFirstName()).append("\n");
            details.append("Last Name: ").append(newObj.getLastName()).append("\n");
            details.append("Age: ").append(newObj.getAge()).append("\n");
            details.append("PhoneNumber: ").append(newObj.getPhoneNumber()).append("\n");
            details.append("Email: ").append(newObj.getEmail()).append("\n");

             ImageIcon photoIcon = (ImageIcon) imgLabel.getIcon();
            JOptionPane.showMessageDialog(this, details.toString(), "User Details", JOptionPane.INFORMATION_MESSAGE, photoIcon);
        }
        else
        {
            
            JOptionPane.showMessageDialog(this, "Invalid input. Profile not created."  );
        }
        
                
    }//GEN-LAST:event_onSubmitButtonClick

    public static boolean isValidName(String firstName) {
        // is null or empty
        if (firstName == null || firstName.trim().isEmpty()) {
            return false;
        }

        // input length 
        if (firstName.length() > 50) {
            return false;
        }

        // input validation using regular expression
        String regex = "^[a-zA-Z]+$"; 
        Pattern ipPattern = Pattern.compile(regex);
        Matcher ipMatcher = ipPattern.matcher(firstName);

        return ipMatcher.matches();
    }
    
    public static boolean isValidAge(String userAge)
    {
        try
        {
            int maxAge =100;
            int age = Integer.parseInt(userAge);

            if(age < 0 || age > maxAge)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch (NumberFormatException ex) 
        {
            return false;
        }
        
    }
    
    public static boolean isValidPhoneNumber(String phoneNumber)
    {
        // Define the regex pattern for a 10-digit U.S. phone number
        String regex = "^(\\d{10}|\\d{3}[-\\.\\s]?\\d{3}[-\\.\\s]?\\d{4}|\\(\\d{3}\\)[-\\.\\s]?\\d{3}[-\\.\\s]?\\d{4})$";

        // Compile the pattern
        Pattern ipPattern = Pattern.compile(regex);

        // Match the input phone number against the pattern
        Matcher ipMatcher = ipPattern.matcher(phoneNumber);

        // Return true if the phone number matches the pattern, false otherwise
        return ipMatcher.matches();
    }
    
    public static boolean isValidEmail(String email) {
        // Define the regex pattern for a basic email address validation
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the pattern
        Pattern ipPattern = Pattern.compile(regex);

        // Match the input email against the pattern
        Matcher ipMatcher = ipPattern.matcher(email);

        // Return true if the email matches the pattern, false otherwise
        return ipMatcher.matches();
    }
    
    private void fileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserButtonActionPerformed
        // TODO add your handling code here:
               
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            try 
            {
                String fileName = file.getSelectedFile().getName().toLowerCase();
                if(fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png"))
                {
                
                    BufferedImage img = ImageIO.read(file.getSelectedFile());
                    Image edited_image = img.getScaledInstance(60, 80,
                    Image.SCALE_SMOOTH);
                    if (edited_image != null) 
                    {
                        photoTextField.setText(file.getSelectedFile().getAbsolutePath());

                        imageLabel.setIcon(new ImageIcon(edited_image));
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Image should be jpg,jpeg or png format."  );
                }
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(this, "Please upload image correctly correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_fileChooserButtonActionPerformed


    private void firstNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusLost
        // TODO add your handling code here:
        if(!isValidName(firstNameTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid FirstName."  );
        }
    }//GEN-LAST:event_firstNameTextFieldFocusLost

    private void lastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusLost
        // TODO add your handling code here:
        if(!isValidName(lastNameTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid LastName."  );
        }
    }//GEN-LAST:event_lastNameTextFieldFocusLost

    private void ageTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTextFieldFocusLost
        // TODO add your handling code here:
        if(!isValidAge(ageTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid Age."  );
        }
    }//GEN-LAST:event_ageTextFieldFocusLost

    private void phoneNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldFocusLost
        // TODO add your handling code here:
        if (!isValidPhoneNumber(phoneNumberTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid Phone#. Please enter a valid PhoneNumber."  );
        }
    }//GEN-LAST:event_phoneNumberTextFieldFocusLost

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        // TODO add your handling code here:
        if (!isValidEmail(emailTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid EmailId. Please enter a valid EmailId."  );
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton fileChooserButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JTextField photoTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
