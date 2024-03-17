package com.chanwoong.springsecurywithjwt.service;

import com.chanwoong.springsecurywithjwt.dto.CustomUserDetails;
import com.chanwoong.springsecurywithjwt.entity.UserEntity;
import com.chanwoong.springsecurywithjwt.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userData = userRepository.findByUsername(username);

        if(userData!=null){
            return new CustomUserDetails(userData);
        }
        return null;
    }
}
