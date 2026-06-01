---
title: "数字化工作台"
type: reference
source: "iuap-数字化工作台红皮书 (201页)"
tags: ["BIP", "旗舰版", "工作台", "菜单", "磁贴", "JSSDK"]
created: 2026-06-01
---

# 数字化工作台

## 菜单层级

`域(Domain) → 应用(App) → 服务(Service) → 菜单(Menu)`，最多5级。

## 角色工作台

创建主模板 → 发布系统级 → 配置场景应用 → 关联规格 → 分配角色/用户/组织。

磁贴尺寸：1:1 / 2:1 / 2:2 / 3:1 / 3:2 / 4:1 / 4:2。主题：6种预制 + 自定义颜色(标签/页签/磁贴区)。

## JSSDK

`jDiwork.openService(serviceCode, params)` / `openApplication(appCode)` / `getTenantId()` / `onData(event, callback)`。

## 全局搜索插件

`IFullTextService.search(keyword, pageIndex, pageSize)` → `Page<String>`。

## 计量（License）

ControlPoint + LicenseDimension 模型。三种：功能许可 / 用户数许可 / 简单计数许可。`ILicensePlugin.getUsedAmount()`。

## URL 规范

`/{微服务}/xx` / `/{ms}/ucf-wh/{前端应用}` / `/mdf-node/meta/{单据类型}/{单据编码}`。

## Maven

`diwork-sdk` + `mwclient` + `iris-iuap-support`。

## Session 过滤器

`DiWorkRequestListener` + 可配置验证链：`DiworkDefaultSessionVerifier(@Order=10)` → `ProductModeSupportVerifier(@Order=20)`。OAuth v1/v2 / Bearer token / JWT caching。
