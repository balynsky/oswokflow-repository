This project will host the latest code from OpenSymphony product OSWorkflow (and related projects) in form of maven artifacts. Moreover, it will contain an adapter to user PropertySet with Hibernate3.

You can use this snippet in your **pom.xml** to access the Maven repository folder in order to access the artifacts:

```
<repositories>
    <repository>
        <id>OpenSymphony mirror repository</id>
        <name>OpenSymphony mirror repository</name>
        <url>https://oswokflow-repository.googlecode.com/svn/deploy/</url>
    </repository>
</repositories>
```

Workflow XSD can be found at this URL:
```
https://oswokflow-repository.googlecode.com/svn/trunk/osworkflow-build/osworkflow-designer/src/main/resources/META-INF/workflow_2_8.dtd
```