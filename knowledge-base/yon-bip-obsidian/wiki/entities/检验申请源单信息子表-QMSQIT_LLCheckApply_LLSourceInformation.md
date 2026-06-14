---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.LLSourceInformation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验申请源单信息子表 (`QMSQIT.LLCheckApply.LLSourceInformation`)

> QMSQIT | 物理表：`qms_qit_llapply_source`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验申请源单信息子表 |
| 物理表 | `qms_qit_llapply_source` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:44.5330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（92个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `definect_source` | 源单信息自定义项特征 | `definect_source` | 59fe1eb5-6197-44a8-b73f-58e0e3038c64 |
| 5 | `vnote` | 备注 | `vnote` | String |
| 6 | `orderBillType` | 源头单据类型 | `orderBillType` | String |
| 7 | `qty` | 到货数量 | `qty` | Decimal |
| 8 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 9 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 10 | `product` | 物料 | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 12 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 13 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 14 | `orderbillNum` | 源头单据号 | `orderbillNum` | String |
| 15 | `orderbillIndex` | 源头单据行号 | `orderbillIndex` | String |
| 16 | `sourcebillTypeb` | 来源单据类型 | `sourcebillTypeb` | String |
| 17 | `sourcebillNumb` | 来源单据号 | `sourcebillNumb` | String |
| 18 | `sourcebillIndex` | 来源单据行号 | `sourcebillIndex` | String |
| 19 | `mainUnitb` | 主单位ID | `mainUnitb` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 20 | `checkmNumberb` | 请检数量 | `checkmNumberb` | Decimal |
| 21 | `businessDate` | 业务日期 | `businessDate` | DateTime |
| 22 | `checkNumberb` | 请检件数 | `checkNumberb` | Decimal |
| 23 | `parent_id` | 来料检验申请ID | `parent_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 24 | `dr` | 逻辑删除标记 | `dr` | Short |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `conversion` | 换算率 | `conversion` | String |
| 27 | `checkUnit` | 请检单位ID | `checkUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 28 | `arrivalId` | 到货单主表ID | `arrivalId` | String |
| 29 | `arrivalBId` | 到货单子表ID | `arrivalBId` | String |
| 30 | `upcode` | 上游单据号 | `upcode` | String |
| 31 | `source` | 上游单据类型 | `source` | String |
| 32 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 33 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 34 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 35 | `conversionType` | 换算率类型 | `conversionType` | Integer |
| 36 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 37 | `invaliddate` | 有效期至 | `invaliddate` | Date |
| 38 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 39 | `orderbill` | 订单单据ID | `orderbill` | String |
| 40 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 41 | `batchNo` | 批次号 | `batchno` | String |
| 42 | `batchNoId` | 批次号id | `batchno_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 43 | `cargospaceId` | 货位id | `cargospace_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 44 | `define1` | 自定义项1 | `define1` | String |
| 45 | `define10` | 自定义项10 | `define10` | String |
| 46 | `define11` | 自定义项11 | `define11` | String |
| 47 | `define12` | 自定义项12 | `define12` | String |
| 48 | `define13` | 自定义项13 | `define13` | String |
| 49 | `define14` | 自定义项14 | `define14` | String |
| 50 | `define15` | 自定义项15 | `define15` | String |
| 51 | `define16` | 自定义项16 | `define16` | String |
| 52 | `define17` | 自定义项17 | `define17` | String |
| 53 | `define18` | 自定义项18 | `define18` | String |
| 54 | `define19` | 自定义项19 | `define19` | String |
| 55 | `define2` | 自定义项2 | `define2` | String |
| 56 | `define20` | 自定义项20 | `define20` | String |
| 57 | `define21` | 自定义项21 | `define21` | String |
| 58 | `define22` | 自定义项22 | `define22` | String |
| 59 | `define23` | 自定义项23 | `define23` | String |
| 60 | `define24` | 自定义项24 | `define24` | String |
| 61 | `define25` | 自定义项25 | `define25` | String |
| 62 | `define26` | 自定义项26 | `define26` | String |
| 63 | `define27` | 自定义项27 | `define27` | String |
| 64 | `define28` | 自定义项28 | `define28` | String |
| 65 | `define29` | 自定义项29 | `define29` | String |
| 66 | `define3` | 自定义项3 | `define3` | String |
| 67 | `define30` | 自定义项30 | `define30` | String |
| 68 | `define4` | 自定义项4 | `define4` | String |
| 69 | `define5` | 自定义项5 | `define5` | String |
| 70 | `define6` | 自定义项6 | `define6` | String |
| 71 | `define7` | 自定义项7 | `define7` | String |
| 72 | `define8` | 自定义项8 | `define8` | String |
| 73 | `define9` | 自定义项9 | `define9` | String |
| 74 | `defines` | 源单信息子表自定义项 | `` | c6aec987-bf30-4785-b65c-2207c466734c |
| 75 | `freect_s` | 源单信息自由项特征组实体 | `freect_s` | 40ceb279-9495-4fd5-874b-c2ab83fe0f62 |
| 76 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 77 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 78 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 79 | `isGoodsPosition` | 是否货位管理 | `is_goods_position` | Integer |
| 80 | `isSnManage` | 序列号管理 | `is_sn_manage` | Integer |
| 81 | `lineNo` | 行号 | `line_no` | Decimal |
| 82 | `prodDeptId` | 生产部门id | `product_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 83 | `produceDate` | 生产日期 | `produce_date` | Date |
| 84 | `projectId` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 85 | `reservedObj` | 跟踪线索 | `reservedobj` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 86 | `snList` | 检验申请源单序列号 | `` | cf0a70dc-c707-4f36-8314-cc3342a9d160 |
| 87 | `stockStatusId` | 库存状态id | `stockstatus_id` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 88 | `validityDate` | 有效期至 | `validity_date` | Date |
| 89 | `wareHouseId` | 仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 90 | `warrantyDate` | 保质期 | `warranty_date` | Integer |
| 91 | `warrantyUnit` | 保质期单位 | `warranty_unit` | String |
| 92 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `product` | 物料 | `pc.product.Product` | Service |  |
| 2 | `freect_s` | 源单信息自由项特征组实体 | `QMSQIT.LLCheckApply.CheckApplySourceFree` | None |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `reservedObj` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 7 | `definect_source` | 源单信息自定义项特征 | `QMSQIT.LLCheckApply.LLSourceDefineeCharacter` | None |  |
| 8 | `prodDeptId` | 生产部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 9 | `checkUnit` | 请检单位ID | `pc.unit.Unit` | Service |  |
| 10 | `cargospaceId` | 货位id | `aa.goodsposition.GoodsPosition` | Service |  |
| 11 | `defines` | 源单信息子表自定义项 | `QMSQIT.LLCheckApply.LLSourceDefine` | None | true |
| 12 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 13 | `parent_id` | 来料检验申请ID | `QMSQIT.LLCheckApply.LLCheckApply` | None | true |
| 14 | `snList` | 检验申请源单序列号 | `QMSQIT.LLCheckApply.LLSourceInformationSn` | None | true |
| 15 | `stockStatusId` | 库存状态id | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 16 | `wareHouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 17 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 18 | `mainUnitb` | 主单位ID | `pc.unit.Unit` | Service |  |
