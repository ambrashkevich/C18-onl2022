package by.tms.shop.controller;

import by.tms.shop.exception.CommandException;
import by.tms.shop.model.PagesPath;
import javax.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    PagesPath execute(HttpServletRequest request) throws CommandException;
}
