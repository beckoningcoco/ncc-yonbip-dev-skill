---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisioncandidate.CpuBidPjtNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 公示表 (`lawbid.decisioncandidate.CpuBidPjtNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_pjt_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公示表 |
| 物理表 | `cpu_bid_pjt_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:10.3350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:58:16:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 公示表接口 | `lawdecision.itf.ICpuBidPjtNotice` | 269 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 企业ID | `cpu.itf.IEnterprise` | 6 |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidProjectCode` | 招标项目编码 | `bid_project_code` | String |
| 2 | `bidProjectName` | 招标项目名称 | `bid_project_name` | String |
| 3 | `billId` | 单据id | `bill_id` | 585541ea-ad90-4a33-a108-ebac173a8032 |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `changeNoticePassTime` | 变更公告发布 | `change_notice_pass_time` | DateTime |
| 6 | `consignorContactPersonId` | 委托方联系人ID | `consignor_contact_person_id` | String |
| 7 | `consignorContactPersonName` | 委托方联系人名称 | `consignor_contact_person_name` | String |
| 8 | `consignorEnterpriseId` | 委托方租户ID | `consignor_enterprise_id` | Long |
| 9 | `consignorEnterpriseName` | 委托方企业名称 | `consignor_enterprise_name` | String |
| 10 | `contentId` | 公告内容id | `content_id` | Long |
| 11 | `deadline` | 消息截止时间 | `deadline` | DateTime |
| 12 | `dr` | 删除标识 | `dr` | Short |
| 13 | `enterpriseId` | 企业租户ID | `enterprise_id` | Long |
| 14 | `id` | 主键 | `id` | Long |
| 15 | `international` | 是否国际标 | `international` | Integer |
| 16 | `noticeType` | 公告类型 | `notice_type` | String |
| 17 | `pmName` | 项目经理名称 | `pm_name` | String |
| 18 | `pmPersonId` | 项目经理ID | `pm_person_id` | String |
| 19 | `publishId` | 发布人id | `publish_id` | String |
| 20 | `publishName` | 发布人姓名 | `publish_name` | String |
| 21 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `purOrgId` | 招标公司id | `pur_org_id` | String |
| 24 | `purOrgName` | 招标公司名称 | `pur_org_name` | String |
| 25 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 26 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 27 | `status` | 公告状态 | `status` | String |
| 28 | `title` | 公告标题 | `title` | String |
| 29 | `transType` | 交易类型 | `trans_type` | String |
| 30 | `ts` | 时间戳 | `ts` | DateTime |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `billId` | 单据id | `lawbid.decisioncandidate.CpuCandidatePublicity` | None | true |
