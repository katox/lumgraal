# lumgraal

generated using Luminus version "3.10.0"


## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

SVM jar from Graal needs to be repackaged as a maven dependency:

    mvn install:install-file -DgroupId=com.oracle -DartifactId=graal-svm \
                                         -Dversion=1.0.0-rc6 -Dpackaging=jar -Dfile=graalvm-ce-1.0.0-rc6/jre/lib/svm/builder/svm.jar

## Running

    lein do clean, uberjar
    ./run.sh

## License

Copyright © 2018 FIXME
