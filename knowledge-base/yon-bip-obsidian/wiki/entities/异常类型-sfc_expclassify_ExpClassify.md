---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.expclassify.ExpClassify"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常类型 (`sfc.expclassify.ExpClassify`)

> IMPSFC | 物理表：`imp_sfc_exp_classify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常类型 |
| 物理表 | `imp_sfc_exp_classify` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:48.0090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `description` | 描述 | `description` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `id` | ID | `id` | Long |
| 9 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 10 | `isPrefabricated` | 系统预制 | `is_prefabricated` | Boolean |
| 11 | `level` | 层级 | `level` | Integer |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `name` | 名称 | `name` | String |
| 17 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 18 | `parent` | 上级分组id | `parent_id` | 50e2e950-c9af-43d1-97b4-681b98241a8a |
| 19 | `path` | 路径 | `path` | String |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `remark` | 备注 | `remark` | String |
| 22 | `selfDefineCharacter` | 自定义项特征 | `self_define_character` | 467cf4d4-5fda-426d-8630-da0b60d6b66a |
| 23 | `sort` | 排序号 | `sort_num` | Integer |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分组id | `sfc.expclassify.ExpClassify` | None |  |
| 2 | `selfDefineCharacter` | 自定义项特征 | `sfc.expclassify.ExpClassifySelfDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
