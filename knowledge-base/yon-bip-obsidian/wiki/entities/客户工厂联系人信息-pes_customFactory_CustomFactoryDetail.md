---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.customFactory.CustomFactoryDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 客户工厂联系人信息 (`pes.customFactory.CustomFactoryDetail`)

> IMP_PES | 物理表：`imp_pes_custom_factory_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户工厂联系人信息 |
| 物理表 | `imp_pes_custom_factory_detail` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:32.9150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `contacts` | 联系人 | `contacts` | String |
| 2 | `contactsPhone` | 联系人电话 | `contacts_phone` | String |
| 3 | `contactsAddress` | 联系人地址 | `contacts_address` | String |
| 4 | `customFactoryId` | 客户工厂 | `custom_factory_id` | cfde0823-db21-43ef-94cd-0b511e013ba6 |
| 5 | `longitude` | 经度 | `longitude` | String |
| 6 | `latitude` | 纬度 | `latitude` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `tenant` | 租户ID | `tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `customFactoryId` | 客户工厂 | `pes.customFactory.CustomFactory` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
