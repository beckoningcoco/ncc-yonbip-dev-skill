# |<<

**上收规则子实体 (sf_deliveryrule_b / nc.vo.sf.deliveryrule.DeliveryRuleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryrule_b | 上收规则子实体标识 | pk_deliveryrule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 缴款单位 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_financeorg_v | 成员单位版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_bankacc_p | 单位银行账号 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | bankname_p | 缴款银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 6 | pk_planitem_p | 单位计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 7 | pk_planitem_r | 资金组织计划项目 | pk_planitem_r | varchar(20) |  | 资金计划项目 (fundplan) |
| 8 | pk_accid | 单位内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 9 | balance | 余额 | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | ration | 定额 | ration | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | deliveryrate | 上收定率 | deliveryrate | decimal(4, 2) |  | 数值 (UFDouble) |
| 12 | leastamount | 最小上收金额 | leastamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | isacceptinteger | 取整 | isacceptinteger | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | acceptbase | 取整基数 | acceptbase | int |  | 整数 (Integer) |
| 15 | isnetbankfull | 网银补录完整 | isnetbankfull | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 17 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 18 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 19 | paytype | 汇款速度 | paytype | varchar(50) |  | 汇款速度 (pay_type) |  | 0=普通; |