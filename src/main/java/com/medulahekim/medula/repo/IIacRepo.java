package com.medulahekim.medula.repo;

import com.medulahekim.medula.common.IlacMesajBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIacRepo extends JpaRepository<IlacMesajBilgileri, Integer> {

}
