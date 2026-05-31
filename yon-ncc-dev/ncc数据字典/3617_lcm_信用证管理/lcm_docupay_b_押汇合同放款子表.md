# |<<

**押汇合同放款子表 (lcm_docupay_b / nc.vo.lcm.paydocubills.DocuPayBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payrcpt_b | 押汇放款子表主键 | pk_payrcpt_b | char(20) | √ | 主键 (UFID) |
| 2 | repaycode | 还款编号 | repaycode | varchar(50) |  | 字符串 (String) |
| 3 | repaydate | 还款日期 | repaydate | char(19) |  | 日期 (UFDate) |
| 4 | serialno | 序号 | serialno | int |  | 整数 (Integer) |
| 5 | preamount | 预计还本金 | preamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | preinterest | 预计付利息 | preinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | sumamount | 本利合计 | sumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | operatedate | 处理日期 | operatedate | char(19) |  | 日期 (UFDate) |
| 9 | olcpreamount | 预计还本金本币 | olcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcpreamount | 预计还本金集团本币 | glcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | gllcpreamount | 预计还本金全局本币 | gllcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olcpreinterest | 预计付利息本币 | olcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glcpreinterest | 预计付利息集团本币 | glcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllcpreinterest | 预计付利息全局本币 | gllcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcsumamount | 本利合计本币 | olcsumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | glcsumamount | 本利合计集团本币 | glcsumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcsumamount | 本利合计全局本币 | gllcsumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | pk_extratecode | 展期利率 | pk_extratecode | varchar(20) |  | 利率编码 (fi_ratecode) |
| 19 | extbegindate | 展期开始日期 | extbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 20 | extenddate | 展期结束日期 | extenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 21 | unamount | 未还本金 | unamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | lastrepaydate | 最后还款日期 | lastrepaydate | char(19) |  | 日期 (UFDate) |
| 23 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 24 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 25 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 26 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |