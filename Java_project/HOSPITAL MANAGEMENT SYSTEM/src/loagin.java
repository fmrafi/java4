/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * loagin.java
 *
 * Created on Apr 18, 2010, 4:09:44 AM
 */

/**
 *
 * @author motiur
 */
import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;
 import java.lang.String;
 import javax.swing.*;
 import java.sql.*;
import javax.swing.JOptionPane;
public class loagin extends javax.swing.JFrame {
 Statement sta;
ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs7,rs8,rs9,rs10,rs6;
public static String k1,k2,k3,str1,k4,k5,stSearch,stSearch6,stSearch7,stSearch8,stSearch9,stSearch10,stSearch11,stSearch12,stSearch13,str2,str3,str4,str5,str6,str7,str8,str9,str10;
public static int r;
           public static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,tjm,a,a1,p,p1,str;
    /** Creates new form loagin */
    public loagin() {
        initComponents();
         Jdbc j=new Jdbc();
j.connection();
stSearch=("select * from enable_disable");
rs=j.find_statement(stSearch);
try{
rs.beforeFirst();
str="11";
 while(rs.next())
 {
    str=rs.getString(1);
 }
}catch(Exception ex){}
String p3="1";
    char j1=str.charAt(0);
    char j2=p3.charAt(0);
        if(j1!=j2)
            //if(str!=1)
        {
       jTextField2.setText("          *** NEW USER'S ARE ALLOWED***");
        }
        else
        {
        jTextField2.setText("         *** NEW USER'S ARE NOT ALLOWED***");
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Impact", 3, 48));
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setText("WELCOME TO");

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 24));
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("USER ID:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 24));
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setText("PASSWARD:");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 3, 24));
        jButton1.setForeground(new java.awt.Color(0, 51, 0));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24));
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 48));
        jLabel5.setForeground(new java.awt.Color(153, 0, 204));
        jLabel5.setText("HOSPITAL MANAGEMENT SYSTEM");

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 24));
        jButton3.setForeground(new java.awt.Color(204, 0, 204));
        jButton3.setText("CREATE A NEW USER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton4.setForeground(new java.awt.Color(51, 102, 255));
        jButton4.setText("E");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton5.setForeground(new java.awt.Color(255, 0, 102));
        jButton5.setText("D");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jButton6.setForeground(new java.awt.Color(255, 0, 102));
        jButton6.setText("N.U.LIST");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SAUMON copy.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("L");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("B");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel4)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(779, 779, 779)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(663, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(127, 127, 127))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Jdbc j=new Jdbc();
      j.connection();
       String u="11111";
        String u1="111";
    String pass="222";
  String a = new String(jTextField1.getText());
   //String a1 = new String(jTextField1.getText());
   String p=new String(jPasswordField1.getPassword());
    String search="select * from personal where id='"+a+"'";
	rs=j. find_statement(search);
  try{
    while(rs.next())
    {
  //u1=rs.getString(1);
  u=rs.getString(3);
  pass=rs.getString(4);

    }


    }catch(Exception e){}
   if((a.equals(u)&& p.equals(pass)))//|| (a.equals(u)&& p.equals(pass)))
   {
main fp=new main();
this.hide();
fp.show();
   }
   else
  {
   stSearch=("select * from enable_disable");
rs=j.find_statement(stSearch);
try{
rs.beforeFirst();
str="11";
 while(rs.next())
 {
    str=rs.getString(1);
 }
}catch(Exception ex){}
String p11="1";
    char j1=str.charAt(0);
    char j2=p11.charAt(0);
        if(j1!=j2)
            //if(str!=1)
        {
       //setVisible(false);
       //new create_user().setVisible(true);
      String u2="111";
    String passs="222";
  String a11 = new String(jTextField1.getText());
   //String a1 = new String(jTextField1.getText());
   String p1=new String(jPasswordField1.getPassword());
    String s=("select * from personal_1 where id='"+a+"'");
	rs=j. find_statement(s);
  try{
    while(rs.next())
    {
  //u1=rs.getString(1);
  u2=rs.getString(1);
  passs=rs.getString(4);

    }


    }catch(Exception e){}
   if((a11.equals(u2)&& p1.equals(passs)))//|| (a.equals(u)&& p.equals(pass)))
   {

j.createTable("drop table counter");
j.createTable("create table enter(id varchar(20),passward varchar(20))");
j.createTable("insert into enter values ('"+a+"','"+p+"')");
 j.createTable("create table counter(count varchar(20))");
 j.createTable("insert into  counter values ('1')");
  main fp=new main();
this.hide();
fp.show();

   }
        
        
        else
        {
         JOptionPane.showMessageDialog(null," Error user id  or   password ");
        }
   }     //String u="11111";
     
   else
  {
    JOptionPane.showMessageDialog(null,"SORRY  NEW USER ARE DISABLED  BY ADMINISTRATOR......YOU  CAN  NOT  ACCESS  THIS  SOFTWARE  UNTIL  THE  ADMINISTRATOR  MAKE  YOU  ENABLE.... THANKS.....","warning",JOptionPane.WARNING_MESSAGE);

  }


   }      // JOptionPane.showMessageDialog(null," Error user name or password ");
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
/*String u="";
    String pass="";
  String a = new String(jTextField1.getText());
   String p=new String(jPasswordField1.getPassword());
   if( u.equals(a)&& p.equals(pass))
   {
main fp=new main();
this.hide();
fp.show();
   }
   else
  {
    JOptionPane.showMessageDialog(null," Error user name or password ");
  }*/
           // TODO ad
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
/*String u="";
    String pass="";
  String a = new String(jTextField1.getText());
   String p=new String(jPasswordField1.getPassword());
   if( u.equals(a)&& p.equals(pass))
   {
main fp=new main();
this.hide();
fp.show();
   }
   else
  {
    JOptionPane.showMessageDialog(null," Error user name or password ");
  }  */      // TODO ad        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Jdbc j=new Jdbc();
