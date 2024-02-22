# Compose Sample MVI

## Technical stack

* arch:
  - app: clean architecture with **features x layer modularization**
  - ui: simplified **MVI**
* build: **kts** gradle build scripts + gradle **convention plugins** to simplify + **version catalog**
* dep injection: **hilt** + **auto-dagger**
* ui: **compose** + **material3** + navigation
* async: **coroutines** & **flow**
* db: **room**
* rest: **retrofit**
* annotation processing: **ksp** only, no kapt

## App structure

Modules hierarchy:

* **app**
* **core**
  * feature
    * nav
    * ui
  * ui
    * theme
* **features**
  * library
    * data
    * domain
    * nav
    * ui
  * spotlight
    * ui
* **gradle-plugins**

Feature module plugins:

* app.feature.data
* app.feature.domain
* app.feature.nav
* app.feature.ui
