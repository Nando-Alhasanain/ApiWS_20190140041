/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.project.dua;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nando
 */
@Service
public class BarangServicelmpl implements BarangService {

    /*
    @Autowired
    private BarangRepository barangRepository;

    @Override
    public List<Barang> getAllEmployees() {
        return barangRepository.findAll();
    }

    @Override
    public void saveEmployee(Barang barang) {
        this.barangRepository.save(barang);
    }

    @Override
    public Barang getEmployeeById(int id) {
        Optional<Barang> optional = barangRepository.findById(id);
        Barang barang = null;
        if (optional.isPresent()) {
            barang = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return barang;
    }

    @Override
    public void deleteEmployeeById(int id) {

        this.barangRepository.deleteById(id);
    }

    @Override
    public Page<Barang> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
                : Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.barangRepository.findAll(pageable);
    }

     */
    @Autowired
    private BarangRepository repository;

    @Override
    public Barang addBarang(Barang barang) {
        return repository.save(barang);
    }

    @Override
    public Barang getBarangById(int barangId) {
        return repository.findById(barangId).get();
    }

    @Override
    public void updateBarang(Barang barang) {
        Barang barangDB = repository.findById(barang.getIdBarang()).orElseThrow();
        repository.save(barang);
    }

    @Override
    public void deleteBarangById(int barangId) {
        try {
            repository.deleteById(barangId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Barang> getAllBarang() {
        return repository.findAll();
    }
}
