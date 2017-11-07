package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.Son;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SonDAO extends JpaRepository<Son, Integer> {
}
