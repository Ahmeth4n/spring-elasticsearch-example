package com.magnakod.kratos.repository;

import com.magnakod.kratos.document.Users;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ElasticsearchRepository<Users, String> {

    Users findByUserType(String user_type);
}