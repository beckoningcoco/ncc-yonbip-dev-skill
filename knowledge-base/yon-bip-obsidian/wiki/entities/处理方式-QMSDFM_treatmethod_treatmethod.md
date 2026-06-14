---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.treatmethod.treatmethod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 处理方式 (`QMSDFM.treatmethod.treatmethod`)

> QIC | 物理表：`qms_dfm_treatmethod`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 处理方式 |
| 物理表 | `qms_dfm_treatmethod` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:52.3880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | String |
| 3 | `code` | 编码 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `type` | 类型 | `method_type` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `qualityGrade` | 质量计分 | `quality_grade` | Decimal |
| 8 | `prefabricated` | 系统预置 | `prefabricated` | String |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `note` | 备注 | `note` | String |
| 15 | `creator` | 创建人 | `creator` | String |
| 16 | `modifier` | 修改人 | `modifier` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `DefineList` | 处理方式自定义项 | `` | c3d15052-be2c-48f6-b5bc-dc2bedcb4e0a |
| 21 | `definect_h` | 自定义项特征组 | `definect_h` | 4754f6a6-6808-472e-b500-821187ad6abc |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `DefineList` | 处理方式自定义项 | `QMSDFM.treatmethod.Define` | None | true |
| 5 | `definect_h` | 自定义项特征组 | `QMSDFM.treatmethod.TreatMethodDefineCharacter` | None |  |
