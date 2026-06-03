---
tags: [BIP, 元数据, 数据字典, tlm.financialproduct.FinancialProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融产品 (`tlm.financialproduct.FinancialProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financialproduct` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`ef17ada4-cde4-4d1f-9405-8eeb7eab2c2d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融产品 |
| 物理表 | `tlm_financialproduct` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 186 个 |
| 关联引用 | 49 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financialProductExchangeCurrencyVO` | `tlm.financialproduct.FinancialProductExchangeCurrencyVO` | composition |
| `financialProductRealRightVO` | `tlm.financialproduct.FinancialProductRealRightVO` | composition |
| `financialProductCastRVO` | `tlm.financialproduct.FinancialProductCastRVO` | composition |
| `financialProductCurve` | `tlm.financialproduct.FinancialProductCurve` | composition |
| `financialProductCastTVO` | `tlm.financialproduct.FinancialProductCastTVO` | composition |
| `financialProductTaxVO` | `tlm.financialproduct.FinancialProductTaxVO` | composition |
| `financialProductAccentityVO` | `tlm.financialproduct.FinancialProductAccentityVO` | composition |
| `financialProductCurrencyVO` | `tlm.financialproduct.FinancialProductCurrencyVO` | composition |

## 关联引用 (49个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `apply_tax` | `` |
| `compound_financing_flow_type` | `` |
| `real_right` | `` |
| `reduce_principal_financing_flow_type` | `tlm_flowtypeRef` |
| `investment_flow_type` | `tlm_flowtypeRef` |
| `tenant_id` | `` |
| `derivative_interest_out_flow_type` | `tlm_flowtypeRef` |
| `normal_financing_flow_type` | `tlm_flowtypeRef` |
| `overdue_financing_flow_type` | `` |
| `product_class` | `tlm_financialproductclassref` |
| `pre_investment_flow_type` | `` |
| `pay_investment_flow_type` | `tlm_flowtypeRef` |
| `reduce_principal_derivative_flow_type` | `tlm_flowtypeRef` |
| `castr` | `` |
| `castt` | `` |
| `financing_flow_type` | `tlm_flowtypeRef` |
| `apply_accentity` | `` |
| `reduce_principal_investment_flow_type` | `tlm_flowtypeRef` |
| `profit_sharing_financing_flow_type` | `` |
| `derivative_In_flow_type` | `tlm_flowtypeRef` |
| `appoint_rate` | `tlm_interestrateRef` |
| `fp_define_character` | `` |
| `derivative_interest_In_flow_type` | `tlm_flowtypeRef` |
| `reduce_derivative_In_flow_type` | `tlm_flowtypeRef` |
| `pre_financing_flow_type` | `` |
| `derivative_out_flow_type` | `tlm_flowtypeRef` |
| `reduce_derivative_out_flow_type` | `tlm_flowtypeRef` |
| `derivative_flow_type` | `tlm_flowtypeRef` |
| `ytenant_id` | `` |
| `overdue_investment_flow_type` | `` |
| `pay_financing_flow_type` | `tlm_flowtypeRef` |
| `profit_sharing_investment_flow_type` | `tlm_flowtypeRef` |
| `contract_type_id` | `` |
| `normal_investment_flow_type` | `tlm_flowtypeRef` |
| `material` | `` |
| `apply_currency` | `` |
| `exchange_currency` | `` |
| `compound_investment_flow_type` | `` |
| `retention_price_f_flow_type` | `tlm_flowtypeRef` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 186 个直连字段

### 文本字段 (60个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `f_business_class` | `f_business_class` | String | 融资业务分类 |
| `business_category` | `business_category` | String | 业务分类 |
| `interest_overdue_accrual` | `interest_overdue_accrual` | String | 利息逾期计息 |
| `occupy_trading_limit` | `occupy_trading_limit` | String | 占用时机 |
| `hook` | `hook` | String | 是否挂钩标的 |
| `product_type` | `product_type` | String | 产品类型 |
| `financing_tool` | `financing_tool` | String | 工具(融资) |
| `pre_interest_accrual` | `pre_interest_accrual` | String | 提前违约计息 |
| `pre_redeem` | `pre_redeem` | String | 提前赎回 |
| `pre_redeem_time` | `pre_redeem_time` | String | 提前赎回次数 |
| `is_pre_principal` | `is_pre_principal` | String | 是否预付本金 |
| `principal_overdue_accrual` | `principal_overdue_accrual` | String | 本金逾期计息 |
| `rate_setting` | `rate_setting` | String | 利率设置 |
| `investment_tool` | `investment_tool` | String | 工具(投资) |
| `release_trading_limit` | `release_trading_limit` | String | 释放时机 |
| `service_application_method` | `service_application_method` | String | 服务应用方式 |
| `interest_cal_method` | `interest_cal_method` | String | 利息计算方式 |
| `trading_limit` | `trading_limit` | String | 交易限额 |
| `derivatives_tool` | `derivatives_tool` | String | 工具(衍生品) |
| `apply_event` | `apply_event` | String | 申请事件 |
| `ys_reserve` | `ys_reserve` | String | YS保留字段 |
| `ys_template` | `ys_template` | String | YS通用模板 |
| `code` | `code` | String | 产品编码 |
| `application_direct` | `application_direct` | String | 应用方向 |
| `business_rule` | `business_rule` | String | 业务规则 |
| `org_type` | `org_type` | String | 关联机构类型 |
| `closing_type` | `closing_type` | String | 平仓类型 |
| `enableoutagestatus` | `enableoutagestatus` | String | 启用状态 |
| `closing_method` | `closing_method` | String | 平仓方法 |
| `coupon_basis` | `coupon_basis` | String | 息票基准 |
| `compound_mode` | `compound_mode` | String | 组合方式 |
| `exchang_principal` | `exchang_principal` | String | 是否互换本金 |
| `adjust_type` | `adjust_type` | String | 调整类型 |
| `repayment_method` | `repayment_method` | String | 还本赎回方式 |
| `quote_type` | `quote_type` | String | 报价类型 |
| `register_event` | `register_event` | String | 登记事件 |
| `retention_price` | `retention_price` | String | 留购价款 |
| `cashflow_event` | `cashflow_event` | String | 现金流事件 |
| `accounting_event` | `accounting_event` | String | 核算事件 |
| `npv_calculate_market_value` | `npv_calculate_market_value` | String | 用npv方法计算市值 |
| `income_calculate_type` | `income_calculate_type` | String | 损益计算方法 |
| `change_event` | `change_event` | String | 变更事件 |
| `finish_event` | `finish_event` | String | 结束事件 |
| `is_auto_end` | `is_auto_end` | String | 本金为0是否自动结束 |
| `finish_method` | `finish_method` | String | 到期结束方式 |
| `relate_credit` | `relate_credit` | String | 关联授信 |
| `occupy_margin` | `occupy_margin` | String | 缴存时机 |
| `occupy_credit` | `occupy_credit` | String | 占用时机 |
| `release_margin` | `release_margin` | String | 释放时机 |
| `release_credit` | `release_credit` | String | 释放时机 |
| `relate_bond` | `relate_bond` | String | 关联担保 |
| `occupy_bond` | `occupy_bond` | String | 占用时机 |
| `release_bond` | `release_bond` | String | 释放时机 |
| `relate_lgm` | `relate_lgm` | String | 关联保函 |
| `relate_margin` | `relate_margin` | String | 关联保证金 |
| `` | `creator` | String | 操作员 |
| `` | `modifier` | String | 修改人 |
| `relate_fundplan` | `relate_fundplan` | String | 关联资金计划 |
| `specification` | `specification` | String | 物料规格 |
| `issue_invoice_event` | `issue_invoice_event` | String | 开票事件 |

### 引用字段 (40个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `apply_accentity` | `apply_accentity` | f5a7a6aa-4f56-4264-862b-0d24b08bd383 | 适用资金组织 |
| `apply_currency` | `apply_currency` | 8bfa4411-ec87-4ff7-b25a-20061ce14833 | 适用币种 |
| `apply_tax` | `apply_tax` | 97d36330-b49e-4ef8-8799-3df607c6b18c | 适用税种档案 |
| `product_class` | `product_class` | dc13fc1a-5b86-403a-8316-940079179f64 | 金融产品分类ID |
| `castr` | `castr` | 22f724b4-8143-4f58-8854-9c1c9dba5d77 | 融资费用 |
| `castt` | `castt` | 3aebee12-46c8-4974-828e-04b4cdac8907 | 投资费用 |
| `compound_financing_flow_type` | `compound_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 复利融资流类型 |
| `compound_investment_flow_type` | `compound_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 复利投资流类型 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `exchange_currency` | `exchange_currency` | 833054d7-d857-4218-8c0f-aea99134cd3d | 兑换币种 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `overdue_financing_flow_type` | `overdue_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 逾期利息融资流类型 |
| `real_right` | `real_right` | 8a43b098-715c-4227-b6e8-bbb35003e382 | 关联物权类别 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `overdue_investment_flow_type` | `overdue_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 逾期利息投资流类型 |
| `pre_financing_flow_type` | `pre_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 提前还本/赎回利息融资流类型 |
| `pre_investment_flow_type` | `pre_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 提前还本/赎回利息投资流类型 |
| `profit_sharing_financing_flow_type` | `profit_sharing_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 融资流类型 |
| `profit_sharing_investment_flow_type` | `profit_sharing_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 投资流类型 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `appoint_rate` | `appoint_rate` | 27edb820-3f4d-45c2-8d94-1b2a5e60bc0d | 提前还本/赎回时指定利率ID |
| `retention_price_f_flow_type` | `retention_price_f_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 留购价款融资流类型ID |
| `financing_flow_type` | `financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 融资流类型ID |
| `investment_flow_type` | `investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 投资流类型ID |
| `derivative_flow_type` | `derivative_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品流类型ID |
| `normal_financing_flow_type` | `normal_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 正常利息融资流类型ID |
| `normal_investment_flow_type` | `normal_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 正常利息投资流类型ID |
| `reduce_principal_financing_flow_type` | `reduce_principal_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 融资流类型ID |
| `reduce_principal_investment_flow_type` | `reduce_principal_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 投资流类型ID |
| `reduce_principal_derivative_flow_type` | `reduce_principal_derivative_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品流类型ID |
| `derivative_interest_In_flow_type` | `derivative_interest_In_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品利息流入流类型ID |
| `derivative_interest_out_flow_type` | `derivative_interest_out_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品利息流出流类型ID |
| `reduce_derivative_In_flow_type` | `reduce_derivative_In_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品流入流类型ID |
| `reduce_derivative_out_flow_type` | `reduce_derivative_out_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品流出流类型ID |
| `derivative_In_flow_type` | `derivative_In_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品流入流类型ID |
| `derivative_out_flow_type` | `derivative_out_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 衍生品流出流类型ID |
| `pay_financing_flow_type` | `pay_financing_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 融资付费流类型ID |
| `pay_investment_flow_type` | `pay_investment_flow_type` | d7e874ec-355b-42a0-93b3-67e3e979987f | 投资付费流类型ID |
| `contract_type_id` | `contract_type_id` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | 合同类型 |
| `material` | `material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `vouchdate` | Date | 单据日期 |
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 枚举字段 (66个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `amortize` | `amortize` | String | 摊销 |
| `apply_tax_flag` | `apply_tax_flag` | String | 是否适用税目档案 |
| `settlement_center_role` | `settlement_center_role` | String | 结算中心角色 |
| `balance_method` | `balance_method` | String | 余额方式 |
| `trade_category` | `trade_category` | String | 交易品种 |
| `is_pub` | `is_pub` | String | 发布状态 |
| `bussiness_type` | `bussiness_type` | String | 业务大类 |
| `market_registered` | `market_registered` | String | 市值登记 |
| `is_syndicate` | `is_syndicate` | String | 是否银团贷款 |
| `is_loan_by_mandate` | `is_loan_by_mandate` | String | 是否委托贷款 |
| `leasetype` | `leasetype` | String | 租赁类型 |
| `leasing_asset` | `leasing_asset` | String | 是否包含租赁资产 |
| `specific_plan` | `specific_plan` | String | 是否资产专项计划 |
| `period_head_tail` | `period_head_tail` | String | 周期首尾规则 |
| `profit_sharing` | `profit_sharing` | String | 分红 |
| `related_real_right` | `related_real_right` | String | 是否关联物权 |
| `interes_base` | `interes_base` | String | 计息基数 |
| `include_enddate` | `include_enddate` | String | 是否包含到期日 |
| `register_apply` | `register_apply` | String | 登记申请 |
| `normal_interes_base` | `normal_interes_base` | String | 正常还本计息基数 |
| `delivery_apply` | `delivery_apply` | String | 交割申请 |
| `redem_apply` | `redem_apply` | String | 减少本金申请 |
| `close_apply` | `close_apply` | String | 平仓申请 |
| `amt_fixed` | `amt_fixed` | String | 协议金额是否固定 |
| `transfer_apply` | `transfer_apply` | String | 转让申请 |
| `change_apply` | `change_apply` | String | 变更申请 |
| `rollover_apply` | `rollover_apply` | String | 展期申请 |
| `holiday_principle` | `holiday_principle` | String | 节假日处理原则 |
| `apply_all` | `apply_all` | String | 适用所有会计主体 |
| `add_principal_apply` | `add_principal_apply` | String | 增加本金申请 |
| `derivative_type` | `derivative_type` | String | 衍生品类型 |
| `principal_grant_time` | `principal_grant_time` | String | 本金发放次数 |
| `principal_type` | `principal_type` | String | 本金类型 |
| `subject_type` | `subject_type` | String | 标的物类别 |
| `third_rarty_role` | `third_rarty_role` | String | 第三方角色 |
| `principal_currency` | `principal_currency` | String | 本金币种 |
| `bill_schema` | `bill_schema` | String | 单据(借据)模式 |
| `term_type` | `term_type` | String | 期限类型 |
| `interest_accrual` | `interest_accrual` | String | 是否计息 |
| `interest_rate_type` | `interest_rate_type` | String | 利率类型 |
| `interest_accrual_day` | `interest_accrual_day` | String | 计息天数 |
| `interest_settlement_rule` | `interest_settlement_rule` | String | 结息头尾规则 |
| `withholding_rule` | `withholding_rule` | String | 预提头尾规则 |
| `ytd_interestRate` | `ytd_interestRate` | String | 年/月/日利率 |
| `interest_rate_algorithm` | `interest_rate_algorithm` | String | 计息算法 |
| `interest_settlement_method` | `interest_settlement_method` | String | 结息方式 |
| `interest_accrual_type` | `interest_accrual_type` | String | 提前还本/赎回时计息类型 |
| `default_add_principal` | `default_add_principal` | String | 登记时是否默认增加本金 |
| `add_principal` | `add_principal` | String | 增加本金 |
| `pay_income_interest` | `pay_income_interest` | String | 付息/收息 |
| `reduce_principal` | `reduce_principal` | String | 减少本金 |
| `withholding` | `withholding` | String | 预提 |
| `interest_settlement` | `interest_settlement` | String | 结息 |
| `financein_change` | `financein_change` | String | 借据变更 |
| `rush_withholding` | `rush_withholding` | String | 结息凭证生成方式 |
| `fair_value` | `fair_value` | String | 公允价值 |
| `fair_value_algorithm` | `fair_value_algorithm` | String | 公允价值算法 |
| `delivery` | `delivery` | String | 交割 |
| `exhibition_period` | `exhibition_period` | String | 展期 |
| `agreement_change` | `agreement_change` | String | 协议变更 |
| `derate` | `derate` | String | 减免 |
| `sale_change` | `sale_change` | String | 交易变更 |
| `pay` | `pay` | String | 付费/收费 |
| `transfer_register` | `transfer_register` | String | 转让 |
| `relate_risk` | `relate_risk` | String | 关联风险条款 |
| `accounting_method` | `accounting_method` | String | 核算方式 |

### 短整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `status` | Short | 单据状态 |
| `bill_type` | `bill_type` | Short | 单据类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `tplid` | Long | 模板id |
| `id` | `id` | Long | 主键 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `product_name` | `product_name` | String | 产品名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建日期 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `fp_define_character` | `fp_define_character` | a4593feb-3240-45e2-9f7b-890358f3bbdd | 金融产品自定义项 |

### other (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | f5a7a6aa-4f56-4264-862b-0d24b08bd383 | 金融产品资金组织子表 |
| `` | `` | 22f724b4-8143-4f58-8854-9c1c9dba5d77 | 金融产品融资费用子表 |
| `` | `` | 3aebee12-46c8-4974-828e-04b4cdac8907 | 金融产品投资费用子表 |
| `` | `` | 8bfa4411-ec87-4ff7-b25a-20061ce14833 | 金融产品币种子表 |
| `` | `` | 42482b12-5f31-4784-9b8d-38395660683c | 默认曲线 |
| `` | `` | 833054d7-d857-4218-8c0f-aea99134cd3d | 金融产品兑换币种子表 |
| `` | `` | 8a43b098-715c-4227-b6e8-bbb35003e382 | 金融产品物权类别子表 |
| `` | `` | 97d36330-b49e-4ef8-8799-3df607c6b18c | 金融产品税种子表 |
