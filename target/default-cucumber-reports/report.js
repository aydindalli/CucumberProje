$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/koalapalace.feature");
formatter.feature({
  "name": "Koala Palace",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@koalapalace"
    }
  ]
});
formatter.background({
  "name": "Koala Palace Admin Giris",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici koalapalace admin sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_koalapalace_admin_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici kullaniciadi ve sifresini girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_kullaniciadi_ve_sifresini_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici giris islemini gerceklestirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_giris_islemini_gerceklestirir()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC25_kullanici datestarti dateendden sonra girerek olusturur",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@koalapalace"
    },
    {
      "name": "@hotelreservationcreate"
    },
    {
      "name": "@hotelreservationnegativetests"
    },
    {
      "name": "@hotelreservationnegativetest11"
    }
  ]
});
formatter.step({
  "name": "kullanici hotelroomreservation sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_hotelroomreservation_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation iduser bolumunde \"manager2\" secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_iduser_bolumunde_secer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation idhotelroom bolumunde \"Hilton\" secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_idhotelroom_bolumunde_secer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation price bolumune \"500\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_price_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation datestart bolumune \"10/30/2020\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_datestart_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation dateend bolumune \"10/5/2020\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_dateend_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation adultamaount bolumune \"2\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_adultamaount_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation childrenamount bolumune \"3\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_childrenamount_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation namesurname bolumune \"Hamza Yılmaz\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_namesurname_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation phone bolumune \"0500600700\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_phone_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation email bolumune \"hamza@gmail.com\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_email_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation notes bolumune \"Testerlardan selam..\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_notes_bolumune_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation save butonuna tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_save_butonuna_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//label[@class\u003d\u0027error\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-N8MJ6HR\u0027, ip: \u0027192.168.43.131\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:55148}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 1cdf87d8a9d1e15066ae99cfd1e68bee\n*** Element info: {Using\u003dxpath, value\u003d//label[@class\u003d\u0027error\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\r\n\tat stepdefinitions.KoalaPalaceStepDef.kullanici_roomreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder(KoalaPalaceStepDef.java:236)\r\n\tat ✽.kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder(file:///C:/Users/HP/IdeaProjects/CucumberProje/src/test/resources/features/koalapalace.feature:259)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});