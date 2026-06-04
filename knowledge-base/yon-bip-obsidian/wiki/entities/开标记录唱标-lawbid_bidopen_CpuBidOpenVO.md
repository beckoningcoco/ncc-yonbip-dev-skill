---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopen.CpuBidOpenVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标记录唱标 (`lawbid.bidopen.CpuBidOpenVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bidopen`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标记录唱标 |
| 物理表 | `cpu_bidopen` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:12.6170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `id` | id | `id` | Long |
| 5 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 6 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 8 | `bidProjectId` | 招标项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 9 | `bidProjectCode` | 招标项目编码 | `bid_project_code` | String |
| 10 | `bidProjectName` | 招标项目名称 | `bid_project_name` | String |
| 11 | `bidSectionId` | 标段(包)ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 12 | `bidSectionCode` | 标段(包)编码 | `bid_section_code` | String |
| 13 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 14 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 15 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 16 | `bidOpenPlaceType` | 开标方式 | `bid_open_place_type` | String |
| 17 | `bidOpenEndTime` | 开标结束时间 | `bid_open_end_time` | DateTime |
| 18 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 19 | `isPublishOpenResult` | 是否公示开标结果 | `is_publish_open_result` | Integer |
| 20 | `deadOpenResultDays` | 开标结果公示天数 | `dead_open_result_days` | Integer |
| 21 | `deadOpenResultTime` | 截止公示开标结果日期 | `dead_open_result_time` | DateTime |
| 22 | `openRound` | 当前开标轮次 | `open_round` | Integer |
| 23 | `openRoundStatus` | 当前是否为最新轮次开标 | `open_round_status` | Integer |
| 24 | `billStatus` | 单据状态 | `bill_status` | String |
| 25 | `file` | 附件 | `file` | String |
| 26 | `needSupConfirmResult` | 是否需要供应商确认开标结果 | `need_sup_confirm_result` | Integer |
| 27 | `involvedRoleType` | 单据状态 | `involved_role_type` | String |
| 28 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 29 | `bidOpenDecryptNotices` | 开标记录唱标 | `` | 286ee0ec-dba1-47ad-a481-0c2a127dd1bc |
| 30 | `bidOpenRateDocDetails` | 开标汇率子表 | `` | b5942ee7-17b1-4cae-9953-8c8be534af80 |
| 31 | `bidOpenSettings` | 开标设置表 | `` | f72fba5b-7d27-488f-a9b0-e3f823ffc1a9 |
| 32 | `bidOpenSuppliers` | 开标记录唱标 | `` | 3d7aee59-101a-4413-a958-b320a716fd18 |
| 33 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `bidOpenRateDocDetails` | 开标汇率子表 | `lawbid.bidopen.CpuBidOpenRateDocDetail` | None | true |
| 3 | `bidOpenDecryptNotices` | 开标记录唱标 | `lawbid.bidopen.CpuBidOpenDecryptNoticeVO` | None | true |
| 4 | `bidOpenSettings` | 开标设置表 | `lawbid.bidopen.CpuBidOpenSettingVO` | None | true |
| 5 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidProjectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 7 | `bidOpenSuppliers` | 开标记录唱标 | `lawbid.bidopen.CpuBidOpenSupplierVO` | None | true |
| 8 | `bidSectionId` | 标段(包)ID | `lawbid.section.LawbidSection` | None |  |
