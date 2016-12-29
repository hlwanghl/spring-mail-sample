import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author <a href="mailto:hlwanghl@hotmail.com">Hongliang Wang</a>
 */
@Configuration
public class AppConfig {
    @Bean
    public JavaMailSender mailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.some.company.com");
        return mailSender;
    }

    @Bean
    public SimpleMailMessage mailMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("default-no-reply@some.company.com");
        message.setSubject("Default Subject");
        return message;
    }

    @Bean
    public Sample sample() {
        return new Sample();
    }
}
