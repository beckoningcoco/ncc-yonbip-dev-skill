---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationMeasurePrevention"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改预防措施 (`qmsu.rectification.QmsuProblemRectificationMeasurePrevention`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_measure_prevention`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改预防措施 |
| 物理表 | `qmsu_problem_rectification_measure_prevention` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:08.7710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `measureDetail` | 措施描述 | `measure_detail` | String |
| 3 | `rectificationId` | 问题整改id | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 4 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 5 | `ctId` | 自定义项特征组id | `ct_id` | 3ee49236-01d9-466c-bcb9-73f902c01e09 |
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
| 18 | `measureVerification` | 措施验证 | `measure_verification` | String |
| 19 | `responsible` | 责任人 | `responsible` | String |
| 20 | `completionTime` | 完成时间 | `completion_time` | DateTime |
| 21 | `preventionMeasureAttachment` | 预防措施附件 | `prevention_measure_attachment` | String |
| 22 | `synKey` | 同步标识 | `syn_key` | String |
| 23 | `qmsuProblemRectificationMeasurePreventionAttrextItem` | 问题整改预防措施自由自定义项 | `` | bbe5e7f4-b7c4-405f-8250-9293e0c34db6 |
| 24 | `qmsuProblemRectificationMeasurePreventionUserdefItem` | 问题整改预防措施固定自定义项 | `` | c0917f2f-4e28-413b-aaa6-3200e121052c |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `qmsuProblemRectificationMeasurePreventionAttrextItem` | 问题整改预防措施自由自定义项 | `qmsu.rectification.QmsuProblemRectificationMeasurePreventionAttrextItem` | None | true |
| 2 | `qmsuProblemRectificationMeasurePreventionUserdefItem` | 问题整改预防措施固定自定义项 | `qmsu.rectification.QmsuProblemRectificationMeasurePreventionUserdefItem` | None | true |
| 3 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationMeasurePreventionCt` | None |  |
| 4 | `rectificationId` | 问题整改id | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
