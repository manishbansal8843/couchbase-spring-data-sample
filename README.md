# couchbase-spring-data-sample

This repo contains artifacts for creating a spring-boot app with Couchbase.

This app can be built by maven. After that, it can be packaged into a docker image and further deployed into a kubernetes cluster.

Now, all these steps can be performed via a GCP cloud build. Below are the steps to perform the same.

# Pre-requisites

One must have fully-functional GKE cluster with couchbase installed on it before deploying this app. To do that, one can refer below repository.

```
 https://github.com/manishbansal8843/couchbase-hackathon.git 
```

# App installation

1. Open gcloud shell.

2. Set project id and compute/zone in the cloud shell.

```
gcloud config set project couchbase-hackathon
gcloud config set compute/zone us-east1-b
```

3. Clone this repo.

`git clone https://github.com/manishbansal8843/couchbase-hackathon.git`

4. Swith directory

`cd couchbase-spring-data-sample`

5. Trigger build

`gcloud builds submit .`

This will install this application in GKE cluster along with couchbase cluster.

# App testing

1. This application can be tested by deploying a busybox-curl container on the same cluster and then executing cUrl commands.

2. To create a `building` resource.

Sample request

```
curl -X POST "sample:8080/building" \
 -H 'content-type: application/json' \
 -d '{"id" : 101,
 "name" : "Infosys", 
 "companyId" : "Infosys101",
 "areas" : [
 {
 "id" : 201,
 "name" : "Chandigarh"
 },
 {
 "id" : 202,
 "name" : "Mohali" 
 } 
 ],
 "phoneNumbers":["1234567890","0987654321"]
 }'

```

Response:

```
{"id":"101","name":"Infosys","companyId":"Infosys101","areas":[{"id":"201","name":"Chandigarh","areas":[]},{"id":"202","name":"Mohali","areas":[]}],"phoneNumbers":["1234567890","0987654321"]}
```

3. To fetch a `building` resource.

Sample Request

```
curl -X GET "sample:8080/building/101"
```

Sample Response

```
{"id":"101","name":"Infosys","companyId":"Infosys101","areas":[{"id":"201","name":"Chandigarh","areas":[]},{"id":"202","name":"Mohali","areas":[]}],"phoneNumbers":["1234567890","0987654321"]}
```
