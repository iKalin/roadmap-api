# Roadmap backend #
[ ![Codeship Status for Ramotion/roadmap-api](https://codeship.com/projects/2ba911f0-4afc-0132-8280-0ac24b6883cd/status?branch=master)](https://codeship.com/projects/46560)

### Version 0.6.1 ###

* Removed formatting of timestamps
* Implemented simple mail sender

### Version 0.6.0 ###

* Code cleanup

### Version 0.5.12 ###

* Documentation updated
* Bugfixes

### Version 0.5.11 ###

* Implemented rename method for survey
* TODO: update documentation

### Version 0.5.10 ###

* Implemented close-delete-enable/disable methods for surveys
* Bugfixes in survey creation

### Version 0.5.9 ###

* Added survey creation API at `/survey` for testing
* TODO: rename-close-delete surveys

### Version 0.5.8 ###

* Added request for getting own profile `/profile`

### Version 0.5.7 ###

* Id in FeatureTextEntity changed to complex PK (language-featureId pair)
* Bugfixes

### Version 0.5.6 ###

* Doc's updated
* Some API improvements

### Version 0.5.5 ###

* Changed mappings in create/edit app requests

### Version 0.5.4 ###

* CORS requests fixed, example still on `/alogin` page

### Version 0.5.3 ###

* Issues with login and cors requests

### Version 0.5.2 ###

* Login logic changed to form-login with `/login` endpoint
* Ajax login example available on `/alogin` page

### Version 0.5.1 ###

* Deployment fixes
* Cors filter fixes

### Version 0.5.0 ###

* Many changes in model, added UUID's
* Added public API for registration
* Login page removed, auth changed to standard basic HTTP auth
* Added CORS support

### Version 0.4.3 ###

* Started work on API design

### Version 0.4.2 ###

* User credentials for login now stored in database

### Version 0.4.1 ###

* Added docs for Web API
* Versions log order inverted

### Version 0.4.0 ###

* Implemented simple chat on websocket
* Added Spring security support
* Three in-memory users for testing chat

### Version 0.3.2 ###

* Added more default exception handlers

### Version 0.3.1 ###

* Changed structure in get survey API

### Version 0.3.0 ###

* Many model changes
* Added mock data to database
* Couple of web APIs implemented without exception handling

### Version 0.2.5 ###

* Testing webapp runner 7.0.4 with embedded tomcat

### Version 0.2.4 ###

* Many changes in model
* Languages moved from model entity to enum with all ISO639-1 language codes
* Web API interface designed

### Version 0.2.3 ###

* Configured logging to file
* Refactored database connection settings

### Version 0.2.2 ###

* Fixes in heroku database connection settings
* Fixes in model entities

### Version 0.2.1 ###

* Some changes for heroku database

### Version 0.2.0 ###

* Added Liquibase(www.liquibase.org) tool for database version control and migration
* Added datasource configuration from environment variables for heroku

### Version 0.1.3 ###

* Experiments with STOMP over websocket
* Some minor changes in model entities

### Version 0.1.2 ###

* Implemented preview version of model
* Implemented listener update audit timestamps

### Version 0.1.1 ###

* Added database support with JPA
* Implemented couple entities of model

### Version 0.1.0 ###

* Hello world =)


