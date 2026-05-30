# |<<

**借转贷版本 (cdmc_infinancepay_v / nc.vo.cdmc.cdm.financepay.version.InfinancepayVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_infinancepay_b | 子表pk | pk_infinancepay_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | contractid | 内部贷款合同 | contractid | varchar(50) |  | 字符串 (String) |
| 5 | innercontractcode | 内贷合同编号 | innercontractcode | varchar(200) |  | 字符串 (String) |
| 6 | infinancepaycode | 内部放款编号 | infinancepaycode | varchar(200) |  | 字符串 (String) |
| 7 | infinancepayid | 内部放款单 | infinancepayid | varchar(200) |  | 字符串 (String) |
| 8 | outfinancepayid | 外部放款单 | outfinancepayid | varchar(200) |  | 字符串 (String) |
| 9 | loanmy | 占用放款金额 | loanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nowloanmy | 当前占用放款金额 | nowloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | olcloanmy | 占用放款金额组织本币 | olcloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | glcloanmy | 占用放款金额集团本币 | glcloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | gllcloanmy | 占用放款金额全局本币 | gllcloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | olcnowloanmy | 当前占用放款金额组织本币 | olcnowloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | glcnowloanmy | 当前占用放款金额集团本币 | glcnowloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | gllcnowloanmy | 当前占用放款金额全局本币 | gllcnowloanmy | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | loandate | 放款日期 | loandate | char(19) |  | 日期 (UFDate) |
| 18 | enddate | 结束日期 | enddate | char(19) |  | 日期 (UFDate) |
| 19 | versionno | 版本号 | versionno | int |  | 整数 (Integer) |
| 20 | borrowercorpid | 借款单位 | borrowercorpid | varchar(20) |  | 组织 (org) |
| 21 | billtype | 标记位 | billtype | varchar(200) |  | 字符串 (String) |
| 22 | busistatus | 内贷放款单据状态 | busistatus | int |  | 整数 (Integer) |
| 23 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |