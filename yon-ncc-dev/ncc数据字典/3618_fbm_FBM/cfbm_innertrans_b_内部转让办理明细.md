# |<<

**内部转让办理明细 (cfbm_innertrans_b / nc.vo.cfbm.innertrans.InnerTransBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertrans_b | 子键 | pk_innertrans_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | fbmbillno | 票据编号 | fbmbillno | char(50) |  | 主键 (UFID) |
| 6 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 7 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 8 | transinterest | 转让利息 | transinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | olctransinterest | 转让利息组织本币金额 | olctransinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glctransinterest | 转让利息集团本币金额 | glctransinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | gllctransinterest | 转让利息全局本币金额 | gllctransinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | transamount | 转让余额 | transamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | olctransamount | 转让余额组织本币金额 | olctransamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glctransamount | 转让余额集团本币金额 | glctransamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | gllctransamount | 转让余额全局本币金额 | gllctransamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | billamount | 票据金额 | billamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcbillamount | 票据金额组织本币金额 | olcbillamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | glcbillamount | 票据金额集团本币金额 | glcbillamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | gllcbillamount | 票据金额全局本币金额 | gllcbillamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 24 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 25 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |