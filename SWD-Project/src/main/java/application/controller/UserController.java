package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import application.entity.User;
import application.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@Api(value="User Management System")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@ApiOperation(value = "View a list of available user", response = Iterable.class)
	@ResponseBody
    @GetMapping("/user")
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
	
	@ApiOperation(value = "View a single user", response = Optional.class)
	@ResponseBody
    @GetMapping("/user/{id}")
    public Optional<User> getOne(@ApiParam("The ID of the user you want to view") @PathVariable(value = "id") int id){
        return userRepository.findById(id);
    }
	
	@ApiOperation(value = "Delete a user", response = Optional.class)
	@Transactional
	@ResponseBody
    @DeleteMapping("/user/{id}")
    public Optional<User> deleteOne(@ApiParam("The ID of the user you want to delete") @PathVariable(value = "id") int id) {
        return userRepository.deleteById(id);
    }
	
	@ApiOperation(value = "Add a new user", response = User.class)
    @PostMapping("/user")
    public User addOne(@ApiParam("The user Object to create a new User") @RequestBody User user) {
        return userRepository.save(user);
    }
    
	@ApiOperation(value = "Update a user", response = User.class)
    @PutMapping("/user")
    public User updateOne(@ApiParam("The user Object to update current User")@RequestBody User user) {
    	if (userRepository.findById(user.getId()) != null)
    	{
    		return null;
    	}
    	else
    	{
    		return userRepository.save(user);
    	}
    }
}
