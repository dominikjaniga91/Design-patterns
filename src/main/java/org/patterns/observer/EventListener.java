package org.patterns.observer;

import java.io.File;

interface EventListener {

    void update(String eventType, File file);
}