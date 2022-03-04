#! /usr/bin/env groovy

def call() {
  echo "Building the app for brance $BRANCH_NAME"
  sh 'mvn package'
}