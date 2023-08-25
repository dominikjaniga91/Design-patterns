package org.patterns.observer;

class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("close", new LogCloseListener("/path/to/log/file.txt"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.closeFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}