package org.patterns.observer;

import java.io.File;

class EmailNotificationListener implements EventListener, EmailSender {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
        sendEmail("content", this.email);
    }

    @Override
    public void sendEmail(String content, String email) {
        //sends email
    }
}