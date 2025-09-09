package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailSender;

	public EmailNotifier() {
		// Decide automaticamente a implementação
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			this.mailSender = new DryRunMailSender();
		} else {
			this.mailSender = new SmtpClient();
		}
	}

	public void welcome(User user) {
		mailSender.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
