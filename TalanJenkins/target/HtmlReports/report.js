$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TalanJenkins.feature");
formatter.feature({
  "name": "Connexion on TA",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "name": "user enter his email\u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his password\u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user is on dashbord page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "ines.masmoudi@talan.com",
        "DmbDBgDbHT95"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.Tests_connect.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.Tests_connect.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter his emailines.masmoudi@talan.com",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_connect.user_enter_his_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his passwordDmbDBgDbHT95",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_connect.user_enters_his_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashbord page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.Tests_connect.user_is_on_dashbord_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Update.feature");
formatter.feature({
  "name": "update user data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user is able to modify his profils data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on his dashbord",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on his profil",
  "keyword": "When "
});
formatter.step({
  "name": "user delet his old data",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his new data \u003cname\u003e  and \u003cfamilyname\u003e and \u003cbirthday\u003e and \u003cphonenumber\u003e and \u003ctown\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on submit",
  "keyword": "And "
});
formatter.step({
  "name": "user get confirmation of his data modification",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "familyname",
        "birthday",
        "phonenumber",
        "town"
      ]
    },
    {
      "cells": [
        "inessss",
        "masssmoudi",
        "07081991",
        "21240226",
        "Sfax"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to modify his profils data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on his dashbord",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.Tests_update.user_is_on_his_dashbord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on his profil",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.Tests_update.user_clicks_on_his_profil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user delet his old data",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_update.user_delet_his_old_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his new data inessss  and masssmoudi and 07081991 and 21240226 and Sfax",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_update.user_enters_his_new_data_name_and_familyname_and_birthday_and_mobilenumber_and_town(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_update.user_clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get confirmation of his data modification",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.Tests_update.user_get_confirmation_of_his_data_modification()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/VerifyCourses.feature");
formatter.feature({
  "name": "Checking courses",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user is able to check his old sessions courses ressources",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "old session link is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.old_session_link_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on his old sessions link",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.user_clicks_on_his_old_sessions_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on view the course",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.user_clicks_on_view_the_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on a module number",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.user_clicks_on_a_module_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on a course number",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.user_clicks_on_a_course_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on resources",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.user_clicks_on_resources()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get lessons title displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.Tests_VerifyCourses.user_get_lessons_title_displayed()"
});
formatter.result({
  "status": "passed"
});
});