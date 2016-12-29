import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:hlwanghl@hotmail.com">Hongliang Wang</a>
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Sample sample = context.getBean(Sample.class);

        sample.sendMail("no-reply@some.company.com", "receiver@some.company.com", "Test", "This is a test.");
    }
}
