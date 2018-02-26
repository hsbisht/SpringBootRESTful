package org.hempedia.springboot.webserviceApi;

import java.util.List;

import org.hempedia.springboot.model.CoursesEntity;
import org.hempedia.springboot.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesApi {

	@Autowired
	private CoursesService coursesService;
	
	@RequestMapping("/courses")
	public List<CoursesEntity> getCourses()
	{
		return coursesService.processCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public CoursesEntity getCourse(@PathVariable Integer id)
	{
		return coursesService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/course")
	public void addCourse(@RequestBody CoursesEntity coursesEntity)
	{
		coursesService.addTopic(coursesEntity);
	}
}
