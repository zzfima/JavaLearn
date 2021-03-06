# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)

Project source: https://alexkosarev.name/2017/08/08/application-development-with-spring-part-1/

After clone write: ./mvnw spring-boot:run

Desc:

Разрабатываемый проект — простой хелпдеск, основная цель которого — 
предоставить пользователям возможность уведомлять службу технической 
поддержки о возникающих проблемах. Кроме возможности создания самих заявок 
(или обращений), должна быть реализована возможность оставлять 
комментарии к заявкам.
Основные возможности нашего проекта — создание и обсуждение заявок. 
Следовательно, нам потребуется всего два класса-сущностей: 
для описания заявки и для описания комментария. Авторизация будет 
рассматриваться в следующей статье, так что в классах-сущностях 
информации об авторах записей не будет.