package fcc.practicafinal;
import javax.swing.JOptionPane;
import java.util.*;
/**
 * @author saulmn
 */
public class Interfaz extends javax.swing.JFrame {
    private int op, ded, j, cnt[];
    private Hilo t1,t2,t3,t4;
    private RCompartido rc,rcp;
    private HiloDI di1,di2,di3,di4;
    private RCompartidoDI rcdi;
    private VCerradura vcerr;
    private HiloC c1,c2,c3,c4;
    private RCompartidoC rcc;
    private HiloD d1,d2,d3,d4;
    private RCompartidoD rcd;
    private HiloDijkstra p1,p2,p3,p4;
    private HiloM m1,m2,m3,m4;
    private RCompartidoM rcm,rca;
    private HiloA a1,a2,a3,a4;

    
    public Interfaz() {
        initComponents();
        //Condiciones competencia
        rc = new RCompartido();
        t1 = new Hilo(Area1, rc);
        t1.setName("Perrito 1");
        t2 = new Hilo(Area2, rc);
        t2.setName("Perrito 2");
        t3 = new Hilo(Area3, rc);
        t3.setName("Perrito 3");
        t4 = new Hilo(Area4, rc);
        t4.setName("Perrito 4");
        //Desactivacion de interrupciones
        rcdi = new RCompartidoDI();
        di1 = new HiloDI(Area1, rcdi);
        di1.setName("Perrito 1");
        di2 = new HiloDI(Area2, rcdi);
        di2.setName("Perrito 2");
        di3 = new HiloDI(Area3, rcdi);
        di3.setName("Perrito 3");
        di4 = new HiloDI(Area4, rcdi);
        di4.setName("Perrito 4");
        //Peterson (Variable Cerradura)
        vcerr = new VCerradura();
        rcc = new RCompartidoC();
        c1 = new HiloC(Area1, rcc);
        c1.setName("Perrito 1");
        c2 = new HiloC(Area2, rcc);
        c2.setName("Perrito 2");
        c3 = new HiloC(Area3, rcc);
        c3.setName("Perrito 3");
        c4 = new HiloC(Area4, rcc);
        c4.setName("Perrito 4");
        //Dekker (Alternancia Estricta)
        rcd = new RCompartidoD();
        d1 = new HiloD(Area1, rcd);
        d1.setName("Perrito 1");
        d2 = new HiloD(Area2, rcd);
        d2.setName("Perrito 2");
        d3 = new HiloD(Area3, rcd);
        d3.setName("Perrito 3");
        d4 = new HiloD(Area4, rcd);
        d4.setName("Perrito 4");
        //Dijkstra (Paper)
        rcp = new RCompartido();
        p1 = new HiloDijkstra(Area1, rcp,0);
        p1.setName("Perrito 1");
        p2 = new HiloDijkstra(Area2, rcp,1);
        p2.setName("Perrito 2");
        p3 = new HiloDijkstra(Area3, rcp,2);
        p3.setName("Perrito 3");
        p4 = new HiloDijkstra(Area4, rcp,3);
        p4.setName("Perrito 4");
        //Mutex (API)
        rcm = new RCompartidoM();
        m1 = new HiloM(Area1, rcm);
        m1.setName("Perrito 1");
        m2 = new HiloM(Area2, rcm);
        m2.setName("Perrito 2");
        m3 = new HiloM(Area3, rcm);
        m3.setName("Perrito 3");
        m4 = new HiloM(Area4, rcm);
        m4.setName("Perrito 4");
        //Mutex (Artesanal)
        rca = new RCompartidoM();
        a1 = new HiloA(Area1, rca);
        a1.setName("Perrito 1");
        a2 = new HiloA(Area2, rca);
        a2.setName("Perrito 2");
        a3 = new HiloA(Area3, rca);
        a3.setName("Perrito 3");
        a4 = new HiloA(Area4, rca);
        a4.setName("Perrito 4");   
        
        op = 0;
        ded = 0;
        j = 0;

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jDialog1 = new javax.swing.JDialog();
        Buttonstart = new javax.swing.JButton();
        Buttonkill = new javax.swing.JButton();
        Buttonexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Area3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Area4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica Final de porácticas de entrenamiento");

        Buttonstart.setText("Start");
        Buttonstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonstartActionPerformed(evt);
            }
        });

        Buttonkill.setText("Kill -9");
        Buttonkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonkillActionPerformed(evt);
            }
        });

        Buttonexit.setText("Exit");
        Buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonexitActionPerformed(evt);
            }
        });

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane2.setViewportView(Area2);

        Area3.setColumns(20);
        Area3.setRows(5);
        jScrollPane3.setViewportView(Area3);

        Area4.setColumns(20);
        Area4.setRows(5);
        jScrollPane5.setViewportView(Area4);

        jLabel1.setText("Plato 3");

        jLabel2.setText("Plato 1");

        jLabel3.setText("Plato 2");

        jLabel4.setText("Plato 3");

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Algorithms");

        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem1.setText("Condiciones Competencias");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem2.setText("Desactivación de Interrupcion");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setText("Peterson (Variable Cerradura)");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setText("Dekker (Alternancia Estricta)");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setText("Dijkstra (Paper)");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem6.setText("Mutex (Exclusion Mutua API)");
        jCheckBoxMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem7.setText("Mutex (Exclusion Mutua Artesanal)");
        jCheckBoxMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem7);
        jMenu4.add(jSeparator2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Buttonstart, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(Buttonkill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buttonexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel2)
                .addGap(126, 126, 126)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Buttonstart)
                        .addGap(26, 26, 26)
                        .addComponent(Buttonkill)
                        .addGap(26, 26, 26)
                        .addComponent(Buttonexit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonstartActionPerformed
        switch(op){
            case 1:

                t1.start();

                t2.start();

                t3.start();

                t4.start();
                
                t1.despertar();

                t2.despertar();
            
                t3.despertar();
             
                t4.despertar();
            break;
            
            case 2:
                di1.start();
                di1.despertar();
                di2.start();
                di2.despertar();
                di3.start();
                di3.despertar();
                di4.start();
                di4.despertar();
            break; 
            
            case 3:
                c1.start();
                c1.despertar();
                c2.start();
                c2.despertar();
                c3.start();
                c3.despertar();
                c4.start();
                c4.despertar();             
            break; 
            
            case 4:
                d1.start();
                d1.despertar();
                d2.start();
                d2.despertar();
                d3.start();
                d3.despertar();
                d4.start();
                d4.despertar();
               
            break; 
            
            case 5:
                p1.start();
                p1.despertar();
                p2.start();
                p2.despertar();
                p3.start();
                p3.despertar();
                p4.start();
                p4.despertar(); 
                
            break; 
            
            case 6:
                m1.start();
                m1.despertar();
                m2.start();
                m2.despertar();
                m3.start();
                m3.despertar();
                m4.start();
                m4.despertar();                
            break; 
           
            case 7:
                a1.start();
                a1.despertar();
                a2.start();
                a2.despertar();
                a3.start();
                a3.despertar();
                a4.start();
                a4.despertar();                
            break;
            
            default:
                JOptionPane.showMessageDialog(this,"Failed to select Algorithm.","Algorithm Warning: 01", JOptionPane.WARNING_MESSAGE);
            break;             
        }
    }//GEN-LAST:event_ButtonstartActionPerformed

    private void ButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonexitActionPerformed
        JOptionPane.showMessageDialog(this,"Thanks for using.");
        System.exit(0);
    }//GEN-LAST:event_ButtonexitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(this,"Thanks for using.");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ButtonkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonkillActionPerformed
        //Revisa que ya haya algo en kill
        if(op<1){
            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 02", JOptionPane.WARNING_MESSAGE); 
        }else{
          ded  = (int) (Math.random()*4+1);
          System.out.println(ded);
        }
        //Distibuye los kills
        switch(op){
            
            case 1:
                if(t1.getState().equals(Thread.State.NEW) || t2.getState().equals(Thread.State.NEW) || t3.getState().equals(Thread.State.NEW) || t4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A1: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                t1.stop();

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 t2.stop();
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                                t3.stop();
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                t4.stop();

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
      
            break;    
            
            case 2:
                
                if(di1.getState().equals(Thread.State.NEW) || di2.getState().equals(Thread.State.NEW) || di3.getState().equals(Thread.State.NEW) || di4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A2: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                di1.stop();

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 di2.stop();
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                                di3.stop();
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                di4.stop();

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
            break; 
            
            case 3:
                
           if(c1.getState().equals(Thread.State.NEW) || c2.getState().equals(Thread.State.NEW) || c3.getState().equals(Thread.State.NEW) || c4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A3: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                c1.stop();

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 c2.stop();
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                                c3.stop();
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                c4.stop();

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
            break; 
            
            case 4:
                
           if(d1.getState().equals(Thread.State.NEW) || d2.getState().equals(Thread.State.NEW) || d3.getState().equals(Thread.State.NEW) || d4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A4: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                d1.stop();

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 d2.stop();
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                                d3.stop();
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                d4.stop();

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
            break; 
            
            case 5:
                
           if(p1.getState().equals(Thread.State.NEW) || p2.getState().equals(Thread.State.NEW) || p3.getState().equals(Thread.State.NEW) || p4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A5: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                p1.stop();

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 p2.stop();
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                               p3.stop();
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                p4.stop();

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
            break; 
            
            case 6:
                
           if(m1.getState().equals(Thread.State.NEW) || m2.getState().equals(Thread.State.NEW) || m3.getState().equals(Thread.State.NEW) || m4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A6: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                m1.setDead(true);

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 m2.setDead(true);
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                                m3.setDead(true);
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                m4.setDead(true);

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
            break; 
            
            case 7:
                
           if(a1.getState().equals(Thread.State.NEW) || a2.getState().equals(Thread.State.NEW) || a3.getState().equals(Thread.State.NEW) || a4.getState().equals(Thread.State.NEW)){
                    JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 03", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    ded  = (int) (Math.random()*4+1);
                    System.out.println("A7: "+ded);
                    
                    switch(ded){
                        case 1:
                            try{
                                a1.setDead(true);

                             }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                         break;
            
                        case 2:
                             try{
                                 a2.setDead(true);
                    
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 3:
                            try{
                                a3.setDead(true);
                      
                            }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
            
                        case 4:
                             try{
                                a4.setDead(true);

                        }catch(Exception e){JOptionPane.showMessageDialog(this,"Failed to Kill Selected Thread.","Kill Warning: 02",JOptionPane.ERROR_MESSAGE);}
                        break; 
     
                        default:
                            JOptionPane.showMessageDialog(this,"Failed to Kill Thread: There's no threads.","Kill Warning: 01", JOptionPane.WARNING_MESSAGE);
                         break;    
                     } 

                }
            break;
            
            default:
                 JOptionPane.showMessageDialog(this,"Failed to Kill Thread.","Algorithm Warning: 01", JOptionPane.WARNING_MESSAGE);
            break;    
        }
    }//GEN-LAST:event_ButtonkillActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       JOptionPane.showMessageDialog(this,"Saul Maldonado Navarro Otoño 2020 FCC BUAP.","Practica Final de Practicas de Entrenamiento", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        op = 1;
        
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText(""); 
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();        
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
        
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();
        
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem6.setSelected(false);
        jCheckBoxMenuItem7.setSelected(false);
        
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        op = 2;
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
        
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();
       
        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem6.setSelected(false);
        jCheckBoxMenuItem7.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        op = 3;
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
        
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();

        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem6.setSelected(false);
        jCheckBoxMenuItem7.setSelected(false);        
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        op = 4;
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
       
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();

        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem6.setSelected(false);
        jCheckBoxMenuItem7.setSelected(false);        
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
        op = 5;
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
        
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();

        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem6.setSelected(false);
        jCheckBoxMenuItem7.setSelected(false);        
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jCheckBoxMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem6ActionPerformed
        op = 6;
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
        
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();
        
        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem7.setSelected(false);
        
    }//GEN-LAST:event_jCheckBoxMenuItem6ActionPerformed

    private void jCheckBoxMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7ActionPerformed
        op = 7;
        
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        
        t1.dormir();
        t2.dormir();
        t3.dormir();
        t4.dormir();
        
        di1.dormir();
        di2.dormir();
        di3.dormir();
        di4.dormir();
             
        c1.dormir();
        c2.dormir();
        c3.dormir();
        c4.dormir();
  
        d1.dormir();
        d2.dormir();
        d3.dormir();
        d4.dormir();
      
        p1.dormir();
        p2.dormir();
        p3.dormir();
        p4.dormir();
        
        m1.dormir();
        m2.dormir();
        m3.dormir();
        m4.dormir();
        
        a1.dormir();
        a2.dormir();
        a3.dormir();
        a4.dormir();

        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem6.setSelected(false);  
    }//GEN-LAST:event_jCheckBoxMenuItem7ActionPerformed
    /**/
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextArea Area3;
    private javax.swing.JTextArea Area4;
    private javax.swing.JButton Buttonexit;
    private javax.swing.JButton Buttonkill;
    private javax.swing.JButton Buttonstart;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
