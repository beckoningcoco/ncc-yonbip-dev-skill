# |<<

**组织视图-预算组织体系 (org_view_budgetstru / nc.vo.org.orgview.OrgViewBudgetStruSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budgetstrusub | 主键 | pk_budgetstrusub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级组织单元 | pk_fatherorg | varchar(20) |  | 组织结构_预算组织体系成员 (budgetorgstrumember) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |