---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.cpupdrevise.CpuPdrevise"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标变更单主表 (`sourcing.cpupdrevise.CpuPdrevise`)

> ycSouringInquiry | 物理表：`cpu_pdrevise`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标变更单主表 |
| 物理表 | `cpu_pdrevise` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:12.2320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 定标变更单主表ID |
| 编码 | `bill_code` | String | 变更单号 |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `puorgDocId` | 主组织id | `puorg_doc_id` | 8006983d-d605-473b-b0c4-0e9469aaacff |
| 2 | `code` | 变更单号 | `bill_code` | String |
| 3 | `creatorName` | 变更人 | `creator_name` | String |
| 4 | `createTime` | 变更时间 | `create_time` | DateTime |
| 5 | `changerId` | 处理人id | `changer_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `fileId` | 附件 | `file_id` | String |
| 7 | `reviseType` | 变更类型 | `revise_type` | String |
| 8 | `reviseStartor` | 变更发起方 | `revise_startor` | String |
| 9 | `reviseDutySide` | 变更责任方 | `revise_duty_side` | String |
| 10 | `reviseReason` | 变更理由 | `revise_reason` | String |
| 11 | `pdreviseStatus` | 定标变更单状态 | `status` | String |
| 12 | `cpuPdreviseDefineCharacter` | 定标变更单主表自定义项 | `define_character_id` | 73753c82-fc7b-4867-be04-e3b48977d1ef |
| 13 | `creatorId` | 创建人id | `creator_id` | Long |
| 14 | `creator` | 创建人 | `creator` | String |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 17 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifier` | 修改人 | `modifier` | String |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `commitorId` | 提交审批人id | `commitor_id` | Long |
| 22 | `commitorName` | 提交审批人 | `commitor_name` | String |
| 23 | `commitTime` | 提交审批时间 | `commit_time` | DateTime |
| 24 | `approverId` | 终审通过人id | `approver_id` | Long |
| 25 | `approverName` | 终审通过人 | `approver_name` | String |
| 26 | `approveTime` | 终审通过时间 | `approve_time` | DateTime |
| 27 | `returncount` | MDD云审退回次数 | `returncount` | Short |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `id` | 定标变更单主表ID | `id` | Long |
| 30 | `status` | 状态(无效) | `workflow_status` | Integer |
| 31 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 32 | `ts` | 时间戳 | `ts` | DateTime |
| 33 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 34 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 35 | `dr` | 逻辑删除标志 | `dr` | String |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime |
| 37 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 38 | `isWfControlled` | 云审开关 | `isWfControlled` | Boolean |
| 39 | `verifystate` | 云审状态码 | `verifystate` | Short |
| 40 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 41 | `auditDate` | 审批日期 | `audit_date` | Date |
| 42 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 43 | `auditor` | 审批人名称 | `auditor` | String |
| 44 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 45 | `bodys` | 定标变更单子表 | `` | 3ec5f7f3-ec1d-4add-8da5-1c4048fcdc82 |
| 46 | `define` | 定标变更单主表自由自定义项 | `` | ea8602ac-c701-4c7b-8c56-dfea76a3c634 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `changerId` | 处理人id | `bd.staff.Staff` | Service |  |
| 2 | `puorgDocId` | 主组织id | `bd.adminOrg.PurchaseOrgVO` | Service |  |
| 3 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 4 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | Service |  |
| 5 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 6 | `define` | 定标变更单主表自由自定义项 | `sourcing.cpupdrevise.CpuPdreviseFreeDefine` | None | true |
| 7 | `bodys` | 定标变更单子表 | `sourcing.cpupdrevise.CpuPdreviseDetail` | None | true |
| 8 | `cpuPdreviseDefineCharacter` | 定标变更单主表自定义项 | `sourcing.cpupdrevise.CpuPdreviseDefineCharacter` | None |  |
