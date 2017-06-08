package br.com.neppo.examples.resources;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleResource {

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		
		String user = SecurityContextHolder.getContext().getAuthentication().getName();
		
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>)  SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		
		for (GrantedAuthority authority : authorities) {
		    
			
			
		}
			
		
		return String.format("Hello World, %s! Seus direitos de acesso:  %s", user, authorities);
		
	}
	
}
