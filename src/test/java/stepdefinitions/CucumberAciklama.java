package stepdefinitions;

public class CucumberAciklama {

    /*

Test raporlari TESTNG ve CUCUMBER da ayri ayridir.
Paralel testte tespit edilen hata ayri ayri tekrar yapılır ve sonuç hata ayri ayri gösterilerek raporlastirilir.
Paralel test, test etmede zaman acisindan ekonomiktir.

JUnit     -> Before, After, BeforeClass, AfterClass, Test, Ignore
TestNG    -> BeforeSuite, BeforeTest, BeforeGroup, BeforeClass, Befor..
Cucumber  -> Benzer annotationslar..
			 En önemli farkı TestNG'den, testlerinizn senaryosunu, feature file adlı dosyada yazıyorsunuz ve
			 oradan methodlar oluşturup çalıştırabiliyorsunuz.
-------------------------------KÜTÜPHANELER--------------------------------
JUnit     : selenium-java , webdrivermanager , junit
TestNG    : selenium-java , webdrivermanager , testng
Cucumber  : selenium-java , webdrivermanager , cucumber
											   (cucumber-java cucumber-junit)
----------------------------------PAKETLER---------------------------------
TestNG    : pages, utilities, tests			  , smoketests
Cucumber  : pages, utilities, stepdefinitions , runners
.properties dosyası CUCUMBER'da olacak mı ? : EVET
-----------------------------------RAPOR-----------------------------------
TestNG'de rapor oluşturmak için farklı bir kütüphane yüklüyorduk, Cucumber için hangi kütüphaneyi eklememiz gerekiyor ?(ya da gerekiyor mu)
***** Cucumber kendi raporunu kendisi hazırlıyor.
------------------------------EN ÖNEMLİ DOSYA------------------------------
Cucumber'da TestNG'den farklı olarak, test senaryolarımızı (test case) yazdığımız ".feature" dosyası vardır. Bu dosyanın içerisine, test case'imizi (test senaryosu) adım adım senaryo şeklinde yazarız. Ve daha sonra bu dosyasının içerisindeki her bir adım için 1 tane METHOD oluştururuz. Bu oluşturduğumuz methodları "stepdefinitions" paketinin içerisindeki class'larda yaparız. Ve testimizi "runners" paketinin içerisindeki class'lar yardımıyla çalıştırırız.
---> stepdefinitions 	(paket)  : senaryodaki adımların "method"larının bulunduğu paket.
---> runners			(paket)  : senaryolarımızı(yani testcase) çalıştırdığımız class'ların bulunduğu paket
---> .feature 			(dosya)  : senaryolarımızı yazdığımız dosya.
--------------------------FEATURE FILE OLUSTURMA--------------------------
Feature: Google Arama
Scenario: TC01_kullanici googleda arama yapar
Given, When, And, But, Then
Given   ile baslayin
And
And
And
Then    ile bitirin.
----------------------------Cucumber Test ADIMLARI-------------------------
1. .feature file oluştururuz.
	Senaryomuzu yazarız.
2. dryRun = true şeklinde çalıştırıp, eksik olan methodları kopyalarız.
	stepdefinitions paketinin içerisinde oluşturacağımız Class'ın içerisine, kopyaladığımız methodları yapıştırırız.
3. dryRun = false yaparak, testimizi çalıştırırız.


     */
}
