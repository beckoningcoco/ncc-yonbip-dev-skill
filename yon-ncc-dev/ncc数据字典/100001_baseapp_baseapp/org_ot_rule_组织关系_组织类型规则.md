# |<<

**组织关系_组织类型规则 (org_ot_rule / nc.vo.org.orgmodel.OrgTypeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgtyperule | 组织类型规则主键 | pk_orgtyperule | char(20) | √ | 主键 (UFID) |
| 2 | mainorgtype | 主组织类型 | mainorgtype | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 3 | orgtype1 | 组织类型名称1 | orgtype1 | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 4 | orgtype2 | 组织类型名称2 | orgtype2 | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 5 | orgtype3 | 组织类型名称3 | orgtype3 | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 6 | orgtype4 | 组织类型名称4 | orgtype4 | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 7 | orgtype5 | 组织类型名称5 | orgtype5 | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 8 | orgtype6 | 组织类型名称6 | orgtype6 | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 9 | pk_ruletype | 组织类型间关系类型 | pk_ruletype | varchar(20) |  | 组织关系_组织类型间规则类型 (orgtyperuletype) |