j.connection();
stSearch=("select * from enable_disable");
rs=j.find_statement(stSearch);
try{
rs.beforeFirst();
str="11";
 while(rs.next())
 {
    str=rs.getString(1);
 }
}catch(Exception ex){}
String p="1";
    char j1=str.charAt(0);
    char j2=p.charAt(0);
        if(j1!=j2)
            //if(str!=1)
        {
       setVisible(false);
       new create_user().setVisible(true);
        }
        else
        {
         JOptionPane.showMessageDialog(null,"SORRY  CREATE USER ARE DISABLED  BY ADMINISTRATOR......","warning",JOptionPane.WARNING_MESSAGE);
        }
    //JOptionPane.showMessageDialog(null,"please login to enter the project else click exit","warning",JOptionPane.WARNING_MESSAGE);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Jdbc j=new Jdbc();
j.connection();
 a = new String(jTextField1.getText());
 p=new String(jPasswordField1.getPassword());
str1="08045";
str2="123";
boolean b;
if( str1.equals(a)&& p.equals(str2))
{
String p1="1";
j.createTable("delete from enable_disable where  unique_key='2'");
j.createTable("delete from personal where name='newuser' ");
if(b=j.createTable("insert into enable_disable values('"+p1+"') ")!=true)
{
 JOptionPane.showMessageDialog(null,"Sorry create user disable","warning",JOptionPane.WARNING_MESSAGE);
}
else
{
    setVisible(false);
    new loagin().setVisible(true);
}
}
else
{
 JOptionPane.showMessageDialog(null,"SORRY  YOU  ARE  NOT  VALID USER  FOR  THIS  OPTION..... THIS  IS  ONLY  FOR  ADMINISTRATOR   ","warning",JOptionPane.WARNING_MESSAGE);
}            // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Jdbc j=new Jdbc();
j.connection();
 a = new String(jTextField1.getText());
 p=new String(jPasswordField1.getPassword());
