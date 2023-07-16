package adsreportingsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;

public class Registration extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_2;
    private JComboBox<String> combo_platform;
    private JTable table_1;
    private JTextField textField_1;
    private JComboBox<String> combobox_type;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration frame = new Registration();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Registration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 805, 587);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(119, 169, 219));
        panel.setBounds(0, 0, 781, 540);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Campaign Name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(50, 103, 124, 18);
        panel.add(lblNewLabel);

        JLabel lblContact = new JLabel("Platform");
        lblContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblContact.setBounds(48, 160, 106, 22);
        panel.add(lblContact);

        JLabel lblNewLabel_2 = new JLabel("Budget");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(50, 131, 86, 19);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Type");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2_1.setBounds(50, 188, 53, 28);
        panel.add(lblNewLabel_2_1);

        textField = new JTextField();
        textField.setBounds(162, 105, 145, 19);
        panel.add(textField);
        textField.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(162, 131, 145, 19);
        panel.add(textField_2);

        JButton btnNewButton = new JButton("Add");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addButtonClicked();
            }
        });
        btnNewButton.setBounds(48, 318, 106, 21);
        panel.add(btnNewButton);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnUpdate.setBounds(173, 318, 97, 21);
        panel.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnDelete.setBounds(48, 364, 106, 21);
        panel.add(btnDelete);

        JButton btnClear = new JButton("Compare");
        btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnClear.setBounds(173, 364, 97, 21);
        panel.add(btnClear);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(356, 79, 421, 434);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 421, 119);
        panel_1.add(scrollPane);

        table_1 = new JTable();
        scrollPane.setViewportView(table_1);
        table_1.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Campaign Name", "Platform", "Budget", "Type", "Result"
            }
        ));
        table_1.getColumnModel().getColumn(0).setPreferredWidth(105);
        table_1.getColumnModel().getColumn(1).setPreferredWidth(116);
        table_1.getColumnModel().getColumn(2).setPreferredWidth(106);
        table_1.getColumnModel().getColumn(3).setPreferredWidth(95);

        JLabel lblNewLabel_1 = new JLabel("Result");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(50, 226, 52, 18);
        panel.add(lblNewLabel_1);

        combo_platform = new JComboBox<>();
        combo_platform.setMaximumRowCount(2);
        combo_platform.setModel(new DefaultComboBoxModel<>(new String[] {"Google", "Meta"}));
        combo_platform.setBounds(164, 163, 143, 21);
        panel.add(combo_platform);

        combobox_type = new JComboBox<>();
        combobox_type.setModel(new DefaultComboBoxModel<>(new String[] {"Awareness", "Leadgen", "Views", "Engagement"}));
        combobox_type.setMaximumRowCount(4);
        combobox_type.setBounds(162, 194, 145, 21);
        panel.add(combobox_type);

        textField_1 = new JTextField();
        textField_1.setBounds(161, 228, 146, 19);
        panel.add(textField_1);
        textField_1.setColumns(10);
    }

    public void addButtonClicked() {
        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reporting", "root", "");
            Statement stmt = con.createStatement();
        ) {
            String campaignName = textField.getText();
            String platform = combo_platform.getSelectedItem().toString();
            String budget = textField_2.getText();
            String type = combobox_type.getSelectedItem().toString();
            String result = textField_1.getText();

            String insertQuery = "INSERT INTO campaign (name, platform, budget, type, result) VALUES ('" +
                campaignName + "', '" + platform + "', '" + budget + "', '" + type + "', '" + result + "')";

            stmt.executeUpdate(insertQuery);

            JOptionPane.showMessageDialog(null, "Record added successfully!");

            // Clear the input fields
            textField.setText("");
            textField_2.setText("");
            textField_1.setText("");

            // Refresh the table to show the updated data
            refreshTable(stmt);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void refreshTable(Statement stmt) throws SQLException {
        String selectQuery = "SELECT * FROM campaign";

        ResultSet rs = stmt.executeQuery(selectQuery);

        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        model.setRowCount(0); // Clear existing data in the table

        while (rs.next()) {
            String campaignName = rs.getString("name");
            String platform = rs.getString("platform");
            String budget = rs.getString("budget");
            String type = rs.getString("type");
            String result = rs.getString("result");

            model.addRow(new Object[]{campaignName, platform, budget, type, result});
        }

        rs.close();
    }
}
