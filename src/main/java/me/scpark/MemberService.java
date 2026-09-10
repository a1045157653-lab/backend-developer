package me.scpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MenberService {
    @Autowired
    private MenberRepository menberRepository;

    public List<me.scspark.Member> getAllMenbers(){
        return menberRepository.findAll();


    }
}
