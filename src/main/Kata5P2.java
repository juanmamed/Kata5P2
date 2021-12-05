/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReaderBD;

/**
 *
 * @author Juanma
 */
public class Kata5P2 {

    private static String nameFile;
    private static ArrayList<Mail> mailList;
    private static Histogram<String> histogram;
    private static HistogramDisplay histogramdisplay;
    public static void main(String[] args) {
        nameFile = "email.txt";
        execute();
    }

    private static void execute() {
        input();
        process();
        output();
    }

    private static void input() {
        MailListReaderBD emails = new MailListReaderBD();
        mailList = emails.read();
    }

    private static void process() {
        histogram = MailHistogramBuilder.buildt(mailList);
    }

    private static void output() {
        histogramdisplay = new HistogramDisplay("Histograma", histogram);
        histogramdisplay.execute();
    }
    
}
