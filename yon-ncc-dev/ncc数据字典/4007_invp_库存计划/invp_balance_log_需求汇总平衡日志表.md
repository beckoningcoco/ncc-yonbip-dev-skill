# |<<

**需求汇总平衡日志表 (invp_balance_log / nc.vo.invp.result.entity.BalanceLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancelog | 需求汇总平衡日志表主键 | pk_balancelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 本次平衡库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | src_billid | 来源单据id | src_billid | varchar(20) |  | 字符串 (String) |
| 5 | src_billbid | 来源单据表体id | src_billbid | varchar(20) |  | 字符串 (String) |
| 6 | src_billcode | 来源单据号 | src_billcode | varchar(20) |  | 字符串 (String) |
| 7 | src_rowno | 来源单据行号 | src_rowno | varchar(40) |  | 字符串 (String) |
| 8 | cdownbilltypecode | 下游单据类型 | cdownbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | cdowntranstype | 下游单据交易类型 | cdowntranstype | varchar(20) |  | 交易类型 (transtype) |
| 10 | vdownbillcode | 下游单据号 | vdownbillcode | varchar(50) |  | 字符串 (String) |
| 11 | cdownbillid | 下游单据主表ID | cdownbillid | varchar(50) |  | 字符串 (String) |
| 12 | cdownbillbid | 下游单据表体ID | cdownbillbid | varchar(50) |  | 字符串 (String) |
| 13 | vdownrowno | 下游单据行号 | vdownrowno | varchar(50) |  | 字符串 (String) |
| 14 | nnetnum | 请购数量 | nnetnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | csummarypsn | 汇总人 | csummarypsn | varchar(20) |  | 用户 (user) |
| 16 | csummarydate | 汇总日期 | csummarydate | char(19) |  | 日期 (UFDate) |
| 17 | ctransbilltypecode | 调拨单据类型 | ctransbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | ctranstranstype | 调拨订单交易类型 | ctranstranstype | varchar(20) |  | 调拨订单交易类型 (to_m5xtrantype) |
| 19 | vtransbillcode | 调拨单据号 | vtransbillcode | varchar(50) |  | 字符串 (String) |
| 20 | ctransbillid | 调拨单据主表ID | ctransbillid | varchar(50) |  | 字符串 (String) |
| 21 | ctransbillbid | 调拨单据表体ID | ctransbillbid | varchar(50) |  | 字符串 (String) |
| 22 | vtransrowno | 调拨单据行号 | vtransrowno | varchar(50) |  | 字符串 (String) |
| 23 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 24 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 25 | saga_btxid | 事务分支id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 26 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |