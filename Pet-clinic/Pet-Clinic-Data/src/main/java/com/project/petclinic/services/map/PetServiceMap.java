package com.project.petclinic.services.map;

import com.project.petclinic.model.Owner;
import com.project.petclinic.model.Pet;
import com.project.petclinic.services.CrudService;
import com.project.petclinic.services.PetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements
    PetService {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

  @Override
  public Pet save(Pet object) {
    return super.save(object);
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }
}
