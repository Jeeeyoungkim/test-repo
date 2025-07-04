# Sample Spring Boot API (Maven)

## 빌드 방법
```sh
mvn clean package
```

## 실행 방법
```sh
# 로컬 실행
mvn spring-boot:run
# 또는 빌드 후 jar 실행
java -jar target/sample-api-1.0-SNAPSHOT.jar
```

## API 사용법
- GET `/api/test?success=true` → 성공 응답
- GET `/api/test?success=false` → 실패 응답

### 예시
```sh
curl 'http://localhost:8080/api/test?success=true'
```

#### 성공 응답
```
{
  "success": true,
  "message": "요청이 성공적으로 처리되었습니다."
}
```

#### 실패 응답
```
{
  "success": false,
  "message": "요청이 실패하였습니다."
}
```

## Dockerfile 예시
```dockerfile
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/sample-api-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
``` 