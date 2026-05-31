# |<<

**规则类型 (sm_rule_type / nc.vo.uap.rbac.rule.PermissionRuleTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_type | 主键 | pk_rule_type | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 类型编码 | typecode | varchar(50) |  | 字符串 (String) |
| 3 | typename | 类型名称 | typename | varchar(50) |  | 字符串 (String) |
| 4 | ruleeditorclass | 规则编辑器类名 | ruleeditorclass | varchar(200) |  | 字符串 (String) |
| 5 | rulefactoryclass | 规则工厂类名 | rulefactoryclass | varchar(200) |  | 字符串 (String) |
| 6 | ownresource | 所属资源 | ownresource | varchar(20) |  | 权限资源 (PermissionResource) |
| 7 | ismetadatatype | 元数据规则类型 | ismetadatatype | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | ownmodule | 所属模块 | ownmodule | varchar(20) |  | 模块信息 (module) |
| 9 | seqnum | 编辑器的优先顺序 | seqnum | int |  | 整数 (Integer) |
| 10 | ruleeditorclass4web | 规则编辑器类型4web | ruleeditorclass4web | varchar(200) |  | 字符串 (String) |
| 11 | ruleeditorpath4js | 规则编辑器js路径 | ruleeditorpath4js | varchar(200) |  | 字符串 (String) |
| 12 | ruleeditortype | 规则编辑器类型 | ruleeditortype | varchar(50) |  | 字符串 (String) |