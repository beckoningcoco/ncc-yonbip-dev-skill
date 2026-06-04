---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.calldocument.CallBidDocument"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购文件 (`lawbid.calldocument.CallBidDocument`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_call_bid_document`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购文件 |
| 物理表 | `cpu_call_bid_document` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:07.8840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:52:000

## 依赖接口（10个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 4 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 7 | 招标文件 | `calldocument.itf.ICallBidDocument` | 106 |
| 8 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 9 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |
| 10 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `callBidDocumentDefineCharacter` | 采购文件表头自定义项 | `define_character_id` | b40a7f24-6354-4f63-b1e6-908722258df0 |
| 2 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `createDate` | 创建日期 | `create_date` | Date |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `historyFlowKey` | 历史businessKey | `history_flow_key` | String |
| 8 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 9 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 10 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `returncount` | 退回次数 | `returncount` | Short |
| 16 | `verifystate` | 审批状态 | `verifystate` | Short |
| 17 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 18 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 19 | `flowSource` | 审批源 | `flow_source` | String |
| 20 | `id` | ID | `id` | Long |
| 21 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 22 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 23 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 24 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 26 | `lawbidProjectId` | 招标项目ID | `lawbid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 27 | `purOrgId` | 代理公司组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 28 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 29 | `bidDocSaleEnd` | 领取截止时间 | `bid_doc_sale_end` | DateTime |
| 30 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 31 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 34 | `fileCode` | 招标文件 | `file_code` | String |
| 35 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 36 | `auditDate` | 审批日期 | `audit_date` | Date |
| 37 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 38 | `auditor` | 审批人名称 | `auditor` | String |
| 39 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 40 | `callBidDocumentSectionList` | 采购文件标包信息 | `` | c5e9e2bd-4010-4ba3-9d39-10172dc5bf8f |
| 41 | `define` | 采购文件自由自定义项 | `` | aa1392b2-7170-45f4-9ba0-8d9f63747cdb |
| 42 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 代理公司组织id | `org.func.BaseOrg` | Service |  |
| 2 | `callBidDocumentSectionList` | 采购文件标包信息 | `lawbid.calldocument.CallBidDocumentSection` | None | true |
| 3 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 4 | `lawbidProjectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 5 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人ID | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 9 | `define` | 采购文件自由自定义项 | `lawbid.calldocument.CallBidDocumentFreedefine` | None | true |
| 10 | `callBidDocumentDefineCharacter` | 采购文件表头自定义项 | `lawbid.calldocument.CallBidDocumentDefineCharacter` | None |  |
| 11 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
