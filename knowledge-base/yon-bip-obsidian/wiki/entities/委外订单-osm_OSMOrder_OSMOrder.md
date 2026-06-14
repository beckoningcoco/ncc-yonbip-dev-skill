---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单 (`osm.OSMOrder.OSMOrder`)

> OSM | 物理表：`po_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单 |
| 物理表 | `po_order` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:40.6240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（83个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `defineDts` | 自定义项特征组 | `define_cts` | cab67855-4e81-4fd3-ba40-418c8354df64 |
| 2 | `printCount` | 打印次数 | `printCount` | Integer |
| 3 | `auditDate` | 审批日期 | `audit_date` | Date |
| 4 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 5 | `parent` | 上级分类 | `parent_id` | Long |
| 6 | `level` | 层级 | `level` | Integer |
| 7 | `path` | 路径 | `path` | String |
| 8 | `failedInfo` | 失败信息 | `failedInfo` | String |
| 9 | `isBeginning` | 期初订单 | `is_beginning` | Integer |
| 10 | `accountingDate` | 记账日期 | `accounting_date` | String |
| 11 | `tradeThrowVersion` | 多角贸易抛转版本信息 | `trade_throw_version` | Short |
| 12 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 13 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 14 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 15 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 16 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 17 | `exchangeStatus` | 交换状态 | `exchangeStatus` | Short |
| 18 | `sort` | 排序号 | `sort_num` | Integer |
| 19 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 20 | `externalSourceType` | 外部系统类型 | `external_source_type` | String |
| 21 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 22 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 25 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 26 | `entrustProcessType` | 受托加工业务 | `entrust_process_type` | Short |
| 27 | `auditor` | 审批人名称 | `auditor` | String |
| 28 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `barCode` | 单据条码 | `bar_code` | String |
| 30 | `billSource` | 生单来源 | `bill_source` | String |
| 31 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 32 | `bizType` | 业务类型 | `biz_type` | String |
| 33 | `changeFlag` | 变更标识 | `change_flag` | Integer |
| 34 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 35 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 36 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 37 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 38 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 39 | `closer` | 关闭人名称 | `closer` | String |
| 40 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 41 | `code` | 编码 | `code` | String |
| 42 | `completionInspection` | 完工齐套检查 | `completion_inspection` | Boolean |
| 43 | `createDate` | 创建日期 | `create_date` | Date |
| 44 | `createTime` | 创建时间 | `create_time` | DateTime |
| 45 | `creator` | 创建人名称 | `creator` | String |
| 46 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `defaultBomSelect` | 默认BOM选择 | `default_bom_select` | String |
| 48 | `docSource` | 单据来源 | `doc_source` | String |
| 49 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 50 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 51 | `id` | ID | `id` | Long |
| 52 | `isBOMMustInput` | BOM必输 | `is_bom_must_input` | Boolean |
| 53 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 54 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 55 | `isStd` | 是否快捷订单 | `is_std` | Boolean |
| 56 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 57 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 58 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 59 | `locker` | 锁定人 | `locker` | String |
| 60 | `modifier` | 修改人名称 | `modifier` | String |
| 61 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 62 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 63 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 64 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 65 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 66 | `pubts` | 时间戳 | `pubts` | DateTime |
| 67 | `remark` | 备注 | `remark` | String |
| 68 | `returncount` | 退回次数 | `returncount` | Short |
| 69 | `sourceType` | 来源上级单据类型 | `source_type` | String |
| 70 | `status` | 单据状态 | `status` | Short |
| 71 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 72 | `tplid` | 模板id | `tplid` | Long |
| 73 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 74 | `verifystate` | 审批状态 | `verifystate` | Short |
| 75 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 76 | `arrivePlan` | 委外到货安排 | `` | 0faf5b79-710a-4436-b70b-87efa7b5851e |
| 77 | `orderProduct` | 委外订单产品 | `` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 78 | `orderSubcontract` | 委外订单信息 | `` | ce298aa4-cb43-4d88-995b-0591c8f95ddd |
| 79 | `orderSubcontractConsult` | 委外协同信息 | `` | e8773c9e-1964-40e5-ad23-eb1ff696d725 |
| 80 | `orderSubcontractlog` | 委外协同日志 | `` | c3a71d4c-a092-4cfd-8041-5e3b84ee46e0 |
| 81 | `paymentExeDetail` | 付款执行明细 | `` | fc05e21c-76b5-41f6-b87f-d06ad11df66e |
| 82 | `paymentSchedules` | 付款计划表 | `` | 64adc14a-d97d-420e-8e08-da52d58279b3 |
| 83 | `productionMode` | 生产模式 | `production_mode` | Integer |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `paymentSchedules` | 付款计划表 | `osm.OSMOrder.OSMPaymentSchedules` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `paymentExeDetail` | 付款执行明细 | `osm.OSMOrder.OSMPaymentExeDetail` | None | true |
| 5 | `orderSubcontract` | 委外订单信息 | `osm.OSMOrder.OSMSubcontract` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 9 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 10 | `orderSubcontractlog` | 委外协同日志 | `osm.OSMOrder.OSMSubcontractlog` | None | true |
| 11 | `arrivePlan` | 委外到货安排 | `osm.OSMOrder.ArrivePlan` | None | true |
| 12 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 13 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 14 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 15 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 16 | `orderProduct` | 委外订单产品 | `osm.OSMOrder.OSMOrderProduct` | None | true |
| 17 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 20 | `defineDts` | 自定义项特征组 | `po.order.OrderDefineCharacteristics` | None |  |
| 21 | `orderSubcontractConsult` | 委外协同信息 | `osm.OSMOrder.OSMSubcontractConsult` | None | true |
