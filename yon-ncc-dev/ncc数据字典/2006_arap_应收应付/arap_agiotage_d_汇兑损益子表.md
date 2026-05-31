# |<<

**汇兑损益子表 (arap_agiotage_d / nc.vo.arap.agiotage.AgiotageChildVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agiotage_d | 主键 | pk_agiotage_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_agiotage | 主表主键 | pk_agiotage | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | scomment | 摘要 | scomment | varchar(300) |  | 字符串 (String) |
| 6 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 7 | busiyear | 处理年度 | busiyear | char(4) |  | 主键 (UFID) |
| 8 | busiperiod | 处理期间 | busiperiod | char(2) |  | 主键 (UFID) |
| 9 | pk_termitem | 收付业务数据标识 | pk_termitem | char(20) |  | 主键 (UFID) |
| 10 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | billno | 单据编号 | billno | varchar(40) |  | 字符串 (String) |
| 12 | local_money_de | 借方处理本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | local_money_cr | 贷方处理本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | rate | 汇率 | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | currtype | 币种 | currtype | varchar(20) |  | 币种 (currtype) |
| 16 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | global_money_de | 借方处理全局本币金额 | global_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | global_money_cr | 贷方处理全局本币金额 | global_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | group_money_cr | 贷方处理集团本币金额 | group_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | group_money_de | 借方处理集团本币金额 | group_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | pk_bill | 单据PK | pk_bill | varchar(30) |  | 字符串 (String) |
| 22 | pk_item | 单据子表PK | pk_item | varchar(30) |  | 字符串 (String) |
| 23 | supplier | 供应商 | supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 25 | globalrate | 全局本币汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | grouprate | 集团本币汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | pk_busidata | 业务数据主键 | pk_busidata | varchar(20) |  | 收付业务数据 (arap_busidata) |
| 28 | money_bal | 原币余额 | money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | local_money_bal | 组织本币余额 | local_money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | group_money_bal | 集团本币余额 | group_money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | global_money_bal | 全局本币余额 | global_money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | redflag | 红冲标志 | redflag | int |  | 整数 (Integer) |
| 33 | expiredate | 信用到期日 | expiredate | char(19) |  | 日期 (UFDate) |
| 34 | innerctldeferdays | 内控到期日 | innerctldeferdays | char(19) |  | 日期 (UFDate) |
| 35 | ordercubasdoc | 订单客户 | ordercubasdoc | varchar(20) |  | 客户基本信息 (customer) |