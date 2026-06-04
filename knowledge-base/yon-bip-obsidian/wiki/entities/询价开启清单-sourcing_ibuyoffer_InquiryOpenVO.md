---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.InquiryOpenVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价开启清单 (`sourcing.ibuyoffer.InquiryOpenVO`)

> ycSouringInquiry | 物理表：`ipu_quotation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价开启清单 |
| 物理表 | `ipu_quotation` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:15.2370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 | 询价开启清单ID |
| 编码 | `vbuyoffer_billcode` | String | 单据号 |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 询价开启清单ID | `id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 2 | `auditDate` | 审批日期 | `audit_date` | Date |
| 3 | `puOrgDocId` | 采购组织id | `puorg_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `code` | 单据号 | `vbuyoffer_billcode` | String |
| 5 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `status` | 单据状态 | `status` | Short |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 10 | `tenant` | 租户ID | `tenant_id` | String |
| 11 | `auditor` | 审批人名称 | `auditor` | String |
| 12 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 17 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 18 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `returncount` | 退回次数 | `returncount` | Short |
| 23 | `source` | 上游单据类型 | `source` | String |
| 24 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 25 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 26 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 27 | `upcode` | 上游单据号 | `upcode` | String |
| 28 | `verifystate` | 审批状态 | `verifystate` | Short |
| 29 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 30 | `priceMain` | 询价开启报价子表 | `` | f70b091f-0b67-4a95-9dda-ecdccace3269 |
| 31 | `superviseEntityList` | 询价开启清单监督人子表 | `` | 925bfc56-75b3-4854-a697-0fa776536402 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 3 | `superviseEntityList` | 询价开启清单监督人子表 | `sourcing.ibuyoffer.InquiryOpenSupervise` | None | true |
| 4 | `puOrgDocId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 7 | `priceMain` | 询价开启报价子表 | `sourcing.ibuyoffer.InquiryOpenQuotationOffer` | None | true |
| 8 | `id` | 询价开启清单ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 9 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
