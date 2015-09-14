package com.jsf.jsfprohtml5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean
@ViewScoped
public class User implements Serializable {
	
    private String name;
    private String password;
    
    private List<String> favouriteSports;
    private Map<String, String> spokenLanguages;
    
    public User() {
    	
    	favouriteSports = new ArrayList<String>();
      	favouriteSports.add("Football");
      	favouriteSports.add("Rugby");
      	favouriteSports.add("rugby emma baron lawl");
      	
     	spokenLanguages = new HashMap<String, String>();
     	spokenLanguages.put("ENG", "English");
    }
    public String getName() {
    	System.out.println("dog");
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public List<String> getFavouriteSports() {
		return favouriteSports;
	}
	public void setFavouriteSports(List<String> favouriteSports) {
		this.favouriteSports = favouriteSports;
	}
	public Map<String, String> getSpokenLanguages() {
		return spokenLanguages;
	}
	public void setSpokenLanguages(Map<String, String> spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}
	public void setPassword(String password) {
        this.password = password;
    }
    
    @PostConstruct
    private void initialize() {
        System.out.println("Bean is initialized with the following user name: " + name);
        favouriteSports.add("ameer");
    }
    @PreDestroy
    private void cleanUp() {
        System.out.println("You can do the cleanup here"+"chimpanzee");
    }
}