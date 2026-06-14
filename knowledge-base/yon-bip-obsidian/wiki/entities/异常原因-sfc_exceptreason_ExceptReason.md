---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.exceptreason.ExceptReason"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常原因 (`sfc.exceptreason.ExceptReason`)

> IMPSFC | 物理表：`imp_sfc_except_reason`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常原因 |
| 物理表 | `imp_sfc_except_reason` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:41.9090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（23个）

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
| 10 | `level` | 层级 | `level` | Integer |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `name` | 名称 | `name` | String |
| 16 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 17 | `parent` | 上级分组 | `parent_id` | 9e9af41b-a04f-4b2c-9aeb-738c1c08a4c6 |
| 18 | `path` | 路径 | `path` | String |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `remark` | 备注 | `remark` | String |
| 21 | `selfDefineCharacter` | 自定义项特征 | `self_define_character` | d180bcad-517a-4a47-809b-eec5b8f85de1 |
| 22 | `sort` | 排序号 | `sort_num` | Integer |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分组 | `sfc.exceptreason.ExceptReason` | None |  |
| 2 | `selfDefineCharacter` | 自定义项特征 | `sfc.exceptreason.ExceptReasonSelfDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
