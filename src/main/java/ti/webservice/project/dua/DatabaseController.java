/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.project.dua;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nando
 */
@Controller
public class DatabaseController {
        @CrossOrigin
    @RequestMapping(value="/databarang", produces={MediaType.APPLICATION_JSON_VALUE})
    
    @ResponseBody
    public List<Barang> getDatamhs(){
        
        List<Barang> databarang = new ArrayList<>();
        
        BarangJpaController controller = new BarangJpaController();
        
        try {
            databarang = controller.findBarangEntities();
        } catch (Exception e){}
        
        return databarang;
    }
}
