---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.noticetemplate.NoticeTemplateType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件公告模板类型参照 (`lawbid.noticetemplate.NoticeTemplateType`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_notice_template_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件公告模板类型参照 |
| 物理表 | `cpu_notice_template_type` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:43.2130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:31:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billNo` | 对应单据UI模板编码 | `bill_no` | String |
| 2 | `businessType` | 业务类型 | `business_type` | String |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `code` | 公告类型编码 | `code` | String |
| 5 | `enable` | 是否开启 | `enable` | Integer |
| 6 | `fullName` | Full Name | `full_name` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `name` | 公告类型名称 | `name` | String |
| 9 | `nameResid` | 公告类型名称多语 | `name_resid` | String |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
