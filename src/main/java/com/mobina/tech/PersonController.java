package com.mobina.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("personList", repository.findAll());
        return "home";
    }
    @GetMapping("/savePersonPage")
    public String savePersonPage(Model model) {
        PersonEntity person=new PersonEntity();
        model.addAttribute("person",person);
        return "add_person";
    }

    @PostMapping("/savePerson")
    public String savePerson(@ModelAttribute("person") PersonEntity person) {
        repository.save(person);
        return "redirect:/";
    }

    @GetMapping("/updatePersonPage/{id}")
    public String showUpdatePersonPage(@PathVariable("id") int id, Model model) {
        Optional<PersonEntity> temp=repository.findById(id);
        PersonEntity person=temp.get();
        model.addAttribute("person",person);
        return "update_person";
    }

    @GetMapping("/deletePerson/{id}")
    public String deletePerson(@PathVariable("id") int id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}
