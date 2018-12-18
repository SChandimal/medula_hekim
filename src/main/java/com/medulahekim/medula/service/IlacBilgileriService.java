package com.medulahekim.medula.service;

import com.medulahekim.medula.common.IlacBilgileri;
import com.medulahekim.medula.repo.IlacBilgileriRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IlacBilgileriService {
    @Autowired
    private IlacBilgileriRepo ilacBilgileriRepo;

    public void saveIlacBilgileri(IlacBilgileri ilacBilgileri) {
        ilacBilgileriRepo.save(ilacBilgileri);
    }
}
