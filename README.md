Application Description.

Entire deployment topology is based on Google Cloud Platform and the deployment is
on server less platform "Cloud Run". 

To read more on google cloud run, visit https://cloud.google.com/run/docs

It is a java-spring boot application which has one controller which takes number as input and calculates the factorial.

The API is exposed via Swagger. 

How to deploy and run:
1. The script "cloudrun.sh" is the entry point. It will build the project and copies the jar file to the root project.
2. The above script cloudrun.sh calls "cloudbuild.yaml" file which creates a docker image of the application which is described in the dockerfile and pushes the image to the
google repository gcr.io in the project "development-tier".
3. The image pushed will look like the image "Docker Image.png".
4. Then we create a service in Google Cloud Run, selecting the CPU, memory, port and the image which will look like the immage in "CloudRun Deployment.png".
5. We will get an accessible URL to access the service. 
6. The swagger will look like "Swagger.png".
7. The entire operation will look like the image in "Swagger-Operation.png".