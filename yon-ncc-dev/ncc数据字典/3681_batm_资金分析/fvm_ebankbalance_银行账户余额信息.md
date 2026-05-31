# |<<

**银行账户余额信息 (fvm_ebankbalance / nc.vo.batm.ebankbalance.EBankBalanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fvm_balance | 余额主键 | pk_fvm_balance | char(20) | √ | 主键 (UFID) |
| 2 | pk_fvm_dzd | 对账单主键 | pk_fvm_dzd | varchar(50) |  | 字符串 (String) |
| 3 | pk_ebank_balance | 余额主键（银企直连） | pk_ebank_balance | varchar(50) |  | 字符串 (String) |
| 4 | pk_bankaccbas | 银行账户主键 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 5 | pk_bankaccsub | 银行账户子户主键 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 6 | pk_netbankinftp | 网银信息 | pk_netbankinftp | varchar(20) |  | 网银信息模板 (netbankinftp) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 组织(核算) | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | arapprop | 收付属性 | arapprop | varchar(50) |  | 字符串 (String) |
| 10 | accnum | 帐号 | accnum | varchar(40) |  | 字符串 (String) |
| 11 | accname | 户名 | accname | varchar(200) |  | 字符串 (String) |
| 12 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 13 | pk_bankdoc | 开户银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 14 | bankarea | 开户地区 | bankarea | varchar(80) |  | 字符串 (String) |
| 15 | province | 省份 | province | varchar(80) |  | 字符串 (String) |
| 16 | city | 城市 | city | varchar(80) |  | 字符串 (String) |
| 17 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 18 | acctype | 账户类型 | acctype | int |  | 账户类型 (accounttype) |  | 0=活期; |