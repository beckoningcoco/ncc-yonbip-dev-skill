---
title: "YonBuilder 应用构建"
type: reference
source: "iuap-YonBuilder应用构建红皮书 (116页)"
tags: ["BIP", "旗舰版", "YonBuilder", "低代码", "页面建模"]
created: 2026-06-01
---

# YonBuilder 应用构建

## 三阶段

1. **数据建模**：实体/查询(QuerySchema)/枚举
2. **页面建模**：8种单据模板(卡片/列表/卡片+列表/左树右卡/左树右表/Wizard/报表/仪表板) + 4种参照模板
3. **发布管理**：设计态→预览→发布→授权菜单→用户可见

## 四大设计器套件

集成层 → 适配层(GlobalAdapter/PropAdapter/ViewAdapter) → 视图层 → 控件层(13种MetaType)。

## 前端适配

设计器产出元数据 → MDF 运行协议(`viewmodel`+`viewApplication`) → MDF 引擎渲染多端(Web/Mobile/TV)。

## 流程&自动化

审批流绑定 / 业务流(推单/拉单/回写) / 定时任务。

## 11 张核心表

组件扩展中心管理组件注册、版本、依赖、分类。

## 后端存储

页面模板读取保存过程、UI元数据(控件绑定/节点状态/协议转换)、打印数据存储。

## 相关文档

- [[metadata-bizobject]] — 数据建模对应元数据设计
- [[mdf-frontend]] — 页面建模产出MDF协议
- [[factory-ext]] — 原厂扩展在YonBuilder内操作
