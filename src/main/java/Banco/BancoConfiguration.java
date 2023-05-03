package Banco;

import org.springframework.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;
import org.springframework.core.io.*;
import org.springframework.data.repository.init.*;
import java.net.URL;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "Banco-EntityManagerFactory",
        transactionManagerRef = "Banco-TransactionManager"
)
public class BancoConfiguration {

  @Bean(name="Banco-EntityManagerFactory")
  public LocalEntityManagerFactoryBean entityManagerFactory() {
    LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
    factoryBean.setPersistenceUnitName("Banco");
    return factoryBean;
  }

  @Bean(name = "Banco-TransactionManager")
  public PlatformTransactionManager transactionManager() {
    return new JpaTransactionManager(entityManagerFactory().getObject());
  }

}