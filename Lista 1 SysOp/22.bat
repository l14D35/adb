@ECHO OFF
IF "%1"=="" (
ECHO Nie podano parametru
) ELSE (
net user %1
)