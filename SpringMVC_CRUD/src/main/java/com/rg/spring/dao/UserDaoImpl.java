package com.rg.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rg.spring.model.User;
@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	public void saveUser(User user) {
		merge(user);

	}

	public List<User> findAllUsers() {
		 Criteria criteria = getSession().createCriteria(User.class);
	        return (List<User>) criteria.list();
	}

	public void deleteUserByID(int ID) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
        query.setLong("id", ID);
        query.executeUpdate();

	}

	public User findByID(int ID) {
		 Criteria criteria = getSession().createCriteria(User.class);
	        criteria.add(Restrictions.eq("id",ID));
	        return (User) criteria.uniqueResult();
	}

	public void updateUser(User user) {
		getSession().update(user);

	}

}
