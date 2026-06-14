@echo off
setlocal enabledelayedexpansion
title NCC YonBIP Dev Skill - Setup

:: Force UTF-8 codepage to avoid garbled text in non-Chinese environments
chcp 65001 >nul 2>&1

echo ============================================
echo   NCC YonBIP Dev Skill Toolkit - Setup
echo ============================================
echo.

:: === Parse arguments ===
set QUIET=0
set SKIP_NCC=0
:parse_args
if "%~1"=="" goto :end_parse
if /i "%~1"=="--quiet" set QUIET=1
if /i "%~1"=="-q" set QUIET=1
if /i "%~1"=="--skip-ncc" set SKIP_NCC=1
shift
goto :parse_args
:end_parse

:: Detect non-interactive mode (stdin is not a terminal)
set NON_INTERACTIVE=0
echo %PROMPT% 2>nul | findstr /r "." >nul 2>&1 || set NON_INTERACTIVE=1

:: ============================================================
:: Helper: install a skill with symlink, fallback to copy
:: ============================================================
goto :skip_helper
:install_skill
:: %1 = skill name, %2 = source dir (relative to script dir)
set "SKILL_NAME=%~1"
set "SKILL_SRC=%~dp0skills\%~2"
set "SKILL_DST=%SKILLS_DIR%\!SKILL_NAME!"

if exist "!SKILL_DST!" (
    echo   !SKILL_NAME!: already exists, skipped
    goto :eof
)

:: Try mklink /J first (fast, auto-sync with git pull)
mklink /J "!SKILL_DST!" "!SKILL_SRC!" >nul 2>&1
:: Verify the junction was actually created
if exist "!SKILL_DST!\SKILL.md" (
    echo   !SKILL_NAME!: installed ^(junction^)
    goto :eof
)

:: Also check without SKILL.md (some skills might not have it)
if exist "!SKILL_DST!" (
    echo   !SKILL_NAME!: installed ^(junction^)
    goto :eof
)

:: Fallback to xcopy
echo   !SKILL_NAME!: junction failed, copying...
xcopy "!SKILL_SRC!" "!SKILL_DST!" /E /I /Q >nul
if exist "!SKILL_DST!" (
    echo   !SKILL_NAME!: installed ^(copy^)
) else (
    echo   !SKILL_NAME!: [ERROR] installation failed
)
goto :eof
:skip_helper

:: === 1. Check prerequisites ===
echo [1/6] Checking environment...

where node >nul 2>nul
if %errorlevel% neq 0 (
    echo   [WARN] Node.js not found - baoyu-url-to-markdown will not work
    echo          Download from https://nodejs.org
) else (
    echo   Node.js: OK
)

where python >nul 2>nul
if %errorlevel% neq 0 (
    echo   [WARN] Python not found - source index builder will not work
) else (
    echo   Python: OK
)

echo   Claude Code: please verify it is installed

:: === 2. Install skills ===
echo.
echo [2/6] Installing skills...

set "SKILLS_DIR=%USERPROFILE%\.claude\skills"
if not exist "%SKILLS_DIR%" mkdir "%SKILLS_DIR%"

call :install_skill yon-ncc-dev yon-ncc-dev
call :install_skill yonyou-bip-dev yonyou-bip-dev
call :install_skill db-query db-query
call :install_skill baoyu-url-to-markdown baoyu-url-to-markdown
call :install_skill llm-wiki llm-wiki
:: === Auto-configure Claude Code permissions ===
echo.
echo [*] Configuring Claude Code permissions (no prompts for skill files)...

set "SETTINGS_FILE=%USERPROFILE%\.claude\settings.json"
set "SKILLS_DIR_FWD=%SKILLS_DIR:\=/%"

python -c "
import json, os
settings_file = os.environ['SETTINGS_FILE']
skills_dir = os.environ['SKILLS_DIR']

cfg = {}
if os.path.exists(settings_file):
    with open(settings_file, 'r', encoding='utf-8') as f:
        cfg = json.load(f)