str1="08045";
str2="123";
boolean b;
if( str1.equals(a)&& p.equals(str2))
{
//r=2;
    String p2="2";
j.createTable("delete from enable_disable where  unique_key='1'");
if(b=j.createTable("insert into  enable_disable values('"+p2+"') ")!=true)
{
 JOptionPane.showMessageDialog(null,"Sorry create user able","warning",JOptionPane.WARNING_MESSAGE);
}
else
{
    setVisible(false);
    new loagin().setVisible(true);
}
}
else
{
 JOptionPane.showMessageDialog(null,"SORRY  YOU  ARE  NOT  VALID USER  FOR  THIS  OPTION.....THIS  IS  ONLY  FOR  ADMINISTRATOR    ","warning",JOptionPane.WARNING_MESSAGE);
}             // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 Jdbc j=new Jdbc();
        j.connection();
        String name=jTextField1.getText();
       System.out.println(name);
     String search="select * from personal_1 where name='newuser'";
	     rs=j.find_statement(search);
String id1="";
String id2="     ID           NAME     \n\n";
String id3="--------------------|-------------------\n";
         try{
    while(rs.next())
    {
//System.out.println(name);
for(int i=1;i<=3;i=++i+1)
{String id=rs.getString(i);
id1=id1+"    "+id;
}
id1=id1+"\n";


    }
    id1=id2+id3+id1+"\n"+"";
            JOptionPane.showMessageDialog(null,id1);
       j.result_stat.close();
	 j.st_stat.close();

   }catch(Exception e){}
     j.connectionclose();             // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
Jdbc j=new Jdbc();
j.connection();
 a = new String(jTextField1.getText());
 p=new String(jPasswordField1.getPassword());
str1="08045";
str2="123";
boolean b;
if( str1.equals(a)&& p.equals(str2))
{
//r=2;
    String p2="2";
//j.createTable("delete from enable_disable where  unique_key='1'");

{
 String search=("select * from enter");
	     rs=j.find_statement(search);
String id1="";
String id2="     id       password    \n\n";
String id3="------------|---------\n\n";
         try{
    while(rs.next())
    {
//System.out.println(name);
for(int i=1;i<=2;++i)
{String id=rs.getString(i);
id1=id1+"    "+id;
}
id1=id1+"\n";


    }
    id1=id2+id3+id1+"\n"+"";
            JOptionPane.showMessageDialog(null,id1);
       j.result_stat.close();
	 j.st_stat.close();

   }catch(Exception e){}

}

}
else
{
 JOptionPane.showMessageDialog(null,"SORRY  YOU  ARE  NOT  VALID USER  FOR  THIS  OPTION.....THIS  IS  ONLY  FOR  ADMINISTRATOR    ","warning",JOptionPane.WARNING_MESSAGE);
}             // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
Jdbc j=new Jdbc();
j.connection();
 a = new String(jTextField1.getText());
 p=new String(jPasswordField1.getPassword());
str1="08045";
str2="123";
boolean b;
if( str1.equals(a)&& p.equals(str2))
{
//r=2;
    String p2="2";
//j.createTable("delete from personal_1 where  passward='123456789'");

{
 String search=("select * from personal_1 where passward='123456789'");
	     rs=j.find_statement(search);
String id1="";
String id2="     name         id   \n\n";
String id3="------------|---------\n\n";
         try{
    while(rs.next())
    {
//System.out.println(name);
for(int i=1;i<=3;++i)
{String id=rs.getString(i);
id1=id1+"    "+id;
}
id1=id1+"\n";


    }
    id1=id2+id3+id1+"\n"+"";
            JOptionPane.showMessageDialog(null,id1);
       j.result_stat.close();
	 j.st_stat.close();

   }catch(Exception e){}

}

}
else
{
 JOptionPane.showMessageDialog(null,"SORRY  YOU  ARE  NOT  VALID USER  FOR  THIS  OPTION.....THIS  IS  ONLY  FOR  ADMINISTRATOR    ","warning",JOptionPane.WARNING_MESSAGE);
}             // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loagin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
