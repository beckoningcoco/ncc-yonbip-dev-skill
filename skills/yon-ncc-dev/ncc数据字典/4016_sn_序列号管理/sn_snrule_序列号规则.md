# |<<

**序列号规则 (sn_snrule / nc.vo.sn.snrule.entity.SnRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5379.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_snrule | 序列号主键 | pk_snrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vrulename | 规则名称 | vrulename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | vrulecode | 规则编码 | vrulecode | varchar(50) |  | 字符串 (String) |
| 5 | vprefix | 前缀 | vprefix | varchar(50) |  | 字符串 (String) |
| 6 | vsuffix | 后缀 | vsuffix | varchar(50) |  | 字符串 (String) |
| 7 | vobject1 | 业务对象1 | vobject1 | int |  | 业务对象 (RuleObjectEnum) |  | 1=物料编码; |