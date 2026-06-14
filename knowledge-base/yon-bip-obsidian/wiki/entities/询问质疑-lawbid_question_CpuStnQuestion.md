---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.question.CpuStnQuestion"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询问质疑 (`lawbid.question.CpuStnQuestion`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_stn_question`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询问质疑 |
| 物理表 | `cpu_stn_question` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:11.2330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:32:000

## 依赖接口（8个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 5 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 6 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 7 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 8 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（57个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 4 | `ts` | 时间戳 | `ts` | DateTime |
| 5 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `status` | 云审状态 | `workflow_status` | Short |
| 8 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 9 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 10 | `flowSource` | 审批源 | `flow_source` | String |
| 11 | `cpuStnQuestionDefineCharacter` | 答疑澄清表头自定义项 | `define_character_id` | 17f6d99c-720d-4a06-84de-af625a6d7537 |
| 12 | `auditor` | 审批人 | `auditor` | String |
| 13 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `auditDate` | 审批日期 | `audit_date` | Date |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `ytenantId` | ytenantId | `ytenant_id` | String |
| 26 | `verifystate` | 审批状态 | `verifystate` | Short |
| 27 | `id` | id | `id` | Long |
| 28 | `enterpriseId` | 供应商的租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 29 | `returncount` | 退回次数 | `returncount` | Short |
| 30 | `orderNo` | 序号 | `order_no` | Integer |
| 31 | `picketageId` | 标段(包)id | `picketage_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 32 | `picketageCode` | 标段(包)编号 | `picketage_code` | String |
| 33 | `picketageName` | 标段(包)名称 | `picketage_name` | String |
| 34 | `questionerId` | 提问人 | `questioner_id` | Long |
| 35 | `questionerName` | 单位名称 | `questioner_name` | String |
| 36 | `purOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 37 | `linkman` | 联系人 | `linkman` | String |
| 38 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 39 | `linkmanmail` | 工作邮箱 | `linkmanMail` | String |
| 40 | `linkmantel` | 联系方式 | `linkmanTel` | String |
| 41 | `linkmanfax` | 传真 | `linkmanFax` | String |
| 42 | `questionTitle` | 问题标题 | `question_title` | String |
| 43 | `questionType` | 问题类型 | `question_type` | Integer |
| 44 | `questionText` | 问题内容 | `question_text` | String |
| 45 | `fileId` | 附件 | `file_id` | String |
| 46 | `questionDate` | 问题提出时间 | `question_date` | DateTime |
| 47 | `answerDate` | 回复时间 | `answer_date` | DateTime |
| 48 | `questionState` | 状态 | `question_state` | Integer |
| 49 | `replyPersonId` | 回复人 | `reply_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 50 | `replyPersonName` | 回复人名称 | `reply_person_name` | String |
| 51 | `replyText` | 内容 | `reply_text` | String |
| 52 | `publicState` | 公开发给所有潜在投标人 | `public_state` | Integer |
| 53 | `purEnterpriseId` | 采购商的租户id | `pur_enterprise_id` | Long |
| 54 | `billtype` | 类别 | `billtype` | Integer |
| 55 | `dataType` | 数据类型 0/1 | `data_type` | Integer |
| 56 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 57 | `documentId` | 附件 | `document_id` | String |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `cpuStnQuestionDefineCharacter` | 答疑澄清表头自定义项 | `lawbid.question.CpuStnQuestionDefineCharacter` | None |  |
| 7 | `enterpriseId` | 供应商的租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 8 | `picketageId` | 标段(包)id | `lawbid.section.LawbidSection` | None |  |
| 9 | `replyPersonId` | 回复人 | `bd.staff.Staff` | Service |  |
