# Relation Engine

[![Build Status](https://travis-ci.com/abvss/relation-engine.svg?branch=master)](https://travis-ci.com/abvss/relation-engine) [![Coverage Status](https://coveralls.io/repos/github/abvss/relation-engine/badge.svg?branch=master)](https://coveralls.io/github/abvss/relation-engine?branch=master)

Relation Engine is the relation graph creator library/service you can use with your spring applications, this service is based on first, middle, last names of the individuals and find out the basic relations like father, mother, son, daughter, brother, sister, spouse. With curated information library creates the Graph data structure which you can use freely for many diffrant cool things :-)

<p align="center">
  <img src="/src/test/resources/generated-graph/graph.png" />
</p>

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to use library.


### Prerequisites

* Linux _(or any other OS where java can be installed)_
* Java 8/11
* Maven
* Lombok installed on your Eclipse/intellij

### Using Relation Engine Service

Import the dependancy
```
<dependency>
        <groupId>in.abvss</groupId>
	<artifactId>relation-engine</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
Use the service, easy :)

```
@Autowired
RelationEngineService relationEngineService;
...
...
...
List<Member> memberList = new ArrayList<Member>();
...
relationEngineService.setMemberList(memberList);      
MutableDirectedGraph g = service.createRelationshipGraph();   

```


### Running the tests
For shooting everything once. :)

```
mvn clean verify package test spotbugs:check pmd:pmd checkstyle:check javadoc:javadoc
```

### Junit
Relation Engine have lots of testcases to cover and code coverage is **89%**
```
mvn clean verify test
```

### Coding style tests
I'm a contributor to Apache Commons Text and love the checkstyle we use there. I have used same to develop this project.
https://github.com/apache/commons-text

```
mvn clean verify checkstyle:check
```
### Spotbug and pmd
```
mvn clean verify spotbugs:check pmd:pmd
```
### Javadoc
For API documentation.
```
mvn clean verify javadoc:javadoc
```
### Site
Using default site generation by mvn.
```
mvn site:run
```
and point your browser to http://0.0.0.0:8080/, All info, javadoc, Reports at one place :)

### Deployment

Just do ```mvn clean verify package``` in source directory and use the .jar file generated.

### Relation Engine built on

**System Info :-**

```
System:    Kernel: 4.15.0-20-generic x86_64 bits: 64 Desktop: Cinnamon 3.8.8
           Distro: Linux Mint 19 Tara
Machine:   System: Dell product: Dell System XPS L502X
           Mobo: Dell model: 0MY6GN v: A00 UEFI [Legacy]: Dell v: A05 date: 05/04/2011
CPU:       Quad core Intel Core i7-2630QM (-MT-MCP-) cache: 6144 KB
           clock speeds: max: 2900 MHz 1: 798 MHz 2: 798 MHz 3: 798 MHz 4: 798 MHz 5: 798 MHz 6: 798 MHz
           7: 798 MHz 8: 798 MHz
Graphics:  Card-1: Intel 2nd Generation Core Processor Family Integrated Graphics Controller
           Card-2: NVIDIA GF108M [GeForce GT 540M]
           Display Server: x11 (X.Org 1.19.6 ) drivers: modesetting,nouveau (unloaded: fbdev,vesa)
           Resolution: 1366x768@59.64hz, 1280x1024@60.02hz
           OpenGL: renderer: Mesa DRI Intel Sandybridge Mobile version: 3.3 Mesa 18.0.0-rc5
Drives:    HDD Total Size: 240.1GB (37.8% used)
           ID-1: /dev/mmcblk0 model: N/A size: 4.0GB
           ID-2: /dev/sda model: INTEL_SSDSC2BW24 size: 240.1GB
Partition: ID-1: / size: 103G used: 75G (77%) fs: ext4 dev: /dev/sda6
           ID-2: swap-1 size: 8.00GB used: 0.00GB (0%) fs: swap dev: /dev/sda5
```
**Java :-**

```
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-18T00:03:14+05:30)
Maven home: /usr/lib/maven/apache-maven-3.5.4
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: /usr/lib/jvm/jdk1.8.0_181/jre
Default locale: en_IN, platform encoding: UTF-8
OS name: "linux", version: "4.15.0-20-generic", arch: "amd64", family: "unix"

```

## Built With

* [Eclipse](https://www.eclipse.org/) - IDE used
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

**Amey Jadiye**
* [https://github.com/ameyjadiye](https://github.com/ameyjadiye)
* [https://www.linkedin.com/in/ameyjadiye/](https://www.linkedin.com/in/ameyjadiye/)

## License & Copyright

Copyright © 2020 by Amey Jadiye _(Author)_ With Apache Licence.
