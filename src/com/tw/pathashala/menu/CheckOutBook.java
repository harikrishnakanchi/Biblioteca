package com.tw.pathashala.menu;

import com.tw.pathashala.models.Library;
import com.tw.pathashala.view.ConsoleInput;
import com.tw.pathashala.view.ConsoleOutputTemplate;

import static com.tw.pathashala.constants.Constants.CHECKOUT_MESSAGE;
import static com.tw.pathashala.constants.Constants.CONTINUE;

public class CheckOutBook implements MenuAction {
    ConsoleOutputTemplate outputTemplate;
    ConsoleInput consoleInput;
    Library library;

    public CheckOutBook(ConsoleOutputTemplate outputTemplate, ConsoleInput consoleInput, Library library) {
        this.outputTemplate = outputTemplate;
        this.consoleInput = consoleInput;
        this.library = library;
    }

    @Override
    public String execute() {
        String bookName = askForBookName();
        outputTemplate.addToBody(this.library.checkOut(bookName));
        return CONTINUE;
    }

    private String askForBookName() {
        outputTemplate.renderOutput(library.availableItems(), CHECKOUT_MESSAGE);
        return consoleInput.getUserInput();
    }
}
