package com.github.zebimax.chromeNetParser;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.IconLoader;

/**
 * Created by Max on 20.04.2014.
 */
public class NetParserAction extends AnAction {
    public NetParserAction() {
        // Set the menu item name.
        super("Parse Chrome Request", "Parse Chrome Request", IconLoader.getIcon("/images/Google-Chrome-Canary-icon.png"));
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description");
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt = Messages.showInputDialog(
                project, "What is your name?", "Input Your Name", Messages.getQuestionIcon());
        Messages.showMessageDialog(
                project, "Hello, " + txt + "!\n I am glad to see you.", "Information", Messages.getInformationIcon());
    }
}
