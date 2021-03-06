/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualrules;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Federico Garcia-Arevalo Calles
 */
public class VisualRules extends javax.swing.JFrame {
    /**
     * Creates new form VisualRules
     */
    private final ArrayList rules;
    
    public VisualRules() {
        initComponents(0,0);
        this.rules = new ArrayList();
        pack();
    }
    
    public void new_rule(String name, String weight){
        if(!this.rules.isEmpty()) CreateRules();
        this.rules.add(name);
        this.rules.add(weight);
        this.rules.add("");
        this.rules.add("");
    }
    
    public void new_antecedent(String name, String[] values){
        if(this.rules.isEmpty()) return;
        this.rules.add(name);
        this.rules.add(String.valueOf(values.length/7));
        this.rules.addAll(Arrays.asList(values));
    }

    public void new_consequent(String name, String value){
        if(this.rules.isEmpty()) return;
        this.rules.set(2,name);
        this.rules.set(3,value);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(int w, int h) {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        _actual_num_row = new javax.swing.JTextField();
        _OK = new javax.swing.JButton();
        _info = new javax.swing.JTextPane();
        _cont = new javax.swing.JScrollPane();
        _lista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 642));

        jLabel1.setText("Num of variable per row:");

        _actual_num_row.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _actual_num_row.setMaximumSize(new java.awt.Dimension(45, 23));
        _actual_num_row.setMinimumSize(new java.awt.Dimension(45, 23));
        _actual_num_row.setPreferredSize(new java.awt.Dimension(45, 23));
        
        _OK.setText("OK");
        _OK.setFocusPainted(false);
        _OK.setMaximumSize(new java.awt.Dimension(60, 23));
        _OK.setMinimumSize(new java.awt.Dimension(60, 23));
        _OK.setPreferredSize(new java.awt.Dimension(60, 23));
        _OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _OKActionPerformed(evt);
            }
        });

        _info.setText("Zoom an area of graph: click left and mark the area to right.\n" +
            "See all graph: click left and move to left.");
        _info.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _info.setEnabled(false);
        _info.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_actual_num_row, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_info))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_actual_num_row, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_OK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(_info, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout _listaLayout = new javax.swing.GroupLayout(_lista);
        _lista.setLayout(_listaLayout);
        _listaLayout.setHorizontalGroup(
            _listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, w, Short.MAX_VALUE)
        );
        _listaLayout.setVerticalGroup(
            _listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, h, Short.MAX_VALUE)
        );

        _cont.setViewportView(_lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_cont)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_cont))
        );

    }// </editor-fold>                        

    private void _OKActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        String text = _actual_num_row.getText();
        if(text.length() < 1 || text.length() > 2) return;
        
        try{
            int num = Integer.parseInt(text);
            if(num < 1 || num > 99) return;

            change_num_rules_in_row(num);
        }catch(NumberFormatException e){
            
        }
    }                                   
    
    public void SeeRules(String name){
        this.setTitle(name);
        CreateRules();
        int num = 5;
        change_num_rules_in_row(num);
        _actual_num_row.setText("" + num);
        this.setVisible(true);
    }
    
    private void CreateRules(){
        if(this.rules.isEmpty()) return;
        
        Rule rule = new Rule();
        
        if(this.rules.size() > 2){
            // ANTECEDENT
            rule = getAntecedent(this.rules,rule);

            // CONSEQUENT
            String consequent_variable = (String) this.rules.get(2);
            String consequent_term = (String) this.rules.get(3);
            rule.consequent(consequent_variable,consequent_term);
        }
        
        // ADD RULE
        rule.weight(Float.parseFloat((String) this.rules.get(1)));
        rule.number((String) this.rules.get(0));
        _lista.add(rule);
        
        this.rules.clear();
    }
    
    private void change_num_rules_in_row(int num){
        int h = 6;
        int w = 0;
        Rule aux[] = new Rule[_lista.getComponentCount()];
        for(int i = 0; i < _lista.getComponentCount(); i++){
            aux[i] = (Rule) _lista.getComponent(i);
            aux[i].regroup_components(num);
            aux[i].setSize(aux[i].getPreferredSize());
            aux[i].setLocation(6,h);
            h += aux[i].getHeight() + 6;
            if(aux[i].getWidth() > w) w = aux[i].getWidth();
        }
        
        this.remove(jPanel1);
        this.remove(jLabel1);
        this.remove(_actual_num_row);
        this.remove(_OK);
        this.remove(_info);
        this.remove(_cont);
        this.remove(_lista);
        
        initComponents(w,h);
        
        for (Rule rule : aux) {
            _lista.add(rule);
        }
    }
    
    private static Rule getAntecedent(ArrayList aux, Rule rule) {
        // Obtener las variables y terminos que van en la regla
        int act = 4;
        while(act  < aux.size()){
            String name = (String) aux.get(act); act++;
            int numLabels = Integer.parseInt((String) aux.get(act)); act++;
            int type_variable = 0;
            ArrayList aux_2 = new ArrayList();
            for(int k = 0; k < numLabels; k++){
                String[] data = new String[7];
                data[0] = (String) aux.get(act); act++;
                data[1] = (String) aux.get(act); act++;
                data[2] = (String) aux.get(act); act++;
                data[3] = (String) aux.get(act); act++;
                data[4] = (String) aux.get(act); act++;
                data[5] = (String) aux.get(act); act++;
                data[6] = (String) aux.get(act); act++;
                if(data[1].equals(data[2]) && data[1].equals(data[3]) && data[1].equals(data[4]) && type_variable != 2){
                    type_variable = 1;
                }else{
                    type_variable = 2;
                }
                aux_2.add(data);
            }
            if(type_variable == 1){
                String[] terms = new String[aux_2.size()];
                for(int i = 0; i < terms.length; i++){
                    String[] data = (String[]) aux_2.get(i);
                    terms[i] = data[0];
                }
                rule.add_categoric_antecedent(name,terms);
            }else if(type_variable == 2){
                double[][][] series = new double[aux_2.size()][4][2];
                for(int i = 0; i < series.length; i++){
                    String[] data = (String[]) aux_2.get(i);
                    series[i][0][0] = Double.parseDouble(data[1]);
                    series[i][0][1] = Double.parseDouble(data[5]);
                    series[i][1][0] = Double.parseDouble(data[2]);
                    series[i][1][1] = 1;
                    series[i][2][0] = Double.parseDouble(data[3]);
                    series[i][2][1] = 1;
                    series[i][3][0] = Double.parseDouble(data[4]);
                    series[i][3][1] = Double.parseDouble(data[6]);
                }
                rule.add_fuzzy_antecedent(name,series);
            }
        }
        return rule;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton _OK;
    private javax.swing.JTextField _actual_num_row;
    private javax.swing.JScrollPane _cont;
    private javax.swing.JTextPane _info;
    private javax.swing.JPanel _lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
