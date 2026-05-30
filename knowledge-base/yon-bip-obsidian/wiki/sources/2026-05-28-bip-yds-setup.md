---
tags: [YDS, 环境搭建, 脚手架, 引擎创建, RDBGA, 调试, BIP5]
created: 2026-05-28
updated: 2026-05-28
sources: []
images: 58
image_paths: []
---

# 基于YDS开发准备及环境搭建

> YonBIP 社区文档中心 — YDS 一站式开发环境的完整搭建指南（BIP5）。

## 适用场景

仅适用**本地部署**（公有云/私有云/专属云不适用此流程）。开发成果可部署到所有环境。

## YDS 功能特性

| 功能 | 说明 |
|------|------|
| 云原生 + Standalone | 同时支持简强环境和云原生环境开发 |
| 多工程支持 | 一个工作区支持前后端微服务/二三方包同时开发调试 |
| 本地仓库 + ypr 仓库 | 本地文件夹作为仓库，或引用线上 ypr 仓库 |
| YMS Cloud 微服务视图 | 树型展示指定环境中运行的微服务 |
| YMS Cloud 流水线视图 | 树型展示流水线及构建记录 |
| 一起部署/联调的微服务 | 多服务同时部署/联调 |
| 一键部署 YMS 中间件 | 一键完成 yms 中间件部署 |
| 一键启动调试 | 自动创建调试配置并启动 |
| 一键打开工作台 | 打开工作台并植入调试配置 |
| 安装盘/QP 补丁制作 | 基于项目生成安装盘和补丁 |

## 关键术语

| 术语 | 定义 |
|------|------|
| YDS | YonBuilder Developer Studio，全生命周期研发 IDE |
| YMS HOME | YMS 中间件工程结构，含 yms 中间件和数据库驱动 |
| RDBGA | Remote Debug Address，根据上下文代理请求，实现云上云下联调 |
| 工作区 | YDS 工程目录，用于多服务联调部署 |

## 环境要求

- **最低版本**：BIP5 0315 或 R6 0326 合集补丁
- **JDK**：BIP5 需 JDK **21**（All in One 安装包含 JDK + Maven + Git）
- **安装**：从 YDS 下载中心获取 All in One 安装包
- **Settings.xml**：找专属化环境运维负责人获取

## 引擎创建流程

1. YDS 打开空目录（**不可有中文**）
2. 登录技术中台（YonCTP）→ 选择系统环境
3. 登录业务中台 → 选择租户和环境
4. `Ctrl+Shift+P` → `YDS:Create YonBuilder Engine` → 输入引擎名和编码
5. 脚手架生成：`{引擎名}-be`、`{引擎名}-fe`、`ynf-{引擎名}`、`settings.xml`
6. YMS 信息自动配置，数据库自动建 schema

## 启动流程

### 后端
- YDS 点击功能按钮（debug / 直接启动）
- 首次需勾选运行工程
- 启动成功标志：控制台显示 **`YMSAllModuleReady`**
- 健康检查：`http://localhost:62871/_yms/ready`

### 前端
- YDS 点击"启动前端脚手架"
- 首次自动下载 node_modules（需几分钟）
- 启动后自动打开内嵌浏览器，植入 RDBGA cookie

## 两种调试方式

| 方式 | 原理 | 适用场景 |
|------|------|----------|
| RDBGA | 云端请求通过 RDBGA 技术转发到本地后端 | 云端到本地网络通畅 |
| HOST | 前端直接请求本地 local.yyuap.com:62871 | 云端到本地不通，需配置 hosts |

### HOST 方式 config.env.js 配置

```js
const config = {
  DOMAIN_KEY: packageJson.domainKey || '',
  HTTP_SERVICE_BASEURL: 'http://local.yyuap.com:62871',
  HTTP_MAIN_ORIGIN: 'http://eco-dev.yyuap.com'
}
```

验证：预览页面 URL 前缀替换为 `http://local.yyuap.com:3003`

## 常见问题

| 问题 | 解决 |
|------|------|
| 后端启动证书异常 | `YDS:Import Workbench Domain Certificate to JVM` |
| 预览单据报错 | 健康检查接口 + 防火墙 62871 端口 |
| FileNotFoundException/yms.jar | **工程目录不能有中文** |
| 公有云引擎编码申请 | 管理租户申请微服务编码 + 应用编码 |
| Maven 依赖下载失败 | 用脚手架预制的 settings.xml；三处配置需指向同一文件 |
| 多网卡 | 配置 `yds.serverBindAddress` 绑定正确 IP |
| 浏览器无 override 栏 | 手动指定 `~/.yds/chrome/` 路径 |
| FSClient 创建桶失败 | SSH 协议被封 → 改用 local-file-storage（配置文件详见文档） |
| 引擎创建失败 | 检查是否登录工作台和技术中台、编码是否符合规范 |

### Maven Settings 三个配置项

| 配置 | 用途 |
|------|------|
| `maven.settingsFile` | 工程编译启动、制盘 |
| `java.configuration.maven.userSettings` | Java 插件解析依赖 |
| `java.configuration.maven.globalSettings` | 全局配置（可选） |

## 相关页面

- [[环境搭建]]
- [[专业开发]]
- [[旗舰版开发基础]]
- [[2026-05-28-bip-upgrade-yds]]
