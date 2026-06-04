---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.bidnoticenew.CpuBidNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标公示主表 (`sourcing.bidnoticenew.CpuBidNotice`)

> ycSouringInquiry | 物理表：`cpu_bidnotice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标公示主表 |
| 物理表 | `cpu_bidnotice` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:22.6900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `code` | 询价单号 | `vbuyoffer_billcode` | String |
| 3 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `billstatus` | 单据状态 | `billstatus` | String |
| 5 | `noticefileId` | 附件 | `file_id` | String |
| 6 | `businessType` | 业务类型 | `business_type` | String |
| 7 | `noticetitle` | 公告标题 | `notice_title` | String |
| 8 | `publishChannel` | 公告渠道 | `publish_channel` | String |
| 9 | `noticeTemplateId` | 公告模板id | `noticetemplate_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 10 | `originalContent` | 公告模板 | `original_content` | String |
| 11 | `targetContent` | 公共模板内容 | `target_content` | String |
| 12 | `noticetemplateFileId` | 公告内容附件id | `noticetemplate_fileid` | String |
| 13 | `subject` | 单据标题 | `subject` | String |
| 14 | `toYuncai` | 发送到企业门户 | `to_yuncai` | Long |
| 15 | `pricedecisionId` | 定标单主表id | `pricedecision_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 16 | `buyofferId` | 询价单主表id | `buyoffer_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `dr` | 逻辑删除标志 | `dr` | Integer |
| 22 | `pubts` | 时间戳 | `ts` | DateTime |
| 23 | `creatorId` | 创建人id | `creator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 24 | `modifierId` | 修改人id | `modifier_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 26 | `verifystate` | 审批状态 | `verifystate` | Short |
| 27 | `returncount` | 退回次数 | `returncount` | Short |
| 28 | `purOrgId` | 采购组织id | `pur_OrgId` | 8006983d-d605-473b-b0c4-0e9469aaacff |
| 29 | `status` | 单据状态 | `workflow_status` | Integer |
| 30 | `cpuBidNoticeDefineCharacter` | 中标公示主表自定义项 | `define_character_id` | 44c2a7c5-4148-4551-84e9-d8a9a7de3cd9 |
| 31 | `isNew` | 是否新单据 | `is_new` | Integer |
| 32 | `publishId` | 创建人id | `publish_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 33 | `publishTime` | 修改时间 | `publish_time` | DateTime |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 36 | `auditor` | 审批人名称 | `auditor` | String |
| 37 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 38 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 39 | `auditDate` | 审批日期 | `audit_date` | Date |
| 40 | `createDate` | 创建日期 | `create_date` | Date |
| 41 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 42 | `bodys` | 中标公示子表 | `` | ca71ae8b-4206-49b7-ac50-b0f5594f4686 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `buyofferId` | 询价单主表id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 2 | `cpuBidNoticeDefineCharacter` | 中标公示主表自定义项 | `sourcing.bidnoticenew.CpuBidNoticeDefineCharacter` | None |  |
| 3 | `purOrgId` | 采购组织id | `bd.adminOrg.PurchaseOrgVO` | Service |  |
| 4 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 5 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人id | `bd.staff.Staff` | Service |  |
| 8 | `modifierId` | 修改人id | `bd.staff.Staff` | Service |  |
| 9 | `pricedecisionId` | 定标单主表id | `sourcing.pricedecision.PriceDecision` | None |  |
| 10 | `bodys` | 中标公示子表 | `sourcing.bidnoticenew.CpuBidNoticeBody` | None | true |
| 11 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 12 | `publishId` | 创建人id | `bd.staff.Staff` | Service |  |
