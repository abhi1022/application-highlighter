./gradlew clean
./gradlew build

cp build/libs/demo.jar .

gcloud builds submit --timeout 300s --config cloudbuild.yaml .