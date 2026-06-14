---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuPriceQuotationOffer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价单主表 (`sourcing.ibuyoffer.CpuPriceQuotationOffer`)

> ycSouringInquiry | 物理表：`cpu_qtoffer`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价单主表 |
| 物理表 | `cpu_qtoffer` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:10.7980` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 报价单ID |

---

## 直接属性（166个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 报价单ID | `id` | Long |
| 2 | `offerId` | 询价单ID | `offer_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 3 | `transactionTypeCode` | 报价单交易类型编码 | `transaction_type_code` | String |
| 4 | `transactionTypeId` | 报价单交易类型ID | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `transactionTypeName` | 报价单交易类型名称 | `transaction_type_name` | String |
| 6 | `qoDefineCharacter` | 报价单主表自定义项 | `define_character_id` | 4dfc32f7-12ea-4b9e-acee-eb62cb43632c |
| 7 | `transTypePk` | 交易类型编码 | `trans_type_pk` | String |
| 8 | `purcorpName` | 采购企业名称 | `purcorp_name` | String |
| 9 | `vbuyofferBillcode` | 询价单号 | `vbuyoffer_billcode` | String |
| 10 | `subject` | 询价标题 | `subject` | String |
| 11 | `currencyIdDiwork` | 询价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 12 | `decideRow` | 中标行数 | `decide_row` | Integer |
| 13 | `currencyNameDiwork` | BIP币种名称 | `currency_name_diwork` | String |
| 14 | `currencyTypeSignDiwork` | BIP币种符号 | `currency_type_sign_diwork` | String |
| 15 | `qtCurrencyNameDiwork` | 报价币种名称 | `qt_currency_name_diwork` | String |
| 16 | `purorgName` | 采购组织名称 | `purorg_name` | String |
| 17 | `priceRankingRule` | 报价排名规则 | `price_rank_rule` | String |
| 18 | `exchRateOps` | 汇率折算方式 | `exchRateOps` | ExchangeRateMethod |
| 19 | `ipAddress` | 报价人ip对应的地址 | `ip_address` | String |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 22 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 23 | `qtCurrencyTypeSignDiwork` | 报价币种符号 | `qt_currency_type_sign_diwork` | String |
| 24 | `currencyCodeDiwork` | BIP币种编码 | `currency_code_diwork` | String |
| 25 | `qtofferRow` | 报价行数 | `qtoffer_row` | Integer |
| 26 | `qtCurrencyCodeDiwork` | 报价币种编码 | `qt_currency_code_diwork` | String |
| 27 | `abandonOfferReason` | 放弃报价理由 | `abandon_offer_reason` | String |
| 28 | `qtexpiredate` | 报价截止时间 | `qtexpiredate` | DateTime |
| 29 | `purchaser` | 采购商联系人 | `purchaser` | String |
| 30 | `purchaserPhone` | 采购商联系电话 | `purchaser_phone` | String |
| 31 | `priceTemplateName` | 价格模板名称 | `price_template_name` | String |
| 32 | `priceTemplateId` | 价格模板ID | `price_template_id` | Long |
| 33 | `allowRisePrice` | 是否允许涨价 | `allow_rise_price` | Boolean |
| 34 | `needLimitPriceTimes` | 是否限制报价次数 | `need_limit_price_times` | Boolean |
| 35 | `limitPriceTimes` | 报价限制的次数 | `limit_price_times` | Integer |
| 36 | `priceTimes` | 已经报价次数 | `price_times` | Integer |
| 37 | `allowPartQuote` | 允许供应商部分报价 | `allow_part_quote` | Boolean |
| 38 | `lastBuyofferRound` | 是否是最新一轮询价 | `last_buyoffer_round` | Boolean |
| 39 | `latestTalks` | 是否最新谈判轮次 | `latest_talks` | Boolean |
| 40 | `talksRound` | 谈判轮次 | `talks_round` | String |
| 41 | `priceModel` | 报价模式 | `price_model` | String |
| 42 | `buyofferType` | 履行方式 | `buyoffer_type` | String |
| 43 | `suggestPrice` | 谈判参考价格 | `suggest_price` | Decimal |
| 44 | `talkRemark` | 谈判备注 | `talk_remark` | String |
| 45 | `puraddress` | 收货地址 | `puraddress` | String |
| 46 | `provinceid` | 收货地址-省ID | `provinceId` | String |
| 47 | `cityid` | 收货地址-市ID | `cityId` | String |
| 48 | `offerReferExchRate` | 报价参考汇率 | `offer_refer_exchRate` | Decimal |
| 49 | `districtid` | 收货地址-区ID | `districtId` | String |
| 50 | `paymentmode` | 付款方式 | `paymentmode` | String |
| 51 | `deliverterm` | 交货条件 | `deliverterm` | String |
| 52 | `offerReleaseTime` | 询价单发布时间 | `offer_release_time` | DateTime |
| 53 | `supplierQualify` | 对供应商要求 | `supplier_qualify` | String |
| 54 | `supplierCertif` | 对供应商证件要求 | `supplier_certif` | String |
| 55 | `publicType` | 询价方式(公开广泛寻源/邀请寻源,0-公开 1-邀请) | `public_type` | String |
| 56 | `supplierDocName` | 报价企业 | `supplier_doc_name` | String |
| 57 | `suppliername` | 报价人 | `suppliername` | String |
| 58 | `supplyPhone` | 报价人联系电话 | `supply_phone` | String |
| 59 | `createtime` | 报价时间 | `createtime` | DateTime |
| 60 | `ip` | 报价IP地址 | `ip` | String |
| 61 | `qtCurrencyIdDiwork` | 报价币种ID | `qt_currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 62 | `expireDate` | 报价有效期 | `expire_date` | DateTime |
| 63 | `diffQuotaUnit` | 是否指定特殊报价单位 | `diff_quota_unit` | Boolean |
| 64 | `isReplace` | 报价来源 | `is_replace` | Boolean |
| 65 | `pubts` | 报价时间 | `pubts` | DateTime |
| 66 | `billstatus` | (废弃) | `billstatus` | String |
| 67 | `currencyName` | 询价币种名称 | `currency_name` | String |
| 68 | `dr` | 删除标志 | `dr` | Short |
| 69 | `freight` | (废弃) | `freight` | Decimal |
| 70 | `invoicetype` | 税务发票信息(非mdd) | `invoicetype` | String |
| 71 | `hasPriceInvoice` | 是否提供发票 | `has_price_invoice` | Boolean |
| 72 | `priceInvoiceType` | 发票类型 | `price_invoice_type` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b |
| 73 | `totalmny` | 报价含税总额(现金) | `totalmny` | Decimal |
| 74 | `noTaxTotalmny` | 报价无税总额(现金) | `no_tax_totalmny` | Decimal |
| 75 | `acceptanceTotalMny` | 报价含税总额(承兑) | `acceptance_total_mny` | Decimal |
| 76 | `noTaxAccTotalMny` | 报价无税总额(承兑) | `no_tax_acc_total_mny` | Decimal |
| 77 | `paymentTotalMny` | 报价含税总额(账期) | `payment_total_mny` | Decimal |
| 78 | `supplierid` | 供应商memberId | `supplierid` | Long |
| 79 | `noTaxPayTotalMny` | 报价无税总额(账期) | `no_tax_pay_total_mny` | Decimal |
| 80 | `priceRanking` | 现金含税报价排名 | `price_ranking` | Integer |
| 81 | `showPriceRanking` | 是否提示报价排名 | `show_price_ranking` | Boolean |
| 82 | `noTaxPriceRanking` | 现金无税报价排名 | `no_tax_price_ranking` | Integer |
| 83 | `paymentPriceRanking` | 账期含税报价排名 | `payment_price_ranking` | Integer |
| 84 | `noTaxPaymentPriceRanking` | 账期无税报价排名 | `no_tax_payment_price_ranking` | Integer |
| 85 | `acceptancePriceRanking` | 承兑含税报价排名 | `acceptance_price_ranking` | Integer |
| 86 | `noTaxAcceptancePriceRanking` | 承兑无税报价排名 | `no_tax_acceptance_price_ranking` | Integer |
| 87 | `priceStatus` | 报价状态 | `price_status` | Integer |
| 88 | `priceType` | 报价类型 | `price_type` | String |
| 89 | `acceptanceDesc` | 承兑周期 | `acceptance_desc` | String |
| 90 | `lastTotalmny` | 总金额 | `last_totalmny` | Decimal |
| 91 | `supplierDocId` | 供应商ID | `supplier_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 92 | `specifications` | 补充说明 | `specifications` | String |
| 93 | `supplyDelivery` | 供应商交货方式说明 | `supply_delivery` | String |
| 94 | `supplyPayment` | 供应商付款说明 | `supply_payment` | String |
| 95 | `supplyOfferdes` | 供应商报价说明 | `supply_offerDes` | String |
| 96 | `qutofferFile` | 供应商附件信息 | `qutofferFile` | String |
| 97 | `enterpriseName` | 供应商租户企业名称 | `enterprise_name` | String |
| 98 | `enterpriseId` | 供应商租户企业ID | `enterprise_id` | Long |
| 99 | `prid` | pr业务标识 | `prid` | String |
| 100 | `corpAccount` | 外系统组织or集团 | `corp_account` | String |
| 101 | `corpSubAccount` | 与询价单字段相同 | `corp_sub_account` | String |
| 102 | `corpAccountid` | 外系统组织or集团ID | `corp_accountid` | String |
| 103 | `corpSubAccountid` | 外系统人员ID | `corp_sub_accountid` | String |
| 104 | `erpProductVersion` | ERP产品及版本 | `erp_product_version` | String |
| 105 | `erpVender` | ERP产品供应商 | `erp_vender` | String |
| 106 | `processor` | 处理人 | `processor` | String |
| 107 | `processTime` | 处理时间 | `process_time` | DateTime |
| 108 | `currencyCode` | 询价币种编码 | `currency_code` | String |
| 109 | `suppliermemberid` | 供应商在外系统的id | `suppliermemberid` | String |
| 110 | `createPin` | 创建人 | `create_pin` | String |
| 111 | `updateTime` | 更新时间 | `update_time` | Date |
| 112 | `updatePin` | 更新人 | `update_pin` | String |
| 113 | `sysVersion` | 版本 | `sys_version` | Integer |
| 114 | `purcorpId` | 采购企业{cpu_auth.cpu_enterprise} | `purcorp_id` | Long |
| 115 | `alipriceid` | 1688报价单号 | `alipriceid` | String |
| 116 | `suppliercode` | 登入的用户名 | `suppliercode` | String |
| 117 | `deprecateReason` | 废标原因 | `deprecate_reason` | String |
| 118 | `opened` | 是否已经开启 | `opened` | Boolean |
| 119 | `symbol` | 询价币种符号 | `symbol` | String |
| 120 | `onofflineType` | 报价方式(线上、线上+线下、线下) | `onoffline_type` | String |
| 121 | `replaceUserId` | 代录入用户id | `replace_user_id` | Long |
| 122 | `replaceUserName` | 代录入用户名称 | `replace_user_name` | String |
| 123 | `supplierOtherCertif` | 供应商资质证书 | `supplier_other_certif` | String |
| 124 | `paymentDesc` | 账期描述 | `payment_desc` | String |
| 125 | `buyofferRound` | 询价轮次(如:1,2,3.记录重新询价的次数) | `buyoffer_round` | Integer |
| 126 | `pricePolicy` | 报价品范围策略(1:按供货目录自动分配, 2:手动分配, 3:不限定报价品范围) | `price_policy` | Integer |
| 127 | `priceQuoted` | 已经报价(谈判之后,供应商没有主动报价的时候,会是false) | `price_quoted` | Boolean |
| 128 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 129 | `addressName` | 地址(文字) | `address_name` | String |
| 130 | `purorgId` | 采购组织id | `purorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 131 | `lastTalkTotalmny` | 上轮谈判-现金含税总金额 | `last_talk_totalmny` | Decimal |
| 132 | `lastTalkNtTotalmny` | 上轮谈判-现金无税总金额 | `last_talk_nt_totalmny` | Decimal |
| 133 | `lastTalkAccepMny` | 上轮谈判-承兑含税总金额 | `last_talk_accep_mny` | Decimal |
| 134 | `lastTalkPaymMny` | 上轮谈判-账期含税总金额 | `last_talk_paym_mny` | Decimal |
| 135 | `lastTalkNtAccepMny` | 上轮谈判-承兑无税总金额 | `last_talk_nt_accep_mny` | Decimal |
| 136 | `lastTalkNtPaymMny` | 上轮谈判-账期无税总金额 | `last_talk_nt_paym_mny` | Decimal |
| 137 | `quoteCertif` | 已盖章报价附件 | `quote_certif` | String |
| 138 | `noCommercialBribe` | 无商业贿赂证明 | `no_commercial_bribe` | String |
| 139 | `firstTotalmny` | 总金额(首次保存报价) | `first_totalmny` | Decimal |
| 140 | `firstNoTaxTotalmny` | 无税总金额(首次保存报价) | `first_no_tax_totalmny` | Decimal |
| 141 | `contractVisibleLevel` | 联系方式可见等级(登录后可见, 报价后可见, 公开) | `contract_visible_level` | String |
| 142 | `talkScope` | 谈判物料范围(全部、部分) | `talk_scope` | String |
| 143 | `acceptReferPrice` | 是否接收平台参考报价(包括:“接收/不接收) | `accept_refer_price` | Boolean |
| 144 | `allowPriceFormal` | 是否允许将参考报价加入正式报价(选项:“允许/不允许”) | `allow_price_formal` | Boolean |
| 145 | `purchaserRead` | 采购方查阅状态(包括:“采购方未查阅”/“采购方已查询”) | `purchaser_read` | Boolean |
| 146 | `priceCompare` | 是否已经加入比价参考 | `price_compare` | Boolean |
| 147 | `supplyIsInvited` | 当前供应商是否在询价单邀请列表 | `supply_is_invited` | Boolean |
| 148 | `publicTypeWide` | 询价方式(广泛征集供应商报价) | `public_type_wide` | Boolean |
| 149 | `publicTypeInvite` | 询价方式(邀请指定供应商报价) | `public_type_invite` | Boolean |
| 150 | `talkAllowQuote` | 当前供应商是否需谈判:发起谈判的时候是否允许供应商修改报价 | `talk_allow_quote` | Boolean |
| 151 | `lastQtCurrencyIdDiwork` | 上轮报价币种id | `last_qt_currency_id_diwork` | String |
| 152 | `rateTypeDiwork` | 汇率类型 | `rate_type_diwork` | String |
| 153 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 154 | `editStatus` | 驳回后编辑标记 | `edit_status` | String |
| 155 | `attachNeedCtrl` | 对供应商报价要求上传附件的管控级别 | `attach_need_ctrl` | String |
| 156 | `ts` | 时间 | `ts` | DateTime |
| 157 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 158 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 159 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 160 | `createTime` | 创建时间 | `create_time` | DateTime |
| 161 | `creatorId` | 创建人id | `creatorId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 162 | `currencyId` | 币种ID | `currency_id` | Long |
| 163 | `detailList` | 报价单子表 | `` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 164 | `fileList` | 报价单对供应商要求子表 | `` | e7f77de8-8b75-4ebc-adfe-d54a53f57ec1 |
| 165 | `freeDefines` | 报价单主表自由自定义项 | `` | 972f5c45-7114-40b1-929f-d1be67aca56f |
| 166 | `modifierId` | 修改人id | `modifierId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierDocId` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `purorgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 4 | `transactionTypeId` | 报价单交易类型ID | `bd.bill.TransType` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 7 | `creatorId` | 创建人id | `cpu-privilege.user.MgrUser` | Service |  |
| 8 | `modifierId` | 修改人id | `cpu-privilege.user.MgrUser` | Service |  |
| 9 | `qoDefineCharacter` | 报价单主表自定义项 | `sourcing.ibuyoffer.CpuPriceQuotationOfferDefineCharacter` | None |  |
| 10 | `qtCurrencyIdDiwork` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 11 | `priceInvoiceType` | 发票类型 | `bd.invoice.InvoiceTypeVO` | Service |  |
| 12 | `freeDefines` | 报价单主表自由自定义项 | `sourcing.ibuyoffer.PriceQuotationOfferFreeDefine` | None | true |
| 13 | `currencyIdDiwork` | 询价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 14 | `detailList` | 报价单子表 | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None | true |
| 15 | `offerId` | 询价单ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 16 | `fileList` | 报价单对供应商要求子表 | `sourcing.ibuyoffer.CpuQtOfferFile` | None | true |
