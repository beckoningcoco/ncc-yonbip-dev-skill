---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuBidopen"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标单 (`sourcing.ibuyoffer.CpuBidopen`)

> ycSouringInquiry | 物理表：`cpu_bidopen`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标单 |
| 物理表 | `cpu_bidopen` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:18.2440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（60个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `projectId` | 立项主表ID | `project_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 3 | `bidfileCode` | 招标文件编号 | `bidfile_code` | String |
| 4 | `bidfileTitle` | 标题 | `bidfile_title` | String |
| 5 | `bidCompany` | 招标公司 | `bid_company` | String |
| 6 | `bidOpenTime` | 开启时间 | `bid_open_time` | DateTime |
| 7 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 8 | `pubts` | 时间戳 | `ts` | DateTime |
| 9 | `bidForm` | 开标形式 | `bid_form` | Integer |
| 10 | `bidSupervisedept` | 监督部门参与 | `bid_supervisedept` | Short |
| 11 | `bidMode` | 开标方式 | `bid_mode` | Long |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `updateTime` | 更新时间 | `update_time` | DateTime |
| 14 | `createPin` | 创建人 | `create_pin` | String |
| 15 | `updatePin` | 更新人 | `update_pin` | String |
| 16 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 17 | `bidCompanyName` | 招标公司名称 | `bid_company_name` | String |
| 18 | `supervisePsnId` | 监督人ID | `supervise_psn_id` | String |
| 19 | `supervisePsnName` | 监督人 | `supervise_psn_name` | String |
| 20 | `supervisePsnId2` | 监督人员2 | `supervise_psn_id2` | String |
| 21 | `supervisePsnName2` | 监督人员2 | `supervise_psn_name2` | String |
| 22 | `material` | 物料 | `material` | String |
| 23 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 24 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 25 | `supplierMinNum` | 最小投标企业数量 | `supplier_min_num` | Integer |
| 26 | `sourceType` | 0:招标文件1:询价单 | `source_type` | Integer |
| 27 | `currencyId` | 币种id(云采) | `currency_id` | String |
| 28 | `currencycode` | 币种code | `currencycode` | String |
| 29 | `symbol` | 币种符号 | `symbol` | String |
| 30 | `currencyName` | 币种名称 | `currency_name` | String |
| 31 | `priceModel` | 报价模式  1:现金 2: 现金+承兑 3:现金+账期 4:账期 | `price_model` | String |
| 32 | `acceptanceDesc` | 承兑描述 | `acceptance_desc` | String |
| 33 | `paymentDesc` | 账期描述 | `payment_desc` | String |
| 34 | `buyofferRound` | 谈判轮次 | `buyoffer_round` | Integer |
| 35 | `lastBuyofferRound` | 是否是最新一轮询价 | `last_buyoffer_round` | Short |
| 36 | `bidStartTime` | 投标开始时间 | `bid_start_time` | DateTime |
| 37 | `bidEndTime` | 投标截止时间 | `bid_end_time` | DateTime |
| 38 | `status` | 单据状态 | `status` | String |
| 39 | `furtureTemplate` | 确认是否启用期货报价模板  1表示使用期货报价模板  0表示用之前的报价 | `furture_template` | String |
| 40 | `offerType` | 期货报价模板下的报价方式  1实价 2 浮动金额  3 浮动比例 | `offer_type` | String |
| 41 | `payTypes` | 期货报价模板下的报价模式(1表示账期2表示金额预付3表示部分预付) | `pay_types` | String |
| 42 | `advanceRatio` | 选择报价模式下的部分预付,预付比例字段必填 | `advance_ratio` | Decimal |
| 43 | `itemName` | 项目名称 | `item_name` | String |
| 44 | `itemDetail` | 项目明细(富文本形式) | `item_detail` | String |
| 45 | `quotationType` | 报价类型(1表示总价报价2表示明细报价) | `quotation_type` | String |
| 46 | `projectdocId` | 项目档案id | `projectdoc_id` | String |
| 47 | `vbuyofferBillcode` | 询价单号 | `vbuyoffer_billcode` | String |
| 48 | `pubTotal` | 0标识不公开供应商投标总价;1标识公开 | `pub_total` | Integer |
| 49 | `pubFail` | 0标识不公开供应商淘汰理由;1标识公开 | `pub_fail` | Integer |
| 50 | `record` | 开标一览表富文本框内容url | `record` | String |
| 51 | `recordStatus` | 0标识未发布开标一览表;1标识已发布 | `record_status` | Integer |
| 52 | `bidType` | 招标类型 | `bid_type` | Integer |
| 53 | `currencyIdDiwork` | 询价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 54 | `currencyCodeDiwork` | 询价币种编码 | `currency_code_diwork` | String |
| 55 | `currencyNameDiwork` | 询价币种 | `currency_name_diwork` | String |
| 56 | `currencyTypeSignDiwork` | 询价币种符号 | `currency_type_sign_diwork` | String |
| 57 | `supplierbidType` | 费率招标标识 | `supplierbid_type` | String |
| 58 | `uapProjectdocId` | 平台项目档案id | `uap_projectdoc_Id` | String |
| 59 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 60 | `bidOpenSupplierDetails` | 开标单供应商 | `` | b13ddce4-4fa1-491a-80e4-438946115756 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidOpenSupplierDetails` | 开标单供应商 | `sourcing.ibuyoffer.CpuBidopenSupplier` | None | true |
| 2 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `currencyIdDiwork` | 询价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 4 | `projectId` | 立项主表ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
