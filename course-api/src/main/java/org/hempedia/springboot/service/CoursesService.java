package org.hempedia.springboot.service;

import java.util.List;

import org.hempedia.springboot.Dao.CoursesDao;
import org.hempedia.springboot.model.CoursesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {

	@Autowired
	private CoursesDao coursesDao;
	
	public List<CoursesEntity> processCourses()
	{
		return coursesDao.getCoures();
	}
}
