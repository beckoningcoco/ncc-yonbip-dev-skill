---
tags: ["BIP", "元数据", "数据字典", "PO", "po.orderchange.OrderChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单变更 (`po.orderchange.OrderChange`)

> PO | 物理表：`po_order_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单变更 |
| 物理表 | `po_order_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:05.9010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 变更单ID |

---

## 直接属性（85个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `defaultBomSelect` | 默认BOM选择 | `default_bom_select` | String |
| 2 | `isBOMMustInput` | BOM必输 | `is_bom_must_input` | Boolean |
| 3 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 4 | `defineDts` | 自定义项特征组 | `define_cts` | ebf6160d-bc32-47e0-9bcb-0aa559732b7b |
| 5 | `barCode` | 条形码 | `bar_code` | String |
| 6 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 7 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 8 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 11 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 12 | `entrustProcessType` | 受托加工业务 | `entrust_process_type` | Short |
| 13 | `printCount` | 打印次数 | `printCount` | Integer |
| 14 | `sourceType` | 来源上级单据类型 | `source_type` | String |
| 15 | `id` | 变更单ID | `id` | Long |
| 16 | `originalOrderId` | 原单ID | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 17 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 18 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 19 | `code` | 生产订单号 | `order_no` | String |
| 20 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 21 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 22 | `reasonMemo` | 变更原因 | `reason_memo` | String |
| 23 | `isVersions` | 是否最新版本 | `is_versions` | Boolean |
| 24 | `status` | 变更单状态 | `status` | Short |
| 25 | `remark` | 备注 | `remark` | String |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 28 | `verifystate` | 审批状态 | `verifystate` | Short |
| 29 | `returncount` | 退回次数 | `returncount` | Short |
| 30 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `creator` | 创建人 | `creator` | String |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `locker` | 锁定人 | `locker` | String |
| 34 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 35 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 36 | `modifier` | 修改人 | `modifier` | String |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 38 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 39 | `auditor` | 审核人 | `auditor` | String |
| 40 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 41 | `auditDate` | 审核日期 | `audit_date` | Date |
| 42 | `closer` | 关闭人 | `closer` | String |
| 43 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 44 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 45 | `isStd` | 快捷订单 | `is_std` | Boolean |
| 46 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 47 | `docSource` | 单据来源 | `doc_source` | String |
| 48 | `closeReasonId` | 关闭原因ID | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 49 | `billSource` | 生单来源 | `bill_source` | String |
| 50 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 51 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 52 | `tplid` | 模板id | `tplid` | Long |
| 53 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 54 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 55 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 56 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 57 | `createDate` | 创建日期 | `create_date` | Date |
| 58 | `completionInspection` | 完工齐套检查 | `completion_inspection` | Boolean |
| 59 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 60 | `bizType` | 业务类型 | `biz_type` | String |
| 61 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 62 | `changeFlag` | 变更标识 | `change_flag` | Integer |
| 63 | `accountingDate` | 记账日期 | `accounting_date` | String |
| 64 | `changeOrderType` | 变更类型 | `change_order_type` | String |
| 65 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 66 | `closeApplyCloseDate` | 申请关闭日期 | `close_apply_close_date` | Date |
| 67 | `closeApplyCloserId` | 申请关闭人ID | `close_apply_closer_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 68 | `exchangeStatus` | 交换状态 | `exchangeStatus` | Short |
| 69 | `externalSourceType` | 外部系统类型 | `external_source_type` | String |
| 70 | `failedInfo` | 失败信息 | `failedInfo` | String |
| 71 | `isBeginning` | 期初订单 | `is_beginning` | Integer |
| 72 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 73 | `level` | 层级 | `level` | Integer |
| 74 | `orderChangeAttrextItem` | 表头自由自定义项 | `` | da638f7c-50a1-4565-85c7-3efa91312df6 |
| 75 | `orderProductChange` | 订单产品变更表 | `` | fbe0dedd-7f73-4c6b-91f0-6cd861f75f4f |
| 76 | `orderUserdefItem` | 订单变更表头固定自定义项 | `` | dcd40bc4-25fd-4f58-abb0-d5816e5502ff |
| 77 | `parent` | 上级分类 | `parent_id` | Long |
| 78 | `path` | 路径 | `path` | String |
| 79 | `productionMode` | 生产模式 | `production_mode` | Integer |
| 80 | `sort` | 排序号 | `sort_num` | Integer |
| 81 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 82 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 83 | `tradeThrowVersion` | 多角贸易抛转版本信息 | `trade_throw_version` | Short |
| 84 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 85 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 6 | `closeApplyCloserId` | 申请关闭人ID | `base.user.User` | Service |  |
| 7 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 8 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 9 | `orderChangeAttrextItem` | 表头自由自定义项 | `po.orderchange.OrderChangeAttrextItem` | None | true |
| 10 | `originalOrderId` | 原单ID | `po.order.Order` | None |  |
| 11 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 12 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 13 | `orderProductChange` | 订单产品变更表 | `po.orderchange.OrderProductChange` | None | true |
| 14 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 17 | `defineDts` | 自定义项特征组 | `po.orderchange.OrderChangeDefineCharacteristics` | None |  |
| 18 | `closeReasonId` | 关闭原因ID | `aa.reason.Reason` | Service |  |
| 19 | `orderUserdefItem` | 订单变更表头固定自定义项 | `po.orderchange.OrderChangeDefine` | None | true |
