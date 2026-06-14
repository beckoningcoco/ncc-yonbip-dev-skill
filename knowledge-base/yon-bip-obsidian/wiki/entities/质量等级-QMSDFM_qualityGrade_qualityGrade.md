---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.qualityGrade.qualityGrade"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质量等级 (`QMSDFM.qualityGrade.qualityGrade`)

> QIC | 物理表：`qms_dfm_qualitygrade`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质量等级 |
| 物理表 | `qms_dfm_qualitygrade` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:47.1390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 质量等级组编码 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `code` | 质量等级组编码 | `code` | String |
| 5 | `name` | 质量等级组名称 | `name` | String |
| 6 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 7 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 8 | `qualityGradeDef` | 自定义项 | `qualityGradeDef` | 818ced42-156d-4c27-87c6-db58a4a59d49 |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `creator` | 创建人 | `creator` | String |
| 16 | `modifier` | 修改人 | `modifier` | String |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `bodylist` | 质量等级子表 | `` | 0807260c-f881-4419-9dab-a412fad4e530 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `qualityGradeDef` | 自定义项 | `QMSDFM.qualityGrade.QualityGradeDefine` | None |  |
| 3 | `bodylist` | 质量等级子表 | `QMSDFM.qualityGrade.qualityGradeBody` | None | true |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
