package org.allen.persistence.dao.user;

import com.google.common.collect.Maps;
import org.allen.persistence.dao.BaseDao;
import org.allen.persistence.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/25.
 */
@Repository
public class UserDao extends BaseDao {

    public Object insertUser(User user){
        return insert("User.insertUser", user);
    }

    public boolean updateUser(User user){
        return update("User.updateUser", user) > 0 ? true : false;
    }

    public User findUserById(Long id){
        Map<String, Object> cond = Maps.newHashMap();
        cond.put("id", id);
        return queryForObject("User.findByCondition", cond);
    }

    public List<User> findUserByName(String name){
        Map<String, Object> cond = Maps.newHashMap();
        cond.put("name", name);
        return queryForList("User.findByCondition", cond);
    }
}
