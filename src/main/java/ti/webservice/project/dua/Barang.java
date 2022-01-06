/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.project.dua;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nando
 */
@Entity
@Table(name = "barang")
@XmlRootElement

/*
public class Barang { 
    
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idBarang;
    
    @Column(name = "nama barang")
    private String namaBarang;
    
    @Column(name = "jumlah barang")
    private Integer jumlah;
    
    @Column(name = "Harga barang")
    private Integer harga;

    
    public Integer getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Integer idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    
     
}
 */
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b"),
    @NamedQuery(name = "Barang.findByIdBarang", query = "SELECT b FROM Barang b WHERE b.idBarang = :idBarang"),
    @NamedQuery(name = "Barang.findByNamaBarang", query = "SELECT b FROM Barang b WHERE b.namaBarang = :namaBarang"),
    @NamedQuery(name = "Barang.findByJumlah", query = "SELECT b FROM Barang b WHERE b.jumlah = :jumlah"),
    @NamedQuery(name = "Barang.findByHarga", query = "SELECT b FROM Barang b WHERE b.harga = :harga")})
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_barang")
    private Integer idBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private Integer jumlah;
    @Basic(optional = false)
    @Column(name = "harga")
    private Integer harga;

    public Barang() {
    }

    public Barang(Integer idBarang) {
        this.idBarang = idBarang;
    }

    public Barang(Integer idBarang, String namaBarang, Integer jumlah, Integer harga) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public Integer getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Integer idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarang != null ? idBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.idBarang == null && other.idBarang != null) || (this.idBarang != null && !this.idBarang.equals(other.idBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "ti.webservice.project.dua.Barang[ idBarang=" + idBarang + " ]";
        return "idBarang = " + getIdBarang() + "Nama barang = " + getNamaBarang() + "jumlah = " + getJumlah() + "Harga = " + getHarga();
    }

}
