package ibrdtn.example;

import ibrdtn.api.ExtendedClient.APIException;
import ibrdtn.api.object.Bundle;
import ibrdtn.api.object.EID;
import ibrdtn.api.object.GroupEndpoint;
import ibrdtn.api.object.SingletonEndpoint;
import ibrdtn.example.api.Constants;
import ibrdtn.example.api.DTNClient;
import ibrdtn.example.callback.DisplayCallback;
import ibrdtn.example.callback.ICallback;
import ibrdtn.example.callback.ResponseCallback;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * An application demonstrating the use of the IBR-DTN API.
 *
 * @author Julian Timpner <timpner@ibr.cs.tu-bs.de>
 */
public class DTNExampleApp extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(DTNExampleApp.class.getName());
    private DTNClient dtnClient;

    /**
     * Creates a new DTN demonstration app.
     */
    public DTNExampleApp() {
        initComponents();

        dtnClient = new DTNClient(tfEndpoint.getText(), true);
        dtnClient.addStaticCallback(Envelope.class.getCanonicalName(), new DisplayCallback(this));
        logger.log(Level.INFO, dtnClient.getConfiguration());
        print("INFO: " + dtnClient.getConfiguration());

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

        bgCallback = new javax.swing.ButtonGroup();
        bgDestination = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        tfId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfResponse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDestination = new javax.swing.JTextField();
        rbUnicast = new javax.swing.JRadioButton();
        rbMulticast = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        rbPrintOnly = new javax.swing.JRadioButton();
        rbResponse = new javax.swing.JRadioButton();
        rbNone = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cbPriority = new javax.swing.JComboBox();
        btnSend = new javax.swing.JButton();
        cbCustody = new javax.swing.JCheckBox();
        cbReports = new javax.swing.JCheckBox();
        cbGZIP = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        tfEndpoint = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
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
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Messages"));

        jLabel1.setText("ID:");

        jLabel2.setText("Reply-ID:");

        jLabel4.setText("Destination:");

        tfDestination.setText("dtn://timpner-lx/client-2");

        bgDestination.add(rbUnicast);
        rbUnicast.setSelected(true);
        rbUnicast.setText("Unicast");

        bgDestination.add(rbMulticast);
        rbMulticast.setText("Multicast");

        jLabel5.setText("Callback:");

        bgCallback.add(rbPrintOnly);
        rbPrintOnly.setText("PrintOnly");

        bgCallback.add(rbResponse);
        rbResponse.setText("Response");

        bgCallback.add(rbNone);
        rbNone.setSelected(true);
        rbNone.setText("None");

        jLabel6.setText("Priority:");

        cbPriority.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "BULK", "EXPEDITED" }));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

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
                        .addComponent(tfDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(tfResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPrintOnly)
                            .addComponent(rbResponse)
                            .addComponent(rbNone))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbCustody)
                        .addGap(18, 18, 18)
                        .addComponent(cbGZIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbReports))
                .addGap(65, 65, 65)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbPrintOnly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbResponse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfResponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCustody)
                            .addComponent(cbGZIP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbReports))
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Config"));

        tfEndpoint.setText("client-1");

        jLabel3.setText("Primary EID:");

        btnSave.setText("Set");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEid)
                    .addComponent(tfGid)
                    .addComponent(tfEndpoint, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddEID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveEID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddGID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveGID))
                    .addComponent(btnSave))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndpoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        editMenu.setEnabled(false);

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        /*
         * Custom data format.
         */
        MessageData data = new MessageData();
        data.setId(tfId.getText());
        data.setCorrelationId(tfResponse.getText());

        EID me = new SingletonEndpoint("api:me");

        Bundle bundle = new Bundle(eid, Constants.LIFETIME);
        // bundle.appendBlock(new PayloadBlock(data));
        bundle.setPriority(Bundle.Priority.valueOf((String) cbPriority.getSelectedItem()));

        if (cbReports.isSelected()) {
            bundle.setReportto(me);
        }

        bundle.setFlag(Bundle.Flags.CUSTODY_REQUEST, cbCustody.isSelected());
        bundle.setFlag(Bundle.Flags.CUSTODY_REQUEST, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.CUSTODY_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.DELETION_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.RECEPTION_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.FORWARD_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.DELIVERY_REPORT, cbReports.isSelected());
        bundle.setFlag(Bundle.Flags.COMPRESSION_REQUEST, cbGZIP.isSelected());


        /*
         * Custom callback definitions.
         */
        ICallback callback = null;
        if (!rbNone.isSelected()) {
            if (rbResponse.isSelected()) {
                callback = new ResponseCallback(this);
            } else if (rbPrintOnly.isSelected()) {
                callback = new DisplayCallback(this);
            }
        }

        print("Sending message to ''" + eid + "''");
        dtnClient.send(bundle, data, callback);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnAddGIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGIDActionPerformed
        String group = tfGid.getText();
        if (group != null && group.length() > 3) {
            GroupEndpoint gid = new GroupEndpoint(group);
            try {
                dtnClient.getEC().addRegistration(gid);
                print("INFO: GID '" + gid + "' added");
            } catch (APIException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddGIDActionPerformed

    private void btnAddEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEIDActionPerformed
        String eid = tfEid.getText();
        if (eid != null && eid.length() > 3) {
            try {
                dtnClient.getEC().addEndpoint(eid);
                print("INFO: Endpoint '" + eid + "' added");
            } catch (APIException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddEIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        dtnClient.shutdown();
        dtnClient = new DTNClient(tfEndpoint.getText());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEIDActionPerformed
        String eid = tfEid.getText();
        if (eid != null && eid.length() > 3) {
            try {
                dtnClient.getEC().removeEndpoint(eid);
                print("INFO: Endpoint '" + eid + "' removed");
            } catch (APIException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoveEIDActionPerformed

    private void btnRemoveGIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveGIDActionPerformed
        String group = tfGid.getText();
        if (group != null && group.length() > 3) {
            GroupEndpoint eid = new GroupEndpoint(group);
            try {
                dtnClient.getEC().removeRegistration(eid);
                print("INFO: GID '" + group + "' removed");
            } catch (APIException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoveGIDActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            switch ((String) cbOutput.getSelectedItem()) {
                case "Primary EID":
                    print(dtnClient.getEC().getEndpoint().toString());
                    break;
                case "Node Name":
                    print(dtnClient.getEC().getNodeName().toString());
                    break;
                case "Registrations":
                    print(dtnClient.getEC().getRegistrations().toString());
                    break;
                case "Neighbors":
                    print(dtnClient.getEC().getNeighbors().toString());
                    break;
                default:
                    logger.log(Level.WARNING, "Selected printing paramter unknown!");
            }
        } catch (APIException ex) {
            logger.log(Level.SEVERE, "[Error] Retrieving DTN configuration parameters failed", ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * Prints a string in the app's text area.
     *
     * @param string the string to print
     */
    public final void print(String string) {
        textArea.append(string + "\n");
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.ButtonGroup bgCallback;
    private javax.swing.ButtonGroup bgDestination;
    private javax.swing.JButton btnAddEID;
    private javax.swing.JButton btnAddGID;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemoveEID;
    private javax.swing.JButton btnRemoveGID;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox cbCustody;
    private javax.swing.JCheckBox cbGZIP;
    private javax.swing.JComboBox cbOutput;
    private javax.swing.JComboBox cbPriority;
    private javax.swing.JCheckBox cbReports;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JRadioButton rbMulticast;
    private javax.swing.JRadioButton rbNone;
    private javax.swing.JRadioButton rbPrintOnly;
    private javax.swing.JRadioButton rbResponse;
    private javax.swing.JRadioButton rbUnicast;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField tfDestination;
    private javax.swing.JTextField tfEid;
    private javax.swing.JTextField tfEndpoint;
    private javax.swing.JTextField tfGid;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfResponse;
    // End of variables declaration//GEN-END:variables
}
