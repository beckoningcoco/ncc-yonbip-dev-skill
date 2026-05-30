---
title: 本地前端开发环境搭建（YNF）
date: 2026-05-28
source_url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/XGNBDQDYNF1
version: BIP5
tags: [YNF, 脚手架, ynf-dx-cli, rootStore, Resource Override, 本地调试]
images: 11
image_paths: []
---

# 本地前端开发环境搭建（YNF）

> 使用 ynf-dx-cli 命令行工具构建 YNF 前端脚手架，搭建本地开发环境。仅适用私有云/专属云。

## 工具安装

```bash
# 1. 全局安装 ynpm 工具
npm install ynpm-tool -g

# 2. 全局安装 ynf-dx-cli
ynpm install ynf-dx-cli -g

# 3. 验证
ynf -v
```

## 资源编码 libCode

格式：`ynf-${domainKey}`，示例：`ynf-c-cpu-fn-kflx`

libCode 贯穿开发、流水线部署、资源中心发布、CDN 访问全过程。

## 初始化脚手架

```bash
ynf init [libType] [libCode]
```

| libType | 说明 |
|---------|------|
| `app` | 应用二方包脚手架 |
| `lib` | 组件二方包脚手架 |
| `sdk` | SDK 二方包脚手架 |

初始化后进入项目根目录安装依赖：`ynpm install`

## 添加扩展页面

```bash
ynf add
```

选择"页面扩展" → 扩展脚本存放在 `src/pages/<libName>/stores/ext/` 目录。

## YNF 核心概念

| 概念 | 说明 | MDF 对应 |
|------|------|----------|
| **rootStore** | 页面根状态，管理所有数据和动作 | viewModel |
| **store** | 各种模型：formStore、tableStore、filterStore、pageStore、cardStore | GridModel/SimpleModel |
| **action** | 页面事件（增删改查/工作流/导航），通过 `rootStore.actions.xxx.doAction` 调用 | viewModel.execute |
| **reaction** | 副作用，监听 store 可观测属性变化后自动响应（cardReaction/ListReaction/TreeCardReaction） | modeChange/afterValueChange |

## 本地调试

### Resource Override 代理配置

YNF 需**手动安装** Resource Override 插件（非 YDS 内置），代理规则：

| 方向 | 地址 |
|------|------|
| 线上资源 | `https://${YMS_HOST}/${libCode}/ucf-wh/**` |
| 本地资源 | `https://localhost:9090/**` |

### 启动

```bash
npm run start
```

修改代码保存后刷新浏览器即可看到效果。

## 工程部署

目前 YNF 部署尚不成熟，一般通过**手动上传至 Nginx**。自动化部署可参考"统一前端引擎(Nginx)接入指南"。

## 常见问题

| 问题 | 解决 |
|------|------|
| ynpm 安装 ynf-dx-cli 报错（pnpm 相关） | `ynpm set usein=npm` 切换内核为 npm |
| ynf 命令初始化报错 | `npm install -g typescript` |

## 与 MDF 环境对比

| 维度 | MDF | YNF |
|------|-----|-----|
| 脚手架工具 | YDS/VSCode 启动 | `ynf-dx-cli` 命令行 |
| 包管理 | ynpm/npm | **ynpm**（可选 npm） |
| 本地端口 | 3003 | **9090** |
| Resource Override | YDS 内置自动配置 | **手动安装+手动配置代理规则** |
| 架构 | viewModel + 模型 | **rootStore + stores + actions + reactions** |
| 部署 | Git + 流水线 | 手动 Nginx 上传 |

## 相关页面

- [[专业开发]]
- [[环境搭建]]
- [[YDS工具]]
- [[2026-05-28-bip-ynf-app-dev]]
