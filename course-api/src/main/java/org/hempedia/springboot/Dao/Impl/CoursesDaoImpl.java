package org.hempedia.springboot.Dao.Impl;

import java.util.Arrays;
import java.util.List;

import org.hempedia.springboot.Dao.CoursesDao;
import org.hempedia.springboot.model.CoursesEntity;
import org.springframework.stereotype.Repository;

@Repository("courseDao")
public class CoursesDaoImpl implements CoursesDao {

		public List<CoursesEntity> getCoures()
		{
			return Arrays.asList(new CoursesEntity(10, "Dance Class"),
									new CoursesEntity(20, "Singing Class"),
									new CoursesEntity(30, "Guitar Class"));
		}
}
