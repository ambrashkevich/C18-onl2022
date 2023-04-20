package loginform.controller;

import javax.servlet.http.HttpServletRequest;
import loginform.exception.CommandException;

public interface BaseCommand {

    String execute(HttpServletRequest request) throws CommandException;
}
