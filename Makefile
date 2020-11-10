run-dev:
	./mvnw clean compile quarkus:dev

build-image:
	./mvnw clean package && \
	docker build -f src/main/docker/Dockerfile.jvm -t quarkus/quarkus-demo-jvm .

run-docker:
	docker run -i --rm -p 8080:8080 quarkus/quarkus-demo-jvm

