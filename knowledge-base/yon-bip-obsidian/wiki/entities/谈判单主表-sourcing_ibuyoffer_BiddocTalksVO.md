---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BiddocTalksVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判单主表 (`sourcing.ibuyoffer.BiddocTalksVO`)

> ycSouringInquiry | 物理表：`cpu_biddoc_talks`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判单主表 |
| 物理表 | `cpu_biddoc_talks` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:09.0430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 谈判单ID |

---

## 直接属性（66个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `currencyCodeDiwork` | 询价币种编码 | `currency_code_diwork` | String |
| 2 | `currencyNameDiwork` | 询价币种名称 | `currency_name_diwork` | String |
| 3 | `talksTitle` | 谈判标题 | `talks_title` | String |
| 4 | `talksStarttime` | 谈判开始时间 | `talks_starttime` | DateTime |
| 5 | `talksEndtime` | 谈判截至时间 | `talks_endtime` | DateTime |
| 6 | `needTalkOpen` | 是否控制开启谈判 | `need_talk_open` | Boolean |
| 7 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 8 | `creatorId` | 创建人id | `creatorId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `talkpublisherId` | 谈判发布人id | `talkpublisher` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 11 | `talkpublishTime` | 谈判发布时间 | `talkpublish_time` | DateTime |
| 12 | `opentalkerId` | 实际开启谈判人id | `opentalker` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `opentalkTime` | 实际开启谈判时间 | `opentalk_time` | DateTime |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `talkExchrateType` | 谈判汇率类型 | `talk_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 16 | `talkExchrateDate` | 谈判汇率日期 | `talk_exchrate_date` | Date |
| 17 | `puOrgDocId` | 采购组织id | `puorg_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 18 | `allowRisePrice` | 是否限制报价涨价 | `allow_rise_price` | Boolean |
| 19 | `needLimitPriceTimes` | 是否限制谈判报价次数 | `need_limit_price_times` | Boolean |
| 20 | `limitPriceTimes` | 限制谈判报价的次数 | `limit_price_times` | Integer |
| 21 | `showPriceRanking` | 谈判是否提示报价排名 | `show_price_ranking` | Boolean |
| 22 | `needLimitTalkTimes` | 是否限制谈判次数 | `need_limit_talk_times` | Boolean |
| 23 | `limitTalkTimes` | 限制谈判的次数 | `limit_talk_times` | Integer |
| 24 | `referencePriced` | 是否设置了参考价 | `reference_priced` | Boolean |
| 25 | `materialCheck` | 是否设置了参考价 | `material_check` | Boolean |
| 26 | `isSetprice` | 设定参考报价 | `is_setprice` | Integer |
| 27 | `priceModel` | 报价模式 | `price_model` | String |
| 28 | `acceptanceDesc` | 承兑描述 | `acceptance_desc` | String |
| 29 | `infoquote` | 谈判参考报价金额(含税) | `infoquote` | Decimal |
| 30 | `currencyIdDiwork` | 询价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 31 | `remarks` | 谈判备注 | `remarks` | String |
| 32 | `detailFile` | 谈判附件 | `detail_file` | String |
| 33 | `status` | 谈判单状态 | `status` | String |
| 34 | `round` | 谈判单轮次 | `round` | Integer |
| 35 | `biddocTalksVODefineCharacter` | 谈判表头自定义项特征 | `define_character_id` | e4278742-c1bf-462a-9b07-bd0f52f062a4 |
| 36 | `buyofferRound` | 询价轮次 | `buyoffer_round` | Integer |
| 37 | `creator` | 谈判人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 38 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 39 | `supervisePsnName` | 监督人员名称 | `supervise_psn_name` | String |
| 40 | `supervisePsnId` | 监督人员ID | `supervise_psn_id` | String |
| 41 | `talkOpened` | 是否已经谈判开启 | `talk_opened` | Boolean |
| 42 | `id` | 谈判单ID | `id` | Long |
| 43 | `projectId` | 询价单ID | `project_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 44 | `currencyId` | 币种id | `currency_id` | String |
| 45 | `currencyTypeSignDiwork` | BIP币种符号 | `currency_type_sign_diwork` | String |
| 46 | `currencycode` | 币种编码 | `currencycode` | String |
| 47 | `dr` | 逻辑删除标识 | `dr` | Boolean |
| 48 | `lastBuyofferRound` | 是否是最新一轮询价 | `last_buyoffer_round` | Boolean |
| 49 | `openPassword` | 开启密码 | `open_password` | String |
| 50 | `paymentDesc` | 账期描述 | `payment_desc` | String |
| 51 | `pubts` | 时间戳 | `pubts` | DateTime |
| 52 | `roundstatus` | 轮次状态 | `round_status` | String |
| 53 | `source` | 1:招投标,2:询报价 | `source` | Integer |
| 54 | `symbol` | 币种标识 | `symbol` | String |
| 55 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 56 | `talkScope` | 谈判物料范围(全部、部分) | `talk_scope` | String |
| 57 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 58 | `enterpriseId` | 企业ID | `enterprise_id` | Long |
| 59 | `currencyName` | 询价币种(旧) | `currency_name` | String |
| 60 | `bidType` | 招标类型 | `bid_type` | Integer |
| 61 | `biddocId` | 招标文件id | `biddoc_id` | Long |
| 62 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 63 | `headTalksFreeDefines` | 谈判单子表自由自定义项 | `` | 6bbd67aa-1d75-4363-8950-1f82e21a0798 |
| 64 | `talkMaterialList` | 谈判单物料子表 | `` | fb8745e8-aff7-44e9-9a95-6f6cd9f5c77c |
| 65 | `talkMaterialSupplyList` | 谈判物料与供应商关系表 | `` | e17d0baf-6666-453a-aac3-c261a0be409a |
| 66 | `talksSupplierList` | 谈判单供应商子表 | `` | ddbfa661-2285-4e0e-a737-7b786505aeeb |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 谈判人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `opentalkerId` | 实际开启谈判人id | `base.user.BipUser` | Service |  |
| 5 | `creatorId` | 创建人id | `cpu-privilege.user.MgrUser` | Service |  |
| 6 | `talkpublisherId` | 谈判发布人id | `base.user.BipUser` | Service |  |
| 7 | `talkMaterialSupplyList` | 谈判物料与供应商关系表 | `sourcing.ibuyoffer.TalkMaterialSupply` | None | true |
| 8 | `talksSupplierList` | 谈判单供应商子表 | `sourcing.ibuyoffer.BiddocTalkssupplierVO` | None | true |
| 9 | `talkMaterialList` | 谈判单物料子表 | `sourcing.ibuyoffer.BiddocMaterialVO` | None | true |
| 10 | `biddocTalksVODefineCharacter` | 谈判表头自定义项特征 | `sourcing.ibuyoffer.BiddocTalksDefineCharacter` | None |  |
| 11 | `puOrgDocId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 12 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `currencyIdDiwork` | 询价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 14 | `talkExchrateType` | 谈判汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 15 | `headTalksFreeDefines` | 谈判单子表自由自定义项 | `sourcing.ibuyoffer.BiddocTalksVOFreeDefine` | None | true |
| 16 | `projectId` | 询价单ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
