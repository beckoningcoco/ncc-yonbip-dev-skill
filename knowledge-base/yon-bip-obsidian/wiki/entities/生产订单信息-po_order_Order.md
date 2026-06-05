---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.Order"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单信息 (`po.order.Order`)

> PO | 物理表：`po_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单信息 |
| 物理表 | `po_order` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:21:22.0230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 生产订单号 |

---

## 直接属性（87个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 2 | `id` | ID | `id` | Long |
| 3 | `externalSourceType` | 外部系统类型 | `external_source_type` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `sourceType` | 来源上级单据类型 | `source_type` | String |
| 6 | `failedInfo` | 失败信息 | `failedInfo` | String |
| 7 | `printCount` | 打印次数 | `printCount` | Integer |
| 8 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 9 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 10 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 11 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `parent` | 上级分类 | `parent_id` | Long |
| 13 | `level` | 层级 | `level` | Integer |
| 14 | `path` | 路径 | `path` | String |
| 15 | `sort` | 排序号 | `sort_num` | Integer |
| 16 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 17 | `exchangeStatus` | 交换状态 | `exchangeStatus` | Short |
| 18 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 19 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 22 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 23 | `entrustProcessType` | 受托加工业务 | `entrust_process_type` | Short |
| 24 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 25 | `isBOMMustInput` | BOM必输 | `is_bom_must_input` | Boolean |
| 26 | `defaultBomSelect` | 默认BOM选择 | `default_bom_select` | String |
| 27 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 28 | `code` | 生产订单号 | `code` | String |
| 29 | `defineDts` | 自定义项特征组 | `define_cts` | cab67855-4e81-4fd3-ba40-418c8354df64 |
| 30 | `status` | 订单状态 | `status` | Short |
| 31 | `remark` | 备注 | `remark` | String |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 34 | `verifystate` | 审批状态 | `verifystate` | Short |
| 35 | `returncount` | 退回次数 | `returncount` | Short |
| 36 | `creator` | 创建人 | `creator` | String |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime |
| 38 | `locker` | 锁定人 | `locker` | String |
| 39 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 40 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 41 | `modifier` | 修改人 | `modifier` | String |
| 42 | `barCode` | 单据条码 | `bar_code` | String |
| 43 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 44 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 45 | `productionDepartmentId` | 生产部门Id | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 46 | `auditor` | 审核人 | `auditor` | String |
| 47 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 48 | `auditDate` | 审核日期 | `audit_date` | Date |
| 49 | `closer` | 关闭人 | `closer` | String |
| 50 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 51 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 52 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 53 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 54 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 55 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 56 | `isFlowCoreBill` | 是否核心单据 | `isFlowCoreBill` | Boolean |
| 57 | `completionInspection` | 齐套检查 | `completion_inspection` | Boolean |
| 58 | `isStd` | 快捷订单 | `is_std` | Boolean |
| 59 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 60 | `closeReasonId` | 关闭原因ID | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 61 | `docSource` | 单据来源 | `doc_source` | String |
| 62 | `billSource` | 生单来源 | `bill_source` | String |
| 63 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 64 | `tplid` | 模板id | `tplid` | Long |
| 65 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 66 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 67 | `financeCloseTime` | 财务关闭时间(作废) | `finance_close_time` | DateTime |
| 68 | `createDate` | 创建日期 | `create_date` | Date |
| 69 | `financeStatus` | 财务关闭(作废) | `finance_status` | Short |
| 70 | `bizType` | 业务类型 | `biz_type` | String |
| 71 | `changeFlag` | 变更标识 | `change_flag` | Integer |
| 72 | `accountingDate` | 记账日期 | `accounting_date` | String |
| 73 | `arrivePlan` | 到货计划 | `` | 0ded6928-4faa-46fc-9ff1-ee1a5d02f189 |
| 74 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 75 | `isBeginning` | 期初订单 | `is_beginning` | Integer |
| 76 | `orderAttrextItem` | 表头自由自定义项 | `` | df9aedad-fd78-49ab-88dc-bffef76af37e |
| 77 | `orderExpinfo` | 生产订单扩展信息 | `` | 2bf3855b-9273-4988-947f-4867e10b1966 |
| 78 | `orderHoldinfo` | 生产订单挂起信息 | `` | c97310d0-ab49-4412-a170-d3a14aa4b398 |
| 79 | `orderProduct` | 生产订单产品 | `` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 80 | `orderSubcontract` | 委外订单信息 | `` | 6b22debd-7902-4f3a-a7b6-c806b2f7e1d5 |
| 81 | `orderSubcontractConsult` | 委外协同信息 | `` | c49e19e4-d9f7-4def-85bd-368a1bda207c |
| 82 | `orderSubcontractlog` | 委外协同日志 | `` | 7a883f14-ba1e-4903-a8c1-b430a47b6b60 |
| 83 | `orderUserdefItem` | 表头固定自定义项 | `` | 5a4b9a90-125d-4895-a950-8b946221b2cb |
| 84 | `paymentExeDetail` | 付款执行明细 | `` | 446f3e8f-f404-458b-8f00-f701b59f384a |
| 85 | `paymentSchedules` | 付款计划表 | `` | f52b71be-3d21-46fa-adb2-e7ab3e66a060 |
| 86 | `productionMode` | 生产模式 | `production_mode` | Integer |
| 87 | `tradeThrowVersion` | 多角贸易抛转版本信息 | `trade_throw_version` | Short |

---

## 关联属性（25个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `orderHoldinfo` | 生产订单挂起信息 | `po.order.OrderHoldinfo` | None | true |
| 3 | `paymentSchedules` | 付款计划表 | `po.order.PaymentSchedules` | None | true |
| 4 | `paymentExeDetail` | 付款执行明细 | `po.order.PaymentExeDetail` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 8 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 9 | `orderSubcontractlog` | 委外协同日志 | `po.order.Subcontractlog` | None | true |
| 10 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 11 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `orderProduct` | 生产订单产品 | `po.order.OrderProduct` | None | true |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `orderExpinfo` | 生产订单扩展信息 | `po.order.OrderExpinfo` | None | true |
| 16 | `closeReasonId` | 关闭原因ID | `aa.reason.Reason` | Service |  |
| 17 | `defineDts` | 自定义项特征组 | `po.order.OrderDefineCharacteristics` | None |  |
| 18 | `orderSubcontractConsult` | 委外协同信息 | `po.order.SubcontractConsult` | None | true |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `orderSubcontract` | 委外订单信息 | `po.order.Subcontract` | None | true |
| 21 | `orderAttrextItem` | 表头自由自定义项 | `po.order.OrderAttrextItem` | None | true |
| 22 | `arrivePlan` | 到货计划 | `po.order.ArrivePlan` | None | true |
| 23 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 24 | `productionDepartmentId` | 生产部门Id | `aa.baseorg.DeptMV` | Service |  |
| 25 | `orderUserdefItem` | 表头固定自定义项 | `po.order.OrderUserdefItem` | None | true |
