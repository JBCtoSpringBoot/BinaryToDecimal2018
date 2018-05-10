package com.rekik.binarytodecimal2018;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

@Controller
public class BinaryToDecimalController {


    @RequestMapping("/")
    public String addNewDirector(Model model)
    {
        model.addAttribute("aBinary", new Binary());
        return "binaryinput";
    }

    @PostMapping("/savebinary")
    public String saveBinary(@Valid @ModelAttribute("aBinary") Binary binary, BindingResult result, Model model)

    {

        if(result.hasErrors()){
            return "binaryinput";
        }
        int decimal = 0;
        int digit =0 ;
        int i = 0;
        while (binary.getBinary()!=0){

            digit=binary.getBinary() % 10;

            decimal+=digit * Math.pow(2, i);
            binary.setBinary(binary.getBinary()/10);
            i++;
        }

        model.addAttribute("decimal",decimal);

        return "decimal";
    }


}
