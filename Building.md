SamlBeans uses <a href='http://maven.apache.org'>Maven</a> to build.  You can use either Maven 2 or 3.

After checking out the project, just run the following:

```
> mvn install
```

And the .jars will be available in your local disk maven repository ($HOME/.m2/repository) as well as in each module's respective `target` directory.