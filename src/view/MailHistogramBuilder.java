/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Histogram;
import model.Mail;

/**
 *
 * @author Juanma
 */
public class MailHistogramBuilder {
    public static Histogram<String> buildt(List<Mail> mailList){
        Histogram<String> histogram = new Histogram<>();
        
        for(Mail mail :mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
