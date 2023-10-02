# Spring Boot Rest API Demo

## Build the application

```bash
mvn clean package
```

## Run the application

```bash
mvn spring-boot:run
```

## Test the application

```bash
curl http://localhost:8080/hello
```

## Test the reverse operation

```bash
curl http://localhost:8080/reverse?text=hello
```

## Test the remove vowels operation

```bash
curl http://localhost:8080/removeVowels?text=hello
```

## Run unit test

```bash
mvn test
```

## Dockerize the application

```bash
docker build -t spring-boot-rest-api-demo .
```

## Run the dockerized application

```bash
docker run -p 8080:8080 spring-boot-rest-api-demo
```

# Deploy to AKS

## Environment variables

```bash
export RESOURCE_GROUP=aks-demo-alb-rg
export CLUSTER_NAME=demo
export NAMESPACE=demo
```

## Get AKS credentials

```bash
az aks get-credentials --resource-group $RESOURCE_GROUP --name $CLUSTER_NAME
```

## Create namespace

```bash
kubectl create namespace $NAMESPACE
```

## Deploy the application

```bash
kubectl apply -f k8s/application.yaml -n $NAMESPACE
```

## Get service IP

```bash
export SVC_IP=`kubectl get svc myapp -n $NAMESPACE -o jsonpath='{.status.loadBalancer.ingress[0].ip}'`
```

## Test the application

```bash
curl http://$SVC_IP/hello
```
