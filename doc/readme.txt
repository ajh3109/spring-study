2015.08.30 hello world
2015.09.01 DB SELECT 처리
	mybatis설정, altibase설정
	config 생성
		/spring-study/src/main/resources/config/spring/context-datasource.xml
		/spring-study/src/main/resources/config/spring/context-mapper.xml
	mapper 생성
		/spring-study/src/main/resources/mapper/User_SQL.xml
	web.xml 설정
		/spring-study/src/main/webapp/WEB-INF/web.xml
		추가
		<context-param>
			<param-name>contextConfigLocation</param-name>
		    <param-value>classpath*:config/spring/context-*.xml</param-value>
		</context-param>
	
	pom.xml 아래내용 추가
		<!-- MyBatis -->
			<dependency>
			    <groupId>org.mybatis</groupId>
			    <artifactId>mybatis</artifactId>
			    <version>3.2.2</version>
			</dependency>
			 
			<dependency>
			    <groupId>org.mybatis</groupId>
			    <artifactId>mybatis-spring</artifactId>
			    <version>1.2.0</version>
			</dependency>
			 
			<dependency>
			    <groupId>org.springframework</groupId>
			    <artifactId>spring-jdbc</artifactId>
			    <version>${org.springframework-version}</version>
			</dependency>
			 
			<dependency>
			    <groupId>commons-dbcp</groupId>
			    <artifactId>commons-dbcp</artifactId>
			    <version>1.4</version>
			</dependency>
	알티베이스 jar 추가 및 lib build path 설정
		/spring-study/src/main/webapp/WEB-INF/lib/Altibase_6.1.1.jar
	사용자목록 view jsp 추가
		/spring-study/src/main/webapp/WEB-INF/views/notice/userList.jsp
	DAO 설정 후 DB select 완료