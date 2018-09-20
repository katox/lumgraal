#!/bin/sh -x

native-image --static --verbose --no-server -H:+ReportUnsupportedElementsAtRuntime --delay-class-initialization-to-runtime=com.zaxxer.hikari.pool.ProxyConnection,com.zaxxer.hikari.pool.PoolEntry,com.zaxxer.hikari.pool.HikariPool,com.zaxxer.hikari.util.DriverDataSource,com.zaxxer.hikari.HikariDataSource,com.zaxxer.hikari.HikariConfig,com.zaxxer.hikari.util.ConcurrentBag,com.zaxxer.hikari.util.PropertyElf,com.zaxxer.hikari.pool.ProxyLeakTask,org.slf4j.impl.StaticLoggerBinder -jar target/uberjar/lumgraal.jar
