---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.exceptionapply.ExceptionApply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 异常处理申请单 (`lawbid.exceptionapply.ExceptionApply`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_exception_form`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常处理申请单 |
| 物理表 | `cpu_bid_exception_form` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:04.6740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `form_code` | String | 申请单号 |

## 部署信息

- 部署时间: 2026-05-22 23:54:44:000

## 依赖接口（11个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 异常处理申请单 | `exceptionapply.itf.IExceptionApply` | 10 |
| 2 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 租户接口 | `ucfbase.ucfbaseItf.ITenant` | 77 |
| 5 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 6 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 7 | 企业ID | `cpu-base.itf.IEnterprise` | 7 |
| 8 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 9 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 10 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 11 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（58个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 3 | `bidProjectId` | 采购项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 4 | `bidSectionId` | 标段 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 5 | `afterPurchaseModeId` | 变更采购方式 | `after_purchase_mode_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 6 | `exceptionDescribe` | 异常原因 | `exception_describe` | String |
| 7 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 8 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 9 | `verifystate` | 审批状态 | `verifystate` | Short |
| 10 | `returncount` | 退回次数 | `returncount` | Short |
| 11 | `beforePurchaseModeId` | 原采购方式 | `before_purchase_mode_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 12 | `code` | 申请单号 | `form_code` | String |
| 13 | `formName` | 申请单名称 | `form_name` | String |
| 14 | `startNodeCode` | 异常环节 | `start_node_code` | String |
| 15 | `startNodeName` | 发起节点名称 | `start_node_name` | String |
| 16 | `roundCode` | 处理方式 | `round_code` | String |
| 17 | `ruleCode` | 业务起点 | `rule_code` | String |
| 18 | `ifReleaseNotice` | 发布终止公告 | `if_release_notice` | Boolean |
| 19 | `exceptionReason` | 异常描述 | `exception_reason` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 20 | `reasonAttachFileId` | 原因附件 | `reason_attach_file_id` | String |
| 21 | `noticeDetail` | 公告内容 | `notice_detail` | String |
| 22 | `noticeAttachFileId` | 公告附件 | `notice_attach_File_id` | String |
| 23 | `auditDate` | 审批日期 | `audit_date` | Date |
| 24 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 25 | `auditor` | 审批人名称 | `auditor` | String |
| 26 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `bidDescribId` | 描述信息（废） | `bid_describe_id` | String |
| 28 | `bidProjectCode` | 采购项目编号(废) | `bid_project_code` | String |
| 29 | `bidProjectName` | 采购项目名称（废） | `bid_project_name` | String |
| 30 | `bidSectionCode` | 标段编号(废) | `bid_section_code` | String |
| 31 | `bidSectionName` | 标段名称（废） | `bid_section_name` | String |
| 32 | `bidSectionStatus` | 异常申请发起时标包状态 | `bid_section_status` | String |
| 33 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 34 | `changePurchaseCode` | 变更采购方式编码（废） | `change_purchase_code` | String |
| 35 | `changePurchaseName` | 变更采购方式名称（废） | `change_purchase_name` | String |
| 36 | `createDate` | 创建日期 | `create_date` | Date |
| 37 | `createTime` | 创建日期 | `create_time` | DateTime |
| 38 | `creator` | 创建人名称 | `creator` | String |
| 39 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 40 | `dataSourceBillNo` | 数据来源单据号 | `data_source_bill_no` | String |
| 41 | `dr` | 逻辑删除标记 | `dr` | Short |
| 42 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 43 | `exceptionApplyDefineCharacter` | 异常处理申请单自定义项特征 | `define_character_id` | ae80c244-4516-4825-bef4-cb24826e5853 |
| 44 | `flowSource` | 审批源 | `flow_source` | String |
| 45 | `modifier` | 修改人名称 | `modifier` | String |
| 46 | `modifierId` | 更新人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 48 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 49 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `purchaseCode` | 采购方式编码（废） | `purchase_code` | String |
| 52 | `purchaseName` | 采购方式名称（废） | `purchase_name` | String |
| 53 | `purchasedocFlowId` | 采购方式流程ID | `purchasedoc_flow_id` | 51b620f3-fd52-4dbf-a38c-d40c310796ec |
| 54 | `roundName` | 环节名称（废） | `round_name` | String |
| 55 | `ruleName` | 业务逻辑名称（废） | `rule_name` | String |
| 56 | `status` | 单据状态 | `status` | String |
| 57 | `tenant` | 租户ID | `tenant_id` | String |
| 58 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | Service |  |
| 2 | `afterPurchaseModeId` | 变更采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 更新人 | `base.user.User` | Service |  |
| 6 | `bidProjectId` | 采购项目 | `lawbid.project.LawbidProject` | None |  |
| 7 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 8 | `purchasedocFlowId` | 采购方式流程ID | `lawbid.purchasedoc.PurchaseDocFlow` | None |  |
| 9 | `beforePurchaseModeId` | 原采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 10 | `exceptionReason` | 异常描述 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 11 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `exceptionApplyDefineCharacter` | 异常处理申请单自定义项特征 | `lawbid.exceptionapply.ExceptionApplyDefineCharacter` | None |  |
| 13 | `bidSectionId` | 标段 | `lawbid.section.LawbidSection` | None |  |
