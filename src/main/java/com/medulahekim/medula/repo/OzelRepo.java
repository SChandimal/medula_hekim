package com.medulahekim.medula.repo;

import com.medulahekim.medula.common.OzelDurumBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OzelRepo extends JpaRepository<OzelDurumBilgileri, Integer> {

}
