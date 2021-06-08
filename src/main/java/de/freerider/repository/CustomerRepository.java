package de.freerider.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import de.freerider.model.Customer;


@Component
class CustomerRepository implements CrudRepository<Customer, String> {
	//
	private final IDGenerator idGen = new IDGenerator( "C", IDGenerator.IDTYPE.NUM, 6 );
    
	private final HashMap<String, Customer> map = new HashMap <String, Customer>();
	
	
	@Override
	public <S extends Customer> S save(S entity) {
		if (entity == null) {
			throw new IllegalArgumentException ("Entity is Null");
		}
		else {
			String id = entity.getId();
			if (id == null || id.equals("")) {
				id= idGen.nextId();
				entity.setId(id);
			}
			map.put(entity.getId(), entity);
		}
		return entity;
	}

	@Override
	public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		List<S> result = new ArrayList<S>();

		for (S entity : entities) {
			result.add(save(entity));
		}

		return result;
	}

	@Override
	public Optional<Customer> findById(String id) {
		// TODO Auto-generated method stub
		
		return ((CrudRepository<Customer, String>) map).findById(id);
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		((CrudRepository<Customer, String>) map).deleteById(id);
	}

	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Customer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	
}
