package br.com.mariojp.solid.dip;

public class DryRunMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        // Não envia e-mail de verdade
        System.out.println("[DRY RUN] E-mail para " + to + ": " + subject);
    }
}
