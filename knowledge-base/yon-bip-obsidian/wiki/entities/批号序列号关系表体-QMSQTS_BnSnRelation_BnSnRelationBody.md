---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.BnSnRelation.BnSnRelationBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 批号序列号关系表体 (`QMSQTS.BnSnRelation.BnSnRelationBody`)

> QMSQTS | 物理表：`qms_qts_bnsnrelation_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 批号序列号关系表体 |
| 物理表 | `qms_qts_bnsnrelation_b` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:11.3510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `batchNo` | 批号 | `batch_no` | String |
| 2 | `batchNoId` | 批号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `childID` | 数据抽取子表ID | `child_id` | Long |
| 4 | `createDate` | 创建日期 | `create_date` | Date |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `deptId` | 部门id | `dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `freect_b` | 表体自由项特征组实体 | `freect_b` | 9c8b9f5d-ce11-434a-9ffb-af9fd114f2b0 |
| 11 | `grandDr` | 数据抽取孙表DR | `grand_dr` | Integer |
| 12 | `grandID` | 数据抽取孙表ID | `grand_id` | Long |
| 13 | `id` | ID | `id` | Long |
| 14 | `lineNo` | 行号 | `line_no` | Decimal |
| 15 | `lineSourceFlag` | 单据行来源 | `line_source_flag` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `num` | 数量 | `num` | Decimal |
| 21 | `parentId` | 主表ID | `parent_id` | fdd8aea6-35a4-4f67-9d0f-a3309ea2c54b |
| 22 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `purchaseOrgId` | 采购组织id | `purchase_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 25 | `remark` | 备注 | `remark` | String |
| 26 | `sn` | 序列号 | `sn` | String |
| 27 | `snID` | 序列号ID | `sn_id` | b77de1a0-2e36-47ba-9bd9-3cda94fd9680 |
| 28 | `sourceCode` | 来源单据号 | `source_code` | String |
| 29 | `sourceDetailId` | 来源单据行ID | `source_detail_id` | Long |
| 30 | `sourceDocId` | 来源单据ID | `source_doc_id` | Long |
| 31 | `sourceLineNum` | 来源单据行号 | `source_line_num` | String |
| 32 | `sourceType` | 来源单据类型 | `source_type` | String |
| 33 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 34 | `supplyOrgId` | 生产组织id | `supply_org_id` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 35 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `warehouseId` | 仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `snID` | 序列号ID | `sn.serialnumber.SNstateReport` | Service |  |
| 2 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 3 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `deptId` | 部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `purchaseOrgId` | 采购组织id | `org.func.PurchaseOrg` | Service |  |
| 9 | `parentId` | 主表ID | `QMSQTS.BnSnRelation.BnSnRelationHead` | None | true |
| 10 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 11 | `batchNoId` | 批号id | `st.batchno.Batchno` | Service |  |
| 12 | `freect_b` | 表体自由项特征组实体 | `QMSQTS.BnSnRelation.BnSnRelationBodyFree` | None |  |
| 13 | `warehouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 14 | `supplyOrgId` | 生产组织id | `org.func.FactoryOrg` | Service |  |
