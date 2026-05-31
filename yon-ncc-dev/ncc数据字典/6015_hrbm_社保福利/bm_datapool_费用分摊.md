# |<<

**费用分摊 (bm_datapool / nc.vo.bm.amo.DataPoolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1224.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_datapool | 费用分摊主表主键 | pk_bm_datapool | char(20) | √ | 主键 (UFID) |
| 2 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 3 | pk_bm_class | 险种主键 | pk_bm_class | char(20) |  | 主键 (UFID) |
| 4 | cyear | 年度 | cyear | varchar(50) |  | 字符串 (String) |
| 5 | cperiod | 期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 6 | currid | 当前操作人 | currid | char(20) |  | 主键 (UFID) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 9 | saga_btxid | 本地事务id | saga_btxid | varchar(50) |  | 字符串 (String) |
| 10 | saga_gtxid | 全局事务ID | saga_gtxid | varchar(50) |  | 字符串 (String) |