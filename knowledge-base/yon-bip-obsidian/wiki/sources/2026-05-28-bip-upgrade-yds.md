---
tags: [YDS, 环境搭建, 脚手架, 前端工程, 后端工程, Maven, ynpm]
created: 2026-05-28
updated: 2026-05-28
sources: []
images: 28
image_paths: []
---

# 升级到YDS开发

> YonBIP 社区文档中心 — 从传统脚手架工程升级到 YDS 一站式开发的环境搭建指南。

## 适用场景

仅适用于私有云/专属云/本地部署。**公有云不适用**。

## 搭建准备

1. 确认开发环境信息（平台地址、账号密码、网络、hosts、Maven 私库配置）
2. 获取引擎信息（脚手架 Git 地址、数据库访问信息）
3. 脚手架下载到本地：`enginecode-be` + `enginecode-fe`

## 前端环境搭建

### 升级前（手动模式）

1. VS Code 打开 `xxxxx-fe` 前端工程
2. 修改 `xxxxx-fe/src/common/config.env.js` 配置后端地址
3. 全局安装 **ynpm 4.0.5**：`npm install -g ynpm@4.0.5`
4. `npm run debug` 启动 server + extend 两个服务

### 升级后（YDS 模式）

YDS 点击"启动前端脚手架"，自动下载依赖、启动工程、打开浏览器。

## 后端环境搭建

### 升级前（手动模式）

1. IDEA 打开 `enginecode-be` 工程
2. 配置 Maven 私库 settings.xml
3. 修改 `config-dev.properties`（config 目录下）
4. 修改 `application.properties`（bootstrap 模块 resources 下）
5. Maven Reload → compile → package
6. 启动类：`MDFApplication.java`
   - **VM 参数**：`-Denable_cloud_debug=true`
7. 健康检查：`http://local.yyuap.com:8080/extend/healthycheck` → 返回 `Connected` + `ok`

### 升级后（YDS 模式）

1. settings.xml 放 `C:\Users\<用户>\.m2\`
2. YDS 点击后端工程启动按钮（debug 启动 / 直接启动）
3. 健康检查：`http://localhost:62871/extend/healthycheck`

## 搭建验证

升级前：无痕浏览器打开数字化工作台 → 预览单据页面 → URL 黄色背景部分替换为 `http://local.yyuap.com:3003`

升级后：前端启动自动打开浏览器，后端已启动则直接访问页面。

## 常见问题

| 问题 | 解决 |
|------|------|
| 前端脚手架初始化卡住 | 检查 VPN 状态和网速，或使用离线包 |
| 离线包运行不起来 | 离线包 nodejs/ynpm 版本需与本地一致 |
| Maven 依赖拉取失败 | 检查 iNodeVPN + Maven 私库配置 + 私库里是否有对应 jar |
| 前端启动报组件加载失败 | 检查 nodejs 版本兼容性，用 nvm 切换版本 |
| FileNotFoundException，找不到 yms.jar | 工程目录不能有中文 |
| YDS 预览单据报错 | 先查健康检查接口，再查防火墙是否放通 62871 端口 |

## 关键端口

| 端口 | 用途 |
|------|------|
| 8080 | 升级前后端健康检查 |
| 62871 | 升级后后端健康检查 |
| 3003 | 前端本地调试 |

## 相关页面

- [[环境搭建]]
- [[专业开发]]
- [[旗舰版开发基础]]
