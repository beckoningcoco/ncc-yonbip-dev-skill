---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationMeasureTemporary"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改临时措施 (`qmsu.rectification.QmsuProblemRectificationMeasureTemporary`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_measure_temporary`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改临时措施 |
| 物理表 | `qmsu_problem_rectification_measure_temporary` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:10.0590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `rectificationId` | 问题整改 | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 3 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | 491f9992-e5c1-4aef-beec-70b3631efc96 |
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
| 17 | `measureDetail` | 措施详述 | `measure_detail` | String |
| 18 | `responsible` | 责任人 | `responsible` | String |
| 19 | `completeTime` | 完成时间 | `complete_time` | DateTime |
| 20 | `temporaryMeasureAttachment` | 临时措施附件 | `temporary_measure_attachment` | String |
| 21 | `synKey` | 同步标识 | `syn_key` | String |
| 22 | `qmsuProblemRectificationMeasureTemporaryAttrextItem` | 问题整改临时措施自由自定义项 | `` | 42c097da-003c-4ae1-8e1d-8ffe964eec6f |
| 23 | `qmsuProblemRectificationMeasureTemporaryUserdefItem` | 问题整改临时措施固定自定义项 | `` | 08a9b0e6-0616-45a6-8dc8-f489cdb2baa6 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationMeasureTemporaryCt` | None |  |
| 2 | `rectificationId` | 问题整改 | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `qmsuProblemRectificationMeasureTemporaryUserdefItem` | 问题整改临时措施固定自定义项 | `qmsu.rectification.QmsuProblemRectificationMeasureTemporaryUserdefItem` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `qmsuProblemRectificationMeasureTemporaryAttrextItem` | 问题整改临时措施自由自定义项 | `qmsu.rectification.QmsuProblemRectificationMeasureTemporaryAttrextItem` | None | true |
