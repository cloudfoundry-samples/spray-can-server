spray-can-server
================
The spray-can simple-http-server example from [Spray](http://github.com/spray/spray).  Spray is a suite of scala libraries for building and consuming RESTful web services on top of Akka.  This example is deployed to Cloud Foundry as a standalone application.

### Deploying to Cloud Foundry

To deploy the application to Cloud Foundry, simply build the dist and push it to Cloud Foundry using the provided manifest.yml file.  You may need to modify the manifest to use a unique URL.

```bash
sbt clean compile package-dist
vmc push
Would you like to deploy from the current directory? [Yn]:
Pushing application 'simple-http-server'...
```