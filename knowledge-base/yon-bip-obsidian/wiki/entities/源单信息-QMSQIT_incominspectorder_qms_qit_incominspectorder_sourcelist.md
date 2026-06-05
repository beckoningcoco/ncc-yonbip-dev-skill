---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_sourcelist"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 源单信息 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_sourcelist`)

> QMSQIT | 物理表：`qms_qit_incom_sourcelist`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 源单信息 |
| 物理表 | `qms_qit_incom_sourcelist` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:40.0150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（85个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 5 | `qty` | 到货数量 | `qty` | Decimal |
| 6 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 7 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 8 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 9 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 10 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 11 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | a31c12c1-ce19-4cd9-bb25-6c47dda79123 |
| 12 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 13 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 14 | `source` | 上游单据类型 | `source` | String |
| 15 | `upcode` | 上游单据号 | `upcode` | String |
| 16 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 17 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 18 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 19 | `orderbilltype` | 请检源头单据类型 | `orderbilltype` | String |
| 20 | `vordercode` | 请检源头单据号 | `vordercode` | String |
| 21 | `vorderrowno` | 请检源头单据行号 | `vorderrowno` | String |
| 22 | `sourcebilltype` | 请检来源单据类型 | `sourcebilltype` | String |
| 23 | `vsourcecode` | 请检来源单据号 | `vsourcecode` | String |
| 24 | `sourcerowno` | 请检来源单据行号 | `sourcerowno` | String |
| 25 | `sunitid` | 主计量id | `sunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `applychecknum` | 请检数量 | `applychecknum` | Decimal |
| 27 | `busiDate` | 业务日期 | `busiDate` | DateTime |
| 28 | `sastunitid` | 单位id | `sastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 29 | `applycheckastnum` | 请检件数 | `applycheckastnum` | Decimal |
| 30 | `schangerate` | 换算率 | `schangerate` | String |
| 31 | `pk_orderbill` | 请检源头单据id | `pk_orderbill` | String |
| 32 | `pk_sourcebill` | 请检来源单据id | `pk_sourcebill` | String |
| 33 | `pk_sourcebill_b` | 请检来源单据行id | `pk_sourcebill_b` | String |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 37 | `batchNo` | 批次号 | `batchno` | String |
| 38 | `batchNoId` | 批次号id | `batchno_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 39 | `cargospaceId` | 货位id | `cargospace_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 40 | `define1` | 自定义项1 | `define1` | String |
| 41 | `define10` | 自定义项10 | `define10` | String |
| 42 | `define11` | 自定义项11 | `define11` | String |
| 43 | `define12` | 自定义项12 | `define12` | String |
| 44 | `define13` | 自定义项13 | `define13` | String |
| 45 | `define14` | 自定义项14 | `define14` | String |
| 46 | `define15` | 自定义项15 | `define15` | String |
| 47 | `define16` | 自定义项16 | `define16` | String |
| 48 | `define17` | 自定义项17 | `define17` | String |
| 49 | `define18` | 自定义项18 | `define18` | String |
| 50 | `define19` | 自定义项19 | `define19` | String |
| 51 | `define2` | 自定义项2 | `define2` | String |
| 52 | `define20` | 自定义项20 | `define20` | String |
| 53 | `define21` | 自定义项21 | `define21` | String |
| 54 | `define22` | 自定义项22 | `define22` | String |
| 55 | `define23` | 自定义项23 | `define23` | String |
| 56 | `define24` | 自定义项24 | `define24` | String |
| 57 | `define25` | 自定义项25 | `define25` | String |
| 58 | `define26` | 自定义项26 | `define26` | String |
| 59 | `define27` | 自定义项27 | `define27` | String |
| 60 | `define28` | 自定义项28 | `define28` | String |
| 61 | `define29` | 自定义项29 | `define29` | String |
| 62 | `define3` | 自定义项3 | `define3` | String |
| 63 | `define30` | 自定义项30 | `define30` | String |
| 64 | `define4` | 自定义项4 | `define4` | String |
| 65 | `define5` | 自定义项5 | `define5` | String |
| 66 | `define6` | 自定义项6 | `define6` | String |
| 67 | `define7` | 自定义项7 | `define7` | String |
| 68 | `define8` | 自定义项8 | `define8` | String |
| 69 | `define9` | 自定义项9 | `define9` | String |
| 70 | `freect_s` | 源单信息自由项特征组实体 | `freect_s` | 7bc1d517-14e4-4ec0-a8af-64853a731b80 |
| 71 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 72 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 73 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 74 | `prodDeptId` | 生产部门id | `product_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 75 | `produceDate` | 生产日期 | `produce_date` | Date |
| 76 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 77 | `projectId` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 78 | `qms_qit_incominspectorder_detailresultList` | 处理结果明细 | `` | 4a838116-dc2a-413e-9c87-23ff027cf053 |
| 79 | `reservedObj` | 跟踪线索 | `reserved_obj` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 80 | `stockStatusId` | 库存状态id | `stockstatus_id` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 81 | `validityDate` | 有效期至 | `validity_date` | Date |
| 82 | `wareHouseId` | 仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 83 | `warrantyDate` | 保质期 | `warranty_date` | Integer |
| 84 | `warrantyUnit` | 保质期单位 | `warranty_unit` | String |
| 85 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sunitid` | 主计量id | `pc.unit.Unit` | Service |  |
| 2 | `sastunitid` | 单位id | `pc.unit.Unit` | Service |  |
| 3 | `freect_s` | 源单信息自由项特征组实体 | `QMSQIT.incominspectorder.InComInspectSourceFree` | None |  |
| 4 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `reservedObj` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 9 | `prodDeptId` | 生产部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 10 | `cargospaceId` | 货位id | `aa.goodsposition.GoodsPosition` | Service |  |
| 11 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 12 | `defineCharacteristics` | 自定义项特征组 | `QMSQIT.incominspectorder.sourcelist_defineCharacter` | None |  |
| 13 | `qms_qit_incominspectorder_detailresultList` | 处理结果明细 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult` | None | true |
| 14 | `stockStatusId` | 库存状态id | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 15 | `wareHouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 16 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
| 17 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
