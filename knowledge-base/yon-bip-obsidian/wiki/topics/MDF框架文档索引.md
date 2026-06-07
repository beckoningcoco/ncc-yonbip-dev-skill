---
title: "MDF 框架官方文档索引"
source: https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html
date: 2026-06-07
tags: [MDF, 前端框架, 索引, YonBIP]
platform_version: "BIP V5"
source_type: mdf-docs-index
---

# MDF 框架官方文档索引

> 来源：YonBIP MDF 框架官方文档站 | 共 **507 页** | 消化日期：2026-06-07
> 存放位置：`wiki/sources/mdf-*.md`

## 章节总览

| 章节 | 标识 | 页数 | 说明 |
|------|------|------|------|
| 介绍 | `mdf-introduce-*` | 37 | 框架概述、脚手架、调试方法、升级方案、FAQ |
| 协议 | `mdf-spec-*` | 36 | 编码规范、视图模型协议、元数据管理、集成方案 |
| 指南 | `mdf-guides-*` | 168 | 扩展开发、参照、表格、审批流、附件、多语言、打印... |
| API | `mdf-api-*` | 45 | ViewModel、BaseModel、GridModel、工具函数、页面路由... |
| Web组件 | `mdf-web-*` | 131 | 表单控件、按钮、表格、查询区、容器组件、图表... |
| 移动组件 | `mdf-mobile-*` | 60 | 移动端表单控件、按钮、容器、分析组件... |
| MDF服务 | `mdf-node-*` | 30 | Node BFF 层配置、资源管理、CI/CD、API... |

## 快速查找

### 开发最常用（⭐ 优先查阅）

| 场景 | 文件 |
|------|------|
| MDF 框架入口/概览 | `mdf-introduce-01-preview.md` |
| 脚手架使用 | `mdf-introduce-01-mdf-cli-introduce.md` |
| 前端调试方法 | `mdf-introduce-02-mdf-framework-debug.md` |
| 领域扩展机制 | `mdf-guides-03-kuozhanjizhijieshao.md` |
| 单据逻辑扩展 | `mdf-guides-02-danjuluojikuozhan.md` |
| ViewModel 容器模型 | `mdf-api-03-view-model.md` |
| BaseModel 基础模型 | `mdf-api-02-base-model.md` |
| GridModel 表格模型 | `mdf-api-02-grid-model.md` |
| ReferModel 参照模型 | `mdf-api-02-refer-model.md` |
| 常用工具 Utils | `mdf-api-05-utils.md` |
| 页面管理 Page | `mdf-api-05-page.md` |
| 弹窗 Modal | `mdf-api-05-modal.md` |
| 网络请求 Proxy | `mdf-api-05-proxy.md` |
| Table 表格组件 | `mdf-web-04-table.md` |
| ConvenientQuery 查询区 | `mdf-web-05-convenientquery.md` |
| Refer 参照组件 | `mdf-web-01-refer.md` |
| 领域样式扩展 | `mdf-guides-03-lingyuyangshikuozhan.md` |
| 常见问题整理 | `mdf-guides-26-changjianwentizhengli.md` |
| 参照常用扩展 | `mdf-guides-05-canzhaochangyongkuozhanshuli.md` |

### 内容较丰富的页面（推荐阅读）

这些页面内容超过 5000 字符，知识点较为详细：

- `mdf-introduce-01-mdf-cli-introduce.md` — 脚手架介绍 (19K)
- `mdf-introduce-02-domain-fe-debug-description.md` — 领域前端调试 (14K)
- `mdf-introduce-02-mdf-framework-rule.md` — 框架能力规则 (13K)
- `mdf-guides-05-canzhaochangyongkuozhanshuli.md` — 参照常用扩展 (17K)
- `mdf-guides-05-canzhaoshejishuoming.md` — 参照设计说明 (11K)
- `mdf-guides-26-changjianwentizhengli.md` — 常见问题整理
- `mdf-web-04-table.md` — 表格组件 (10K)
- `mdf-web-04-treetable.md` — 树表格 (10K)
- `mdf-api-05-utils.md` — 常用工具 (8K)
- `mdf-mobile-06-liebiaoyemianpeizhi-mobile.md` — 移动端列表页 (27K)

---

## 章节详细列表

### 一、介绍 (37 页)

