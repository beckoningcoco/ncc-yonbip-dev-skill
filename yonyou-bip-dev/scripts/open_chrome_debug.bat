@echo off
taskkill /F /IM chrome.exe >nul 2>&1
timeout /t 2 /nobreak >nul
rmdir /s /q "C:\Users\99558\chrome_debug" >nul 2>&1
start "" "C:\Program Files\Google\Chrome\Application\chrome.exe" --remote-debugging-port=9222 --remote-allow-origins=* --user-data-dir=C:\Users\99558\chrome_debug --no-first-run --no-default-browser-check
echo Chrome debug port 9222 ready.
pause
