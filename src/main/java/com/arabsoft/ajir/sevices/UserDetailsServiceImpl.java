package com.arabsoft.ajir.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arabsoft.ajir.dao.AdmUserRep;
import com.arabsoft.ajir.entities.AdmUser;







@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  AdmUserRep userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    AdmUser user = userRepository.findByMatpers(username);
    

    return UserDetailsImpl.build(user);
  }

}