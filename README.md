## oerworldmapindexer

This microservice serves as an indexer for data of the [oerworldmap](https://github.com/hbz/oerworldmap). Indexing has been hived off the oerworldmap for performance reasons.

The service uses a diff-based input data format and is able to rebuild the entire data structure from the scratch.

## Setup

Clone this repository

    $ git clone https://github.com/hbz/oerworldmapindexer.git && cd oerworldmapindexer

Make sure you have a
[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
and [sbt](http://www.scala-sbt.org/download.html) installed. Then

    $ sbt run

and visit [http://localhost:9000](http://localhost:9000).
