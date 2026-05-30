---
tags: [YDS, IDE, 环境搭建, 脚手架, 调试, RDBGA, BIP5]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-bip-yds-setup, 2026-05-28-bip-upgrade-yds, 2026-05-28-bip-dev-system]
---

# YDS工具

> YonBuilder Developer Studio（YDS）是 BIP 专业开发的一站式 IDE，覆盖项目创建、开发调试、部署、制品生成和补丁制作全流程。

## 功能特性

| 功能 | 说明 |
|------|------|
| 云原生 + Standalone 双模式 | 同时支持简强环境和云原生环境 |
| 多工程支持 | 一个工作区支持前后端微服务 + 二三方包 |
| 一键部署/启动 YMS | 一键完成中间件部署和启动 |
| 一键调试 + 工作台 | 自动创建调试配置、打开工作台并植入 RDBGA |
| 安装盘/QP 补丁 | 基于项目生成安装盘和基线补丁 |
| 一起部署/联调的微服务 | 多服务同时部署、跨环境联调 |

## 环境要求

| 项目 | 要求 |
|------|------|
| YDS 安装 | All in One 安装包（含 JDK + Maven + Git） |
| BIP5 JDK | **JDK 21** |
| R6 JDK | **JDK 8**（需手动配置） |
| 最低版本 | BIP5 0315 / R6 0326 合集补丁 |
| Settings.xml | 找专属化环境运维负责人获取 |

## 关键术语

| 术语 | 定义 |
|------|------|
| YMS HOME | YMS 中间件工程结构，含 yms.jar 和数据库驱动 |
| RDBGA | Remote Debug Address — 根据上下文代理请求，云端流量转发到本地 |
| 工作区 | YDS 工程目录，多服务联调部署 |
| Standalone | 独立开发模式，不依赖云环境 |

## 引擎创建

1. YDS 打开空目录（**不可有中文**）
2. 登录技术中台（YonCTP）→ 选择环境
3. 登录业务中台 → 选择租户和环境
4. `Ctrl+Shift+P` → `YDS:Create YonBuilder Engine`
5. 输入引擎名称 + 引擎编码（符合开发规范）
6. 脚手架自动生成：`{引擎名}-be`、`{引擎名}-fe`、`ynf-{引擎名}`、`settings.xml`
7. YMS 自动配置，数据库自动建 schema

## 启动脚手架

### 后端

- YDS 点击功能按钮（debug 启动 / 直接启动）
- 首次勾选运行工程
- 启动完成信号：**`YMSAllModuleReady`**
- 健康检查：`http://localhost:62871/_yms/ready`
- VM 参数：`-Denable_cloud_debug=true`

### 前端

- YDS 点击"启动前端脚手架"
- 首次自动下载 node_modules（数分钟）
- 启动后自动打开内嵌浏览器 + 植入 RDBGA cookie

## 调试方式

| 方式 | 原理 | 配置 |
|------|------|------|
| **RDBGA** | 云端请求转发到本地后端 | 无需额外配置，YDS 自动注入 |
| **HOST** | 前端直连本地后端 | 修改 `config.env.js`，配置 `local.yyuap.com:62871` |

### HOST 方式 config.env.js

```js
const config = {
  DOMAIN_KEY: packageJson.domainKey || '',
  HTTP_SERVICE_BASEURL: 'http://local.yyuap.com:62871',
  HTTP_MAIN_ORIGIN: 'http://eco-dev.yyuap.com'
}
```

验证：预览页面 URL 前缀替换为 `http://local.yyuap.com:3003`

## 关键端口

| 端口 | 用途 |
|------|------|
| 62871 | 后端脚手架 / 健康检查 |
| 3003 | 前端本地调试 |

## Maven Settings 三处配置

| 配置项 | 用途 |
|--------|------|
| `maven.settingsFile` | 工程编译启动、制盘 |
| `java.configuration.maven.userSettings` | Java 插件解析依赖 |
| `java.configuration.maven.globalSettings` | 全局（可选，建议同上） |

## 常见问题

| 问题 | 解决 |
|------|------|
| 后端证书异常 | `YDS:Import Workbench Domain Certificate to JVM` |
| FileNotFoundException/yms.jar | **工程目录不能有中文** |
| Maven 依赖拉取失败 | 用脚手架预制的 settings.xml；检查 iNodeVPN |
| 预览单据报错 | 查健康检查 + 防火墙 62871 端口 |
| 多网卡流量不到本机 | 配置 `yds.serverBindAddress` |
| 浏览器无 override 栏 | 手动指定 `~/.yds/chrome/` 路径 |
| FSClient 创建桶失败 | SSH 被封 → 改用 local-file-storage |
| 引擎创建失败 | 检查是否登录、编码是否符合规范 |
| 前端脚手架卡住 | VPN/网络，或使用离线包 |

## 相关页面

- [[环境搭建]]
- [[专业开发]]
- [[旗舰版开发基础]]
- [[2026-05-28-bip-yds-setup]]
- [[2026-05-28-bip-upgrade-yds]]
- [[2026-05-28-bip-dev-system]]
