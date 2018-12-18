package com.medulahekim.medula.repo;

import com.medulahekim.medula.common.SBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sutrepo extends JpaRepository<SBilgileri, Integer> {

}
