package simulador.tela;

import simulador.memoria.Memoria;
import simulador.processador.Registradores;
import simulador.processador.PC;
import simulador.processador.RI;
import simulador.processador.UC;

/**
 *
 * @author Haruki
 */

public class Tela extends javax.swing.JFrame {

    //Instancia objetos
    PC pc;
    RI ri;
    UC uc;
    Memoria mem;
    Registradores registradores;
    
    //Construtor da tela
    
    public Tela() {
        pc = new PC();
        ri = new RI();
        registradores = new Registradores();
        //TESTE
        registradores.getRegistradores(0).setConteudo(10);
        registradores.getRegistradores(1).setConteudo(7);
        //FIM DO TESTE
        uc = new UC();
        mem = new Memoria();
        initComponents();
        atualizarTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRegistrador16 = new javax.swing.JTextField();
        lblRegistrador16 = new javax.swing.JLabel();
        txtRegistrador17 = new javax.swing.JTextField();
        lblRegistrador17 = new javax.swing.JLabel();
        txtRegistrador18 = new javax.swing.JTextField();
        lblRegistrador18 = new javax.swing.JLabel();
        txtRegistrador19 = new javax.swing.JTextField();
        lblRegistrador19 = new javax.swing.JLabel();
        txtRegistrador23 = new javax.swing.JTextField();
        lblRegistrador23 = new javax.swing.JLabel();
        lblRegistrador22 = new javax.swing.JLabel();
        txtRegistrador22 = new javax.swing.JTextField();
        lblRegistrador21 = new javax.swing.JLabel();
        txtRegistrador21 = new javax.swing.JTextField();
        lblRegistrador20 = new javax.swing.JLabel();
        txtRegistrador20 = new javax.swing.JTextField();
        lblRegistrador31 = new javax.swing.JLabel();
        lblRegistrador29 = new javax.swing.JLabel();
        lblRegistrador30 = new javax.swing.JLabel();
        txtRegistrador31 = new javax.swing.JTextField();
        txtRegistrador30 = new javax.swing.JTextField();
        lblRegistrador28 = new javax.swing.JLabel();
        txtRegistrador28 = new javax.swing.JTextField();
        txtRegistrador29 = new javax.swing.JTextField();
        lblRegistrador27 = new javax.swing.JLabel();
        txtRegistrador27 = new javax.swing.JTextField();
        lblRegistrador26 = new javax.swing.JLabel();
        txtRegistrador26 = new javax.swing.JTextField();
        lblRegistrador25 = new javax.swing.JLabel();
        txtRegistrador25 = new javax.swing.JTextField();
        lblRegistrador24 = new javax.swing.JLabel();
        txtRegistrador24 = new javax.swing.JTextField();
        txtRegistrador15 = new javax.swing.JTextField();
        lblRegistrador15 = new javax.swing.JLabel();
        lblRegistrador14 = new javax.swing.JLabel();
        txtRegistrador14 = new javax.swing.JTextField();
        lblRegistrador13 = new javax.swing.JLabel();
        txtRegistrador13 = new javax.swing.JTextField();
        txtRegistrador12 = new javax.swing.JTextField();
        lblRegistrador12 = new javax.swing.JLabel();
        lblRegistrador11 = new javax.swing.JLabel();
        txtRegistrador11 = new javax.swing.JTextField();
        txtRegistrador10 = new javax.swing.JTextField();
        lblRegistrador10 = new javax.swing.JLabel();
        lblRegistrador9 = new javax.swing.JLabel();
        txtRegistrador9 = new javax.swing.JTextField();
        txtRegistrador8 = new javax.swing.JTextField();
        lblRegistrador8 = new javax.swing.JLabel();
        txtRegistrador7 = new javax.swing.JTextField();
        lblRegistrador7 = new javax.swing.JLabel();
        txtRegistrador6 = new javax.swing.JTextField();
        lblRegistrador6 = new javax.swing.JLabel();
        txtRegistrador5 = new javax.swing.JTextField();
        lblRegistrador5 = new javax.swing.JLabel();
        txtRegistrador4 = new javax.swing.JTextField();
        lblRegistrador4 = new javax.swing.JLabel();
        txtRegistrador3 = new javax.swing.JTextField();
        lblRegistrador3 = new javax.swing.JLabel();
        txtRegistrador2 = new javax.swing.JTextField();
        lblRegistrador2 = new javax.swing.JLabel();
        txtRegistrador1 = new javax.swing.JTextField();
        lblRegistrador1 = new javax.swing.JLabel();
        txtRegistrador0 = new javax.swing.JTextField();
        lblRegistrador0 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistradores = new javax.swing.JLabel();
        txtMemoria8 = new javax.swing.JTextField();
        lblMemoria8 = new javax.swing.JLabel();
        txtMemoria9 = new javax.swing.JTextField();
        lblMemoria9 = new javax.swing.JLabel();
        lblMemoria11 = new javax.swing.JLabel();
        txtMemoria11 = new javax.swing.JTextField();
        txtMemoria10 = new javax.swing.JTextField();
        lblMemoria10 = new javax.swing.JLabel();
        lblMemoria15 = new javax.swing.JLabel();
        lblMemoria14 = new javax.swing.JLabel();
        txtMemoria15 = new javax.swing.JTextField();
        txtMemoria14 = new javax.swing.JTextField();
        txtMemoria13 = new javax.swing.JTextField();
        lblMemoria13 = new javax.swing.JLabel();
        txtMemoria12 = new javax.swing.JTextField();
        lblMemoria12 = new javax.swing.JLabel();
        txtMemoria7 = new javax.swing.JTextField();
        lblMemoria7 = new javax.swing.JLabel();
        txtMemoria6 = new javax.swing.JTextField();
        lblMemoria6 = new javax.swing.JLabel();
        txtMemoria5 = new javax.swing.JTextField();
        lblMemoria5 = new javax.swing.JLabel();
        txtMemoria4 = new javax.swing.JTextField();
        lblMemoria4 = new javax.swing.JLabel();
        txtMemoria3 = new javax.swing.JTextField();
        lblMemoria3 = new javax.swing.JLabel();
        txtMemoria2 = new javax.swing.JTextField();
        lblMemoria2 = new javax.swing.JLabel();
        txtMemoria1 = new javax.swing.JTextField();
        lblMemoria1 = new javax.swing.JLabel();
        txtMemoria0 = new javax.swing.JTextField();
        lblMemoria0 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblMemorias = new javax.swing.JLabel();
        txtPC = new javax.swing.JTextField();
        lblPC = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnExecutar = new javax.swing.JButton();
        txtRI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRegistrador16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador16.setFocusable(false);

        lblRegistrador16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador16.setText("r16");

        txtRegistrador17.setEditable(false);
        txtRegistrador17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador17.setFocusable(false);

        lblRegistrador17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador17.setText("r17");

        txtRegistrador18.setEditable(false);
        txtRegistrador18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador18.setFocusable(false);

        lblRegistrador18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador18.setText("r18");

        txtRegistrador19.setEditable(false);
        txtRegistrador19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador19.setFocusable(false);

        lblRegistrador19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador19.setText("r19");

        txtRegistrador23.setEditable(false);
        txtRegistrador23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador23.setFocusable(false);

        lblRegistrador23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador23.setText("r23");

        lblRegistrador22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador22.setText("r22");

        txtRegistrador22.setEditable(false);
        txtRegistrador22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador22.setFocusable(false);

        lblRegistrador21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador21.setText("r21");

        txtRegistrador21.setEditable(false);
        txtRegistrador21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador21.setFocusable(false);

        lblRegistrador20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador20.setText("r20");

        txtRegistrador20.setEditable(false);
        txtRegistrador20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador20.setFocusable(false);

        lblRegistrador31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador31.setText("r31");

        lblRegistrador29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador29.setText("r29");

        lblRegistrador30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador30.setText("r30");

        txtRegistrador31.setEditable(false);
        txtRegistrador31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador31.setFocusable(false);

        txtRegistrador30.setEditable(false);
        txtRegistrador30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador30.setFocusable(false);

        lblRegistrador28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador28.setText("r28");

        txtRegistrador28.setEditable(false);
        txtRegistrador28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador28.setFocusable(false);

        txtRegistrador29.setEditable(false);
        txtRegistrador29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador29.setFocusable(false);

        lblRegistrador27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador27.setText("r27");

        txtRegistrador27.setEditable(false);
        txtRegistrador27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador27.setFocusable(false);

        lblRegistrador26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador26.setText("r26");

        txtRegistrador26.setEditable(false);
        txtRegistrador26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador26.setFocusable(false);

        lblRegistrador25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador25.setText("r25");

        txtRegistrador25.setEditable(false);
        txtRegistrador25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador25.setFocusable(false);

        lblRegistrador24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador24.setText("r24");

        txtRegistrador24.setEditable(false);
        txtRegistrador24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador24.setFocusable(false);

        txtRegistrador15.setEditable(false);
        txtRegistrador15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador15.setFocusable(false);

        lblRegistrador15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador15.setText("r15");

        lblRegistrador14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador14.setText("r14");

        txtRegistrador14.setEditable(false);
        txtRegistrador14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador14.setFocusable(false);

        lblRegistrador13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador13.setText("r13");

        txtRegistrador13.setEditable(false);
        txtRegistrador13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador13.setFocusable(false);

        txtRegistrador12.setEditable(false);
        txtRegistrador12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador12.setFocusable(false);

        lblRegistrador12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador12.setText("r12");

        lblRegistrador11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador11.setText("r11");

        txtRegistrador11.setEditable(false);
        txtRegistrador11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador11.setFocusable(false);

        txtRegistrador10.setEditable(false);
        txtRegistrador10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador10.setFocusable(false);

        lblRegistrador10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador10.setText("r10");

        lblRegistrador9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador9.setText("r9");

        txtRegistrador9.setEditable(false);
        txtRegistrador9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador9.setFocusable(false);

        txtRegistrador8.setEditable(false);
        txtRegistrador8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador8.setFocusable(false);

        lblRegistrador8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador8.setText("r8");

        txtRegistrador7.setEditable(false);
        txtRegistrador7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador7.setFocusable(false);

        lblRegistrador7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador7.setText("r7");

        txtRegistrador6.setEditable(false);
        txtRegistrador6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador6.setFocusable(false);

        lblRegistrador6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador6.setText("r6");

        txtRegistrador5.setEditable(false);
        txtRegistrador5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador5.setFocusable(false);

        lblRegistrador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador5.setText("r5");

        txtRegistrador4.setEditable(false);
        txtRegistrador4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador4.setFocusable(false);

        lblRegistrador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador4.setText("r4");

        txtRegistrador3.setEditable(false);
        txtRegistrador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador3.setFocusable(false);

        lblRegistrador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador3.setText("r3");

        txtRegistrador2.setEditable(false);
        txtRegistrador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador2.setFocusable(false);

        lblRegistrador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador2.setText("r2");

        txtRegistrador1.setEditable(false);
        txtRegistrador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador1.setFocusable(false);

        lblRegistrador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador1.setText("r1");

        txtRegistrador0.setEditable(false);
        txtRegistrador0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistrador0.setFocusable(false);

        lblRegistrador0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrador0.setText("r0");

        lblRegistradores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistradores.setText("Registradores");

        txtMemoria8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria8.setText("8");

        txtMemoria9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria9.setText("9");

        lblMemoria11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria11.setText("11");

        txtMemoria11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMemoria10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria10.setText("10");

        lblMemoria15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria15.setText("15");

        lblMemoria14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria14.setText("14");

        txtMemoria15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMemoria14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMemoria13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria13.setText("13");

        txtMemoria12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria12.setText("12");

        txtMemoria7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria7.setText("7");

        txtMemoria6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria6.setText("6");

        txtMemoria5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria5.setText("5");

        txtMemoria4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria4.setText("4");

        txtMemoria3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria3.setText("3");

        txtMemoria2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria2.setText("2");

        txtMemoria1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria1.setText("1");

        txtMemoria0.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMemoria0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria0.setText("0");

        lblMemorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemorias.setText("Memórias");

        txtPC.setEditable(false);
        txtPC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPC.setFocusable(false);

        lblPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPC.setText("PC");

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickExecutar(evt);
            }
        });

        txtRI.setEditable(false);
        txtRI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRI.setFocusable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistrador15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistrador15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemoria7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMemoria7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistradores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPC)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMemorias)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMemoria15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemoria15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistradores)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRegistrador18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegistrador18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrador16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistrador16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickExecutar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickExecutar
        
        //Guarda todos os inputs do usuário na memória
        guardarInput();
        
        //Busca a instrução e armazena no RI
        ri.setConteudo(mem.getCelulas(pc.getContador()));
        
        //Envia a instrução do RI para a UC e lá decodifica a instrução
        uc.interpretador(ri.getConteudo(), registradores);
        
        //Incrementa PC e atualiza a tela
        pc.somar();
        atualizarTela();
        
    }//GEN-LAST:event_clickExecutar
    
    //Função que atualiza valores da tela
    private void atualizarTela () {
        
        txtPC.setText("" + pc.getContador());
        txtRI.setText(ri.getConteudo());
        txtMemoria0.setText("" + mem.getCelulas(0));
        txtMemoria1.setText("" + mem.getCelulas(1));
        txtMemoria2.setText("" + mem.getCelulas(2));
        txtMemoria3.setText("" + mem.getCelulas(3));
        txtMemoria4.setText("" + mem.getCelulas(4));
        txtMemoria5.setText("" + mem.getCelulas(5));
        txtMemoria6.setText("" + mem.getCelulas(6));
        txtMemoria7.setText("" + mem.getCelulas(7));
        txtMemoria8.setText("" + mem.getCelulas(8));
        txtMemoria9.setText("" + mem.getCelulas(9));
        txtMemoria10.setText("" + mem.getCelulas(10));
        txtMemoria11.setText("" + mem.getCelulas(11));
        txtMemoria12.setText("" + mem.getCelulas(12));
        txtMemoria13.setText("" + mem.getCelulas(13));
        txtMemoria14.setText("" + mem.getCelulas(14));
        txtMemoria15.setText("" + mem.getCelulas(15));
        txtRegistrador0.setText("" + registradores.getRegistradores(0).getConteudo());
        txtRegistrador1.setText("" + registradores.getRegistradores(1).getConteudo());
        txtRegistrador2.setText("" + registradores.getRegistradores(2).getConteudo());
        txtRegistrador3.setText("" + registradores.getRegistradores(3).getConteudo());
        txtRegistrador4.setText("" + registradores.getRegistradores(4).getConteudo());
        txtRegistrador5.setText("" + registradores.getRegistradores(5).getConteudo());
        txtRegistrador6.setText("" + registradores.getRegistradores(6).getConteudo());
        txtRegistrador7.setText("" + registradores.getRegistradores(7).getConteudo());
        txtRegistrador8.setText("" + registradores.getRegistradores(8).getConteudo());
        txtRegistrador9.setText("" + registradores.getRegistradores(9).getConteudo());
        txtRegistrador10.setText("" + registradores.getRegistradores(10).getConteudo());
        txtRegistrador11.setText("" + registradores.getRegistradores(11).getConteudo());
        txtRegistrador12.setText("" + registradores.getRegistradores(12).getConteudo());
        txtRegistrador13.setText("" + registradores.getRegistradores(13).getConteudo());
        txtRegistrador14.setText("" + registradores.getRegistradores(14).getConteudo());
        txtRegistrador15.setText("" + registradores.getRegistradores(15).getConteudo());
        txtRegistrador16.setText("" + registradores.getRegistradores(16).getConteudo());
        txtRegistrador17.setText("" + registradores.getRegistradores(17).getConteudo());
        txtRegistrador18.setText("" + registradores.getRegistradores(18).getConteudo());
        txtRegistrador19.setText("" + registradores.getRegistradores(19).getConteudo());
        txtRegistrador20.setText("" + registradores.getRegistradores(20).getConteudo());
        txtRegistrador21.setText("" + registradores.getRegistradores(21).getConteudo());
        txtRegistrador22.setText("" + registradores.getRegistradores(22).getConteudo());
        txtRegistrador23.setText("" + registradores.getRegistradores(23).getConteudo());
        txtRegistrador24.setText("" + registradores.getRegistradores(24).getConteudo());
        txtRegistrador25.setText("" + registradores.getRegistradores(25).getConteudo());
        txtRegistrador26.setText("" + registradores.getRegistradores(26).getConteudo());
        txtRegistrador27.setText("" + registradores.getRegistradores(27).getConteudo());
        txtRegistrador28.setText("" + registradores.getRegistradores(28).getConteudo());
        txtRegistrador29.setText("" + registradores.getRegistradores(29).getConteudo());
        txtRegistrador30.setText("" + registradores.getRegistradores(30).getConteudo());
        txtRegistrador31.setText("" + registradores.getRegistradores(31).getConteudo());
        
    }
    
    //Função que guarda todos os inputs do usuário na memória
    private void guardarInput () {
        
        mem.setCelulas(txtMemoria0.getText(), 0);
        mem.setCelulas(txtMemoria1.getText(), 1);
        mem.setCelulas(txtMemoria2.getText(), 2);
        mem.setCelulas(txtMemoria3.getText(), 3);
        mem.setCelulas(txtMemoria4.getText(), 4);
        mem.setCelulas(txtMemoria5.getText(), 5);
        mem.setCelulas(txtMemoria6.getText(), 6);
        mem.setCelulas(txtMemoria7.getText(), 7);
        mem.setCelulas(txtMemoria8.getText(), 8);
        mem.setCelulas(txtMemoria9.getText(), 9);
        mem.setCelulas(txtMemoria10.getText(), 10);
        mem.setCelulas(txtMemoria11.getText(), 11);
        mem.setCelulas(txtMemoria12.getText(), 12);
        mem.setCelulas(txtMemoria13.getText(), 13);
        mem.setCelulas(txtMemoria14.getText(), 14);
        mem.setCelulas(txtMemoria15.getText(), 15);
        
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
    private javax.swing.JButton btnExecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMemoria0;
    private javax.swing.JLabel lblMemoria1;
    private javax.swing.JLabel lblMemoria10;
    private javax.swing.JLabel lblMemoria11;
    private javax.swing.JLabel lblMemoria12;
    private javax.swing.JLabel lblMemoria13;
    private javax.swing.JLabel lblMemoria14;
    private javax.swing.JLabel lblMemoria15;
    private javax.swing.JLabel lblMemoria2;
    private javax.swing.JLabel lblMemoria3;
    private javax.swing.JLabel lblMemoria4;
    private javax.swing.JLabel lblMemoria5;
    private javax.swing.JLabel lblMemoria6;
    private javax.swing.JLabel lblMemoria7;
    private javax.swing.JLabel lblMemoria8;
    private javax.swing.JLabel lblMemoria9;
    private javax.swing.JLabel lblMemorias;
    private javax.swing.JLabel lblPC;
    private javax.swing.JLabel lblRegistrador0;
    private javax.swing.JLabel lblRegistrador1;
    private javax.swing.JLabel lblRegistrador10;
    private javax.swing.JLabel lblRegistrador11;
    private javax.swing.JLabel lblRegistrador12;
    private javax.swing.JLabel lblRegistrador13;
    private javax.swing.JLabel lblRegistrador14;
    private javax.swing.JLabel lblRegistrador15;
    private javax.swing.JLabel lblRegistrador16;
    private javax.swing.JLabel lblRegistrador17;
    private javax.swing.JLabel lblRegistrador18;
    private javax.swing.JLabel lblRegistrador19;
    private javax.swing.JLabel lblRegistrador2;
    private javax.swing.JLabel lblRegistrador20;
    private javax.swing.JLabel lblRegistrador21;
    private javax.swing.JLabel lblRegistrador22;
    private javax.swing.JLabel lblRegistrador23;
    private javax.swing.JLabel lblRegistrador24;
    private javax.swing.JLabel lblRegistrador25;
    private javax.swing.JLabel lblRegistrador26;
    private javax.swing.JLabel lblRegistrador27;
    private javax.swing.JLabel lblRegistrador28;
    private javax.swing.JLabel lblRegistrador29;
    private javax.swing.JLabel lblRegistrador3;
    private javax.swing.JLabel lblRegistrador30;
    private javax.swing.JLabel lblRegistrador31;
    private javax.swing.JLabel lblRegistrador4;
    private javax.swing.JLabel lblRegistrador5;
    private javax.swing.JLabel lblRegistrador6;
    private javax.swing.JLabel lblRegistrador7;
    private javax.swing.JLabel lblRegistrador8;
    private javax.swing.JLabel lblRegistrador9;
    private javax.swing.JLabel lblRegistradores;
    private javax.swing.JTextField txtMemoria0;
    private javax.swing.JTextField txtMemoria1;
    private javax.swing.JTextField txtMemoria10;
    private javax.swing.JTextField txtMemoria11;
    private javax.swing.JTextField txtMemoria12;
    private javax.swing.JTextField txtMemoria13;
    private javax.swing.JTextField txtMemoria14;
    private javax.swing.JTextField txtMemoria15;
    private javax.swing.JTextField txtMemoria2;
    private javax.swing.JTextField txtMemoria3;
    private javax.swing.JTextField txtMemoria4;
    private javax.swing.JTextField txtMemoria5;
    private javax.swing.JTextField txtMemoria6;
    private javax.swing.JTextField txtMemoria7;
    private javax.swing.JTextField txtMemoria8;
    private javax.swing.JTextField txtMemoria9;
    private javax.swing.JTextField txtPC;
    private javax.swing.JTextField txtRI;
    private javax.swing.JTextField txtRegistrador0;
    private javax.swing.JTextField txtRegistrador1;
    private javax.swing.JTextField txtRegistrador10;
    private javax.swing.JTextField txtRegistrador11;
    private javax.swing.JTextField txtRegistrador12;
    private javax.swing.JTextField txtRegistrador13;
    private javax.swing.JTextField txtRegistrador14;
    private javax.swing.JTextField txtRegistrador15;
    private javax.swing.JTextField txtRegistrador16;
    private javax.swing.JTextField txtRegistrador17;
    private javax.swing.JTextField txtRegistrador18;
    private javax.swing.JTextField txtRegistrador19;
    private javax.swing.JTextField txtRegistrador2;
    private javax.swing.JTextField txtRegistrador20;
    private javax.swing.JTextField txtRegistrador21;
    private javax.swing.JTextField txtRegistrador22;
    private javax.swing.JTextField txtRegistrador23;
    private javax.swing.JTextField txtRegistrador24;
    private javax.swing.JTextField txtRegistrador25;
    private javax.swing.JTextField txtRegistrador26;
    private javax.swing.JTextField txtRegistrador27;
    private javax.swing.JTextField txtRegistrador28;
    private javax.swing.JTextField txtRegistrador29;
    private javax.swing.JTextField txtRegistrador3;
    private javax.swing.JTextField txtRegistrador30;
    private javax.swing.JTextField txtRegistrador31;
    private javax.swing.JTextField txtRegistrador4;
    private javax.swing.JTextField txtRegistrador5;
    private javax.swing.JTextField txtRegistrador6;
    private javax.swing.JTextField txtRegistrador7;
    private javax.swing.JTextField txtRegistrador8;
    private javax.swing.JTextField txtRegistrador9;
    // End of variables declaration//GEN-END:variables
}
