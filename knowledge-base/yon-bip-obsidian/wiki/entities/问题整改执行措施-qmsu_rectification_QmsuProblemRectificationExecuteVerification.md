---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationExecuteVerification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改执行措施 (`qmsu.rectification.QmsuProblemRectificationExecuteVerification`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_execute_verification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改执行措施 |
| 物理表 | `qmsu_problem_rectification_execute_verification` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:04.7500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `measureDetail` | 措施描述 | `measure_detail` | String |
| 3 | `rectificationId` | 问题整改id | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 4 | `validatorId` | 执行人Id | `validator_id` | String |
| 5 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 6 | `permanentMeasureId` | 永久措施id | `permanent_measure_id` | Long |
| 7 | `ctId` | 自定义项特征组id | `ct_id` | 4bf59d04-72bb-4aac-92aa-aba0b4680eb6 |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `tenant` | 租户ID | `tenant_id` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `validator` | 执行验证人 | `validator` | String |
| 21 | `validateTime` | 执行验证时间 | `validate_time` | DateTime |
| 22 | `validateAttachment` | 执行验证附件 | `validate_attachment` | String |
| 23 | `synKey` | 同步标识 | `syn_key` | String |
| 24 | `qmsuProblemRectificationExecuteVerificationAttrextItem` | 问题整改执行验证自由自定义项 | `` | 0031e600-141a-4e69-b73d-513a9c16479e |
| 25 | `qmsuProblemRectificationExecuteVerificationUserdefItem` | 问题整改执行验证固定自定义项 | `` | 113ba555-ccb8-45d7-aa16-b97072f32fc0 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationExecuteVerificationCt` | None |  |
| 2 | `rectificationId` | 问题整改id | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `qmsuProblemRectificationExecuteVerificationUserdefItem` | 问题整改执行验证固定自定义项 | `qmsu.rectification.QmsuProblemRectificationExecuteVerificationUserdefItem` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `qmsuProblemRectificationExecuteVerificationAttrextItem` | 问题整改执行验证自由自定义项 | `qmsu.rectification.QmsuProblemRectificationExecuteVerificationAttrextItem` | None | true |
