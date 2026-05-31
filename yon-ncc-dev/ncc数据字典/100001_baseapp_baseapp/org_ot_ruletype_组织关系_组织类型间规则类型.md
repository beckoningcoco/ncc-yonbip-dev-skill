# |<<

**组织关系_组织类型间规则类型 (org_ot_ruletype / nc.vo.org.orgmodel.OrgTypeRuleTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruletype | 组织类型规则类型主键 | pk_ruletype | char(20) | √ | 主键 (UFID) |
| 2 | name | 规则类型名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | code | 规则类型编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | rulevalidateclass | 规则校验类路径 | rulevalidateclass | varchar(200) |  | 字符串 (String) |
| 5 | memo | 规则说明 | memo | varchar(1024) |  | 备注 (Memo) |