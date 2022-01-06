/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.project.dua;

import java.util.List;
import org.springframework.data.domain.Page;
import ti.webservice.project.dua.Barang;

/**
 *
 * @author Nando
 */
public interface BarangService {

    /*
    List<Barang> getAllEmployees();

    void saveEmployee(Barang barang);

    Barang getEmployeeById(int id);

    void deleteEmployeeById(int id);

    Page<Barang> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
    
    */
    
    Barang addBarang(Barang barang);
    Barang getBarangById(int barangId);
    void updateBarang(Barang barang);
    void deleteBarangById(int barangId);
    List<Barang> getAllBarang(); 
}
