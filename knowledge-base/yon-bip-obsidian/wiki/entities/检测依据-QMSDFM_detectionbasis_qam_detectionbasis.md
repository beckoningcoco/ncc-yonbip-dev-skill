---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.detectionbasis.qam_detectionbasis"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检测依据 (`QMSDFM.detectionbasis.qam_detectionbasis`)

> QIC | 物理表：`qms_dfm_detectionbasis`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检测依据 |
| 物理表 | `qms_dfm_detectionbasis` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:53.7830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `classification` | 分类 | `classification` | String |
| 7 | `version` | 版本 | `version` | String |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `definect_h` | 检测依据自定义项 | `definect_h` | dc6e3b3b-d164-4a9e-83b5-4dcc518dce0f |
| 11 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 12 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 13 | `creator` | 创建人id | `creator` | String |
| 14 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `validitydate` | 有效期 | `validitydate` | DateTime |
| 16 | `vnote` | 备注 | `vnote` | String |
| 17 | `modifier` | 修改人id | `modifier` | String |
| 18 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `attachmentId` | 附件管理 | `attachmentId` | String |
| 24 | `defines` | 检测依据自定义项 | `` | 830e68e8-8240-44a2-8cd4-0d29d7c219b4 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 4 | `definect_h` | 检测依据自定义项 | `QMSDFM.detectionbasis.DetectionDefineCharacter` | None |  |
| 5 | `defines` | 检测依据自定义项 | `QMSDFM.detectionbasis.qam_detectionbasis_define` | None | true |
