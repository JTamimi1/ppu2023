
# Use an official OpenJDK runtime as a parent image
FROM openjdk
# Copying the jar file to the "/" directory
COPY $GITHUB_WORKSPACE/.github/artifacts/my-jar-file.jar app.jar

# Expose port 8080 for the API
EXPOSE 8080

# Run the command to start the API server
CMD ["java", "-jar", "/app.jar"]
