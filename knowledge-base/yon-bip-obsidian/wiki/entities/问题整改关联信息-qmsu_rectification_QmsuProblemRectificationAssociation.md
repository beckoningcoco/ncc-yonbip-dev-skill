---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationAssociation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改关联信息 (`qmsu.rectification.QmsuProblemRectificationAssociation`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_association`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改关联信息 |
| 物理表 | `qmsu_problem_rectification_association` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:02.0730` |

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
| 4 | `ctId` | 自定义项特征组id | `ct_id` | 2dc858ed-7327-4807-ad11-08e6d1d017e0 |
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
| 17 | `associationBillType` | 关联单据类型 | `association_bill_type` | String |
| 18 | `associationBillTitle` | 关联单据标题 | `association_bill_title` | String |
| 19 | `associationBillNo` | 关联单据号 | `association_bill_no` | String |
| 20 | `associationBillId` | 关联单据id | `association_bill_id` | Long |
| 21 | `associationBillDate` | 关联单据日期 | `association_bill_Date` | Date |
| 22 | `qmsuProblemRectificationAssociationAttrextItem` | 问题整改关联信息自由自定义项 | `` | a6bd529c-5d77-43cc-ba02-fc2680e33137 |
| 23 | `qmsuProblemRectificationAssociationUserdefItem` | 问题整改关联信息固定自定义项 | `` | a5b292e5-3a36-4434-9286-94dc2f365061 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationAssociationCt` | None |  |
| 2 | `qmsuProblemRectificationAssociationAttrextItem` | 问题整改关联信息自由自定义项 | `qmsu.rectification.QmsuProblemRectificationAssociationAttrextItem` | None | true |
| 3 | `rectificationId` | 问题整改 | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `qmsuProblemRectificationAssociationUserdefItem` | 问题整改关联信息固定自定义项 | `qmsu.rectification.QmsuProblemRectificationAssociationUserdefItem` | None | true |
