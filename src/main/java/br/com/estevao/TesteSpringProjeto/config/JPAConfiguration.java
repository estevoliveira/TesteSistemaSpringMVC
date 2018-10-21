package br.com.estevao.TesteSpringProjeto.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {

	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = 
        		new LocalContainerEntityManagerFactoryBean();
        
        //variavel que indica o tipo de JPA, que nesse caso é o Hibernate
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

        factoryBean.setJpaVendorAdapter(vendorAdapter);

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("");
        //precisa mudar o nome do banco
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_testejava");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        factoryBean.setDataSource(dataSource);

        Properties props = new Properties();
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.hbm2ddl.auto", "update");

        factoryBean.setJpaProperties(props);

        //pacote com as entidades
        factoryBean.setPackagesToScan("br.com.estevao.TesteSpringProjeto.model");

        return factoryBean;
    }
	
	@Bean
	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}
}
