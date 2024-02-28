package com.dft.trading.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dft.trading.account.dao.LonLognDMC;
import com.dft.trading.account.dao.LonLognDMO;
import com.dft.trading.account.service.LonLognBMC;
import com.dft.trading.account.service.LonLognBMO;


// Bean 넣는곳
@Configuration
@MapperScan("com.dft.trading.channel.dao")
public class RootAppConfig {
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://172.30.1.1:3306/dreamft_workbranch");
        dataSource.setUsername("dft");
        dataSource.setPassword("Dft0305!!");
        return dataSource;
    }

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		
		System.out.println("************************** >>> SqlSessionFactory!!");
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		PathMatchingResourcePatternResolver pmrpResolver = new PathMatchingResourcePatternResolver();
		sessionFactory.setMapperLocations(pmrpResolver.getResources("classpath*:com/dft/trading/channel/dao/sql/*.xml"));
		
		return sessionFactory.getObject();
	}
	
	
	// JDBC Template을 쏴서 Database를 연동하는 방식. 대규모 프로젝트에서 사용하지 않음.
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    
    @Bean // UserInfoBMO 서비스 빈을 추가
    public LonLognBMO userInfoBMO() {
        return new LonLognBMC(); // 또는 여기서 적절한 방식으로 빈을 생성하고 반환
    }
    
    @Bean // UserInfoDMO 빈을 추가
    public LonLognDMO userInfoDMO(SqlSessionFactory sqlSessionFactory) {
        LonLognDMC userInfoDMC = new LonLognDMC();
        userInfoDMC.setSqlSessionFactory(sqlSessionFactory);
        return userInfoDMC;
    }

}
