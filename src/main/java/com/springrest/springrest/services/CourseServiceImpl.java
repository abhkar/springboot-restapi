package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	//List<Course> list;
	
	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
		
		//list=new ArrayList<>();
		//list.add(new Course(145,"Java Core Course","This is java basic course"));
		//list.add(new Course(146,"Python Course","This is Python basic course"));
	}
	
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		/*Course c=null;
		
		for(Course course:list){
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}*/
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		//list.add(course);
		
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	/*	list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});*/
		
		courseDao.save(course);
		
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}



















