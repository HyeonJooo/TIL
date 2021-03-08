# MyBatis

Mybatis는 Java Object와 SQL 사이의 자동 매핑 기능을 지원하는 ORM 프레임워크이다.

Mybatis의 핵심은 개발과 유지보수가 쉽도록 SQL문을 별도의 파일로 분리하는 것이다.

---
## JDBC
**JDBC:Java Database Connectivity**

java에서 데이터베이스에 접근할 수 있도록하는 Java API.
JDBC만 사용해서 DB 쿼리문을 작성하면 Java 소스코드와 쿼리문이 겹치게 되고 관리가 어려워진다!

이를 해결하기 위해 사용하는 것이 **Mybatis**이다!

---

## Mybatis? JDBC?
JDBC는 위에서 말한 것과 같이 DB연결부터 쿼리 실행 등을 지원하는 API이다.<br>
Mybatis는 JDBC를 인자로 필요로 하는 JDBC에 종속된 개념이다.<br>
Mybatis를 사용하면 Mybatis는 JDBC에게 쿼리를 주고 JDBC가 DB에 접속해 쿼리문을 실행하게 된다.

<br>

### 그럼 JDBC만 사용하면 될 것 같은데, Mybatis를 사용하는 이유는?
- JDBC만 사용한다면?<br>
  여러 클래스에서 동일 쿼리를 사용한다면 모든 클래스 소스코드에 동일한 쿼리문을 반복해서 사용해야 한다.<br>
  한 곳으로 모은다해도 **소스코드 안에 쿼리문이 존재**한다는 것은 변하지 않는다.
  <br>


- Mybatis를 사용한다면?<br>
  쿼리문을 따로 빼서 XML파일에서 보관한다. <br>
  그럼 소스코드와 쿼리문을 분리시킬 수 있다.<br>
  쿼리문을 따로 보관하고 java 소스코드에서는 XML태그의 id만 호출하여 개발의 편리함을 제공할 수 있게 된다!!

---

## Mybatis 동작 흐름
(1) DAO가 mybatis에서 제공하는 메서드를 호출<br>
(2) mybatis는 SQL문이 저장된 mapper파일(XML)에서 필요한 SQL문을 찾는다.<br>
(3) mybatis는 SQL문을 데이터베이스 서버로 보내기 위해 JDBC를 사용한다.<br>
(4) JDBC 드라이버가 SQL문을 데이터베이스 서버로 보낸다.<br>
(5) mybatis는 실행결과를 반환한다.<br>

---
## DAO에서 Mybatis 사용 흐름
(1) DAO는 SqlSessionFactory에게 SQL을 실행할 객체를 요구<br>
(2) SqlSessionFactory는 SqlSession 객체를 생성하여 반환<br>
(3) DAO는 SqlSession 객체에게 SQL실행을 요청<br>
(4) SqlSession 객체는 SQL이 저장된 맵퍼 파일(XML)에서 SQL을 찾는다.<br>
(5) SqlSession은 JDBC 드라이버를 통해 데이터베이스에 질의를 실행<br>
(6) SqlSession은 데이터베이스로부터 가져온 질의 결과를 객체로 생성하여 반환<br>
(7) DAO는 사용이 끝난 SqlSession을 닫는다.<br>


(출처: http://blog.naver.com/PostView.nhn?blogId=yysvip&logNo=220178612535&parentCategoryNo=&categoryNo=9&viewDate=&isShowPopularPosts=true&from=search)

---

## Mybatis 특징
- **JAVA 소스코드와 SQL문의 분리**<br>
SQL문에 변경이 있을 때마다 java 코드를 수정하거나 컴파일하지 않아도 된다.<br>
  

- **쉬운 접근성과 코드의 간결함**<br>
JDBC의 대부분의 기능을 Mybatis가 제공한다.<br>
  복잡한 JDBC코드를 걷어내고 깔끔한 소스코드를 유지할 수 있다.<br>
  수동적인 파라미터 설정과 쿼리결과에 대한 매핑 구문을 제거할 수 있다.
