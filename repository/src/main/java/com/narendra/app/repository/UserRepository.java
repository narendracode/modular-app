package com.narendra.app.repository;

import com.narendra.app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    public Collection<UserEntity> findByName(String name);
}
