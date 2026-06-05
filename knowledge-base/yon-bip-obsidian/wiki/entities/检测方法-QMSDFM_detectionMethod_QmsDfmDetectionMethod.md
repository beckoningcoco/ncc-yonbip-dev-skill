---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.detectionMethod.QmsDfmDetectionMethod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检测方法 (`QMSDFM.detectionMethod.QmsDfmDetectionMethod`)

> QIC | 物理表：`qms_dfm_detection_method`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检测方法 |
| 物理表 | `qms_dfm_detection_method` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:16.8830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `type` | 分类 | `type` | String |
| 7 | `edition` | 版本 | `edition` | String |
| 8 | `validFrom` | 有效期从 | `valid_from` | DateTime |
| 9 | `expiryDate` | 有效期止 | `expiry_date` | DateTime |
| 10 | `note` | 备注 | `note` | String |
| 11 | `enclosure` | 附件 | `enclosure` | String |
| 12 | `define1` | 表头自定义项 | `define1` | String |
| 13 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 14 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 15 | `latestVersion` | 最新版本 | `latest_version` | String |
| 16 | `methodDefineCharacter` | 自定义项特征属性组 | `methodDefineCharacter` | 132396cf-4aa1-49e0-b6ca-828cd128e901 |
| 17 | `operatingSteps` | 操作步骤 | `operating_steps` | String |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime |
| 20 | `createDate` | 创建日期 | `create_date` | Date |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 22 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 23 | `creator` | 创建人名称 | `creator` | String |
| 24 | `modifier` | 修改人名称 | `modifier` | String |
| 25 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `methodDefineCharacter` | 自定义项特征属性组 | `QMSDFM.detectionMethod.MethodDefineCharacter` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
