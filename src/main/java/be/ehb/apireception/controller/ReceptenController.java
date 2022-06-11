package be.ehb.apireception.controller;

import be.ehb.apireception.model.ReceptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/recpten")
public class ReceptenController {

    private ReceptDao receptDao;

    @Autowired
    public ReceptenController(ReceptDao receptDao){
        this.receptDao = receptDao;

    }

    @GetMapping
    public Iterable<Recept> getALLRecepten(){
        return receptDao.findAll();
    }


}
