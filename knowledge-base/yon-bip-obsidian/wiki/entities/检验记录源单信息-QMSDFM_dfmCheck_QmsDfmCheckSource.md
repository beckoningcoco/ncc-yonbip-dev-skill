---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckSource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验记录源单信息 (`QMSDFM.dfmCheck.QmsDfmCheckSource`)

> QIC | 物理表：`qms_dfm_check_sourcelist`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验记录源单信息 |
| 物理表 | `qms_dfm_check_sourcelist` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:28.6290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `pkDfmCheckRecord` | 检验记录id | `pk_dfm_check_record` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 4 | `applyBillNo` | 请检来源单据号 | `apply_bill_no` | String |
| 5 | `applyBilltype` | 请检来源单据类型 | `apply_bill_type` | String |
| 6 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 7 | `billSourceNum` | 到货数量 | `bill_source_num` | Decimal |
| 8 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 9 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 10 | `applySourceNo` | 请检源头单据号 | `apply_source_no` | String |
| 11 | `pkApplyBillId` | 请检来源单据id | `pk_apply_billId` | String |
| 12 | `pkApplySourceId` | 请检源头单据id | `pk_apply_source_id` | String |
| 13 | `pkSourceBillRowId` | 请检来源单据行id | `pk_source_bill_rowId` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `sourcerowno` | 请检来源单据行号 | `sourcerowno` | String |
| 16 | `tenant` | 租户ID | `tenant_id` | String |
| 17 | `upstream_id` | 上游id | `upstream_id` | String |
| 18 | `vorderrowId` | 请检源头单据行id | `vorderrowId` | String |
| 19 | `vorderrowno` | 请检源头单据行号 | `vorderrowno` | String |
| 20 | `createDate` | 创建日期 | `create_date` | Date |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `creator` | 创建人名称 | `creator` | String |
| 23 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `dr` | 逻辑删除标记 | `dr` | Short |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `applycheckastnum` | 请检数量 | `applycheckastnum` | Decimal |
| 30 | `applychecknum` | 请检主数量 | `applychecknum` | Decimal |
| 31 | `definect_s` | 自定义项特征 | `definect_s` | 2c6c099f-d453-42ac-8822-bd17efe9da6b |
| 32 | `freect_s` | 源单信息自由项特征 | `freect_s` | be08ddcf-e75d-4b64-aadb-b50fc877c709 |
| 33 | `orderbilltype` | 请检源头单据类型 | `orderbilltype` | String |
| 34 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 35 | `sastunitid` | 单位 | `sastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 37 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 38 | `sunitid` | 主单位 | `sunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sunitid` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `sastunitid` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `freect_s` | 源单信息自由项特征 | `QMSDFM.dfmCheck.CheckSourceFree` | None |  |
| 4 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `definect_s` | 自定义项特征 | `QMSDFM.dfmCheck.CheckSourceDefine` | None |  |
| 9 | `pkDfmCheckRecord` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | None | true |
