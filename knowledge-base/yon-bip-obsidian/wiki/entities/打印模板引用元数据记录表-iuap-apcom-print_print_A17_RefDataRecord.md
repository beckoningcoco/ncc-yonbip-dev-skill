---
tags: ["BIP", "元数据", "数据字典", "BMMPT", "iuap-apcom-print.print.A17_RefDataRecord"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 打印模板引用元数据记录表 (`iuap-apcom-print.print.A17_RefDataRecord`)

> BMMPT | 物理表：`ref_data_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 打印模板引用元数据记录表 |
| 物理表 | `ref_data_record` |
| domain/服务域 | `iuap-apcom-print` |
| 所属应用 | `BMMPT` |
| 构建时间 | `2026-06-04 23:34:43.0320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `attrName` | 引用数据所在属性 | `attr_name` | String |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `dataId` | 数据主键 | `data_id` | a7d321f2-7d04-40bd-83d0-cfeb57c8a100 |
| 5 | `entityUri` | 引用数据所在实体 | `entity_uri` | String |
| 6 | `fieldName` | 引用数据所在数据库列名称 | `field_name` | String |
| 7 | `id` | 主键 | `id` | String |
| 8 | `location` | 属性路径 | `location` | String |
| 9 | `locationDesc` | 属性路径的描述 | `location_desc` | String |
| 10 | `locationId` | 主实体数据主键描述 | `location_id` | String |
| 11 | `mainDataId` | 主实体数据主键 | `main_data_id` | String |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `refEntity` | 引用的实体类型 | `ref_entity` | String |
| 16 | `refType` | 引用类型 | `ref_type` | String |
| 17 | `refValue` | 引用属性值 | `ref_value` | String |
| 18 | `tableName` | 引用数据所在表名称 | `table_name` | String |
| 19 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `dataId` | 数据主键 | `iuap-apcom-print.print.printTemplate` | None | true |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
