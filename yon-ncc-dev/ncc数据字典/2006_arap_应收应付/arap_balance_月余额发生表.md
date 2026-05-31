# |<<

**月余额发生表 (arap_balance / nc.vo.arap.tally.BalanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balance | 主键 | pk_balance | char(20) | √ | 主键 (UFID) |
| 2 | compondmd5 | MD5码 | compondmd5 | varchar(32) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | char(20) |  | 字符串 (String) |
| 4 | pk_org | 财务组织 | pk_org | char(20) |  | 字符串 (String) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 6 | accyear | 会计年度 | accyear | char(4) |  | 字符串 (String) |
| 7 | accmonth | 会计月份 | accmonth | char(2) |  | 字符串 (String) |
| 8 | accperiod | 会计期间 | accperiod | char(7) |  | 字符串 (String) |
| 9 | objtype | 往来对象 | objtype | int |  | 整数 (Integer) |
| 10 | customer | 客户 | customer | varchar(20) |  | 主键 (UFID) |
| 11 | supplier | 供应商 | supplier | varchar(20) |  | 主键 (UFID) |
| 12 | pk_deptid | 部门 | pk_deptid | varchar(20) |  | 主键 (UFID) |
| 13 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 主键 (UFID) |
| 14 | pk_currtype | 币种 | pk_currtype | char(20) |  | 主键 (UFID) |
| 15 | billclass | 单据大类 | billclass | varchar(10) |  | 字符串 (String) |
| 16 | billstatus | 单据状态 | billstatus | int |  | 整数 (Integer) |
| 17 | effectstatus | 生效标识 | effectstatus | int |  | 整数 (Integer) |
| 18 | quantity_de | 借方数量 | quantity_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | money_de | 借方原币金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | local_money_de | 借方本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | grouplocal_money_de | 集团借方本币金额 | grouplocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | globallocal_money_de | 全局借方本币金额 | globallocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | quantity_cr | 贷方数量 | quantity_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | money_cr | 贷方原币金额 | money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | local_money_cr | 贷方本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | grouplocal_money_cr | 集团贷方本币金额 | grouplocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | globallocal_money_cr | 全局贷方本币金额 | globallocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | isrefund | 是否退款 | isrefund | char(1) |  | 布尔类型 (UFBoolean) | N |
| 29 | def1 | 自定义项1 | def1 | varchar(101) |  | 字符串 (String) |
| 30 | def2 | 自定义项2 | def2 | varchar(101) |  | 字符串 (String) |
| 31 | def3 | 自定义项3 | def3 | varchar(101) |  | 字符串 (String) |
| 32 | def4 | 自定义项4 | def4 | varchar(101) |  | 字符串 (String) |
| 33 | def5 | 自定义项5 | def5 | varchar(101) |  | 字符串 (String) |
| 34 | def6 | 自定义项6 | def6 | varchar(101) |  | 字符串 (String) |