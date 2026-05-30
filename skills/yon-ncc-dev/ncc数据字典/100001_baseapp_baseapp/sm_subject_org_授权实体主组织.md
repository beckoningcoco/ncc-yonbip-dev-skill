# |<<

**授权实体主组织 (sm_subject_org / nc.vo.uap.rbac.SubjectOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5349.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subject_org | 主键 | pk_subject_org | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | subjectid | 授权主体 | subjectid | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | orgtype | 组织类型 | orgtype | varchar(50) |  | 字符串 (String) |
| 6 | isrule | 是否规则 | isrule | varchar(50) |  | 字符串 (String) |
| 7 | rulepar | 规则参数 | rulepar | varchar(50) |  | 字符串 (String) |
| 8 | creator | 授权人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 授权时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |