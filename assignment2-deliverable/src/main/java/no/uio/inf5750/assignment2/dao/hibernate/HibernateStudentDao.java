package no.uio.inf5750.assignment2.dao.hibernate;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import no.uio.inf5750.assignment2.dao.StudentDAO;
import no.uio.inf5750.assignment2.model.Student;

public class HibernateStudentDao implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
    public SessionFactory getSessionFactory() {
    	return sessionFactory;
    }
	
	public void setSessionFactory( SessionFactory sessionFactory )
    {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		//Her skal jeg ta det skapte studentobjektet og legge det inn i databasen.
		
		return 0;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