# Add Read permission
cfg.setdefault('permissions', {})
cfg['permissions'].setdefault('allow', [])
if 'Read' not in cfg['permissions']['allow']:
    cfg['permissions']['allow'].append('Read')

# Add skills directory as trusted
cfg['permissions'].setdefault('additionalDirectories', [])
if skills_dir not in cfg['permissions']['additionalDirectories']:
    cfg['permissions']['additionalDirectories'].append(skills_dir)

with open(settings_file, 'w', encoding='utf-8') as f:
    json.dump(cfg, f, ensure_ascii=False, indent=2)
print('   Permissions configured: Read + skills directory trusted')
" 2>&1

if %errorlevel% equ 0 (
    echo   Done.
) else (
    echo   [WARN] Failed to auto-configure. Manually add to %SETTINGS_FILE%:
    echo     "permissions": { "allow": ["Read"], "additionalDirectories": ["%SKILLS_DIR%"] }
)

:: === 3. Configure llm-wiki knowledge base ===
echo.
echo [3/6] Configuring llm-wiki knowledge base...

set "LLM_WIKI_PATH_FILE=%USERPROFILE%\.llm-wiki-path"
set "KB_DIR=%~dp0knowledge-base\yon-bip-obsidian"
echo %KB_DIR%> "%LLM_WIKI_PATH_FILE%"
echo   Knowledge base path set to: %KB_DIR%

:: === 4. Install npm dependencies ===
echo.
echo [4/6] Installing npm dependencies...

set "NPM_DIR=%~dp0skills\baoyu-url-to-markdown\scripts"
if exist "%NPM_DIR%\package.json" (
    pushd "%NPM_DIR%"
    call npm install
    popd
    echo   npm: OK
) else (
    echo   [WARN] baoyu-url-to-markdown/scripts/package.json not found
    echo          The skill may not work. Run 'npm install' manually in that directory.
)

:: === 4. Configure NCHOME ===
echo.
echo [5/6] Configuring NCC dev environment...

if "%SKIP_NCC%"=="1" (
    echo   [SKIP] --skip-ncc flag set
    goto :done_ncc
)

if "%NON_INTERACTIVE%"=="1" (
    if "%QUIET%"=="0" (
        echo   [SKIP] Non-interactive mode detected. To configure later, run:
        echo         python skills\yon-ncc-dev\scripts\build_index.py ^<NCHOME_PATH^> ^<VERSION^>
    )
    goto :done_ncc
)

set /p NCC_VERSION="Enter NCC version (e.g. 2111, 2312), or press Enter to skip: "
if "%NCC_VERSION%"=="" (
    echo   [SKIP] No version entered. Run build_index.py later to configure.
    goto :done_ncc
)

set /p NCC_HOME="Enter full path to NCC %NCC_VERSION% home directory: "
if "!NCC_HOME!"=="" (
    echo   [SKIP] No path entered.
    goto :done_ncc
)

echo   Building source index (this may take several minutes)...
python "%~dp0skills\yon-ncc-dev\scripts\build_index.py" "!NCC_HOME!" "!NCC_VERSION!"
if !errorlevel! equ 0 (
    echo   Index built successfully
) else (
    echo   [WARN] Index build failed. Check the path and try again manually.
)

:done_ncc

:: === 5. Done ===
echo.
echo [6/6] Setup complete!
echo.
echo ============================================
echo   Skills installed to: %SKILLS_DIR%
echo   Knowledge base at:   %~dp0knowledge-base\yon-bip-obsidian
echo.
echo   Available skills:
echo     - yon-ncc-dev       (NCC development)
echo     - yonyou-bip-dev    (BIP development)
echo     - db-query          (database query tool)
echo     - baoyu-url-to-markdown
echo     - llm-wiki          (knowledge base)
echo.
echo   Next step - run health check:
echo     python %SKILLS_DIR%\db-query\scripts\check_config.py
echo.
echo   Usage:
echo     setup.bat --quiet     # skip all prompts
echo     setup.bat --skip-ncc  # skip NCC index building
echo ============================================

if "%NON_INTERACTIVE%"=="0" (
    if "%QUIET%"=="0" (
        pause
    )
)
