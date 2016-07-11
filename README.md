![jcenter](https://img.shields.io/badge/_jcenter_-_1.0.0-6688ff.png?style=flat) &#x2003; ![jcenter](https://img.shields.io/badge/_Tests_-_1/1-green.png?style=flat)
# ansi_colors
A java library for colored console output, using ANSI escape codes.

## Download ##

The maven artifacts are on [Bintray](https://bintray.com/programingjd/maven/info.jdavid.ansi/view)
and [jcenter](https://bintray.com/search?query=info.jdavid.ansi).

[Download](https://bintray.com/artifact/download/programingjd/maven/info/jdavid/ansi/colors/1.0.0/colors-1.0.0.jar) the latest jar.

__Maven__

Include [those settings](https://bintray.com/repo/downloadMavenRepoSettingsFile/downloadSettings?repoPath=%2Fbintray%2Fjcenter)
 to be able to resolve jcenter artifacts.
```
<dependency>
  <groupId>info.jdavid.ansi</groupId>
  <artifactId>colors</artifactId>
  <version>1.0.0</version>
</dependency>
```
__Gradle__

Add jcenter to the list of maven repositories.
```
repositories {
  jcenter()
}
```
```
dependencies {
  compile 'info.jdavid.ansi:colors:1.0.0'
}
```

## Usage ##


__java__
```java
System.out.println(Colors.RED.foreground("Red foreground"));
System.out.println(Colors.GREEN.background("Green background"));
System.out.println(Colors.colored(Colors.YELLOW, Colors.RED, "Yellow on Red"));
```