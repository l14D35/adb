@echo off
if "%1" == "" (goto wiadomosc)
if not exist %1 (goto wiadomosc2)
FOR /F "tokens=2,3 delims=, " %%i in (%1) do @NET USER "%%i" %%j /add >nul
goto koniec
:wiadomosc
echo Nie podano nazwy pliku jako parametru
goto koniec
:wiadomosc2
echo Dany plik w podanej lokalizacji nie istnieje
goto koniec
:koniec
pause