# |<<

**规则方案 (cca_rulescheme / nc.vo.cca.rulescheme.RuleSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1303.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rulescheme | 规则方案主键 | pk_rulescheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pk_org | 管理组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | name | 规则方案名称 | name | varchar(80) | √ | 多语文本 (MultiLangText) |
| 8 | code | 规则方案编码 | code | varchar(40) | √ | 字符串 (String) |
| 9 | meno | 备注 | meno | varchar(200) |  | 字符串 (String) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |