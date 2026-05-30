# |<<

**银行对账单信息 (fvm_ebankdzd / nc.vo.batm.ebankbalance.FvmEBankDzdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fvm_dzd | 对账单主键 | pk_fvm_dzd | char(20) | √ | 主键 (UFID) |
| 2 | pk_ebank_dzd | 网银对账单主键 | pk_ebank_dzd | varchar(50) |  | 字符串 (String) |
| 3 | pk_bankaccbas | 银行账户主键 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 4 | pk_bankaccsub | 银行账户子户主键 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | bankaccorg | 所属核算组织 | bankaccorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_org_v | 所属组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 9 | c_ccynbr | 币种 | c_ccynbr | varchar(50) |  | 字符串 (String) |
| 10 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 11 | trans_date | 交易日期 | trans_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 12 | trans_time | 交易时间 | trans_time | char(8) |  | 时间 (UFTime) |
| 13 | dbtdwmc | 付方单位 | dbtdwmc | varchar(200) |  | 字符串 (String) |
| 14 | crtdwmc | 收方单位 | crtdwmc | varchar(200) |  | 字符串 (String) |
| 15 | trans_abstr | 摘要 | trans_abstr | varchar(500) |  | 字符串 (String) |
| 16 | nusage | 用途 | nusage | varchar(500) |  | 字符串 (String) |
| 17 | inmoney | 收入 | inmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | olcinmoney | 收入组织本币金额 | olcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcinmoney | 收入集团本币金额 | glcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcinmoney | 收入全局本币金额 | gllcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | outmoney | 支出 | outmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | olcoutmoney | 支出组织本币金额 | olcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | glcoutmoney | 支出集团本币金额 | glcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gllcoutmoney | 支出全局本币金额 | gllcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | curacc | 本方账号 | curacc | varchar(50) |  | 字符串 (String) |
| 26 | crtacc | 收方账号 | crtacc | varchar(50) |  | 字符串 (String) |
| 27 | oppacc | 对方账号 | oppacc | varchar(50) |  | 字符串 (String) |
| 28 | oppname | 对方单位 | oppname | varchar(200) |  | 字符串 (String) |
| 29 | dbtacc | 付方帐号 | dbtacc | varchar(50) |  | 字符串 (String) |
| 30 | styleflag | 新旧标志 | styleflag | char(50) |  | 字符串 (String) |
| 31 | trsamt | 交易金额 | trsamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 33 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 34 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 35 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 36 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 37 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 38 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 39 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 40 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 41 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |