package GiaoDien.pnDetailSanPham;


import DataAccessLayer.SanPhamDAO;
import DataTranferObject.DiaNhac;
import DataTranferObject.DiaPhim;
import DataTranferObject.Sach;
import DataTranferObject.SanPham;
import Exception.IdSanPhamNotMatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lehuyhung
 */
public class fDetailSanPham extends javax.swing.JFrame {

    /**
     * Creates new form fDetailSanPham
     */
    public fDetailSanPham(SanPham sanPham) {
        initComponents();
        this.tfmasanpham.setText(sanPham.getIdsanpham());
        this.tfTenSanPham.setText(sanPham.getTensanpham());
        this.tfSoLuongConLai.setText(""+sanPham.getSoluongconlai());
        this.lbAnhMinhHoa.setIcon(new javax.swing.ImageIcon((new javax.swing.ImageIcon("C:\\Users\\lehuyhung\\Desktop\\toan merge\\mediaone-master\\src\\anhminhhoa\\"+sanPham.getAnhminhhoa())).getImage().getScaledInstance(lbAnhMinhHoa.getWidth(), lbAnhMinhHoa.getHeight(), 2)));

        if(sanPham instanceof Sach){
            Sach sach=(Sach)sanPham;
             JLabel lbnhaxuatban=new JLabel("nhà xuất bản");
            lbnhaxuatban.setBounds(10, 10, 100, 30);
            pnRieng.add(lbnhaxuatban);
            JTextField nhaxuatban = new JTextField(sach.getTennhaxuatban());
            nhaxuatban.setBounds(140, 10, 200, 30);
            pnRieng.add(nhaxuatban);
            JLabel lbtentacgia = new JLabel("tên tác giả");
            lbtentacgia.setBounds(10, 50, 100, 30);
            pnRieng.add(lbtentacgia);

            JTextField tfTenTacGia = new JTextField(sach.getTentacgia());
            tfTenTacGia.setBounds(140, 50, 200, 30);
            pnRieng.add(tfTenTacGia);
        }
        else if(sanPham instanceof DiaPhim){
            DiaPhim diaphim=(DiaPhim)sanPham;
           JLabel lbnhaxuatban=new JLabel("Đạo diễn ");
            lbnhaxuatban.setBounds(10, 10, 100, 30);
            pnRieng.add(lbnhaxuatban);
            JTextField nhaxuatban = new JTextField(diaphim.getDaodien());
            nhaxuatban.setBounds(140, 10, 200, 30);
            pnRieng.add(nhaxuatban);
            JLabel lbtentacgia = new JLabel("Diễn viên");
            lbtentacgia.setBounds(10, 50, 100, 30);
            pnRieng.add(lbtentacgia);

            JTextField tfTenTacGia = new JTextField(diaphim.getDienvien());
            tfTenTacGia.setBounds(140, 50, 200, 30);
            pnRieng.add(tfTenTacGia);
        }
        else if(sanPham instanceof DiaNhac){
            DiaNhac dianhac=(DiaNhac)sanPham;
               JLabel lbnhaxuatban=new JLabel("Thể loại nhạc");
            lbnhaxuatban.setBounds(10, 10, 100, 30);
            pnRieng.add(lbnhaxuatban);
            JTextField nhaxuatban = new JTextField(dianhac.getTheloainhac_tentheloai());
            nhaxuatban.setBounds(140, 10, 200, 30);
            pnRieng.add(nhaxuatban);
            JLabel lbtentacgia = new JLabel("tên ca sỹ");
            lbtentacgia.setBounds(10, 50, 100, 30);
            pnRieng.add(lbtentacgia);

            JTextField tfTenTacGia = new JTextField(dianhac.getTencasy());
            tfTenTacGia.setBounds(140, 50, 200, 30);
            pnRieng.add(tfTenTacGia);
        }

       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tfmasanpham = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfTenSanPham = new javax.swing.JTextField();
        tfSoLuongConLai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbAnhMinhHoa = new javax.swing.JLabel();
        pnRieng = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("mã sản phẩm");

        jLabel1.setText("tên sản phẩm");

        jLabel2.setText("số lượng còn lại");

        lbAnhMinhHoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhminhhoa/ditimlesong.jpg"))); // NOI18N
        lbAnhMinhHoa.setText("jLabel4");

        javax.swing.GroupLayout pnRiengLayout = new javax.swing.GroupLayout(pnRieng);
        pnRieng.setLayout(pnRiengLayout);
        pnRiengLayout.setHorizontalGroup(
            pnRiengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnRiengLayout.setVerticalGroup(
            pnRiengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAnhMinhHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSoLuongConLai, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnRieng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSoLuongConLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbAnhMinhHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 198, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(pnRieng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fDetailSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fDetailSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fDetailSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fDetailSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fDetailSanPham f;
                try {
                    f = new fDetailSanPham(SanPhamDAO.getSanPhamDetail("1234567890123"));
                    f.setVisible(true);
                } catch (IdSanPhamNotMatch ex) {
                    Logger.getLogger(fDetailSanPham.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbAnhMinhHoa;
    private javax.swing.JPanel pnRieng;
    private javax.swing.JTextField tfSoLuongConLai;
    private javax.swing.JTextField tfTenSanPham;
    private javax.swing.JTextField tfmasanpham;
    // End of variables declaration//GEN-END:variables
}