# |<<

**档案配置_档案唯一性规则 (bd_uniquerule / nc.vo.bd.config.BDUniqueruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 规则主键 | pk_rule | varchar(50) | √ | 字符串 (String) |
| 2 | mdclassid | 元数据主键 | mdclassid | varchar(36) |  | 字符串 (String) |
| 3 | rulecontent | 规则描述 | rulecontent | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | isdefault | 预置规则 | isdefault | char(1) |  | 布尔类型 (UFBoolean) | N |
| 5 | errorcode | 异常号 | errorcode | varchar(50) |  | 规则异常 (ruleexception) | 32000 | 32000=其它; |