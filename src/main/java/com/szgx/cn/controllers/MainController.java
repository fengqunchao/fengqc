/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.szgx.cn.controllers;

import com.szgx.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fengqc
 */
@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @PreAuthorize("hasRole('user')")
    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String toAdmin() {
        return "helloAdmin";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String root() {
        return "index";
    }

    @RequestMapping("/403")
    public String error() {
        return "403";
    }

}
