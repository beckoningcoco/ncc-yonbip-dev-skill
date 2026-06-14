---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.reporttemplate.ReportTemplate"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 报告模板 (`pes.reporttemplate.ReportTemplate`)

> IMP_PES | 物理表：`pes_dim_rpt_tpl`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报告模板 |
| 物理表 | `pes_dim_rpt_tpl` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:14.6500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `templateContentId` | 文件模板ID | `template_content_id` | 67a65644-5898-4be8-a94a-55252c1b74f4 |
| 5 | `productCategoryId` | 产品分类ID | `product_category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 6 | `equipmentType` | 设备分类ID | `equipment_type` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 7 | `equipmentId` | 设备ID | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 8 | `stopstatus` | 启用状态 | `stopstatus` | Boolean |
| 9 | `description` | 描述 | `description` | String |
| 10 | `productId` | 产品ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `creator` | 创建人 | `creator` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifier` | 最后修改人 | `modifier` | String |
| 17 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `id` | ID | `id` | Long |
| 20 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 21 | `tenant` | 租户ID | `tenant_id` | String |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `templateDetail` | 详情 | `` | 35ec16a1-598c-4bc7-bf90-d86a76a51094 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `templateContentId` | 文件模板ID | `pes.dimTpl.DimTpl` | None |  |
| 2 | `templateDetail` | 详情 | `pes.reporttemplate.ReportTemplateDetail` | None | true |
| 3 | `productCategoryId` | 产品分类ID | `pc.cls.ManagementClass` | Service |  |
| 4 | `productId` | 产品ID | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `equipmentId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 9 | `equipmentType` | 设备分类ID | `ampub.ambase.CategoryVO` | Service |  |
| 10 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
