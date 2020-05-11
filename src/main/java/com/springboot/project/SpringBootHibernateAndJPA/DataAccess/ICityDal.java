package com.springboot.project.SpringBootHibernateAndJPA.DataAccess;

import java.util.List;
import com.springboot.project.SpringBootHibernateAndJPA.Entities.City;

public interface ICityDal {
	List<City> getAll();
	City getById(int id);
	void add(City city);
	void update(City city);
	void delete(City city);
}