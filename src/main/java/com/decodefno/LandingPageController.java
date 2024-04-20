package com.decodefno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingPageController {
    @GetMapping("/")
    @ResponseBody
    public String landingPage() {
        return "decodefno.com is available for sale! please connect with decodefno [at] gmail.com";
    }
}
