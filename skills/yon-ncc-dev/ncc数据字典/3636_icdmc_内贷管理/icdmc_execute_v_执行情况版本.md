# |<<

**执行情况版本 (icdmc_execute_v / nc.vo.icdmc.icdmc.contract.version.ExecuteVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_execute_b_icdmc | 执行情况主键 | pk_execute_b_icdmc | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | busidate | 日期 | busidate | char(19) |  | 日期 (UFDate) |
| 8 | memo | 摘要 | memo | varchar(50) |  | 字符串 (String) |
| 9 | initialflag | 期初标志 | initialflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | repayamount | 还本金额 | repayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | loanamount | 放款金额 | loanamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | payinterest | 付息金额 | payinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | leftrepayamount | 未还本金 | leftrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 15 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | summary | 执行情况类型 | summary | varchar(50) |  | 字符串 (String) |
| 19 | pk_srcbilltypeid | 来源单据类型主键 | pk_srcbilltypeid | varchar(50) |  | 字符串 (String) |
| 20 | serialno | 序列号 | serialno | int |  | 整数 (Integer) |
| 21 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 22 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 23 | olcrepayamount | 组织本币还本金额 | olcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | glcrepayamount | 集团本币还本金额 | glcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | gllcrepayamount | 全局本币还本金额 | gllcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | olcpayinterest | 组织本币付息金额 | olcpayinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | glcpayinterest | 集团本币付息金额 | glcpayinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | gllcpayinterest | 全局本币付息金额 | gllcpayinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | exectmark | 执行情况标识 | exectmark | varchar(50) |  | 字符串 (String) |
| 30 | rate | 利率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | unrepayintstmny | 应付未付利息 | unrepayintstmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |