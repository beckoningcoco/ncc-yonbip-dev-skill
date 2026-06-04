---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.biddocumentfile.CpuBidDocumentFile"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件归档 (`lawbid.biddocumentfile.CpuBidDocumentFile`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_document_file`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件归档 |
| 物理表 | `cpu_bid_document_file` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:54.4900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（8个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 5 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 6 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 7 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 8 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（63个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `code` | 编码 | `code` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `historyFlowKey` | 历史businessKey | `historyFlowKey` | String |
| 7 | `auditor` | 审批人名称 | `auditor` | String |
| 8 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 10 | `auditDate` | 审批日期 | `audit_date` | Date |
| 11 | `bidProjectId` | 招标方案 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 12 | `fileSort` | 文件分类 | `file_sort` | Short |
| 13 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 14 | `entrustlinkDepartmentId` | 委托单位联系人所属部门 | `entrust_link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 15 | `linkPersonId` | 采购组织联系人 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 16 | `linkDepartmentId` | 采购组织联系人所属部门 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 17 | `templateCode` | 归档模板编号 | `template_code` | String |
| 18 | `entrustOrgId` | 委托单位 | `entrust_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `entrustOrgPsnId` | 委托单位联系人 | `entrust_org_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `templateName` | 归档目录名称 | `template_name` | String |
| 21 | `dr` | 删除标志 | `dr` | Short |
| 22 | `flowSource` | 审批源 | `flow_source` | String |
| 23 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 24 | `modifier` | 修改人名称 | `modifier` | String |
| 25 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 28 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `purchaseId` | 采购方式主键 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 31 | `tenant` | 租户 | `tenant_id` | String |
| 32 | `ts` | 默认值 | `ts` | DateTime |
| 33 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 34 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `ytenantId` | 租户 | `ytenant_id` | String |
| 36 | `templateId` | 归档模板编号 | `template_id` | a38e5e29-f268-42a0-82cc-b02f7bbae455 |
| 37 | `bidProjectCode` | 项目编号 | `bid_project_code` | String |
| 38 | `bidProjectName` | 项目名称 | `bid_project_name` | String |
| 39 | `purOrgName` | 采购组织 | `pur_org_name` | String |
| 40 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 41 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 42 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 43 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 44 | `billStatus` | 状态 | `status` | String |
| 45 | `uapProjectName` | 工程项目 | `uap_project_name` | String |
| 46 | `isWfControlled` | 是否支持审批流 | `isWfControlled` | Boolean |
| 47 | `verifystate` | 审批状态 | `verifystate` | Short |
| 48 | `returncount` | 退回次数 | `returncount` | Short |
| 49 | `status` | 云审状态 | `workflow_status` | Integer |
| 50 | `documentStartRing` | 归档开始时间 | `document_start_ring` | String |
| 51 | `ifTemplate` | 是否为模板 | `if_template` | Short |
| 52 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 53 | `tenantId` | 租户 | `tenant_id` | String |
| 54 | `addDirectory` | 归档时允许补充目录 | `add_directory` | Short |
| 55 | `bidSectionId` | 标段包主键 | `bid_section_id` | Long |
| 56 | `id` | id | `id` | Long |
| 57 | `createTime` | 创建日期 | `create_time` | DateTime |
| 58 | `bidType` | 适用竞争方式 | `bid_type` | String |
| 59 | `archiveSource` | 归档数据来源 | `archive_source` | Short |
| 60 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 61 | `purOrgId` | 采购组织 | `pur_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 62 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 63 | `bidDocumentFileCategorys` | 文件归档子表 | `` | 7be1d6ea-5d90-409b-94bd-90983e9a9925 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `entrustlinkDepartmentId` | 委托单位联系人所属部门 | `org.func.BaseOrg` | Service |  |
| 2 | `purOrgId` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 3 | `entrustOrgId` | 委托单位 | `org.func.BaseOrg` | Service |  |
| 4 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 5 | `linkPersonId` | 采购组织联系人 | `bd.staff.Staff` | Service |  |
| 6 | `purchaseId` | 采购方式主键 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `linkDepartmentId` | 采购组织联系人所属部门 | `org.func.BaseOrg` | Service |  |
| 10 | `templateId` | 归档模板编号 | `lawbid.biddocument.BidDocument` | None |  |
| 11 | `bidProjectId` | 招标方案 | `lawbid.project.LawbidProject` | None |  |
| 12 | `entrustOrgPsnId` | 委托单位联系人 | `bd.staff.Staff` | Service |  |
| 13 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 14 | `bidDocumentFileCategorys` | 文件归档子表 | `lawbid.biddocumentfile.CpuBidDocumentFileCategory` | None | true |
