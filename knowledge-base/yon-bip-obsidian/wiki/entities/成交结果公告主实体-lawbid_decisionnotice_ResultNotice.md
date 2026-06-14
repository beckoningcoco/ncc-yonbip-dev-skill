---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionnotice.ResultNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果公告主实体 (`lawbid.decisionnotice.ResultNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_result_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果公告主实体 |
| 物理表 | `cpu_result_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:42.6900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 成交结果公告主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:27:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 成交结果公告主接口 | `lawdecision.itf.IResultNotice` | 160 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 6 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 7 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `ytenant` | 租户 | `ytenant_id` | String |
| 14 | `dsnPublish` | 是否发布 | `dsn_publish` | Integer |
| 15 | `id` | 成交结果公告主键 | `id` | Long |
| 16 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 17 | `cpuDecisionId` | 定标主键 | `cpu_decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 |
| 18 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 19 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 20 | `noticeStartDatetime` | 公示起始时间 | `notice_start_datetime` | DateTime |
| 21 | `noticeEndDatetime` | 公示截止时间 | `notice_end_datetime` | DateTime |
| 22 | `enclosure` | 公告附件 | `enclosure` | String |
| 23 | `noticeTemplateId` | 公告模板主键 | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 24 | `originalContent` | 来源公告内容 | `original_content` | String |
| 25 | `targetContent` | 目标公告内容 | `target_content` | String |
| 26 | `publishToMediaChannel` | 公告发布媒体 | `publish_to_media_channel` | String |
| 27 | `bidExceptionFormId` | 异常处理ID | `bid_exception_form_id` | Long |
| 28 | `channelList` | 成交结果公告外部发布渠道 | `` | 4a7a5ecb-8589-450e-8634-2f10aad5cfd9 |
| 29 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 30 | `noticeSuppliers` | 成交结果公告中标供应商 | `` | 7ab21ae0-8f00-4776-a322-e596f9b4fe01 |
| 31 | `pendingMessageId` | 消息ID | `pending_message_id` | Long |
| 32 | `preVersionId` | 前一版本ID | `pre_version_id` | Long |
| 33 | `publishDatetime` | 结果公告发布时间 | `publish_datetime` | DateTime |
| 34 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `resultNoticeType` | 结果公告类型 | `result_notice_type` | Integer |
| 36 | `returncount` | 退回次数 | `returncount` | Short |
| 37 | `verifystate` | 审批状态 | `verifystate` | Short |
| 38 | `versionNo` | 版本编号 | `version_no` | String |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | Service |  |
| 2 | `noticeSuppliers` | 成交结果公告中标供应商 | `lawbid.decisionnotice.ResultNoticeSupplier` | None | true |
| 3 | `channelList` | 成交结果公告外部发布渠道 | `lawbid.decisionnotice.ResultNoticeChannel` | None | true |
| 4 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `cpuDecisionId` | 定标主键 | `lawbid.decisionresult.CpuDecision` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `noticeTemplateId` | 公告模板主键 | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 10 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 11 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
