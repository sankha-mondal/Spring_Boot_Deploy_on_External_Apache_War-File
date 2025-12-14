**Steps for Deploy Spring Boot App on Externat Embedded Tomcat Server:**
 * 1. Add 'war' packaging, spring-boot-starter-tomcat - scope, <finalName> in pom.xml
 * 2. Extend **SpringBootServletInitializer** & override **SpringApplicationBuilder** in main class
 * 3. Generate build/war file: Run as -> maven build -> clean package -> Apply
 * 4. Download compilable Apache version.
 * 5. Paste war file in apache/webapp/
 * 6. Run: startup.bat
