# |<<

**核销主表 (arap_verify / nc.vo.arap.verify.VerifyMainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify | 主表主键 | pk_verify | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | scomment | 摘要 | scomment | varchar(300) |  | 字符串 (String) |
| 5 | busiflag | 处理标志 | busiflag | int |  | 整数 (Integer) |
| 6 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 7 | busino | 处理编号 | busino | varchar(50) |  | 字符串 (String) |
| 8 | money_de | 借方处理原币金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | local_money_de | 借方处理本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | money_cr | 贷方处理原币金额 | money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | group_money_de | 借方处理集团本币金额 | group_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | group_money_cr | 贷方处理集团本币金额 | group_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | global_money_de | 借方处理全局本币金额 | global_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | global_money_cr | 贷方处理全局本币金额 | global_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | local_money_cr | 贷方处理本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | quantity_de | 借方处理数量 | quantity_de | decimal(20, 8) |  | 数值 (UFDouble) |
| 17 | quantity_cr | 贷方处理数量 | quantity_cr | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | pk_currtype_de | 借方币种 | pk_currtype_de | varchar(20) |  | 币种 (currtype) |
| 19 | pk_currtype_cr | 贷方币种 | pk_currtype_cr | varchar(20) |  | 币种 (currtype) |
| 20 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 21 | saga_gtxid | 全局事务 | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 22 | saga_btxid | 子事务 | saga_btxid | varchar(64) |  | 字符串 (String) |
| 23 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |
| 24 | creator | 处理人 | creator | varchar(20) |  | 用户 (user) |