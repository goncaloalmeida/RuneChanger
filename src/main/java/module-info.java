module RuneChanger {
    requires java.base;
    requires java.scripting;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.controls;
    requires jdk.unsupported.desktop;
    requires java.naming;
    requires java.sql;
    requires jdk.crypto.ec;
    requires lol.client.java.api;
    requires com.jfoenix;
    requires slf4j.api;
    requires jna.platform;
    requires logback.classic;
    requires logback.core;
    requires org.jsoup;
    requires fuzzywuzzy;
    requires org.controlsfx.controls;
    requires jna;
    requires org.update4j;
    requires mslinks;

    exports com.stirante.runechanger;
    exports com.stirante.runechanger.gui;
    exports com.stirante.runechanger.gui.controllers;
    exports com.stirante.runechanger.model.client;
    exports com.stirante.runechanger.client;
    exports com.stirante.runechanger.gui.components;
    opens com.stirante.runechanger.runestore;
    opens com.stirante.runechanger.model.client;
    opens com.stirante.runechanger.model.github;
    opens com.stirante.runechanger.model.log;
    opens com.stirante.runechanger.gui.components;
    opens com.stirante.runechanger.gui.controllers;
}