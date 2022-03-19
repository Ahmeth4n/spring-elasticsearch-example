package com.magnakod.kratos.service;

import com.magnakod.kratos.document.Users;
import com.magnakod.kratos.repository.UserRepository;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository){
        this.userRepository = repository;
    }


    public void save(final Users users){
        userRepository.save(users);
    }

    public void findById(final String id){
        Users hedef = userRepository.findById(id).orElse(null);
        hedef.setUserType("2");
        userRepository.save(hedef);
    }


}