```
mdf-introduce-01-preview              MDF框架概览（文档入口）
mdf-introduce-01-mdf-framework-introduce  MDF框架介绍
mdf-introduce-01-mdf-cli-introduce    前端脚手架介绍 ☆
mdf-introduce-02-mdf-framework-debug  前端框架调试方法 ①
mdf-introduce-02-domain-fe-debug-description  领域前端调试方法 ②
mdf-introduce-02-primises-and-node-debug      专属化与Node调试 ③
mdf-introduce-02-jave-debug-description       后端框架调试方法
mdf-introduce-02-chrome-debug-plugin   MDF谷歌调试插件
mdf-introduce-02-mdf-preformance-description  性能问题排查指南
mdf-introduce-02-mdf-memory-optimize   MDF内存泄漏优化记录
mdf-introduce-02-mdf-performance-optimize     MDF性能优化记录
mdf-introduce-02-mdf-framework-use-description  MDF框架实施手册
mdf-introduce-02-mdf-framework-rule    框架能力相关规则
mdf-introduce-02-mdf-to-bug-description     MDF问题流转声明
mdf-introduce-03-upgrade-react18       React18适配方案
mdf-introduce-03-stylertl              RTL适配方案
mdf-introduce-03-qianduangongchenghebingfangan  前端工程合并方案
mdf-introduce-03-mdf-cli30-upgrade     MDF 3.0脚手架升级指南
mdf-introduce-03-mdf-cli41-upgrade     MDF 4.1脚手架升级指南
mdf-introduce-03-tinper-next-primises-upgrade   TinperNext专属化升级方案
mdf-introduce-03-tinper-next-remove-vendor      TinperNext去除vendor方案
mdf-introduce-03-tns-primises-upgrade  TNS专属化升级方案
mdf-introduce-03-mdf-context-upgrade-description  MDF上下文改造注意事项
mdf-introduce-03-yon-builder-mobile-upgrade     YonBuilder移动端升级方案
mdf-introduce-03-mdf-impl-request-introduce     MDF前端接口调用规范化
mdf-introduce-03-transfer-params       嵌套和上下游单据补参方案
mdf-introduce-03-mobile-performance-optimize    移动端性能优化影响范围
mdf-introduce-04-mdf-media-share2022   MDF前端技术分享2022
mdf-introduce-04-mdf-media-week2022    MDF功能返讲系列2022
mdf-introduce-04-mdf-media-line2022    MDF一线实施专题分享2022
mdf-introduce-04-mdf-media-new2022     MDF应届生培训2022
mdf-introduce-05-read-mdf-and-mdd      读懂MDF和MDD
mdf-introduce-05-mdf-event-intoduce    前端框架事件机制
mdf-introduce-05-mdf-pako-and-crypto   加密解密插件@mdf/crypto
mdf-introduce-05-mdf-safe-web          加强Web安全防护设计
mdf-introduce-05-excel-dbui-template   Excel、DB、UI模板关系
mdf-introduce-05-union-field-id        统一fieldId方案
```

### 二、API (45 页) — 核心开发参考

```
mdf-api-01-mvvm                         MVVM架构
mdf-api-01-view-model                   视图模型生命周期
mdf-api-01-page-connect                 多页面通讯
mdf-api-02-base-model                   基础模型 BaseModel
mdf-api-02-simple-model                 模板 Model SimpleModel
mdf-api-02-grid-model                   表格模型 GridModel
mdf-api-02-tree-model                   树模型 TreeModel
mdf-api-02-list-model                   枚举模型 ListModel
mdf-api-02-filter-model                 过滤模型 FilterModel
mdf-api-02-refer-model                  参照模型 ReferModel
mdf-api-02-tag-model                    标签模型 TagModel
mdf-api-03-container-model              容器模型 ContainerModel
mdf-api-03-view-model                   视图模型 ViewModel
mdf-api-03-filter-view-model            查询模型 FilterViewModel
mdf-api-03-refer-view-model             参照模型 ReferViewModel
mdf-api-04-common                       通用 Common
mdf-api-04-voucher-list                 列表 VoucherList
mdf-api-04-voucher-list-mobile          移动列表 VoucherList Mobile
mdf-api-04-voucher                      卡片 Voucher
mdf-api-04-voucher-mobile               移动卡片 Voucher Mobile
mdf-api-04-edit-voucher-list            编辑列表 EditVoucherList
mdf-api-04-freeview                     自由视图 Freeview
mdf-api-04-option                       下拉选项 Option
mdf-api-05-page                         页面管理 Page
mdf-api-05-modal                        弹窗 Modal
mdf-api-05-toast-confirm                提示 Toast Confirm
mdf-api-05-proxy                        网络请求 Proxy
mdf-api-05-transfer                     数据转换 Transfer
mdf-api-05-context                      上下文 Context
mdf-api-05-env                          环境信息 Env
mdf-api-05-config                       配置信息 Config
mdf-api-05-engine                       引擎 Engine
mdf-api-05-extend                       扩展注册 Extend
mdf-api-05-utils                        常用工具 Utils
mdf-api-05-loading                      加载中 Loading
mdf-api-05-index-db                     存储 IndexDB
mdf-api-05-promise                      异步处理 Promise
mdf-api-05-event                        事件总线 Event
mdf-api-05-format                       格式化 Format
mdf-api-05-cache                        全局缓存 Cache
mdf-api-05-shortcut                     快捷键 Shortcut
mdf-api-05-require                      模块化 Require
mdf-api-05-loader                       资源加载 Loader
mdf-api-05-three-package                三方包引用
mdf-api-05-other                        其他API
```

---

> **完整列表**：所有 507 页文档均以 `mdf-` 前缀存放在 `wiki/sources/` 目录下。
> 按文件名搜索即可定位：`mdf-api-*` = API文档、`mdf-web-*` = Web组件、`mdf-guides-*` = 开发指南 等。
