package com.medulahekim.medula.repo;

import com.medulahekim.medula.common.IlacBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IlacBilgileriRepo extends JpaRepository<IlacBilgileri,Integer> {

}
