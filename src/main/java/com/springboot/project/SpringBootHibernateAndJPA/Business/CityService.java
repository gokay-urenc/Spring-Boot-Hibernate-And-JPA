package com.springboot.project.SpringBootHibernateAndJPA.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.project.SpringBootHibernateAndJPA.DataAccess.ICityDal;
import com.springboot.project.SpringBootHibernateAndJPA.Entities.City;

@Service
public class CityService implements ICityService {

	private ICityDal cityDal;
	
	@Autowired
	public CityService(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}
	
	@Override
	@Transactional
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
	}
}