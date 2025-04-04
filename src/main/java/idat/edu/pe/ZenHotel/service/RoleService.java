package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoleModel;
import idat.edu.pe.ZenHotel.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleModel> getRoles(){
        return roleRepository.findAll();
    }

    public void saveRole(RoleModel role) {
        roleRepository.save(role);
    }

    public RoleModel getRoleById(int id){
        return roleRepository.findById(id).orElse(null);
    }
}
