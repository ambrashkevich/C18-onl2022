package com.tms.controller;

import com.tms.model.PagesPath;
import javax.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    PagesPath execute(HttpServletRequest request) throws Exception;
}
