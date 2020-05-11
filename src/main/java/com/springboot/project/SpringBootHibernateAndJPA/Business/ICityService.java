package com.springboot.project.SpringBootHibernateAndJPA.Business;

import java.util.List;
import com.springboot.project.SpringBootHibernateAndJPA.Entities.City;

public interface ICityService {
	List<City> getAll();
	City getById(int id);
	void add(City city);
	void update(City city);
	void delete(City city);
}