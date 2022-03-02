# CodeClan PSD - DevOps/Cloud Workshop

## Instructor Notes

## Contents

The content for the PSD cloud day is split into 2 sessions:

1. AM - Whiteboarding Session
1. PM - Practical Workshop

## Instructions

Split the class into groups of 3-5 before the day starts. These groups will be used throughout both sessions.

### AM - Whiteboarding Session

- Whiteboard/discuss the content in each section before sending the students away to research the provided topics and come back to discuss their findings.
- 10-25 minutes should be enough time, depending on which topics the students have been sent to discuss.
- Make sure that each group contributes during each section so that they don't feel their time spent researching was wasted.
- Pause for questions and discussion after each session.
- The whiteboarding session should wrap up shortly before or at lunch time.

### Practical Workshop Intro

Depending on when the morning session finished, you may want to intro the practical workshop before or after lunch.

In the practical workshop, the students will take a simple React app and set up pipelines on CircleCI so that a commit to the master branch runs automated test and deploy pipelines, deploying the app to AWS S3 if the test pipeline is successful.

You may wish to demo some of the technologies to the students.

- [GitHub Repo](https://github.com/codeclan/psd-cloud-hit-parade-project)
- [Live App](http://cc-hit-parade.s3-website.eu-west-2.amazonaws.com/)
- [CircleCI Pipeline](http://circleci.com)

Sign in to CircleCI with your GitHub account and select the CodeClan org, so that you can see the the HitParade project.

- [AWS](https://aws.com)
- [Login Details](https://docs.google.com/document/d/10Nh6b5rEko_r2DKaU8yTW3cEEwdFzy_iXmZ4eZEfHSY/edit?usp=sharing)

> Don't give these login details to students. This is purely for demonstration purposes.

Sign in to the CC AWS account and demo the hitparade bucket.

### PM - Practical Workshop

Send out the start code and brief to the students. Explain that they just have to follow the instructions in the markdown file.

The students will be able to sign in to CircleCI using their GitHub accounts but one member of each group will have to create an AWS account, which will require them to provide payment details. They won't be charged, but they may wish the delete the AWS bucket when they are done with the lab as they will begin to be charged for it after a year and they don't want to forget about it. Even if they do end up being charged, it will only cost a few pence, but best to make sure that the students are aware of this.
