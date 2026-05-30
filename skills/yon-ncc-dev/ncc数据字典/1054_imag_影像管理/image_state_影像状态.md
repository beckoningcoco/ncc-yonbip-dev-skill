# |<<

**影像状态 (image_state / nc.vo.image.ImageStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3128.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | billid | 单据主键 | billid | char(20) | √ | 主键 (UFID) |
| 2 | factorycode | 影像厂商 | factorycode | varchar(50) |  | 字符串 (String) |
| 3 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | imagestate | 影像状态 | imagestate | int |  | 整数 (Integer) |
| 5 | datasource | 帐套 | datasource | varchar(50) |  | 字符串 (String) |
| 6 | groupid | 集团 | groupid | varchar(50) |  | 字符串 (String) |
| 7 | userid | 用户 | userid | varchar(50) |  | 字符串 (String) |
| 8 | scantype | 扫描方式 | scantype | int |  | 整数 (Integer) |
| 9 | scanrepeat | 驳回是否作废影像 | scanrepeat | varchar(50) |  | 字符串 (String) |
| 10 | flowrepeat | 驳回是否重走流程 | flowrepeat | varchar(50) |  | 字符串 (String) |
| 11 | targetact | 驳回到环节 | targetact | varchar(50) |  | 字符串 (String) |
| 12 | transtype | 交易类型 | transtype | varchar(50) |  | 字符串 (String) |
| 13 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 14 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 15 | saga_btxid | 事务分支id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 16 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) |
| 17 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 18 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |