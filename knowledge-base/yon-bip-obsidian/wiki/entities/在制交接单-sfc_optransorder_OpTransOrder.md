---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.optransorder.OpTransOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 在制交接单 (`sfc.optransorder.OpTransOrder`)

> IMPSFC | 物理表：`imp_sfc_op_trans_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 在制交接单 |
| 物理表 | `imp_sfc_op_trans_order` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:00.5240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `selfDefineCharacter` | 在制交接单自定义项 | `self_define_character` | 21339f13-0ed1-4127-b547-e140ee2ad53b |
| 3 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 4 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 5 | `printCount` | 打印次数 | `printCount` | Integer |
| 6 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 7 | `tplid` | 模板id | `tplid` | Long |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | ID | `id` | Long |
| 10 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 11 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 12 | `transDate` | 交接日期 | `trans_date` | Date |
| 13 | `code` | 编码 | `code` | String |
| 14 | `transType` | 交接类型 | `trans_type` | Integer |
| 15 | `deliverId` | 转出人 | `deliver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 16 | `receiptId` | 接收人 | `receipt_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 17 | `status` | 单据状态 | `status` | Short |
| 18 | `memo` | 备注 | `memo` | String |
| 19 | `isTasktrans` | 按任务汇报交接 | `is_task_trans` | Integer |
| 20 | `dWorkCenterId` | 转出工作中心ID | `d_work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 21 | `rOrgId` | 转入组织 | `r_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 22 | `rWorkCenterId` | 转入工作中心ID | `r_work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 23 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `auditDate` | 审批日期 | `audit_date` | Date |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |
| 28 | `barCode` | 条形码 | `bar_code` | String |
| 29 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `creator` | 创建人名称 | `creator` | String |
| 31 | `createTime` | 创建时间 | `create_time` | DateTime |
| 32 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `modifier` | 修改人名称 | `modifier` | String |
| 34 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 35 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `auditor` | 审批人名称 | `auditor` | String |
| 37 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 38 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 39 | `opTransOrderDetail` | 在制交接单明细 | `` | 704a8821-4a20-44fb-98b2-5f9e5b9ceaaa |
| 40 | `opTransOrderExtItem` | 表头自由自定义项 | `` | 04155c45-2bd2-46b5-8e94-69985fc99b52 |
| 41 | `opTransOrderUserdefItem` | 表头固定自定义项 | `` | c711afc8-cfa3-4126-a8b8-765f3a0b0b08 |
| 42 | `returncount` | 退回次数 | `returncount` | Short |
| 43 | `verifystate` | 审批状态 | `verifystate` | Short |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `selfDefineCharacter` | 在制交接单自定义项 | `sfc.optransorder.OpTransOrderSelfDefineCharacter` | None |  |
| 2 | `opTransOrderExtItem` | 表头自由自定义项 | `sfc.optransorder.OpTransOrderExtItem` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `rWorkCenterId` | 转入工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 8 | `deliverId` | 转出人 | `bd.staff.Staff` | Service |  |
| 9 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `opTransOrderDetail` | 在制交接单明细 | `sfc.optransorder.OpTransOrderDetail` | None | true |
| 11 | `opTransOrderUserdefItem` | 表头固定自定义项 | `sfc.optransorder.OpTransOrderUserdefItem` | None | true |
| 12 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 13 | `dWorkCenterId` | 转出工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 14 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `rOrgId` | 转入组织 | `aa.baseorg.OrgMV` | Service |  |
| 16 | `receiptId` | 接收人 | `bd.staff.Staff` | Service |  |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
