# |<<

**业务分配规则 (ssc_allotrule / nc.vo.ssc.task.allotrule.SSCAllotRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5500.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allotrule | 主键 | pk_allotrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscorg | 所属共享服务组织 | pk_sscorg | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 交易类型所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_tranction | 交易类型 | pk_tranction | text(0) |  | 字符串 (String) |
| 6 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |