package Project_2;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.*;
/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_2
 * Created by Phan Huy
 * Description: ...
 */
public class frameUI extends javax.swing.JFrame {
    ArrayList<String> history = new ArrayList<String>();
    static ArrayList<slang> list = new ArrayList<slang>();
    DefaultTableModel tableModel;
    public frameUI() {
        initComponents();
        tableModel = (DefaultTableModel) Result.getModel();
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setTitle("Slang Words");
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SlangText = new javax.swing.JTextField();
        MeaningText = new javax.swing.JTextField();
        RandSlangButton = new javax.swing.JButton();
        DefinitionSearchButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        RandomButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        HistoryList = new javax.swing.JList<>();
        SlangSearchButton = new javax.swing.JButton();
        RandDefinition = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Britannic Bold",1, 15)); // NOI18N
        jLabel7.setText("Meaning");

        jLabel8.setFont(new java.awt.Font("Britannic Bold",1, 15)); // NOI18N
        jLabel8.setText("Slang Word");
        RandSlangButton.setText("Random Slang Game");
        RandSlangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandSlangButtonActionPerformed(evt);
            }
        });
        DefinitionSearchButton.setBackground(Color.BLACK);
        DefinitionSearchButton.setForeground(Color.WHITE);
        DefinitionSearchButton.setText("Search Definition");
        DefinitionSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefinitionSearchButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        ShowButton.setText("Show");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        RandomButton.setText("Random");
        RandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomButtonActionPerformed(evt);
            }
        });
        HistoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(HistoryList);

        SlangSearchButton.setText("Search Slang");
        SlangSearchButton.setBackground(Color.BLACK);
        SlangSearchButton.setForeground(Color.WHITE);
        SlangSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlangSearchButtonActionPerformed(evt);
            }
        });

        RandDefinition.setText("Random Definition Game");
        RandDefinition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandDefinitionActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        Border bdHis = BorderFactory.createTitledBorder("Slang & Meaning");
        //bdHis = BorderFactory.createLineBorder(Color.DARK_GRAY);
        HistoryList.setBorder(bdHis);
        HistoryButton.setText("History");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Directory");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setText("History");

        Result.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        Result.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Slang Word", "Meaning"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Result.setAlignmentX(2.0F);
        Result.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(Result);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setBackground(new Color(200, 225,217));
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(RandSlangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RandDefinition)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RandomButton))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(MeaningText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(DefinitionSearchButton))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(SlangText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(SlangSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                                        .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                                        .addComponent(HistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(58, 58, 58)))))))
                                .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(28, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SlangText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SlangSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(DefinitionSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(MeaningText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(76, 76, 76)
                                                                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(RandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(RandSlangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(RandDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void SlangSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DeleteTable();
        String slang = SlangText.getText();
        String meaning = main.SearchSlangWord(slang);
        tableModel.addRow(new Object[] {slang,meaning});
        for(String i : history) {
            if (i.equalsIgnoreCase(slang)) // If slang exist on history, doesn't add again
                return;
        }
        history.add(slang);
    }

    private void DefinitionSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DeleteTable();
        String meaning = MeaningText.getText();
        ArrayList<String> slang = main.SearchMeaning(meaning);
        for(String i : slang){
            tableModel.addRow(new Object[] {i,"contains " + meaning});
        }
    }

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        slang add = new slang(SlangText.getText(),MeaningText.getText());
        boolean duplicate = main.CheckSlang(add);
        if(duplicate == true){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "This slang has existed. " +
                    "Do you want to duplicate slang ?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                main.EditSlang(add);
                return;
            }
            else {
                add.setSlang(add.getSlang() + "_1");
            }
        }
        main.AddSlang(add);
    }

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        slang edit = new slang(SlangText.getText(),MeaningText.getText());
        main.EditSlang(edit);
    }

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DeleteTable();
        list = main.GetSlangList();
        for(slang i : list){
            tableModel.addRow(new Object[] {i.getSlang(),i.getMeaning()});
        }
    }

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            main.ResetSlang();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void RandomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DeleteTable();
        slang slang = main.RandomSlang();
        tableModel.addRow(new Object[]{slang.getSlang(), slang.getMeaning()});
    }

    private void RandSlangButtonActionPerformed(java.awt.event.ActionEvent evt) {
        slang slang = new slang();
        slang i = main.RandomSlang();
        slang j = main.RandomSlang();
        slang k = main.RandomSlang();
        slang l = main.RandomSlang();
        int index = new Random().nextInt(4);
        switch (index) {
            case 0:
                slang = i;
                break;
            case 1:
                slang = j;
                break;
            case 2:
                slang = k;
                break;
            case 3:
                slang = l;
                break;
        }
        Object[] possibilities = {i.getMeaning(), j.getMeaning(), k.getMeaning(), l.getMeaning()};
        String s = (String)JOptionPane.showInputDialog(null,"Meaning of " + slang.getSlang(),"quiz",
                JOptionPane.PLAIN_MESSAGE,null,possibilities,i.getMeaning());
        if(s.equalsIgnoreCase(slang.getMeaning())){
            JOptionPane.showMessageDialog(null, "Your answer is correct !", "Answer", JOptionPane.INFORMATION_MESSAGE, null);
        }
        else
            JOptionPane.showMessageDialog(null, "Your answer is wrong !", "Answer", JOptionPane.INFORMATION_MESSAGE, null);
    }
    //- 25% projects

    private void RandDefinitionActionPerformed(java.awt.event.ActionEvent evt) {
        slang slang = new slang();
        slang i = main.RandomSlang();
        slang j = main.RandomSlang();
        slang k = main.RandomSlang();
        slang l = main.RandomSlang();
        int index = new Random().nextInt(4);
        switch (index) {
            case 0:
                slang = i;
                break;
            case 1:
                slang = j;
                break;
            case 2:
                slang = k;
                break;
            case 3:
                slang = l;
                break;
        }
        Object[] possibilities = {i.getSlang(), j.getSlang(), k.getSlang(), l.getSlang()};
        String s = (String)JOptionPane.showInputDialog(null,"Slang word of " + slang.getMeaning(),"quiz",
                JOptionPane.PLAIN_MESSAGE,null,possibilities,i.getSlang());
        if(s.equalsIgnoreCase(slang.getSlang())){
            JOptionPane.showMessageDialog(null, "Your answer is correct !", "Answer", JOptionPane.INFORMATION_MESSAGE, null);
        }
        else
            JOptionPane.showMessageDialog(null, "Your answer is wrong !", "Answer", JOptionPane.INFORMATION_MESSAGE, null);
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        slang delete = new slang(SlangText.getText(),MeaningText.getText());
        main.RemoveSlang(delete);
    }

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel e = new DefaultListModel();
        for(String i : history)
            e.addElement(i);
        HistoryList.setModel(e);
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            main.WriteSlang("D:\\Desktop\\Java\\Java2022\\LearningJava\\src\\Project_2\\update.txt");
            JOptionPane.showMessageDialog(null, "List save to update.txt in disk D", " Save file" , JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void DeleteTable(){
        while(tableModel.getRowCount() != 0) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                tableModel.removeRow(0);
            }
        }
    }


    public static void main(String args[]) throws IOException{
        main.ReadSlang("D:\\Desktop\\Java\\Java2022\\LearningJava\\src\\Project_2\\slang.txt");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DefinitionSearchButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JList<String> HistoryList;
    private javax.swing.JTextField MeaningText;
    private javax.swing.JButton RandDefinition;
    private javax.swing.JButton RandSlangButton;
    private javax.swing.JButton RandomButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTable Result;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JButton SlangSearchButton;
    private javax.swing.JTextField SlangText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration
}
