# |<<

**档案配置_档案唯一性规则属性项 (bd_uniquerule_item / nc.vo.bd.config.BDUniqueruleItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleitem | 规则属性主键 | pk_ruleitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_rule | 规则主键 | pk_rule | varchar(50) | √ | 字符串 (String) |
| 3 | mdcolumnid | 属性主键 | mdcolumnid | varchar(36) | √ | 字符串 (String) |
| 4 | mdcolumnname | 属性名称 | mdcolumnname | varchar(50) |  | 字符串 (String) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |