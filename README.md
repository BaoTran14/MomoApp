# Serenity Screenplay pattern for automation testing native app Momo
Project with purpose of automating testing Momo application. Serenity screenplay pattern is used
with outstanding resolved actions, especially scrolling to select an element inside float modal(Found at ```ScrollInsideModalToText.java```).
## Screenplay structure

## Running project

> mvn clean verify -Denvironment={environment}

## Reporting

1. View detail report in ```target/site/serenity/index.html```
2. To generate emailable report, using single-page-report dependency and configure to plugin as below
```
<dependency>
     <groupId>net.serenity-bdd</groupId>
     <artifactId>serenity-single-page-report</artifactId>
     <version>${serenity.version}</version>
 </dependency>
```
Configure in plugin
```
<plugin>
    <groupId>net.serenity-bdd.maven.plugins</groupId>
    <artifactId>serenity-maven-plugin</artifactId>
    <version>${serenity.version}</version>
    <dependencies>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-single-page-report</artifactId>
            <version>${serenity.version}</version>
        </dependency>
    </dependencies>
    <configuration>
        <reports>single-page-html</reports>
    </configuration>
    <executions>
        <execution>
            <id>serenity-reports</id>
            <phase>post-integration-test</phase>
            <goals>
                <goal>aggregate</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```
View emailable report in ```target/site/serenity/index.html```