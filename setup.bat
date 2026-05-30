@echo off
setlocal enabledelayedexpansion
title NCC YonBIP Dev Skill - Setup

echo ============================================
echo   NCC YonBIP Dev Skill Toolkit - 安装程序
echo ============================================
echo.

:: === 1. 检测前提条件 ===
echo [1/5] 检测环境...

where node >nul 2>nul
if %errorlevel% neq 0 (
    echo [警告] 未找到 Node.js，baoyu-url-to-markdown 技能将无法使用
    echo        请从 https://nodejs.org 下载安装
) else (
    echo   Node.js: 已安装
)

where python >nul 2>nul
if %errorlevel% neq 0 (
    echo [警告] 未找到 Python，源码索引功能将无法使用
) else (
    echo   Python: 已安装
)

echo   Claude Code: 请确认已安装

:: === 2. 安装技能 ===
echo.
echo [2/5] 安装技能到 Claude Code...

set SKILLS_DIR=%USERPROFILE%\.claude\skills
if not exist "%SKILLS_DIR%" mkdir "%SKILLS_DIR%"

:: yon-ncc-dev
if exist "%SKILLS_DIR%\yon-ncc-dev" (
    echo   yon-ncc-dev: 已存在，跳过
) else (
    mklink /J "%SKILLS_DIR%\yon-ncc-dev" "%~dp0skills\yon-ncc-dev" >nul 2>&1
    if %errorlevel% equ 0 (
        echo   yon-ncc-dev: 安装成功
    ) else (
        echo   yon-ncc-dev: 链接失败，尝试复制...
        xcopy "%~dp0skills\yon-ncc-dev" "%SKILLS_DIR%\yon-ncc-dev" /E /I /Q
    )
)

:: yonyou-bip-dev
if exist "%SKILLS_DIR%\yonyou-bip-dev" (
    echo   yonyou-bip-dev: 已存在，跳过
) else (
    mklink /J "%SKILLS_DIR%\yonyou-bip-dev" "%~dp0skills\yonyou-bip-dev" >nul 2>&1
    if %errorlevel% equ 0 (
        echo   yonyou-bip-dev: 安装成功
    ) else (
        xcopy "%~dp0skills\yonyou-bip-dev" "%SKILLS_DIR%\yonyou-bip-dev" /E /I /Q
    )
)

:: baoyu-url-to-markdown
if exist "%SKILLS_DIR%\baoyu-url-to-markdown" (
    echo   baoyu-url-to-markdown: 已存在，跳过
) else (
    mklink /J "%SKILLS_DIR%\baoyu-url-to-markdown" "%~dp0skills\baoyu-url-to-markdown" >nul 2>&1
    if %errorlevel% equ 0 (
        echo   baoyu-url-to-markdown: 安装成功
    ) else (
        xcopy "%~dp0skills\baoyu-url-to-markdown" "%SKILLS_DIR%\baoyu-url-to-markdown" /E /I /Q
    )
)

:: llm-wiki
if exist "%SKILLS_DIR%\llm-wiki" (
    echo   llm-wiki: 已存在，跳过
) else (
    mklink /J "%SKILLS_DIR%\llm-wiki" "%~dp0skills\llm-wiki" >nul 2>&1
    if %errorlevel% equ 0 (
        echo   llm-wiki: 安装成功
    ) else (
        xcopy "%~dp0skills\llm-wiki" "%SKILLS_DIR%\llm-wiki" /E /I /Q
    )
)

:: === 3. 安装 npm 依赖 ===
echo.
echo [3/5] 安装 baoyu-url-to-markdown 依赖...
cd /d "%~dp0skills\baoyu-url-to-markdown\scripts"
if exist "package.json" (
    call npm install
    echo   npm 依赖安装完成
) else (
    echo   [跳过] 未找到 package.json
)
cd /d "%~dp0"

:: === 4. 配置 NCHOME ===
echo.
echo [4/5] 配置 NCC 开发环境...
set /p NCC_VERSION="请输入 NCC 版本号 (如 2111, 2312，直接回车跳过): "
if not "%NCC_VERSION%"=="" (
    set /p NCC_HOME="请输入 NCC %NCC_VERSION% 的 home 全路径: "
    if not "!NCC_HOME!"=="" (
        echo 正在构建源码索引（可能需要几分钟）...
        python "%~dp0skills\yon-ncc-dev\scripts\build_index.py" "!NCC_HOME!" "!NCC_VERSION!"
    )
)

:: === 5. 完成 ===
echo.
echo [5/5] 安装完成！
echo.
echo ============================================
echo   技能已安装到: %SKILLS_DIR%
echo   知识库存放于: %~dp0knowledge-base\yon-bip-obsidian
echo.
echo   现在可以在 Claude Code 中使用以下技能：
echo     - yon-ncc-dev    (NCC 开发)
echo     - yonyou-bip-dev (BIP 开发)
echo     - llm-wiki       (知识库)
echo ============================================
pause
