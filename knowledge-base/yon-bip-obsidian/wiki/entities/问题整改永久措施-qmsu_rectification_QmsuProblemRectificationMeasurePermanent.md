---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationMeasurePermanent"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改永久措施 (`qmsu.rectification.QmsuProblemRectificationMeasurePermanent`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_measure_permanent`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改永久措施 |
| 物理表 | `qmsu_problem_rectification_measure_permanent` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:07.4460` |

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
| 3 | `measureVerification` | 措施验证 | `measure_verification` | String |
| 4 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 5 | `ctId` | 自定义项特征组id | `ct_id` | f03474dc-25fd-4d22-837d-065afe940078 |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 8 | `tenant` | 租户ID | `tenant_id` | String |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `measureDetail` | 措施描述 | `measure_detail` | String |
| 19 | `responsible` | 责任人 | `responsible` | String |
| 20 | `completeTime` | 完成时间 | `complete_time` | DateTime |
| 21 | `permanentMeasureAttachment` | 永久措施附件 | `permanent_measure_attachment` | String |
| 22 | `synKey` | 同步标识 | `syn_key` | String |
| 23 | `qmsuProblemRectificationMeasurePermanentAttrextItem` | 问题整改永久措施自由自定义项 | `` | b66e0f14-680d-4154-9373-d5737bd5dfff |
| 24 | `qmsuProblemRectificationMeasurePermanentUserdefItem` | 问题整改永久措施固定自定义项 | `` | 09c8d809-6245-4c34-8cbd-8d26b3252600 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `qmsuProblemRectificationMeasurePermanentAttrextItem` | 问题整改永久措施自由自定义项 | `qmsu.rectification.QmsuProblemRectificationMeasurePermanentAttrextItem` | None | true |
| 2 | `qmsuProblemRectificationMeasurePermanentUserdefItem` | 问题整改永久措施固定自定义项 | `qmsu.rectification.QmsuProblemRectificationMeasurePermanentUserdefItem` | None | true |
| 3 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationMeasurePermanentCt` | None |  |
| 4 | `rectificationId` | 问题整改 | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
