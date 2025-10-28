// Adaptador (Implementação do repositório em memória)
package adapters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.User;
import ports.UserRepository;


public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<>();


    public void save(User user) 
    { 
        this.database.put(user.getId(), user);
    }

    public User findById(String id) 
    { 
        return this.database.get(id);
    }

    public List<User> findAll() 
    { 
    	return new ArrayList<>(this.database.values());
    }
}