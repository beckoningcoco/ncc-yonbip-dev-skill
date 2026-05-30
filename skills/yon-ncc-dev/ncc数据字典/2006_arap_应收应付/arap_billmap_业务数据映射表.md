# |<<

**业务数据映射表 (arap_billmap / nc.vo.arap.pfflow.ArapBillMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/167.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billmap | 主键 | pk_billmap | varchar(50) | √ | 字符串 (String) |
| 2 | maptype | 占用标志 | maptype | int |  | 整数 (Integer) |
| 3 | oldje | 历史金额 | oldje | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | ybje | 原币金额 | ybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | ybye | 原币余额 | ybye | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | s_system | 系统来源 | s_system | int |  | 整数 (Integer) |
| 7 | s_billtype | 源单据类型 | s_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | s_billid | 源单据主键 | s_billid | varchar(20) |  | 字符串 (String) |
| 9 | s_itemid | 源单据行主键 | s_itemid | varchar(20) |  | 字符串 (String) |
| 10 | s_termid | 源单据协议表主键 | s_termid | varchar(20) |  | 字符串 (String) |
| 11 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | t_billtype | 目的单据类型 | t_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 14 | t_billid | 目的单据主键 | t_billid | varchar(20) |  | 字符串 (String) |
| 15 | t_itemid | 目的单据行主键 | t_itemid | varchar(20) |  | 字符串 (String) |
| 16 | t_termid | 目的协议表主键 | t_termid | varchar(20) |  | 字符串 (String) |
| 17 | ismanual | 是否手工关联 | ismanual | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | settlecurr | 拉单币种 | settlecurr | varchar(20) |  | 币种 (currtype) |
| 19 | settlemoney | 拉单金额 | settlemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | pk_org1 | 上游财务组织 | pk_org1 | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | dr | 删除标志 | dr | int |  | 整数 (Integer) |