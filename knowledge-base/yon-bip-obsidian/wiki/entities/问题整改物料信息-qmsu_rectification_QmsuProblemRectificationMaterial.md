---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改物料信息 (`qmsu.rectification.QmsuProblemRectificationMaterial`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改物料信息 |
| 物理表 | `qmsu_problem_rectification_material` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:06.1270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `rectificationId` | 问题整改 | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 3 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | b39e97b8-1527-42ba-9e9b-9366b5e80899 |
| 5 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `description` | 备注 | `description` | String |
| 10 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `tenant` | 租户ID | `tenant_id` | String |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `materialCode` | 物料编码 | `material_code` | String |
| 20 | `materialClassCode` | 物料分类编码 | `material_class_code` | String |
| 21 | `materialName` | 物料名称 | `material_name` | String |
| 22 | `sourceBillRowId` | 来源单据行号 | `source_bill_row_id` | Long |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 25 | `fileId` | 附件 | `file_id` | String |
| 26 | `dctId` | 自由项特征组id | `dct_id` | 11824874-fb97-4004-9332-4f0d59222fbd |
| 27 | `sourceBillNo` | 来源单据号 | `source_bill_no` | String |
| 28 | `sourceBillId` | 来源单据id | `source_bill_id` | Long |
| 29 | `sourceBillDate` | 来源单据日期 | `source_bill_date` | Date |
| 30 | `material` | 物料 | `material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 31 | `involvedNumber` | 涉及数量 | `involved_number` | Decimal |
| 32 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `qmsuProblemRectificationMaterialAttrextItem` | 问题整改物料信息自由自定义项 | `` | 103af8b4-ab67-4467-b824-8367ebf569e8 |
| 34 | `qmsuProblemRectificationMaterialUserdefItem` | 问题整改物料信息固定自定义项 | `` | 30fef5cf-1178-4db5-8f7f-f954a26e9869 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationMaterialCt` | None |  |
| 2 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `material` | 物料 | `pc.product.Product` | Service |  |
| 4 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 5 | `rectificationId` | 问题整改 | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `qmsuProblemRectificationMaterialAttrextItem` | 问题整改物料信息自由自定义项 | `qmsu.rectification.QmsuProblemRectificationMaterialAttrextItem` | None | true |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `qmsuProblemRectificationMaterialUserdefItem` | 问题整改物料信息固定自定义项 | `qmsu.rectification.QmsuProblemRectificationMaterialUserdefItem` | None | true |
| 11 | `dctId` | 自由项特征组id | `qmsu.rectification.QmsuRectificationMaterialDct` | None |  |
