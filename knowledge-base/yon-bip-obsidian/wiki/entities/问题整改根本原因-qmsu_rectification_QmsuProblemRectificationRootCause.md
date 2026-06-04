---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationRootCause"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改根本原因 (`qmsu.rectification.QmsuProblemRectificationRootCause`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_root_cause`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改根本原因 |
| 物理表 | `qmsu_problem_rectification_root_cause` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:12.6480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `rectificationId` | 问题整改 | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 3 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | b8883a00-4e52-4a7d-a91f-e0574e5e0a8f |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `causeType` | 原因类型 | `cause_type` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 18 | `occurCause` | 发生原因 | `occur_cause` | String |
| 19 | `outflowCause` | 流出原因 | `outflow_cause` | String |
| 20 | `unpreventedCause` | 未预防原因 | `unprevented_cause` | String |
| 21 | `rootCauseAttachment` | 根本原因附件 | `root_cause_attachment` | String |
| 22 | `synKey` | 同步标识 | `syn_key` | String |
| 23 | `qmsuProblemRectificationRootCauseAttrextItem` | 问题整改根本原因自由自定义项 | `` | 003e7be1-8d2d-4d16-bddb-ba47a62f894c |
| 24 | `qmsuProblemRectificationRootCauseUserdefItem` | 问题整改根本原因固定自定义项 | `` | 34624a86-796a-474c-9150-ad476b3e0bcd |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationRootCauseCt` | None |  |
| 2 | `qmsuProblemRectificationRootCauseUserdefItem` | 问题整改根本原因固定自定义项 | `qmsu.rectification.QmsuProblemRectificationRootCauseUserdefItem` | None | true |
| 3 | `qmsuProblemRectificationRootCauseAttrextItem` | 问题整改根本原因自由自定义项 | `qmsu.rectification.QmsuProblemRectificationRootCauseAttrextItem` | None | true |
| 4 | `causeType` | 原因类型 | `aa.reason.Reason` | Service |  |
| 5 | `rectificationId` | 问题整改 | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
