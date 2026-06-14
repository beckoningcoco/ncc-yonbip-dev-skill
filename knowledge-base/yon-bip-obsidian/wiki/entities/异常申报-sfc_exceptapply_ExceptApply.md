---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.exceptapply.ExceptApply"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常申报 (`sfc.exceptapply.ExceptApply`)

> IMPSFC | 物理表：`imp_sfc_except_apply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常申报 |
| 物理表 | `imp_sfc_except_apply` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:39.2780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 3 | `departmentId` | 申报部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 4 | `applyStaffId` | 申报人 | `apply_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 5 | `selfDefineCharacter` | 自定义项特征 | `self_define_character` | 0de58c2e-e1fa-4515-ac23-a3f4017a5e99 |
| 6 | `auditor` | 审批人名称 | `auditor` | String |
| 7 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 9 | `auditDate` | 审批日期 | `audit_date` | Date |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `barCode` | 条形码 | `bar_code` | String |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 14 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 15 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 16 | `verifystate` | 审批状态 | `verifystate` | Short |
| 17 | `returncount` | 退回次数 | `returncount` | Short |
| 18 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 19 | `tplid` | 模板id | `tplid` | Long |
| 20 | `status` | 单据状态 | `status` | Short |
| 21 | `code` | 编码 | `code` | String |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime |
| 23 | `createDate` | 创建日期 | `create_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `creator` | 创建人名称 | `creator` | String |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 31 | `id` | ID | `id` | Long |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `ExceptApplyDetailList` | 异常申报信息 | `` | 68557045-c908-47fc-8068-b2c7da6db48a |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 2 | `ExceptApplyDetailList` | 异常申报信息 | `sfc.exceptapply.ExceptApplyDetail` | None | true |
| 3 | `selfDefineCharacter` | 自定义项特征 | `sfc.exceptapply.ExceptApplySelfDefineCharacter` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `applyStaffId` | 申报人 | `bd.staff.Staff` | Service |  |
| 6 | `departmentId` | 申报部门 | `aa.baseorg.DeptMV` | Service |  |
| 7 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 11 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
