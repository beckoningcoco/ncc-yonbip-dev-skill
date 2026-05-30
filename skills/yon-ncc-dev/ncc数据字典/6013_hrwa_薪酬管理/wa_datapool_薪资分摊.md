# |<<

**薪资分摊 (wa_datapool / nc.vo.wa.datainterface.DataPoolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_datapool | 薪资分摊主表主键 | pk_wa_datapool | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_amotype | 分摊类型主键 | pk_wa_amotype | char(20) |  | 主键 (UFID) |
| 3 | pk_billtype | 单据类型主键 | pk_billtype | char(20) |  | 主键 (UFID) |
| 4 | pk_wa_class | 薪资类别主键 | pk_wa_class | char(20) |  | 主键 (UFID) |
| 5 | cyear | 年度 | cyear | varchar(50) |  | 字符串 (String) |
| 6 | cperiod | 期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 7 | currid | 币种主键 | currid | char(20) |  | 主键 (UFID) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | billmaker | 制单人 | billmaker | char(20) |  | 主键 (UFID) |
| 10 | saga_gtxid | 全局事务id | saga_gtxid | varchar(50) |  | 字符串 (String) |
| 11 | saga_btxid | 本地事务ID | saga_btxid | varchar(50) |  | 字符串 (String) |
| 12 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |