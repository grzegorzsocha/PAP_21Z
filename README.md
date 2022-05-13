# Program do obsługi przychodni - **_Medcomplexsoft_** - pap21z Z19

## Autorzy projektu:
* Grzegorz Socha
* Jakub Smela
* Hubert Truszewski

## Opis instalacji
```
git clone https://gitlab-stud.elka.pw.edu.pl/htruszew/pap21z-z19.git
cd pap21z-z19/medcomplexsoft
mvn clean package assembly:single
```
## Uruchomienie
```
java -jar target/medcomplexsoft.jar
```

## Baza danych
Parametry połączenia z bazą danych przechowywane są w pliku `medcomplexsoft/src/main/resources/META-INF/persistence.xml`.
Aby je zmodyfikować należy zedytować odpowienie wpisy w ww. pliku, a następnie ponownie skompilować program.