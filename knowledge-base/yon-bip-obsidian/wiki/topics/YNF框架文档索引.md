---
title: "YNF 框架官方文档索引"
source: https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html
date: 2026-06-07
tags: [YNF, 前端框架, 新一代, 索引, YonBIP]
platform_version: "BIP V5"
source_type: ynf-docs-index
---

# YNF 框架官方文档索引

> 来源：YonBIP YNF (Yonyou New-generation Front-end Framework) 官方文档站 | 共 **258 页** | 消化日期：2026-06-07
> 存放位置：`wiki/sources/ynf-*.md`

## 章节总览

| 章节 | 标识 | 页数 | 说明 |
|------|------|------|------|
| 介绍 | `ynf-introduce-*` | 15 | YNF 框架概述、设计原则、模型驱动、工具介绍 |
| 协议 | `ynf-spec-*` | 11 | 模板协议、DataSource、Store/Action/Reaction 规范 |
| 开发指南 | `ynf-guides-*` | 15 | CLI 工具、页面开发、资源中心、权限、多语言 |
| YNF API | `ynf-api-*` | 19 | PageStore、FilterStore、TableStore、各类 Store API |
| YNF 组件 | `ynf-components-*` | 198 | 完整组件库：表单、展示、容器、业务组件 |

> ⚠️ 已跳过"开发案例"章节

## 快速查找

### 入门必读

| 场景 | 文件 |
|------|------|
| 如何使用本手册 | `ynf-introduce-introduce-use-it.md` |
| 认识 YNF | `ynf-introduce-introduce-g012-introduce.md` |
| YNF 架构设计原则 | `ynf-introduce-introduce-g013-design-rules.md` |
| YNF 模型驱动详解 | `ynf-introduce-introduce-g015-driven-by-model.md` |
| YNF 开发者工具介绍 | `ynf-introduce-introduce-g014-devtool.md` |
| 创建第一张单据 | `ynf-introduce-introduce-g021-bill.md` |
| 应用发布 | `ynf-introduce-introduce-g022-publish.md` |
| 扩展开发 | `ynf-introduce-introduce-g023-extend.md` |

### 协议规范（开发必读 ⭐）

| 场景 | 文件 |
|------|------|
| 模板协议 | `ynf-spec-spec-g01-spec-billtemplate-spec.md` |
| DataSource 协议 | `ynf-spec-spec-g01-spec-datasource-spec.md` |
| Store 协议 | `ynf-spec-spec-g01-spec-store-spec.md` |
| Action 协议 | `ynf-spec-spec-g01-spec-action-spec.md` |
| Reaction 协议 | `ynf-spec-spec-g01-spec-reaction-spec.md` |

### 开发指南

| 场景 | 文件 |
|------|------|
| CLI 工具 | `ynf-guides-guides-g01-devtool.md` |
| 页面开发 | `ynf-guides-guides-g01-extend-page.md` |
| 如何创建 YNF 组件 | `ynf-guides-guides-g01-how-to-create-ynf-component.md` |
| 资源中心 | `ynf-guides-guides-g01-resource-center.md` |

### YNF API（开发最常用 ⭐⭐）

| API | 文件 |
|-----|------|
| PageStore | `ynf-api-api-g01-page-store-api.md` |
| FilterStore | `ynf-api-api-g01-filter-store-api.md` |
| TableStore | `ynf-api-api-g01-table-store-api.md` |
| PagingStore | `ynf-api-api-g01-paging-store-api.md` |

### YNF 组件（198 页）

全部组件存放于 `ynf-components-*`，涵盖：
- 通用布局/容器组件
- 表单输入组件（Input、Select、DatePicker、Refer...）
- 数据展示组件（Table、Tree、Card...）
- 反馈组件（Modal、Toast、Loading...）
- 业务组件（审批流、附件、打印...）

---

## 与 MDF 的关系

YNF（新一代前端框架）是 BIP 体系中的新一代前端技术栈：
- **MDF**：传统 viewModel 驱动，`cb.define` 注册
- **YNF**：新一代 MobX + hooks，`rootStore/stores/actions/reactions` 架构

两者在 BIP 中共存，YNF 是新项目的推荐选择。

> 更多 YNF 知识参见：`wiki/topics/页面脚本.md` 中的"前端脚本 — YNF 扩展开发"章节
