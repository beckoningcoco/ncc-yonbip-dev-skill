# |<<

**银行账户余额表 (ebank_balance / nc.vo.obm.ebankbalanceqry.EbankBalanceQryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_balance | 主键 | pk_ebank_balance | char(20) | √ | 主键 (UFID) |
| 2 | pk_bankaccsub | 银行子账户pk | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 3 | pk_bankaccbas | 银行账户主户pk | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | bankacc | 银行账号 | bankacc | varchar(50) |  | 字符串 (String) |
| 9 | banktype | 银行类型 | banktype | varchar(60) |  | 字符串 (String) |
| 10 | banktypecode | 银行类别编码 | banktypecode | varchar(50) |  | 字符串 (String) |
| 11 | bankname | 银行名称 | bankname | varchar(200) |  | 字符串 (String) |
| 12 | curdate | 余额日期 | curdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 13 | yesterdaybalance | 昨日余额 | yesterdaybalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | balance | 余额 | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | usablebalance | 可用余额 | usablebalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | unitname | 账户名称 | unitname | varchar(200) |  | 字符串 (String) |
| 17 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 18 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | obmdef1 | 自定义项1 | obmdef1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | obmdef2 | 自定义项2 | obmdef2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | obmdef3 | 自定义项3 | obmdef3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | obmdef4 | 自定义项4 | obmdef4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | obmdef5 | 自定义项5 | obmdef5 | varchar(101) |  | 自定义项 (Custom) |