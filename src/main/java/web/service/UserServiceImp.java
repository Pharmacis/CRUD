package web.service;

import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import java.util.List;
import java.util.Map;

@Service()
public class UserServiceImp implements UserService {

   private UserDao userDao;
   UserServiceImp(UserDao userDao){
      this.userDao= userDao;
   }

   @Autowired
   public UserDao getUserDao() {
      return userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

  // @Transactional(readOnly = true)
   @javax.transaction.Transactional
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional
   @Override
   public void delete(User user) {
     userDao.delete (user);
   }

    @Transactional
    @Override
    public void deleteById(Long id) {
       userDao.deleteById (id);
    }

    @Transactional
   @Override
   public User update(User user) {
      return userDao.update (user);
   }

   @Transactional
   @Override
   public User getUserById(Long id) {
      return userDao.getUserById (id);
   }

}
