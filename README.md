spray-can-server
================
The spray-can simple-http-server example from [Spray](http://github.com/spray/spray).  Spray is a suite of scala libraries for building and consuming RESTful web services on top of Akka. 

### Deploying to Cloud Foundry

To deploy the application to Cloud Foundry, simply build the dist and push it to Cloud Foundry using the provided `manifest.yml` file. 

```bash
$ sbt clean compile package-dist
$ cf push
```

The host name field in the `manifest.yml` include some random characters to make sure the URL for the app is unique in the Cloud Foundry environment. The output of the
`cf app` command shows the URL that was assigned. Using the provided URL in the `urls` field displayed, you can browse to the running application.
