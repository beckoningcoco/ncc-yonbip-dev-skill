---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectconbatch.InspectConBatch"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质检连续批 (`QMSDFM.inspectconbatch.InspectConBatch`)

> QIC | 物理表：`qms_dfm_inspectconbatch`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质检连续批 |
| 物理表 | `qms_dfm_inspectconbatch` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:30.0430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 连续批编码 |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 连续批编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `checkType` | 检验类型 | `check_type` | String |
| 7 | `product` | 物料 | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `productClass` | 物料分类 | `product_class` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 9 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 10 | `processes` | 工序 | `processes` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 11 | `customer` | 客户 | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 12 | `inspectionPlanDetail` | 检验方案 | `plandetail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 13 | `leniencyAdjust` | 宽严度调整规则 | `leniency_adjust` | 3da39e15-1749-401c-b7fa-3444b8f8b7f2 |
| 14 | `remark` | 备注 | `remark` | String |
| 15 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 951617af-4f3f-47a5-9e9b-cc75c6176610 |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `createDate` | 创建日期 | `create_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `enable` | 启用 | `enable` | sys_intboolean |
| 26 | `enablets` | 启用时间 | `enablets` | DateTime |
| 27 | `disablets` | 停用时间 | `disablets` | DateTime |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `ConversionRecordList` | 质检连续批转换记录 | `` | e2f0ac54-c599-4617-8123-c09c0debb346 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `processes` | 工序 | `ed.operation.Operation` | Service |  |
| 2 | `product` | 物料 | `pc.product.Product` | Service |  |
| 3 | `productClass` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `leniencyAdjust` | 宽严度调整规则 | `QMSDFM.leniencyadjustrules.LeniencyAdjustRules` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `inspectionPlanDetail` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None |  |
| 9 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 10 | `defineCharacteristics` | 自定义项特征组 | `QMSDFM.inspectconbatch.InspectConBatch_defineCharacter` | None |  |
| 11 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 12 | `ConversionRecordList` | 质检连续批转换记录 | `QMSDFM.inspectconbatch.ConversionRecord` | None | true |
| 13 | `customer` | 客户 | `aa.merchant.Merchant` | Service |  |
