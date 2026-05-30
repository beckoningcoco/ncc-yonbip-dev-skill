# |<<

**下拨规则子实体 (sf_allocaterule_b / nc.vo.sf.allocaterule.AllocateRuleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocaterule_b | 下拨单子实体标识 | pk_allocaterule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 成员单位 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_financeorg_v | 成员单位版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_bankacc_r | 单位银行账号PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | bankacccode_r | 单位银行账户 | bankacccode_r | varchar(40) |  | 字符串 (String) |
| 6 | bankaccname_r | 单位银行账户户名 | bankaccname_r | varchar(200) |  | 字符串 (String) |
| 7 | bankname_r | 收款银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 8 | pk_planitem_r | 单位计划项目 | pk_planitem_r | varchar(20) |  | 资金计划项目 (fundplan) |
| 9 | pk_planitem_p | 资金组织计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 10 | pk_accid | 单位内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 11 | reservelimit | 账户备用金限额 | reservelimit | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | allocaterate | 下拨比率 | allocaterate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | leastamount | 最小下拨金额 | leastamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | isacceptinteger | 取整 | isacceptinteger | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | acceptbase | 取整基数 | acceptbase | int |  | 整数 (Integer) |
| 16 | isnetbankfull | 网银补录完整 | isnetbankfull | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 18 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 19 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 20 | paytype | 汇款速度 | paytype | varchar(50) |  | 汇款速度 (pay_type) |  | 0=普通; |