package ibrdtn.example.ui;

import ibrdtn.example.api.APIHandlerType;
import ibrdtn.example.api.PayloadType;
import ibrdtn.api.APIException;
import ibrdtn.api.object.Bundle;
import ibrdtn.api.object.EID;
import ibrdtn.api.object.GroupEndpoint;
import ibrdtn.api.object.PayloadBlock;
import ibrdtn.api.object.SingletonEndpoint;
import ibrdtn.example.MessageData;
import ibrdtn.example.api.Constants;
import ibrdtn.example.api.DTNClient;
import ibrdtn.example.callback.AutoResponseCallback;
import ibrdtn.example.callback.ICallback;
import ibrdtn.example.logging.WindowHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.swing.text.DefaultCaret;

/**
 * An application demonstrating the use of the IBR-DTN API.
 *
 * @author Julian Timpner <timpner@ibr.cs.tu-bs.de>
 */
public class DTNExampleApp extends javax.swing.JFrame {

    private static final Logger logger = LogManager.getLogManager().getLogger("");
    private DTNClient dtnClient;
    private WindowHandler handler = null;
    protected PayloadType payloadType = PayloadType.OBJECT;

    /**
     * Creates a new DTN demonstration app.
     */
    public DTNExampleApp() {
        initComponents();

        // Set logging text area to auto-scroll.
        DefaultCaret caret = (DefaultCaret) textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        // Append a window logger to the global logger instance. Thus, all log messages can be print on the GUI.
        handler = WindowHandler.getInstance(this);
        logger.addHandler(handler);

        dtnClient = new DTNClient("1", PayloadType.OBJECT, APIHandlerType.SELECTIVE);

        logger.log(Level.INFO, dtnClient.getConfiguration());

//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                dtnClient.shutdown();
//            }
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDestination = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfDestination = new javax.swing.JTextField();
        rbUnicast = new javax.swing.JRadioButton();
        rbMulticast = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cbPriority = new javax.swing.JComboBox();
        cbCustody = new javax.swing.JCheckBox();
        cbReports = new javax.swing.JCheckBox();
        cbGZIP = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfEid = new javax.swing.JTextField();
        tfGid = new javax.swing.JTextField();
        btnAddEID = new javax.swing.JButton();
        btnAddGID = new javax.swing.JButton();
        btnRemoveEID = new javax.swing.JButton();
        btnRemoveGID = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cbOutput = new javax.swing.JComboBox();
        btnPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfPayload = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfResponse = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        cbAutoResponse = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        settingsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IBR-DTN Java API Example Application");
        setResizable(false);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Messages"));

        jLabel4.setText("Destination:");

        tfDestination.setText("dtn://timpner-lx/2");

        bgDestination.add(rbUnicast);
        rbUnicast.setSelected(true);
        rbUnicast.setText("Unicast");

        bgDestination.add(rbMulticast);
        rbMulticast.setText("Multicast");

        jLabel6.setText("Priority:");

        cbPriority.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "BULK", "EXPEDITED" }));

        cbCustody.setText("Custody");

        cbReports.setText("Reports");

        cbGZIP.setText("GZIP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbUnicast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMulticast)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCustody)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGZIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbReports)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUnicast)
                    .addComponent(rbMulticast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCustody)
                    .addComponent(cbGZIP)
                    .addComponent(cbReports))
                .addGap(137, 137, 137))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Config"));

        jLabel7.setText("Endpoint:");

        jLabel8.setText("GroupEndoint:");

        tfGid.setText("dtn://");

        btnAddEID.setText("Add");
        btnAddEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEIDActionPerformed(evt);
            }
        });

        btnAddGID.setText("Add");
        btnAddGID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGIDActionPerformed(evt);
            }
        });

        btnRemoveEID.setText("Remove");
        btnRemoveEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEIDActionPerformed(evt);
            }
        });

        btnRemoveGID.setText("Remove");
        btnRemoveGID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveGIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEid)
                    .addComponent(tfGid, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEID)
                    .addComponent(btnAddGID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveEID)
                    .addComponent(btnRemoveGID)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfEid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddEID)
                    .addComponent(btnRemoveEID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfGid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddGID)
                    .addComponent(btnRemoveGID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));

        cbOutput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primary EID", "Node Name", "Registrations", "Neighbors" }));

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Payload"));

        tfPayload.setText("IBR says hi!");

        jLabel1.setText("ID:");

        jLabel2.setText("Reply-ID:");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        cbAutoResponse.setText("Echo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfPayload))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbAutoResponse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPayload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfResponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAutoResponse))
                .addGap(58, 58, 58))
        );

        menuBar.setName(""); // NOI18N

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        fileMenu.setEnabled(false);

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        settingsMenuItem.setMnemonic('d');
        settingsMenuItem.setText("Settings");
        settingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(settingsMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        helpMenu.setEnabled(false);

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        dtnClient.shutdown();
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        EID eid;
        /*
         * Switch between unicast and multicast.
         */
        if (rbUnicast.isSelected()) {
            eid = new SingletonEndpoint(tfDestination.getText());
        } else {
            eid = new GroupEndpoint(tfDestination.getText());
        }

        EID me = new SingletonEndpoint("api:me");

        Bundle bundle = new Bundle(eid, Constants.LIFETIME);
        bundle.setPriority(Bundle.Priority.valueOf((String) cbPriority.getSelectedItem()));

        if (cbReports.isSelected()) {
            bundle.setReportto(me);
        }

        bundle.setFlag(Bundle.Flags.CUSTODY_REQUEST, cbCustody.isSelected());
        bundle.setFlag(Bundle.Flags.CUSTODY_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.DELETION_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.RECEPTION_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.FORWARD_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.DELIVERY_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.COMPRESSION_REQUEST, cbGZIP.isSelected());

        /*
         * Custom data format.
         */
        switch (payloadType) {
            case OBJECT:
                MessageData data = new MessageData();
                data.setId(tfId.getText());
                data.setCorrelationId(tfResponse.getText());
                data.setText(tfPayload.getText());

                bundle.appendBlock(new PayloadBlock(data));
                break;
            case BYTE:
                String text = tfPayload.getText();

                bundle.appendBlock(new PayloadBlock(text.getBytes()));
                break;
        }

        if (cbAutoResponse.isSelected()) {
            ICallback callback = new AutoResponseCallback(this);
            dtnClient.send(bundle, callback);
        } else {
            dtnClient.send(bundle);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnRemoveGIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveGIDActionPerformed
        String group = tfGid.getText();
        if (group != null && group.length() > 3) {
            GroupEndpoint eid = new GroupEndpoint(group);
            try {
                dtnClient.getEC().removeRegistration(eid);
                logger.log(Level.INFO, "GID ''{0}'' removed", group);
            } catch (APIException ex) {
                print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRemoveGIDActionPerformed

    private void btnRemoveEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEIDActionPerformed
        String eid = tfEid.getText();
        if (eid != null && eid.length() > 3) {
            try {
                dtnClient.getEC().removeEndpoint(eid);
                logger.log(Level.INFO, "Endpoint ''{0}'' removed", eid);
            } catch (APIException ex) {
                print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRemoveEIDActionPerformed

    private void btnAddGIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGIDActionPerformed
        String group = tfGid.getText();
        if (group != null && group.length() > 3) {
            GroupEndpoint gid = new GroupEndpoint(group);
            try {
                dtnClient.getEC().addRegistration(gid);
                logger.log(Level.INFO, "GID ''{0}'' added", gid);
            } catch (APIException ex) {
                print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddGIDActionPerformed

    private void btnAddEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEIDActionPerformed
        String eid = tfEid.getText();
        if (eid != null && eid.length() > 3) {
            try {
                dtnClient.getEC().addEndpoint(eid);
                logger.log(Level.INFO, "Endpoint ''{0}'' added", eid);
            } catch (APIException ex) {
                print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddEIDActionPerformed

    private void settingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuItemActionPerformed
        new Settings(this).setVisible(true);
    }//GEN-LAST:event_settingsMenuItemActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            switch ((String) cbOutput.getSelectedItem()) {
                case "Primary EID":
                    logger.log(Level.INFO, "Primary EID {0}", dtnClient.getEC().getEndpoint().toString());
                    break;
                case "Node Name":
                    logger.log(Level.INFO, "Node Name {0}", dtnClient.getEC().getNodeName().toString());
                    break;
                case "Registrations":
                    logger.log(Level.INFO, "Registrations {0}", dtnClient.getEC().getRegistrations().toString());
                    break;
                case "Neighbors":
                    logger.log(Level.INFO, "Neighbors {0}", dtnClient.getEC().getNeighbors().toString());
                    break;
                default:
                    logger.log(Level.WARNING, "Selected printing paramter unknown!");
            }
        } catch (APIException ex) {
            logger.log(Level.SEVERE, "Retrieving DTN configuration parameters failed");
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * Prints a string in the app's text area.
     *
     * @param string the string to print
     */
    public final void print(String string) {
        textArea.append(string + "\n");
        textArea.validate();
    }

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
            java.util.logging.Logger.getLogger(DTNExampleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DTNExampleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DTNExampleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DTNExampleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DTNExampleApp().setVisible(true);
            }
        });
    }

    public DTNClient getDtnClient() {
        return dtnClient;
    }

    public void setDtnClient(DTNClient client) {
        this.dtnClient = client;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.ButtonGroup bgDestination;
    private javax.swing.JButton btnAddEID;
    private javax.swing.JButton btnAddGID;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemoveEID;
    private javax.swing.JButton btnRemoveGID;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox cbAutoResponse;
    private javax.swing.JCheckBox cbCustody;
    private javax.swing.JCheckBox cbGZIP;
    private javax.swing.JComboBox cbOutput;
    private javax.swing.JComboBox cbPriority;
    private javax.swing.JCheckBox cbReports;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JRadioButton rbMulticast;
    private javax.swing.JRadioButton rbUnicast;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem settingsMenuItem;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField tfDestination;
    private javax.swing.JTextField tfEid;
    private javax.swing.JTextField tfGid;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfPayload;
    private javax.swing.JTextField tfResponse;
    // End of variables declaration//GEN-END:variables
}