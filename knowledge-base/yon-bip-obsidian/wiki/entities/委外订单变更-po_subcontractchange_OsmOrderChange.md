---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单变更 (`po.subcontractchange.OsmOrderChange`)

> OSM | 物理表：`osm_order_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单变更 |
| 物理表 | `osm_order_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:28.8060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（89个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `barCode` | 单据条码 | `bar_code` | String |
| 2 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 3 | `printCount` | 打印次数 | `printCount` | Integer |
| 4 | `sourceType` | 来源上级单据类型 | `source_type` | String |
| 5 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 6 | `closeApplyCloserId` | 申请关闭人ID | `close_apply_closer_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `closeApplyCloseDate` | 申请关闭日期 | `close_apply_close_date` | Date |
| 8 | `externalSourceType` | 外部系统类型 | `external_source_type` | String |
| 9 | `parent` | 上级分类 | `parent_id` | Long |
| 10 | `level` | 层级 | `level` | Integer |
| 11 | `path` | 路径 | `path` | String |
| 12 | `sort` | 排序号 | `sort_num` | Integer |
| 13 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 14 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 17 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 18 | `entrustProcessType` | 受托加工业务 | `entrust_process_type` | Short |
| 19 | `id` | id | `id` | Long |
| 20 | `originalOrderId` | 原单id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 21 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 22 | `reasonMemo` | 变更原因 | `reason_memo` | String |
| 23 | `isVersions` | 是否最新版本 | `is_versions` | Boolean |
| 24 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 25 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 26 | `isBOMMustInput` | BOM必输 | `is_bom_must_input` | Boolean |
| 27 | `defaultBomSelect` | 默认BOM选择 | `default_bom_select` | String |
| 28 | `defineDts` | 自定义项特征组 | `define_cts` | 8b6fdaa0-f3df-422f-ac9f-ada6db64e8d8 |
| 29 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 30 | `code` | 委外订单号 | `order_no` | String |
| 31 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 32 | `verifystate` | 审批状态 | `verifystate` | Short |
| 33 | `returncount` | 退回次数 | `returncount` | Short |
| 34 | `status` | 变更状态 | `status` | Short |
| 35 | `docSource` | 生单来源 | `doc_source` | String |
| 36 | `remark` | 备注 | `remark` | String |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `modifier` | 修改人 | `modifier` | String |
| 39 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 40 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 41 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 42 | `creator` | 创建人 | `creator` | String |
| 43 | `createTime` | 创建时间 | `create_time` | DateTime |
| 44 | `locker` | 锁定人 | `locker` | String |
| 45 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 46 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 47 | `auditor` | 审核人 | `auditor` | String |
| 48 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 49 | `auditDate` | 审核日期 | `audit_date` | Date |
| 50 | `closer` | 关闭人 | `closer` | String |
| 51 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 52 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 53 | `closeReasonId` | 关闭原因ID | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 54 | `tplid` | 模板id | `tplid` | Long |
| 55 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 56 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 57 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 58 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 59 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 60 | `bizType` | 业务类型 | `biz_type` | String |
| 61 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 62 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 63 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 64 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 65 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 66 | `billSource` | 生单来源 | `bill_source` | String |
| 67 | `createDate` | 创建日期 | `create_date` | Date |
| 68 | `isStd` | 是否快捷订单 | `is_std` | Boolean |
| 69 | `completionInspection` | 完工齐套检查 | `completion_inspection` | Boolean |
| 70 | `changeFlag` | 变更标识 | `change_flag` | Integer |
| 71 | `accountingDate` | 记账日期 | `accounting_date` | String |
| 72 | `arrivePlan` | 到货计划变更 | `` | 64fef5f2-fdb3-4e50-9945-dc9dee1a64bf |
| 73 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 74 | `exchangeStatus` | 交换状态 | `exchangeStatus` | Short |
| 75 | `failedInfo` | 失败信息 | `failedInfo` | String |
| 76 | `isBeginning` | 期初订单 | `is_beginning` | Integer |
| 77 | `orderAttrextItem` | 表头自由自定义项 | `` | 56d3a4db-b274-44a1-af17-514db8e53ccc |
| 78 | `orderProductChange` | 委外订单产品变更表 | `` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 79 | `orderSubcontract` | 委外订单委外信息变更 | `` | e72b2805-1cb6-4b4a-b6d1-5e62a8adef16 |
| 80 | `orderSubcontractConsult` | 委外订单委外协同信息变更 | `` | f0ef1403-326d-4093-9b8f-d81dd3430e5a |
| 81 | `orderUserdefItem` | 委外订单变更表头固定自定义项 | `` | 8d93e637-e5c7-4f4c-9f86-c89bc4648a34 |
| 82 | `paymentExeDetailChange` | 付款执行明细变更表 | `` | 8d4cdd06-b1ea-4d0d-ab76-a2704c9f9b77 |
| 83 | `paymentSchedulesChange` | 付款计划变更表 | `` | b676d25d-ce5f-4b25-a962-f0ae793fcb31 |
| 84 | `productionMode` | 生产模式 | `production_mode` | Integer |
| 85 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 86 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 87 | `tradeThrowVersion` | 多角贸易抛转版本信息 | `trade_throw_version` | Short |
| 88 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 89 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `paymentSchedulesChange` | 付款计划变更表 | `po.subcontractchange.PaymentSchedulesChange` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `paymentExeDetailChange` | 付款执行明细变更表 | `po.subcontractchange.PaymentExeDetailChange` | None | true |
| 5 | `orderSubcontract` | 委外订单委外信息变更 | `po.subcontractchange.OsmSubcontractChange` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 9 | `closeApplyCloserId` | 申请关闭人ID | `base.user.User` | Service |  |
| 10 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 11 | `orderAttrextItem` | 表头自由自定义项 | `po.subcontractchange.OsmOrderChangeAttrextItem` | None | true |
| 12 | `arrivePlan` | 到货计划变更 | `po.subcontractchange.ArrivePlanChange` | None | true |
| 13 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 14 | `originalOrderId` | 原单id | `po.order.Order` | None |  |
| 15 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 16 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 17 | `orderProductChange` | 委外订单产品变更表 | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 18 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 19 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 20 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 21 | `defineDts` | 自定义项特征组 | `po.subcontractchange.OsmOrderChangeDefineCharacteristics` | None |  |
| 22 | `closeReasonId` | 关闭原因ID | `aa.reason.Reason` | Service |  |
| 23 | `orderSubcontractConsult` | 委外订单委外协同信息变更 | `po.subcontractchange.OsmSubcontractConsultChange` | None | true |
| 24 | `orderUserdefItem` | 委外订单变更表头固定自定义项 | `po.subcontractchange.OsmOrderChangeDefine` | None | true |
