# demo-review

Demo-review is a java simple RESTfull webservice application build with [Spring](https://spring.io/).
The project is an example of [CI/CD](https://en.wikipedia.org/wiki/CI/CD). When new code is pushed to the master branch, the code will be build and tested by [Travis CI](https://travis-ci.org/).
The configuration for [Travis CI](https://travis-ci.org/) is defined in the [.travis.yml](https://github.com/GaukeT/demo-review/blob/master/.travis.yml) file. Broadly [Travis CI](https://travis-ci.org/) will start an Ubuntu 16.04 virtual machine, build a [docker](https://www.docker.com/) image, runs the image in a [docker](https://www.docker.com/) contatiner. After that all the [JUnit](https://junit.org/junit5/) tests will be executed. Finally the code is pushed to [Sonar](sonarcloud.io). [Sonar](sonarcloud.io) performs a quality check.

## Badges
[![Build Status](https://travis-ci.org/GaukeT/demo-review.svg?branch=master)](https://travis-ci.org/GaukeT/demo-review)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=nl.gauket%3Ademo-review&metric=alert_status)](https://sonarcloud.io/dashboard?id=nl.gauket%3Ademo-review)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=nl.gauket%3Ademo-review&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=nl.gauket%3Ademo-review)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=nl.gauket%3Ademo-review&metric=security_rating)](https://sonarcloud.io/dashboard?id=nl.gauket%3Ademo-review)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=nl.gauket%3Ademo-review&metric=coverage)](https://sonarcloud.io/dashboard?id=nl.gauket%3Ademo-review)
[![CodeFactor](https://www.codefactor.io/repository/github/gauket/demo-review/badge)](https://www.codefactor.io/repository/github/gauket/demo-review)

## Links
- [Spring](https://spring.io/)
- [Travis CI](https://travis-ci.org/)
- [Docker](https://www.docker.com/)
- [Sonar](https://sonarcloud.io/)

