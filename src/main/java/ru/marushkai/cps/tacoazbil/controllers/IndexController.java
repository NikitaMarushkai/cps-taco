package ru.marushkai.cps.tacoazbil.controllers;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(Model model) {
        String currLang = LocaleContextHolder.getLocaleContext().getLocale().getLanguage();

        return "index";
    }
}
