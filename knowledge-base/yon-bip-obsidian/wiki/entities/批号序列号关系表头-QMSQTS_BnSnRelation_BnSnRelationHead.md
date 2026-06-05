---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.BnSnRelation.BnSnRelationHead"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 批号序列号关系表头 (`QMSQTS.BnSnRelation.BnSnRelationHead`)

> QMSQTS | 物理表：`qms_qts_bnsnrelation_h`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 批号序列号关系表头 |
| 物理表 | `qms_qts_bnsnrelation_h` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:53.2590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编码 |

---

## 直接属性（55个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BnSnRelationBodyList` | 批号序列号关系表体 | `` | 8e04b815-ddad-45c2-8384-d04634041f1d |
| 2 | `addPageFlag` | 新增标识 | `add_page_flag` | String |
| 3 | `auditDate` | 审批日期 | `audit_date` | Date |
| 4 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 5 | `auditor` | 审批人名称 | `auditor` | String |
| 6 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `batchNo` | 批号 | `batch_no` | String |
| 8 | `batchNoId` | 批号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 9 | `bomId` | BOMid | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 10 | `bomVersion` | BOM版本 | `bom_version` | Decimal |
| 11 | `busiDate` | 业务日期 | `busi_date` | DateTime |
| 12 | `code` | 单据编码 | `code` | String |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `deptId` | 部门ID | `dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `factoryId` | 工厂ID | `factory_id` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 20 | `freect_h` | 表头自由项特征组实体 | `freect_h` | dd6d7bec-d175-466a-b397-43609d7c914a |
| 21 | `id` | ID | `id` | Long |
| 22 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 23 | `mainID` | 数据抽取主表ID | `main_id` | Long |
| 24 | `modifier` | 修改人名称 | `modifier` | String |
| 25 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 28 | `num` | 数量 | `num` | Decimal |
| 29 | `orderCode` | 源头订单号 | `order_code` | String |
| 30 | `orderDetailId` | 源头订单行ID | `order_detail_id` | Long |
| 31 | `orderId` | 源头订单ID | `order_id` | Long |
| 32 | `orderLineNum` | 源头订单行号 | `order_linenum` | String |
| 33 | `orderType` | 源头订单类型 | `order_type` | String |
| 34 | `processId` | 工序ID | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 35 | `processOrder` | 工序顺序号 | `process_order` | Decimal |
| 36 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `purchaseOrgId` | 采购组织ID | `purchase_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 39 | `remark` | 备注 | `remark` | String |
| 40 | `returncount` | 退回次数 | `returncount` | Short |
| 41 | `sn` | 序列号 | `sn` | String |
| 42 | `snID` | 序列号ID | `sn_id` | b77de1a0-2e36-47ba-9bd9-3cda94fd9680 |
| 43 | `sourceCode` | 来源单据号 | `source_code` | String |
| 44 | `sourceDetailId` | 来源单据行ID | `source_detail_id` | Long |
| 45 | `sourceDocId` | 来源单据ID | `source_doc_id` | Long |
| 46 | `sourceFlag` | 单据来源 | `source_flag` | String |
| 47 | `sourceLineNum` | 来源单据行号 | `source_linenum` | String |
| 48 | `sourceType` | 来源单据类型 | `source_type` | String |
| 49 | `status` | 状态 | `status` | String |
| 50 | `stockOrgId` | 库存组织ID | `stock_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 51 | `supplierId` | 供应商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 52 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 53 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `verifystate` | 审批状态 | `verifystate` | Short |
| 55 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | BOMid | `ed.bom.Bom` | Service |  |
| 2 | `snID` | 序列号ID | `sn.serialnumber.SNstateReport` | Service |  |
| 3 | `supplierId` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 4 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `factoryId` | 工厂ID | `org.func.FactoryOrg` | Service |  |
| 7 | `deptId` | 部门ID | `bd.adminOrg.DeptOrgVO` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `purchaseOrgId` | 采购组织ID | `org.func.PurchaseOrg` | Service |  |
| 11 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 12 | `batchNoId` | 批号id | `st.batchno.Batchno` | Service |  |
| 13 | `freect_h` | 表头自由项特征组实体 | `QMSQTS.BnSnRelation.BnSnRelationFree` | None |  |
| 14 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 15 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 16 | `processId` | 工序ID | `ed.operation.Operation` | Service |  |
| 17 | `stockOrgId` | 库存组织ID | `org.func.InventoryOrg` | Service |  |
| 18 | `BnSnRelationBodyList` | 批号序列号关系表体 | `QMSQTS.BnSnRelation.BnSnRelationBody` | None | true |
