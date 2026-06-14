---
tags: ["BIP", "元数据", "数据字典", "BCD", "aa.barcodetag.BarcodeTag"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 条码标签 (`aa.barcodetag.BarcodeTag`)

> BCD | 物理表：`aa_barcodetag`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码标签 |
| 物理表 | `aa_barcodetag` |
| domain/服务域 | `uscmpub` |
| schema | `usp_plantransportroute` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:33:53.3400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `tagName` | 标签名称 | `tag_name` | String |
| 3 | `archType` | 打印模板租户架构类型 | `archType` | String |
| 4 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 5 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `templateId` | 模板id | `template_id` | a7d321f2-7d04-40bd-83d0-cfeb57c8a100 |
| 16 | `description` | 说明 | `description` | String |
| 17 | `stopstatus` | 状态 | `stopstatus` | Boolean |
| 18 | `system` | 是否系统预制 | `system` | Boolean |
| 19 | `id` | ID | `id` | Long |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `templateId` | 模板id | `iuap-apcom-print.print.printTemplate` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
