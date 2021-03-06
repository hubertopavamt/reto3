package Domingo_Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioOrtopedic {
    
    @Autowired
    private InterfaceOrtopedic crud;

    public List<Ortopedic> getAll(){
        return (List<Ortopedic>) crud.findAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id){
        return crud.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        return crud.save(ortopedic);
    }
    public void delete(Ortopedic ortopedic){
        crud.delete(ortopedic);
    }
    
}

