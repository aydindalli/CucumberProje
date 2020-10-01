@koalapalace
Feature: Koala Palace
  Background: Koala Palace Admin Giris
    Given kullanici koalapalace admin sayfasina gider
    And kullanici kullaniciadi ve sifresini girer
    Then kullanici giris islemini gerceklestirir
  @hotelcreate
  Scenario: TC12_kullanici bilgileri girerek hotel olusturur
    Given kullanici hotelcreate sayfasina gider
    And kullanici hotelcreate code bolumune "1234" girer
    And kullanici hotelcreate name bolumune "test" girer
    And kullanici hotelcreate adress bolumune "cikmaz sokak" girer
    And kullanici hotelcreate phone bolumune "0539123456" girer
    And kullanici hotelcreate email bolumune "hamza@tech.com" girer
    And kullanici hotelcreate idgroup bolumunde "Hotel Type1" secer
    And kullanici hotelcreate save butonuna tiklar
    Then kullanici hotelcreate kayit islemini assert eder
    Then kullanici driveri kapatir

  @hotelroomcreate
  Scenario: TC13_kullanici bilgileri girerek hotel room olusturur
    Given kullanici hotelroomcreate sayfasina gider
    And kullanici hotelroomcreate idgroup bolumune "Star" secer
    And kullanici hotelroomcreate code bolumune "98765" girer
    And kullanici hotelroomcreate name bolumune "dalliroom" girer
    And kullanici hoteroomcreate location bolumune "Amsterdam" girer
    And kullanici hotelroomcreate description bolumune "Aciklama Yok" girer
    And kullanici hotelroomcreate price bolumune fiyat girer
    And kullanici hotelroomcreate roomtype bolumunde "Single" secer
    And kullanici hotelroomcreate maxadult bolumune "2" girer
    And kullanici hotelroomcreate maxchilderen bolumune "3" girer
    And kullanici hotelroomcreate save butonuna tiklar
    Then kullanici hotelroomcreate kayit islemini assert eder

  @hotelreservationcreate
  Scenario: TC14_kullanici bilgileri girerek room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Dal nid" girer
    And kullanici roomreservation phone bolumune "05444454444" girer
    And kullanici roomreservation email bolumune "dala@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit islemini assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest1
  Scenario: TC15_kullanici IDUSER secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    #Bu adımı sildim : And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest2
  Scenario: TC16_kullanici idhotelroom secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    #Bu adımı sildim : And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest3
  Scenario: TC17_kullanici price secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    #Bu adımı sildim : And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest4
  Scenario: TC18_kullanici datestart secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    #Bu adımı sildim : And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest5
  Scenario: TC19_kullanici dateend secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    #Bu adımı sildim : And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest6
  Scenario: TC20_kullanici adultamaount secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    #Bu adımı sildim : And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest7
  Scenario: TC21_kullanici childrenamount secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    #Bu adımı sildim : And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest8
  Scenario: TC22_kullanici namesurname secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    #Bu adımı sildim : And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest9
  Scenario: TC23_kullanici phone secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    #Bu adımı sildim : And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest10
  Scenario: TC24_kullanici email secmeden room reservation olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/10/2020" girer
    And kullanici roomreservation dateend bolumune "10/17/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    #Bu adımı sildim : And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder

  @hotelreservationcreate
  @hotelreservationnegativetests
  @hotelreservationnegativetest11
  Scenario: TC25_kullanici datestarti dateendden sonra girerek olusturur
    Given kullanici hotelroomreservation sayfasina gider
    And kullanici roomreservation iduser bolumunde "manager2" secer
    And kullanici roomreservation idhotelroom bolumunde "Hilton" secer
    And kullanici roomreservation price bolumune "500" girer
    And kullanici roomreservation datestart bolumune "10/30/2020" girer
    And kullanici roomreservation dateend bolumune "10/5/2020" girer
    And kullanici roomreservation adultamaount bolumune "2" girer
    And kullanici roomreservation childrenamount bolumune "3" girer
    And kullanici roomreservation namesurname bolumune "Hamza Yılmaz" girer
    And kullanici roomreservation phone bolumune "0500600700" girer
    And kullanici roomreservation email bolumune "hamza@gmail.com" girer
    And kullanici roomreservation notes bolumune "Testerlardan selam.." girer
    And kullanici roomreservation save butonuna tiklar
    Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder




