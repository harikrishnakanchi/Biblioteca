package com.tw.pathashala.menu;

import com.tw.pathashala.view.ConsoleOutputTemplate;

import static com.tw.pathashala.constants.Constants.CONTINUE;
import static com.tw.pathashala.constants.Constants.INVALID_OPTION_MESSAGE;

public class InvalidOption implements MenuAction {
    private ConsoleOutputTemplate outputTemplate;

    public InvalidOption(ConsoleOutputTemplate outputTemplate) {
        this.outputTemplate = outputTemplate;
    }

    @Override
    public String execute() {
        outputTemplate.addToBody(INVALID_OPTION_MESSAGE);
        return CONTINUE;
    }
}
