package aop_30_order;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//конфигурационный класс для конфигурирования контейнера Spring методом сканирования пакета
// на наличие аннотаций @Component
@Configuration // аннотация того что это конфигурационный файл Spring
@ComponentScan("aop_30_order") // аннотация с указанием, какой пакет сканировать
@EnableAspectJAutoProxy // аннотация построения автоматического АОП PROXY Spring
public class MyConfig {
}
