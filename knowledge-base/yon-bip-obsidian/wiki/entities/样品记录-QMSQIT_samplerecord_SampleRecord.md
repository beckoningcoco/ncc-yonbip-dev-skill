---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplerecord.SampleRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 样品记录 (`QMSQIT.samplerecord.SampleRecord`)

> QMSQIT | 物理表：`qms_qit_sample_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 样品记录 |
| 物理表 | `qms_qit_sample_record` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:44:03.3300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 样品编号 |

---

## 直接属性（65个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 样品编号 | `code` | String |
| 5 | `sampleCreateDate` | 样品创建日期 | `sample_create_date` | Date |
| 6 | `inspectType` | 检验类型 | `inspect_type` | String |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `requestInspectType` | 请检来源单据类型 | `request_inspect_type` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `sampleType` | 样品类型 | `sample_type` | String |
| 11 | `storageCondition` | 存储条件 | `storage_condition` | String |
| 12 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 13 | `retentExpiration` | 留样效期 | `retent_expiration` | Integer |
| 14 | `retentExpirationUnit` | 留样效期单位 | `retent_expiration_unit` | String |
| 15 | `retentExpirationTo` | 留样效期至 | `retent_expiration_to` | Date |
| 16 | `usedNum` | 已使用数量 | `used_num` | Decimal |
| 17 | `residueNum` | 剩余数量 | `residue_num` | Decimal |
| 18 | `sourceBillRowId` | 来源单据行id | `source_bill_row_id` | Long |
| 19 | `sourceBillRowNo` | 来源单据行号 | `source_bill_row_no` | Integer |
| 20 | `documentId` | 源头单据id | `document_id` | String |
| 21 | `dr` | 逻辑删除标记 | `dr` | Short |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `originBillLineNo` | 源头单据行号 | `origin_bill_line_no` | Integer |
| 24 | `sampleSite` | 取样地点 | `sample_site` | String |
| 25 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 26 | `inspectionPlan` | 检验方案 | `inspection_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 27 | `standardProcess` | 工序 | `standard_process` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 28 | `dynamicInspectPlanId` | 动态检验方案 | `dynamic_inspect_plan_id` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 29 | `sampleUser` | 样品操作人 | `sample_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 30 | `originBillCode` | 源头单据号 | `origin_bill_code` | String |
| 31 | `sampleDefineId` | 样品定义 | `sample_define_id` | bf808ae5-0ef4-49c7-8560-721d1bceaff2 |
| 32 | `batchNo` | 批次号 | `batch_no` | String |
| 33 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 34 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 35 | `requestInspectLineNo` | 请检来源单据行号 | `request_inspect_line_no` | Integer |
| 36 | `inspectStepOrder` | 检验步骤顺序 | `inspect_step_order` | Integer |
| 37 | `requestInspectCode` | 请检来源单据号 | `request_inspect_code` | String |
| 38 | `sampleRemake` | 样品备注 | `sample_remark` | String |
| 39 | `sampleUnit` | 样品计量单位 | `sample_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 40 | `sampleCapacity` | 样品数量 | `sample_capacity` | Decimal |
| 41 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 42 | `effective` | 生效 | `effective` | Short |
| 43 | `inspectApplyCode` | 检验申请单号 | `inspect_apply_code` | String |
| 44 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 45 | `pubts` | 时间戳 | `pubts` | DateTime |
| 46 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 47 | `createDate` | 创建日期 | `create_date` | Date |
| 48 | `creator` | 创建人名称 | `creator` | String |
| 49 | `inspectVersion` | 检验方案版本 | `inspect_version` | String |
| 50 | `sampleShape` | 样品形态 | `sample_shape` | String |
| 51 | `sampleDepartment` | 部门 | `sample_department` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 52 | `originBillType` | 源头单据类型 | `origin_bill_type` | String |
| 53 | `inspectStep` | 检验步骤 | `inspect_step` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 54 | `originRecord` | 原始记录 | `origin_record` | Short |
| 55 | `sourceDocId` | 来源单据id | `source_doc_id` | Long |
| 56 | `recordFct` | 自由项特征 | `record_fct` | 03144894-4c57-4fe2-90e9-828b1058e5b4 |
| 57 | `isGeneOriRecord` | 已生成原始记录 | `is_gene_ori_record` | Short |
| 58 | `sampleContainer` | 样品容器 | `sample_container` | String |
| 59 | `recordDct` | 自定义项特征 | `record_dct` | 23149d33-52f4-45d5-9b70-406823db6495 |
| 60 | `createTime` | 创建时间 | `create_time` | DateTime |
| 61 | `sourceBillCode` | 来源单据号 | `source_bill_code` | String |
| 62 | `isRetestSample` | 是否复验样品 | `is_retest_sample` | Short |
| 63 | `inspectApplyId` | 检验申请id | `inspect_apply_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 64 | `customer` | 客户 | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 65 | `inspectItemList` | 检验项目 | `` | 97d60bcf-f002-4bc8-8b8a-b315034dee48 |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleDefineId` | 样品定义 | `QMSQIT.sampledefine.SampleDefine` | None |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `sampleDepartment` | 部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `sampleUnit` | 样品计量单位 | `pc.unit.Unit` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `inspectStep` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 9 | `inspectItemList` | 检验项目 | `QMSQIT.samplerecord.InspectItem` | None | true |
| 10 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 11 | `recordFct` | 自由项特征 | `QMSQIT.samplerecord.SampleRecordFCT` | None |  |
| 12 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 13 | `recordDct` | 自定义项特征 | `QMSQIT.samplerecord.SampleRecordDCT` | None |  |
| 14 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 15 | `inspectionPlan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 16 | `standardProcess` | 工序 | `ed.operation.Operation` | Service |  |
| 17 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 18 | `dynamicInspectPlanId` | 动态检验方案 | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 19 | `inspectApplyId` | 检验申请id | `QMSQIT.LLCheckApply.LLCheckApply` | None |  |
| 20 | `sampleUser` | 样品操作人 | `bd.staff.Staff` | Service |  |
| 21 | `customer` | 客户 | `aa.merchant.Merchant` | Service |  |
