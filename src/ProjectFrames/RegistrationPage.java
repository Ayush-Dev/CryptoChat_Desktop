/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFrames;

import ProjectDAO.MessageDAO;
import ProjectDAO.UserDAO;
import ProjectPojo.UserPojo;
import ProjectSecurity.KeyExchange;
import static ProjectSecurity.Security.HashPassword;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Ayush's HP
 */
public class RegistrationPage extends javax.swing.JFrame {

    private static final int OFFLINE = 0;

    /**
     * Creates new form RegistrationPage
     */
    public RegistrationPage() {
        initComponents();
        jTextFieldEmail.setForeground(new Color(185, 185, 185));
        jTextFieldEmail.setText("example@email.com");
//        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1080, 800));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordFieldConfirm = new javax.swing.JPasswordField();
        kButtonSignUp = new keeptoo.KButton();
        kButtonSignIn = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelExitButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkBorderRadius(5);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setkGradientFocus(1500);
        kGradientPanel1.setkStartColor(new java.awt.Color(96, 96, 96));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1080, 700));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLastName.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextFieldLastName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldLastName.setOpaque(false);
        jTextFieldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLastNameFocusGained(evt);
            }
        });
        jTextFieldLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLastNameKeyPressed(evt);
            }
        });
        kGradientPanel1.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 210, 40));

        jTextFieldEmail.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextFieldEmail.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldEmail.setOpaque(false);
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyPressed(evt);
            }
        });
        kGradientPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 470, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last name");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 120, -1));

        jTextFieldFirstName.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextFieldFirstName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextFieldFirstName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldFirstName.setOpaque(false);
        jTextFieldFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFirstNameFocusGained(evt);
            }
        });
        jTextFieldFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFirstNameKeyPressed(evt);
            }
        });
        kGradientPanel1.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First name");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 120, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextFieldUsername.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldUsername.setOpaque(false);
        jTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusGained(evt);
            }
        });
        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyPressed(evt);
            }
        });
        kGradientPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 470, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 120, -1));

        jPasswordFieldPassword.setBackground(new java.awt.Color(0, 0, 0, 1));
        jPasswordFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPasswordFieldPassword.setEchoChar('\u25CF');
        jPasswordFieldPassword.setOpaque(false);
        jPasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusGained(evt);
            }
        });
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
        });
        kGradientPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 210, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 120, -1));

        jPasswordFieldConfirm.setBackground(new java.awt.Color(0, 0, 0, 1));
        jPasswordFieldConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldConfirm.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPasswordFieldConfirm.setEchoChar('\u25CF');
        jPasswordFieldConfirm.setOpaque(false);
        jPasswordFieldConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldConfirmFocusGained(evt);
            }
        });
        jPasswordFieldConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfirmKeyPressed(evt);
            }
        });
        kGradientPanel1.add(jPasswordFieldConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 210, 40));

        kButtonSignUp.setText("Sign Up");
        kButtonSignUp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButtonSignUp.setkBorderRadius(50);
        kButtonSignUp.setkEndColor(new java.awt.Color(0, 204, 204));
        kButtonSignUp.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButtonSignUp.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        kButtonSignUp.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        kButtonSignUp.setkStartColor(new java.awt.Color(0, 51, 153));
        kButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonSignUpActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButtonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 170, -1));

        kButtonSignIn.setText("Sign In");
        kButtonSignIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButtonSignIn.setkBorderRadius(50);
        kButtonSignIn.setkEndColor(new java.awt.Color(0, 204, 204));
        kButtonSignIn.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButtonSignIn.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        kButtonSignIn.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        kButtonSignIn.setkStartColor(new java.awt.Color(0, 51, 153));
        kButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonSignInActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButtonSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Or");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 30, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectGraphics/Logo_Small.png"))); // NOI18N
        kGradientPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 540, 220));

        jLabelExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectGraphics/exitIcon.png"))); // NOI18N
        jLabelExitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 0, 0)));
        jLabelExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseReleased(evt);
            }
        });
        kGradientPanel1.add(jLabelExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonSignInActionPerformed
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kButtonSignInActionPerformed

    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        jTextFieldEmail.setForeground(Color.WHITE);
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        if (jTextFieldEmail.getText().trim().equals("example@email.com")) {
            jTextFieldEmail.setText("");
        }
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameFocusGained
        jTextFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_jTextFieldFirstNameFocusGained

    private void jTextFieldLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastNameFocusGained
        jTextFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_jTextFieldLastNameFocusGained

    private void jTextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsernameFocusGained
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_jTextFieldUsernameFocusGained

    private void jPasswordFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordFocusGained
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_jPasswordFieldPasswordFocusGained

    private void jPasswordFieldConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmFocusGained
        jPasswordFieldConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_jPasswordFieldConfirmFocusGained

    private void jTextFieldFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jTextFieldLastName.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldLastName.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldFirstNameKeyPressed

    private void jTextFieldLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldEmail.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldLastNameKeyPressed

    private void jTextFieldEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldUsername.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldEmailKeyPressed

    private void jTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordFieldPassword.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUsernameKeyPressed

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordFieldConfirm.requestFocus();
        }
    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed

    private void jPasswordFieldConfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (isEmptyFields()) {
                JOptionPane.showMessageDialog(null, "All fields are mandatory !", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String password = Arrays.toString(jPasswordFieldPassword.getPassword());
            String confirm = Arrays.toString(jPasswordFieldConfirm.getPassword());
            if (!password.equals(confirm)) {
                JOptionPane.showMessageDialog(null, "Passwords didn't match !", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/ProjectDesigns/Check.gif"));
            JOptionPane.showMessageDialog(null, "User Created", "MESSAGE", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_jPasswordFieldConfirmKeyPressed

    private void kButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonSignUpActionPerformed
        if (isEmptyFields()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory !", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String password = Arrays.toString(jPasswordFieldPassword.getPassword());
        String confirm = Arrays.toString(jPasswordFieldConfirm.getPassword());
        if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(null, "Passwords didn't match !", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
//        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/ProjectDesigns/Check.gif"));
//        JOptionPane.showMessageDialog(null, "User Created", "MESSAGE", JOptionPane.INFORMATION_MESSAGE, icon);
        try {
            String privateKey = KeyExchange.generatePrivateKey();
            ArrayList privateKeyPackets = KeyExchange.generatePrivatePackets(privateKey);
            ArrayList publicKeyPackets = KeyExchange.generatePublicPackets(privateKeyPackets);
            String publicKey = KeyExchange.generatePublicKey(publicKeyPackets);
            UserPojo user = new UserPojo(jTextFieldUsername.getText().trim(), jTextFieldEmail.getText().trim(), jTextFieldFirstName.getText().trim() + " " + jTextFieldLastName.getText().trim(), HashPassword(jTextFieldUsername.getText().trim() + password), publicKey, OFFLINE);
            if (UserDAO.isEmailAvailable(user)) {
                jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                return;
            }
            if (UserDAO.isUsernameAvailable(user)) {
                jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                return;
            }
            if (savePrivateKey(privateKey) == 1) {
                return;
            }
            if (UserDAO.addNewUser(user) && MessageDAO.addUserMessageTable(user) && MessageDAO.addUserFriendTable(user)) {
                JOptionPane.showMessageDialog(null, "User Created", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                jPasswordFieldConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
                jPasswordFieldConfirm.setText(null);
                jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
                jPasswordFieldPassword.setText(null);
                jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
                jTextFieldUsername.setText(null);
                jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
                jTextFieldEmail.setText("example@email.com");
                jTextFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
                jTextFieldLastName.setText(null);
                jTextFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
                jTextFieldFirstName.setText(null);
                jTextFieldFirstName.requestFocus();
//                jLabelEmailWarning.setVisible(false);
//                jLabelUsernameWarning.setVisible(false);
            }
        } catch (IOException | SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(RegistrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kButtonSignUpActionPerformed

    private void jLabelExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitButtonMouseClicked

    private void jLabelExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseEntered
        jLabelExitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
    }//GEN-LAST:event_jLabelExitButtonMouseEntered

    private void jLabelExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseExited
        jLabelExitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, Color.RED));
    }//GEN-LAST:event_jLabelExitButtonMouseExited

    private void jLabelExitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMousePressed
        jLabelExitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
    }//GEN-LAST:event_jLabelExitButtonMousePressed

    private void jLabelExitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseReleased
        jLabelExitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
    }//GEN-LAST:event_jLabelExitButtonMouseReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrationPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelExitButton;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPasswordField jPasswordFieldConfirm;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldUsername;
    private keeptoo.KButton kButtonSignIn;
    private keeptoo.KButton kButtonSignUp;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

    private boolean isEmptyFields() {
        boolean status = false;
        if (jPasswordFieldConfirm.getText().isEmpty()) {
            jPasswordFieldConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            status = true;
        }
        if (jPasswordFieldPassword.getText().isEmpty()) {
            jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            status = true;
        }
        if (jTextFieldUsername.getText().trim().isEmpty()) {
            jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            status = true;
        }
        if (jTextFieldEmail.getText().trim().equals("example@email.com")) {
            jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            status = true;
        }
        if (jTextFieldLastName.getText().trim().isEmpty()) {
            jTextFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            status = true;
        }
        if (jTextFieldFirstName.getText().trim().isEmpty()) {
            jTextFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
            status = true;
        }
        return status;
    }

    private int savePrivateKey(String privateKey) throws IOException {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        j.setAcceptAllFileFilterUsed(false);
        j.setDialogTitle("Save file");
        j.setMultiSelectionEnabled(false);
        j.setSelectedFile(new File(FileSystemView.getFileSystemView().getHomeDirectory(), jTextFieldUsername.getText() + ".txt"));
        int r = j.showSaveDialog(null);
        String path = null;
        if (r == JFileChooser.APPROVE_OPTION) {
            File f = j.getSelectedFile();
            if (f.exists()) {
                int result = JOptionPane.showConfirmDialog(null, "The file exists, overwrite?", "Existing file", JOptionPane.YES_NO_OPTION);
                switch (result) {
                    case JOptionPane.YES_OPTION:
                        break;
                    case JOptionPane.NO_OPTION:

                        return savePrivateKey(privateKey);
                    case JOptionPane.CLOSED_OPTION:
                        return 1;
                }
            }
            path = f.getAbsolutePath();
        } else {
            return 1;
        }
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(privateKey.getBytes());
        }
        return 0;
    }
}
