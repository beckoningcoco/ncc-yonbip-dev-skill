# |<<

**收付业务数据 (arap_busidata / nc.vo.arap.agiotage.ArapBusiDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/169.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busidata | 主标识 | pk_busidata | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_termitem | 收付款协议辅表oid | pk_termitem | char(20) |  | 主键 (UFID) |
| 5 | pk_bill | 单据主表ID | pk_bill | char(20) |  | 主键 (UFID) |
| 6 | pk_item | 辅表主键 | pk_item | char(20) |  | 主键 (UFID) |
| 7 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | billclass | 单据大类 | billclass | varchar(50) |  | 单据大类 (billclass) |  | ys=应收单; |