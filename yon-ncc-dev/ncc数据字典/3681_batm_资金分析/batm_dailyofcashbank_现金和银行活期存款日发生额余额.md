# |<<

**现金和银行活期存款日发生额余额 (batm_dailyofcashbank / nc.vo.batm.cmpvo.DailyOfCashBankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/216.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailyofcashbank | 主键 | pk_dailyofcashbank | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_fatherorg | 上级业务单元 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 6 | pk_bankaccbas | 账户pk | pk_bankaccbas | varchar(50) |  | 字符串 (String) |
| 7 | pk_bankaccsub | 账户子户pk | pk_bankaccsub | varchar(50) |  | 字符串 (String) |
| 8 | pk_currtype | 币种 | pk_currtype | varchar(50) |  | 字符串 (String) |
| 9 | fundformcode | 资金形态 | fundformcode | char(1) |  | 字符串 (String) |
| 10 | transdate | 交易日期 | transdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | lastbalance | 昨日余额 | lastbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | inmoney | 收入 | inmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | olcinmoney | 收入本币 | olcinmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | outmoney | 支出 | outmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | olcoutmoney | 支出本币 | olcoutmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | balance | 今日余额 | balance | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | olcbalance | 今日余额本币 | olcbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | glcbalance | 今日余额集团本币 | glcbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | gllcbalance | 今日余额全局本币 | gllcbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | usablebalance | 今日可用余额 | usablebalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | annualavgbalance | 年日均余额 | annualavgbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | glcinmoney | 收入集团本币 | glcinmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | gllcinmoney | 收入全局本币 | gllcinmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | glcoutmoney | 支出集团本币 | glcoutmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | gllcoutmoney | 支出全局本币 | gllcoutmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | accnum | 银行账号 | accnum | varchar(50) |  | 字符串 (String) |
| 27 | bankname | 开户银行 | bankname | varchar(50) |  | 字符串 (String) |
| 28 | ucode | 业务单元编码 | ucode | varchar(50) |  | 字符串 (String) |
| 29 | arapprop | 收付属性 | arapprop | varchar(50) |  | 字符串 (String) |
| 30 | pk_banktype | 银行类别主键 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 31 | pk_bankdoc | 银行档案主键 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 32 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef2 | 定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef3 | 定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef4 | 定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef5 | 定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef6 | 定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef7 | 定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef8 | 定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef9 | 定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef10 | 定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef11 | 定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef12 | 定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef13 | 定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef14 | 定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef15 | 定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef16 | 定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef17 | 定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef18 | 定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef19 | 定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef20 | 定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |