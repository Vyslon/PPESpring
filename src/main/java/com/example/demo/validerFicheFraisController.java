package com.example.demo;

import Métier.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Controller
public class validerFicheFraisController {

    @GetMapping("/choixVisiteurMois")
    public String choixFichesFrais(Model model) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GSBSpring");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Visiteur vst = new Visiteur();
        //System.out.println("ID = " + vst.getId());
        //vst.setId(1L);
        /* TODO
        FicheFraisPK fpk = new FicheFraisPK(vst, Mois.AVRIL);

        FicheFrais ff = new FicheFrais();
        ff.setEtat(Etat.ENCOURS);
        ff.setId(fpk);

        vst.addFicheFrais(ff); */

        em.persist(vst);
        //em.persist(fpk);
        //em.persist(ff);

        transaction.commit();
        em.close();
        emf.close();

        model.addAttribute("greeting", null);
        return "greeting";
    }
/*
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }*/

}