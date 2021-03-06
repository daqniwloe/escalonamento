/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeSO;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Tela extends javax.swing.JFrame {

    Processo p = new Processo();
    private int tempoEspera = 0;
    private double mediaTurnaround = 0;
    private boolean processosCarregados = false;
    int quantum = 0;
    int tempo = 0;
    
    /**
     * Creates new form Tela
     */
    public Tela() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        ButtonCarregarProcesso = new javax.swing.JButton();
        ButtonExecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFilaProcesso = new javax.swing.JTextArea();
        txtProcesso = new javax.swing.JLabel();
        txtCPU = new javax.swing.JLabel();
        txtFilaPronto = new javax.swing.JLabel();
        txtTempoEspera = new javax.swing.JLabel();
        txtTempoTurnaround = new javax.swing.JLabel();
        ButtonRR = new javax.swing.JRadioButton();
        txtQuantum01 = new javax.swing.JLabel();
        txtQuantum02 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de escalonamento");
        setResizable(false);

        ButtonCarregarProcesso.setText("Carregar Processos");
        ButtonCarregarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCarregarProcessoActionPerformed(evt);
            }
        });

        ButtonExecutar.setText("Executar");
        ButtonExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExecutarActionPerformed(evt);
            }
        });

        txtFilaProcesso.setEditable(false);
        txtFilaProcesso.setColumns(20);
        txtFilaProcesso.setRows(5);
        jScrollPane1.setViewportView(txtFilaProcesso);

        txtProcesso.setBackground(new java.awt.Color(255, 255, 255));
        txtProcesso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProcesso.setForeground(new java.awt.Color(255, 0, 0));
        txtProcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProcesso.setText("PROCESSO");

        txtCPU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCPU.setText("CPU");

        txtFilaPronto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFilaPronto.setText("Fila de pronto");

        txtTempoEspera.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTempoEspera.setText("Tempo de espera: ");

        txtTempoTurnaround.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTempoTurnaround.setText("Tempo de turnaround: ");

        buttonGroup1.add(ButtonRR);
        ButtonRR.setText("ROUND ROBIN");

        txtQuantum01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtQuantum01.setText("Quantum: ");

        txtQuantum02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantum02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFilaPronto)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonCarregarProcesso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonRR)
                        .addGap(176, 176, 176)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonExecutar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTempoTurnaround)
                    .addComponent(txtTempoEspera)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQuantum01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantum02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ButtonRR)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTempoEspera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTempoTurnaround)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantum01)
                            .addComponent(txtQuantum02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFilaPronto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCarregarProcesso)
                    .addComponent(ButtonExecutar))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCarregarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCarregarProcessoActionPerformed
        if (processosCarregados == false) {
            p.carregarProcessos();
            txtFilaProcesso.setText(p.saida());
            processosCarregados = true;
            mediaTurnaround = p.calcularMediaTurnaround();
        }
    }//GEN-LAST:event_ButtonCarregarProcessoActionPerformed

    

    

    private void RR() {
        int quantum01 = Integer.parseInt(txtQuantum02.getText());
        txtProcesso.setText(p.NomeProcessoRR());
        txtTempoEspera.setText("Tempo de espera: " + tempoEspera);
        tempo = p.tempoTurnaroundRR(quantum01);
        int tempo2 = tempo + tempoEspera;
        tempoEspera += tempo;
        txtTempoTurnaround.setText("Tempo de turnaround: " + tempo2);
        p.execRR(quantum01);
        String saida = p.saida();
        txtFilaProcesso.setText(saida);
    }

    private void ButtonExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExecutarActionPerformed
        if (!ButtonRR.isSelected()) {
            JOptionPane.showMessageDialog(null, "Escolha um algoritmo!");
        }  else if (ButtonRR.isSelected() && !p.vazio()) {
            if (txtQuantum02.getText().equals("") || txtQuantum02.getText() == null) {
                JOptionPane.showMessageDialog(null, "O quantum deve ser um número positivo e diferente de zero!");
            } else if ((quantum = p.obterQuantum(Integer.parseInt(txtQuantum02.getText()))) <= 0) {
                    JOptionPane.showMessageDialog(null, "O quantum deve ser um número positivo e diferente de zero!");
                } else {
                RR();
            }
        } else {
            txtProcesso.setText("PROCESSO");
            txtTempoEspera.setText("Tempo de espera: ");
            txtTempoTurnaround.setText("Tempo de turnaround: ");
            tempoEspera = 0;
            if (processosCarregados) {
                JOptionPane.showMessageDialog(null, "Média de turnaround: " + mediaTurnaround);
                processosCarregados = false;
            }
        }
    }//GEN-LAST:event_ButtonExecutarActionPerformed

    private void txtQuantum02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantum02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantum02ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCarregarProcesso;
    private javax.swing.JButton ButtonExecutar;
    private javax.swing.JRadioButton ButtonRR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCPU;
    private javax.swing.JTextArea txtFilaProcesso;
    private javax.swing.JLabel txtFilaPronto;
    private javax.swing.JLabel txtProcesso;
    private javax.swing.JLabel txtQuantum01;
    private javax.swing.JTextField txtQuantum02;
    private javax.swing.JLabel txtTempoEspera;
    private javax.swing.JLabel txtTempoTurnaround;
    // End of variables declaration//GEN-END:variables
}
