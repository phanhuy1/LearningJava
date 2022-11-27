package Testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Testing
 * Created by Phan Huy
 * Date 11/3/2022 - 1:21 PM
 * Description: ...
 */

public class test extends JPanel{
    public void actionPerformed(ActionEvent e)
    {
        String strActionCommand = e.getActionCommand();
        if (strActionCommand.equals("Reg"))
        {


            System.out.println("Reg");
        }
        else
            System.out.println("Hello!");
    }
        public test() {
              setLayout(new BorderLayout());
              setAlignmentX(Component.CENTER_ALIGNMENT);
              JLabel upperLabel = new JLabel("Dang Ky Mon Hoc", SwingConstants.CENTER);
              JPanel top = new JPanel();
              JLabel chooseDistrict = new JLabel("Mon hoc");
              String[] districtArr = {"Quan 1", "Quan 2"};
              JComboBox districtCbb = new JComboBox(districtArr);
              top.setLayout(new FlowLayout());
              top.add(chooseDistrict);
              top.add(districtCbb);
              JPanel topContent = new JPanel();
              topContent.setLayout(new BorderLayout());
              topContent.add(upperLabel, BorderLayout.PAGE_START);
              topContent.add(top, BorderLayout.CENTER);


              String[] wardDs = {"Ben Nghe", "Da kao", "Co Giang", "Pham Ngu Lao", "asdas","123as","ad11dc","1213asdv", "asdvvas","asdvvvbd"};
              JList wardList = new JList(wardDs);
              JList wardList2 = new JList(wardDs);
              JScrollPane scrollPane = new JScrollPane(wardList);
              JScrollPane scrollPane2 = new JScrollPane(wardList2);

              JPanel actionButton = new JPanel();
              JButton addButton = new JButton("\u25BA");
              JButton removeButton = new JButton("\u25C4");
              actionButton.setLayout(new BoxLayout(actionButton, BoxLayout.Y_AXIS));
              actionButton.add(addButton);
              actionButton.add(removeButton);
              JPanel content = new JPanel();
              content.setLayout(new FlowLayout());
              content.add(scrollPane);
              content.add(actionButton);
              content.add(scrollPane2);

              JButton saveButton = new JButton("Luu");
              JButton skipButton = new JButton("Bo qua");
              JPanel bot = new JPanel();
              bot.setLayout(new BoxLayout(bot, BoxLayout.LINE_AXIS));
              bot.setAlignmentX(Component.CENTER_ALIGNMENT);
              bot.add(saveButton);
              bot.add(Box.createRigidArea(new Dimension(20, 0)));
              bot.add(skipButton);

            add(topContent, BorderLayout.PAGE_START);
            add(content, BorderLayout.CENTER);
            add(bot, BorderLayout.PAGE_END);

        }
        private static void creatAndShowGUI() {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new JFrame("Dang Ky");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            test newContentPane = new test();
            newContentPane.setOpaque(true);
            frame.setContentPane(newContentPane);
            frame.pack();
            frame.setVisible(true);
        }
    public static void main(String[] args) {
        creatAndShowGUI();

    }
}
/*
 * setLayout(new VirderKatout());
 * JPanel top = new JPanel();
 * JLabel chooseDistrict = new JLabel("Choose district");
 * String[] districtArr;
 * JComboBox districtCbb = new JComboBox(districtArr);
 * top.setLayout(new FlowLayout());
 * top.add(chooseDistrict);
 * top.add(districtCbb);
 * add(top, BorderLayout.PAGE_START);
 * String[] wardDs = {{"Ben Nghe", "Da kao", "Co Giang", "Pham Ngu Lao"}}
 * JList wardList = new JList(wardDs);
 * JScrollPane scrollPane = new JScrollPane(wardList);
 * add(scrollPane, BorderLayout.CENTER);
 * */