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
	
	public CoursesEntity getCourse(Integer id)
	{
		return (coursesDao.getCoures()).stream().filter(f -> f.getCourseId().equals(id)).findFirst().get();
	}

	public void addCourse(CoursesEntity coursesEntity) {
		coursesDao.addCourse(coursesEntity);
	}

	public void updateCourse(Integer id, CoursesEntity coursesEntity) {
		for(int index=0;index < coursesDao.getCoures().size();index++)
		{
			CoursesEntity course = coursesDao.getCoures().get(index);
			if(course !=null && course.getCourseId() == id)
				coursesDao.getCoures().set(index, coursesEntity);
		}
	}

	public void deleteCourse(Integer id) {
		coursesDao.getCoures().removeIf(f -> f.getCourseId() == id);
	}
}
