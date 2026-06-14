---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BuyOfferVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价单 (`sourcing.ibuyoffer.BuyOfferVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringInquiry 模块实体元数据字典。
> 物理表：`ipu_quotation` | 所属应用：`ycSouringInquiry`
> 来源：元数据API `queryByUri` 返回的 `sourcing.ibuyoffer.BuyOfferVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价单 |
| 物理表 | `ipu_quotation` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 业务对象ID | `411130be-d87d-4ae3-9ec1-218747ac5e4c` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:43.9840` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 询价单ID |
| 编码 | `vbuyoffer_billcode` | `vbuyoffer_billcode` | String | 询价单号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-23 00:08:47:000
- **安装来源**: `/app/data_scripts/cpu-sourcing-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_sourcing/0010_iuap_common/DML/0270_iuap_metadata/202603312028_metadata_sourcing-ibuyoffer_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `de7626d8-72af-4677-b459-ce2983bf8aa2`

## 业务场景

- `DataAuth`
- `transtype`
- `dataPrivacy`
- `userdefine`
- `classified`
- `prewarning`
- `extdevelop`
- `print`
- `UITemplate`
- `imextmp`
- `report`
- `billcode`
- `ruleengine`
- `b-evidence`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `dataAuth`, `doc`, `isMasterOrg`

## 约束

- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 10 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 询价单接口 (`IBuyOffer`) | `buyoffer.itf.IBuyOffer` | 4058 | 171 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 5 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 6 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 7 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 8 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 9 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 10 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 213 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | 询价单ID | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 询价单号 | `vbuyoffer_billcode` | String | `text` |  | ✓ |
| 3 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` | ✓ |  |
| 4 | `subject` | 询价标题 | `subject` | String | `text` |  | ✓ |
| 5 | `puOrgDocName` | 询价执行组织 | `puorg_doc_name` | String | `text` |  | ✓ |
| 6 | `puOrgDocId` | 寻源执行组织id | `puorg_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 7 | `corpSubAccountName` | 采购员名称 | `corp_sub_account_name` | String | `text` |  | ✓ |
| 8 | `corpAccountDocName` | 采购部门名称(询价制单用户对应人员所在部门) | `corp_account_doc_name` | String | `text` |  | ✓ |
| 9 | `corpAccountDocId` | 采购部门id(询价制单用户对应人员所在部门) | `corp_account_doc_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 10 | `ctPurcontentType` | 采购内容 | `ct_purcontent_type` | String | `text` |  | ✓ |
| 11 | `memo` | 询价备注 | `memo` | String | `text` |  | ✓ |
| 12 | `qtexpiredate` | 报价截至时间 | `qtexpiredate` | DateTime | `timestamp` |  | ✓ |
| 13 | `quotationDays` | 报价天数 | `quotation_days` | Integer | `int` |  | ✓ |
| 14 | `creatorId` | 创建人id | `creatorId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 15 | `status` | 询价单审批状态 | `workflow_status` | Integer | `int` |  | ✓ |
| 16 | `buyofferStatus` | 询价单执行状态 | `status` | String | `text` |  | ✓ |
| 17 | `buyofferTime` | 询价单发布时间 | `buyoffer_time` | DateTime | `timestamp` |  | ✓ |
| 18 | `modifierId` | 修改人id | `modifierId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 19 | `currencyNameDiwork` | 询价币种名称 | `currency_name_diwork` | String | `text` |  | ✓ |
| 20 | `currencyCodeDiwork` | 询价币种编码 | `currency_code_diwork` | String | `text` |  | ✓ |
| 21 | `allowMultiDecide` | 是否允许多次定标 | `allow_multi_decide` | Boolean | `switch` |  | ✓ |
| 22 | `bSupplement` | 是否补录 | `b_supplement` | Boolean | `switch` |  | ✓ |
| 23 | `bAutoSavePd` | 补录完成自动下推定标单 | `b_auto_save_pd` | Boolean | `switch` |  | ✓ |
| 24 | `srcBusScene` | 源业务背景 | `src_bus_scene` | SrcBusSceneEnum | `` |  | ✓ |
| 25 | `srcQutoid` | 来源询价单主id | `src_qutoid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 | `quote` |  | ✓ |
| 26 | `firstQutoid` | 源头询价单主id | `first_qutoid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 | `quote` |  | ✓ |
| 27 | `priceRankingRule` | 报价排名规则 | `price_rank_rule` | String | `text` |  | ✓ |
| 28 | `sourcingSolution` | 寻源方案ID | `sourcing_solution` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 | `quote` |  | ✓ |
| 29 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 30 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer | `int` |  | ✓ |
| 31 | `checkPriceMemo` | 核价备注 | `check_price_memo` | String | `text` |  | ✓ |
| 32 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 33 | `invalidatereason` | 作废原因 | `invalidatereason` | String | `text` |  | ✓ |
| 34 | `submitterId` | 提交人id | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 35 | `invalidateperson` | 作废人 | `invalidateperson` | String | `text` |  | ✓ |
| 36 | `quotExchRateType` | 询价汇率类型id | `quot_exchRate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 37 | `submitTime` | 提交时间 | `submit_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `currencyIdDiwork` | 询价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 39 | `currencyTypeSignDiwork` | 询价币种符号 | `currency_type_sign_diwork` | String | `text` |  | ✓ |
| 40 | `rateTypeDiwork` | 汇率类型 | `rate_type_diwork` | String | `text` |  | ✓ |
| 41 | `transactionTypeName` | 交易类型名称 | `transaction_type_name` | String | `text` |  | ✓ |
| 42 | `openInquiryUserId` | 实际开启询价人id | `open_inquiry_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 43 | `transactionTypeId` | 询价单交易类型id | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 44 | `budgetMny` | 预算总额 | `budget_mny` | Decimal | `number` |  | ✓ |
| 45 | `publisherId` | 发布人id | `publisher` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 46 | `planTotalMny` | 计划总金额 | `plan_total_mny` | Decimal | `number` |  | ✓ |
| 47 | `isUrgent` | 计划是否加急标识 | `is_urgent` | String | `text` |  | ✓ |
| 48 | `archiveStatus` | 归档状态 | `archive_status` | String | `text` |  | ✓ |
| 49 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 50 | `publishTime` | 发布时间 | `publish_time` | DateTime | `timestamp` |  | ✓ |
| 51 | `auditId` | 审批人ID | `auditorId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 52 | `auditorId` | 审批人id | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 53 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 54 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 55 | `priceComplianceApproveStatus` | 价格合规审批状态 | `price_compliance_approve_status` | Integer | `int` |  | ✓ |
| 56 | `republicApproveStatus` | 重新询价审批状态 | `republic_approve_status` | Integer | `int` |  | ✓ |
| 57 | `bidLossApproveStatus` | 流标审批状态 | `bid_loss_approve_status` | Integer | `int` |  | ✓ |
| 58 | `gobackApproveStatus` | 询价撤回审批状态 | `goback_approve_status` | Integer | `int` |  | ✓ |
| 59 | `priceTemplateId` | 价格模板id | `price_template_id` | Long | `long` |  | ✓ |
| 60 | `priceTemplateName` | 价格模板名称 | `price_template_name` | String | `text` |  | ✓ |
| 61 | `dr` | 删除标识 | `dr` | Integer | `int` |  | ✓ |
| 62 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 63 | `priceStructure` | 价格构成 | `price_structure` | String | `singleOption` |  | ✓ |
| 64 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 65 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 66 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 67 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 68 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 69 | `republicStatus` | 是否启用重新询价审批 | `republic_status` | Integer | `int` |  | ✓ |
| 70 | `bidLossStatus` | 是否启用询价单流标审批 | `bid_loss_status` | Integer | `int` |  | ✓ |
| 71 | `gobackStatus` | 是否启用询价撤回审批 | `goback_status` | Integer | `int` |  | ✓ |
| 72 | `priceComplianceStatus` | 是否启用价格合规审批 | `price_compliance_status` | Integer | `int` |  | ✓ |
| 73 | `buyofferRound` | 询价轮次 | `buyoffer_round` | Integer | `int` |  | ✓ |
| 74 | `talksRound` | 谈判轮次 | `talks_round` | String | `text` |  | ✓ |
| 75 | `buyofferType` | 履行方式 | `buyoffer_type` | String | `text` |  | ✓ |
| 76 | `isCtrlOpen` | 是否控制开启 | `is_ctrl_open` | Boolean | `switch` |  | ✓ |
| 77 | `ctrlOpenTime` | 控制开启时间 | `ctrl_open_time` | DateTime | `timestamp` |  | ✓ |
| 78 | `ctrlOpenDays` | 控制开启天数 | `ctrl_open_days` | Integer | `int` |  | ✓ |
| 79 | `hasSuperviseDept` | 是否开启监督 | `has_supervise_dept` | Boolean | `switch` |  | ✓ |
| 80 | `supervisePsnName` | 监督人姓名 | `supervise_psn_name` | String | `text` |  | ✓ |
| 81 | `supervisePsnId` | 监督人员id | `supervise_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 82 | `needOpenSupplyNum` | 是否控制开标供应商 | `need_open_supply_num` | Boolean | `switch` |  | ✓ |
| 83 | `openSupplyNum` | 控制开标供应商的数量 | `open_supply_num` | Integer | `int` |  | ✓ |
| 84 | `priceModel` | 报价模式 | `price_model` | String | `text` |  | ✓ |
| 85 | `acceptanceDesc` | 承兑描述 | `acceptance_desc` | String | `text` |  | ✓ |
| 86 | `paymentDesc` | 账期描述 | `payment_desc` | String | `text` |  | ✓ |
| 87 | `canQuotatePart` | 是否允许部分报价 | `can_quotate_part` | Boolean | `switch` |  | ✓ |
| 88 | `limitPriceTimes` | 是否限制报价次数 | `limit_price_times` | Integer | `int` |  | ✓ |
| 89 | `needLimitPriceTimes` | 限制报价的次数 | `need_limit_price_times` | Boolean | `switch` |  | ✓ |
| 90 | `allowRisePrice` | 是否限制报价涨价 | `allow_rise_price` | Boolean | `switch` |  | ✓ |
| 91 | `limitTalkTimes` | 是否限制谈判次数 | `limit_talk_times` | Integer | `int` |  | ✓ |
| 92 | `showPriceRanking` | 是否提示报价排名 | `show_price_ranking` | Boolean | `switch` |  | ✓ |
| 93 | `needLimitTalkTimes` | 限制谈判的次数 | `need_limit_talk_times` | Boolean | `switch` |  | ✓ |
| 94 | `allowPartQuote` | 是否允许供应商部分报价 | `allow_part_quote` | Boolean | `switch` |  | ✓ |
| 95 | `diffQuotaUnit` | 是否指定特殊报价单位 | `diff_quota_unit` | Boolean | `switch` |  | ✓ |
| 96 | `currencyIsfixed` | 是否固定报价币种 | `currency_isfixed` | Integer | `int` |  | ✓ |
| 97 | `exactMatch` | 匹配供货目录策略 | `exact_match` | Integer | `int` |  | ✓ |
| 98 | `supplierCertif` | 三证合一或传统五证 | `supplier_certif` | String | `text` |  | ✓ |
| 99 | `quoteCertif` | 上传已盖章报价单 | `quote_certif` | String | `text` |  | ✓ |
| 100 | `supplierQualify` | 其他证件要求 | `supplier_qualify` | String | `text` |  | ✓ |
| 101 | `onOfflineType` | 在/离线状态 | `onoffline_type` | String | `text` |  | ✓ |
| 102 | `publicTypeInvite` | 询价形式(是否邀请指定供应商报价) | `public_type_invite` | Boolean | `switch` |  | ✓ |
| 103 | `publicTypeWide` | 询价方式(是否广泛征集供应商报价) | `public_type_wide` | Boolean | `switch` |  | ✓ |
| 104 | `pricePolicy` | 报价品范围策略 | `price_policy` | Integer | `int` |  | ✓ |
| 105 | `allowPriceFormal` | 允许将参考报价加入正式报价 | `allow_price_formal` | Boolean | `switch` |  | ✓ |
| 106 | `acceptReferPrice` | 是否接受平台参考报价 | `accept_refer_price` | Boolean | `switch` |  | ✓ |
| 107 | `contractVisibleLevel` | 可见等级 | `contract_visible_level` | String | `text` |  | ✓ |
| 108 | `contact` | 联系人 | `contact` | String | `text` |  | ✓ |
| 109 | `phone` | 联系电话 | `phone` | String | `text` |  | ✓ |
| 110 | `email` | 联系人邮件地址 | `email` | String | `text` |  | ✓ |
| 111 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 112 | `corpSubAccountUserId` | 询价单创建用户ID | `corp_sub_account_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 113 | `processor` | 处理人(无用) | `processor` | String | `text` |  | ✓ |
| 114 | `processTime` | 处理时间(无用) | `process_time` | DateTime | `timestamp` |  | ✓ |
| 115 | `openPsnId` | 开标操作员id | `open_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 116 | `openRoleId` | 开标操作员角色id | `open_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 117 | `openPsnRoleType` | 开标操作员类型(1.人员、2.角色) | `open_psn_role_type` | String | `text` |  | ✓ |
| 118 | `talksPsnId` | 谈判操作员ID | `talks_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 119 | `talksRoleId` | 谈判操作员角色ID | `talks_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 120 | `talksPsnRoleType` | 谈判操作员类型(1.人员、2.角色) | `talks_psn_role_type` | String | `text` |  | ✓ |
| 121 | `pdPsnId` | 定标操作员id | `pd_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 122 | `openPsnName` | 开标操作员名称 | `open_psn_name` | String | `text` |  | ✓ |
| 123 | `pdRoleId` | 定标操作角色id | `pd_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 124 | `pdPsnRoleType` | 定标操作员类型(1.人员、2.角色) | `pd_psn_role_type` | String | `text` |  | ✓ |
| 125 | `talksPsnName` | 谈判操作员名称 | `talks_psn_name` | String | `text` |  | ✓ |
| 126 | `orderPsnId` | 下单操作员id | `order_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 127 | `pdPsnName` | 定标操作员名称 | `pd_psn_name` | String | `text` |  | ✓ |
| 128 | `orderRoleId` | 下单操作角色id | `order_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 129 | `orderPsnName` | 下单操作员名称 | `order_psn_name` | String | `text` |  | ✓ |
| 130 | `createType` | 是否自制 | `create_type` | Integer | `int` |  | ✓ |
| 131 | `orderPsnRoleType` | 下单操作员类型(1.人员、2.角色) | `order_psn_role_type` | String | `text` |  | ✓ |
| 132 | `ytenant` | 询价单租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 133 | `canSeeQt` | 报价查看要求(是否报价截止时间到期后才能查看报价单) | `can_see_qt` | Boolean | `switch` |  | ✓ |
| 134 | `tenant` | 租户 | `tenant_id` | String | `text` |  | ✓ |
| 135 | `buyerTenant` | 租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 136 | `provinceName` | 收货地址-省名字 | `province_name` | String | `text` |  | ✓ |
| 137 | `openRoleName` | 开标操作员角色name | `open_role_name` | String | `text` |  | ✓ |
| 138 | `cityName` | 收货地址-市名字 | `city_name` | String | `text` |  | ✓ |
| 139 | `districtName` | 收货地址-地区名字 | `district_name` | String | `text` |  | ✓ |
| 140 | `provinceId` | 收货地址-省ID | `provinceId` | String | `text` |  | ✓ |
| 141 | `talksRoleName` | 谈判操作角色名称 | `talks_role_name` | String | `text` |  | ✓ |
| 142 | `cityId` | 收货地址-市ID | `cityId` | String | `text` |  | ✓ |
| 143 | `districtId` | 收货地址-地区ID | `districtId` | String | `text` |  | ✓ |
| 144 | `pdRoleName` | 定标操作角色名称 | `pd_role_name` | String | `text` |  | ✓ |
| 145 | `addressName` | 地址(文字) | `addressName` | String | `text` |  | ✓ |
| 146 | `priceTemplate` | 价格模板id | `priceTemplate` | bc9cbd3d-b435-4aeb-a382-a6ccc21ab89f | `quote` |  | ✓ |
| 147 | `receiveAddress` | 详细地址 | `receive_address` | String | `text` |  | ✓ |
| 148 | `payMethod` | 付款方式 | `pay_method` | String | `text` |  | ✓ |
| 149 | `orderRoleName` | 下单操作角色名称 | `order_role_name` | String | `text` |  | ✓ |
| 150 | `deliveryMethod` | 交货条件 | `delivery_method` | String | `text` |  | ✓ |
| 151 | `buyofferFile` | 附件文档 | `buyoffer_file` | String | `text` |  | ✓ |
| 152 | `buyofferInnerFile` | 内部附件 | `buyoffer_inner_file` | String | `text` |  | ✓ |
| 153 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 154 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 155 | `invalidatetime` | 作废时间 | `invalidatetime` | DateTime | `timestamp` |  | ✓ |
| 156 | `bidOpenTime` | 实际开标时间 | `bid_open_time` | DateTime | `timestamp` |  | ✓ |
| 157 | `decisionTime` | 实际定标时间 | `decision_time` | DateTime | `timestamp` |  | ✓ |
| 158 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 159 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 160 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 161 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 162 | `erpBillCode` | ERP来源单据号 | `erp_bill_code` | String | `text` |  | ✓ |
| 163 | `erpUserCode` | ERP采购员编码 | `erp_user_code` | String | `text` |  | ✓ |
| 164 | `transactionTypeCode` | 交易类型编码 | `transaction_type_code` | String | `text` |  | ✓ |
| 165 | `btax` | 是否含税 | `btax` | String | `text` |  | ✓ |
| 166 | `corpAccount` | 外系统组织or集团 | `corp_account` | String | `text` |  | ✓ |
| 167 | `updateTime` | 更新时间(不再用) | `update_time` | DateTime | `timestamp` |  | ✓ |
| 168 | `createPin` | 创建人(不再用) | `create_pin` | String | `text` |  | ✓ |
| 169 | `updatePin` | 更新人(不再用) | `update_pin` | String | `text` |  | ✓ |
| 170 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 171 | `description` | 描述(有可能是富文本形式) | `description` | String | `text` |  | ✓ |
| 172 | `prid` | 外部系统的prId | `prid` | 0dbcfc08-59dc-4d8e-8ad5-08af5e2055bf | `quote` |  | ✓ |
| 173 | `corpSubAccount` | 云采用户名称 | `corp_sub_account` | String | `text` |  | ✓ |
| 174 | `corpAccountid` | 外系统组织or集团ID(企业id) | `corp_accountid` | String | `text` |  | ✓ |
| 175 | `corpSubAccountid` | 采购员id | `corp_sub_accountid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 176 | `erpProductVersion` | ERP产品及版本 | `erp_product_version` | String | `text` |  | ✓ |
| 177 | `erpVender` | ERP产品供应商 | `erp_vender` | String | `text` |  | ✓ |
| 178 | `ecbillcode` | 电商询价单id | `ecbillcode` | String | `text` |  | ✓ |
| 179 | `noCommercialBribe` | 无商业贿赂证明 | `no_commercial_bribe` | String | `text` |  | ✓ |
| 180 | `quotateType` | 报价方式 | `quotate_type` | String | `text` |  | ✓ |
| 181 | `pricesource` | 询价平台范围 | `pricesource` | String | `text` |  | ✓ |
| 182 | `assignPsn` | 分配人 | `assign_psn` | String | `text` |  | ✓ |
| 183 | `assignDept` | 分配部门 | `assign_dept` | String | `text` |  | ✓ |
| 184 | `enterpriseId` | 租户id | `enterprise_id` | Long | `long` |  | ✓ |
| 185 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 186 | `sysVersion` | 系统版本 | `sys_version` | Integer | `int` |  | ✓ |
| 187 | `planMode` | 计划管理模式 | `plan_mode` | String | `text` |  | ✓ |
| 188 | `ecUserCode` | 电商用户编码 | `ec_user_code` | String | `text` |  | ✓ |
| 189 | `publictypemy` | 询价方式(发布到我的采购门户)(不用) | `publictypemy` | Boolean | `switch` |  | ✓ |
| 190 | `buyOfferVODefineCharacter` | 询价单主表自定义项 | `define_character_id` | 47762225-f081-4efa-94db-cdb280516cc0 | `UserDefine` |  | ✓ |
| 191 | `openPassword` | 开启密码 | `open_password` | String | `text` |  | ✓ |
| 192 | `hasEntryPrice` | 是否已经代录过报价 | `hasentry_price` | Boolean | `switch` |  | ✓ |
| 193 | `deprecatedChain` | 流标环节(null:定标,1:开标, 2: 撤回询价流标) | `deprecated_chain` | String | `text` |  | ✓ |
| 194 | `assignUserId` | 分配询价时的分配人用户id | `assign_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 195 | `publicFreeDef` | 自定义发布类型(1.发布到我的采购门户(仅供查看), 2. .. , 3. .. , ...)必须是数值类型,不能为0 | `public_free_def` | String | `text` |  | ✓ |
| 196 | `buyofferClassCode` | 询价单分类code | `buyoffer_class_code` | String | `text` |  | ✓ |
| 197 | `buyofferClassName` | 询价单分类name | `buyoffer_class_name` | String | `text` |  | ✓ |
| 198 | `transTypePk` | 交易类型编码(不用) | `trans_type_pk` | String | `text` |  | ✓ |
| 199 | `useDepartment` | 使用部门 | `use_department` | String | `text` |  | ✓ |
| 200 | `publicTypeArea` | 区域发布 | `public_type_area` | Boolean | `switch` |  | ✓ |
| 201 | `editStatus` | 驳回后编辑标记 | `edit_status` | String | `text` |  | ✓ |
| 202 | `attachNeedCtrl` | 对供应商报价要求上传附件的管控级别 | `attach_need_ctrl` | String | `text` |  | ✓ |
| 203 | `reqprojectpersonname` | 项目负责人 | `reqProjectPersonName` | String | `text` |  | ✓ |
| 204 | `warehouseid` | 仓库id | `wareHouseId` | Long | `long` |  | ✓ |
| 205 | `warehousename` | 仓库名称 | `wareHouseName` | String | `text` |  | ✓ |
| 206 | `warehousecode` | 仓库编码 | `wareHouseCode` | String | `text` |  | ✓ |
| 207 | `deadlineStrategy` | 截止时间生成策略 | `deadline_strategy` | Integer | `int` |  | ✓ |
| 208 | `detailEntityList` | 询价单物料子表 | `` | 82d935cb-9072-4a12-b50a-8c1950dfd402 | `` |  |  |
| 209 | `headfreedefines` | 询价单主表自由自定义项 | `` | 6a3f19c7-5335-4114-a080-6e8f34e64163 | `` |  |  |
| 210 | `relationshipList` | 邀请供应商可报物料关系子表 | `` | 6d10189e-59e4-4a30-b52a-801685909628 | `` |  |  |
| 211 | `superviseEntityList` | 询价单监督人子表 | `` | 82c4d623-677d-4aa3-ae69-0b4257dd2799 | `` |  |  |
| 212 | `supplementList` | 询价单补录子表 | `` | c8208aaf-770b-4f1d-b922-d5e816afd66c | `` |  |  |
| 213 | `supplyEntityList` | 询价单邀请供应商子表 | `` | 033bcf37-fae1-4380-9985-3e1bdc23eebb | `` |  |  |

---

## 关联属性（共 39 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `auditId` | 审批人ID | `cpu-privilege.user.MgrUser` | `auditorId` |  →  |  |  | Service |  |
| 2 | `supplementList` | 询价单补录子表 | `sourcing.ibuyoffer.SupplementQtOfferBodyVO` | `` | supplementList → offerId | 0..n | true | None |  |
| 3 | `talksRoleId` | 谈判操作员角色ID | `sys.auth.Role` | `talks_role_id` |  →  |  |  | Service |  |
| 4 | `relationshipList` | 邀请供应商可报物料关系子表 | `sourcing.ibuyoffer.SupplierProductRelationship` | `` | relationshipList → buyofferId | 0..n | true | None |  |
| 5 | `openInquiryUserId` | 实际开启询价人id | `base.user.BipUser` | `open_inquiry_user` |  →  |  |  | Service |  |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 7 | `creatorId` | 创建人id | `cpu-privilege.user.MgrUser` | `creatorId` |  →  |  |  | Service |  |
| 8 | `modifierId` | 修改人id | `cpu-privilege.user.MgrUser` | `modifierId` |  →  |  |  | Service |  |
| 9 | `pdPsnId` | 定标操作员id | `bd.staff.Staff` | `pd_psn_id` |  →  |  |  | Service |  |
| 10 | `openPsnId` | 开标操作员id | `bd.staff.Staff` | `open_psn_id` |  →  |  |  | Service |  |
| 11 | `sourcingSolution` | 寻源方案ID | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_solution` |  →  |  |  | Service |  |
| 12 | `publisherId` | 发布人id | `base.user.BipUser` | `publisher` |  →  |  |  | Service |  |
| 13 | `srcQutoid` | 来源询价单主id | `sourcing.ibuyoffer.BuyOfferVO` | `src_qutoid` |  →  |  |  | None |  |
| 14 | `supervisePsnId` | 监督人员id | `bd.staff.Staff` | `supervise_psn_id` |  →  |  |  | Service |  |
| 15 | `openRoleId` | 开标操作员角色id | `sys.auth.Role` | `open_role_id` |  →  |  |  | Service |  |
| 16 | `priceTemplate` | 价格模板id | `aa.pricestructuretemplate.PriceStructureTemplate` | `priceTemplate` |  →  |  |  | Service |  |
| 17 | `submitterId` | 提交人id | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 18 | `currencyIdDiwork` | 询价币种id | `bd.currencytenant.CurrencyTenantVO` | `currency_id_diwork` |  →  |  |  | Service |  |
| 19 | `quotExchRateType` | 询价汇率类型id | `bd.exchangeRate.ExchangeRateTypeVO` | `quot_exchRate_type` |  →  |  |  | Service |  |
| 20 | `orderPsnId` | 下单操作员id | `bd.staff.Staff` | `order_psn_id` |  →  |  |  | Service |  |
| 21 | `corpSubAccountid` | 采购员id | `bd.staff.Staff` | `corp_sub_accountid` |  →  |  |  | Service |  |
| 22 | `firstQutoid` | 源头询价单主id | `sourcing.ibuyoffer.BuyOfferVO` | `first_qutoid` |  →  |  |  | None |  |
| 23 | `corpSubAccountUserId` | 询价单创建用户ID | `bd.staff.Staff` | `corp_sub_account_user_id` |  →  |  |  | Service |  |
| 24 | `buyOfferVODefineCharacter` | 询价单主表自定义项 | `sourcing.ibuyoffer.BuyOfferDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 25 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 26 | `detailEntityList` | 询价单物料子表 | `sourcing.ibuyoffer.BuyOfferBodyVO` | `` | detailEntityList → quotationid | 1..n | true | None |  |
| 27 | `headfreedefines` | 询价单主表自由自定义项 | `sourcing.ibuyoffer.BuyOfferVOFreeDefine` | `` | headfreedefines → id | 1 | true | None | ⚠️ |
| 28 | `assignUserId` | 分配询价时的分配人用户id | `bd.staff.Staff` | `assign_user_id` |  →  |  |  | Service |  |
| 29 | `transactionTypeId` | 询价单交易类型id | `bd.bill.TransType` | `transaction_type_id` |  →  |  |  | Service |  |
| 30 | `ytenant` | 询价单租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 31 | `prid` | 外部系统的prId | `sourcing.entrust.CpuReqEntrust` | `prid` |  →  |  |  | None |  |
| 32 | `pdRoleId` | 定标操作角色id | `sys.auth.Role` | `pd_role_id` |  →  |  |  | Service |  |
| 33 | `corpAccountDocId` | 采购部门id(询价制单用户对应人员所在部门) | `bd.adminOrg.AdminOrgVO` | `corp_account_doc_id` |  →  |  |  | Service |  |
| 34 | `supplyEntityList` | 询价单邀请供应商子表 | `sourcing.ibuyoffer.BuyOfferInviteSupplierVO` | `` | supplyEntityList → buyofferId | 0..n | true | None |  |
| 35 | `orderRoleId` | 下单操作角色id | `sys.auth.Role` | `order_role_id` |  →  |  |  | Service |  |
| 36 | `auditorId` | 审批人id | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 37 | `superviseEntityList` | 询价单监督人子表 | `sourcing.ibuyoffer.BuyOfferSuperviseVO` | `` | superviseEntityList → quotationId | 0..n | true | None |  |
| 38 | `puOrgDocId` | 寻源执行组织id | `org.func.BaseOrg` | `puorg_doc_id` |  →  |  |  | Service |  |
| 39 | `talksPsnId` | 谈判操作员ID | `bd.staff.Staff` | `talks_psn_id` |  →  |  |  | Service |  |

### Composition（子表）

- **supplementList**: `supplementList` → `sourcing.ibuyoffer.SupplementQtOfferBodyVO` | 0..n
- **relationshipList**: `relationshipList` → `sourcing.ibuyoffer.SupplierProductRelationship` | 0..n
- **detailEntityList**: `detailEntityList` → `sourcing.ibuyoffer.BuyOfferBodyVO` | 1..n
- **headfreedefines**: `headfreedefines` → `sourcing.ibuyoffer.BuyOfferVOFreeDefine` | 1 ⚠️ 已废弃
- **supplyEntityList**: `supplyEntityList` → `sourcing.ibuyoffer.BuyOfferInviteSupplierVO` | 0..n
- **superviseEntityList**: `superviseEntityList` → `sourcing.ibuyoffer.BuyOfferSuperviseVO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `auditId` (审批人ID) | `cpu-privilege.user.MgrUser` | `auditorId` |
| `talksRoleId` (谈判操作员角色ID) | `sys.auth.Role` | `talks_role_id` |
| `openInquiryUserId` (实际开启询价人id) | `base.user.BipUser` | `open_inquiry_user` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `creatorId` (创建人id) | `cpu-privilege.user.MgrUser` | `creatorId` |
| `modifierId` (修改人id) | `cpu-privilege.user.MgrUser` | `modifierId` |
| `pdPsnId` (定标操作员id) | `bd.staff.Staff` | `pd_psn_id` |
| `openPsnId` (开标操作员id) | `bd.staff.Staff` | `open_psn_id` |
| `sourcingSolution` (寻源方案ID) | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_solution` |
| `publisherId` (发布人id) | `base.user.BipUser` | `publisher` |
| `supervisePsnId` (监督人员id) | `bd.staff.Staff` | `supervise_psn_id` |
| `openRoleId` (开标操作员角色id) | `sys.auth.Role` | `open_role_id` |
| `priceTemplate` (价格模板id) | `aa.pricestructuretemplate.PriceStructureTemplate` | `priceTemplate` |
| `submitterId` (提交人id) | `base.user.BipUser` | `submitter` |
| `currencyIdDiwork` (询价币种id) | `bd.currencytenant.CurrencyTenantVO` | `currency_id_diwork` |
| `quotExchRateType` (询价汇率类型id) | `bd.exchangeRate.ExchangeRateTypeVO` | `quot_exchRate_type` |
| `orderPsnId` (下单操作员id) | `bd.staff.Staff` | `order_psn_id` |
| `corpSubAccountid` (采购员id) | `bd.staff.Staff` | `corp_sub_accountid` |
| `corpSubAccountUserId` (询价单创建用户ID) | `bd.staff.Staff` | `corp_sub_account_user_id` |
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `assignUserId` (分配询价时的分配人用户id) | `bd.staff.Staff` | `assign_user_id` |
| `transactionTypeId` (询价单交易类型id) | `bd.bill.TransType` | `transaction_type_id` |
| `ytenant` (询价单租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `pdRoleId` (定标操作角色id) | `sys.auth.Role` | `pd_role_id` |
| `corpAccountDocId` (采购部门id(询价制单用户对应人员所在部门)) | `bd.adminOrg.AdminOrgVO` | `corp_account_doc_id` |
| `orderRoleId` (下单操作角色id) | `sys.auth.Role` | `order_role_id` |
| `auditorId` (审批人id) | `base.user.User` | `auditorId` |
| `puOrgDocId` (寻源执行组织id) | `org.func.BaseOrg` | `puorg_doc_id` |
| `talksPsnId` (谈判操作员ID) | `bd.staff.Staff` | `talks_psn_id` |
