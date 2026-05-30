# |<<

**银行现金账户账明细表 (batm_bankaccdetail / nc.vo.batm.cmpvo.BankAccDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccdetail | 主键 | pk_bankaccdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | tallytime | 记账时间 | tallytime | char(19) |  | 日期 (UFDate) |
| 6 | tallydate | 记账日期 | tallydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | pk_account | 本方帐户子户主键 | pk_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 8 | oppunit | 对方单位 | oppunit | varchar(300) |  | 字符串 (String) |
| 9 | pk_opporg | 对方单位主键 | pk_opporg | varchar(50) |  | 字符串 (String) |
| 10 | pk_oppaccount | 对方帐户主键 | pk_oppaccount | varchar(50) |  | 字符串 (String) |
| 11 | pk_oppbank | 对方银行主键 | pk_oppbank | varchar(50) |  | 字符串 (String) |
| 12 | oppbank | 对方银行 | oppbank | varchar(300) |  | 字符串 (String) |
| 13 | oppbankacc | 对方银行账号 | oppbankacc | varchar(300) |  | 字符串 (String) |
| 14 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 15 | vbillno | 单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 16 | note | 摘要 | note | varchar(181) |  | 字符串 (String) |
| 17 | pk_curr | 币种 | pk_curr | varchar(50) |  | 字符串 (String) |
| 18 | inmoney | 收入金额 | inmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | olcinmoney | 收入组织本币金额 | olcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | glcinmoney | 收入集团本币金额 | glcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | gllcinmoney | 收入全局本币金额 | gllcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | outmoney | 支出金额 | outmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | olcoutmoney | 支出组织本币金额 | olcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | glcoutmoney | 支出集团本币金额 | glcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | gllcoutmoney | 支出全局本币金额 | gllcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | pk_deptdoc | 部门 | pk_deptdoc | varchar(50) |  | 字符串 (String) |
| 27 | pk_psndoc | 人员 | pk_psndoc | varchar(50) |  | 字符串 (String) |
| 28 | pk_project | 项目 | pk_project | varchar(50) |  | 字符串 (String) |
| 29 | pk_inout | 收支项目 | pk_inout | varchar(50) |  | 字符串 (String) |
| 30 | pk_cashflow | 现金流量项目 | pk_cashflow | varchar(50) |  | 字符串 (String) |
| 31 | pk_balancetype | 结算方式 | pk_balancetype | varchar(50) |  | 字符串 (String) |
| 32 | fundformcode | 资金形态 | fundformcode | int |  | 整数 (Integer) |
| 33 | isbegin | 是否期初 | isbegin | char(1) |  | 字符串 (String) |
| 34 | balance | 余额（原币） | balance | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | olcbalance | 余额（组织本币） | olcbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | glcbalance | 余额（集团本币） | glcbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | gllcbalance | 余额（全局本币） | gllcbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | pk_bankaccbas | 本方银行账户 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 39 | pk_banktype | 银行类别主键 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 40 | pk_bankdoc | 银行档案主键 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 41 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |