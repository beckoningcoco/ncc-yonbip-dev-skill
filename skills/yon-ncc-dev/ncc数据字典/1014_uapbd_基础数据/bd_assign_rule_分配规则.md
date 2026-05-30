# |<<

**分配规则 (bd_assign_rule / nc.vo.bd.assign.AssignruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign_rule | 主键 | pk_assign_rule | char(20) | √ | 字符串 (String) |
| 2 | pk_assign_tab | 档案分配页签 | pk_assign_tab | varchar(20) |  | 档案分配页签 (assigntab) |
| 3 | pk_assign_temp | 分配默认值模板 | pk_assign_temp | char(20) | √ | 分配默认值模板 (assigntemplate) |
| 4 | pk_docclass | 档案分类 | pk_docclass | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |