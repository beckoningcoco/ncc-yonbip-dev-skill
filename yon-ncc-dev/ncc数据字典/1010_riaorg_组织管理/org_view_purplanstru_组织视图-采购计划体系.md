# |<<

**组织视图-采购计划体系 (org_view_purplanstru / nc.vo.org.orgview.OrgViewPurPlanStruSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4194.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_purplanstrusub | 主键 | pk_purplanstrusub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级组织单元 | pk_fatherorg | varchar(20) |  | 组织结构_采购计划体系成员 (purplanstrumember) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | isorgunit | 是否业务单元 | isorgunit | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isdept | 是否部门 | isdept | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | orgvoclass | 组织VO类 | orgvoclass | varchar(50) |  | 字符串 (String) |
| 12 | pk_busiorg | 对应业务单元组织 | pk_busiorg | varchar(50) |  | 字符串 (String) |
| 13 | pk_pps | 所属采购计划体系 | pk_pps | varchar(20) |  | 组织结构_采购计划体系 (purplanstru) |
| 14 | virtualorg | 虚组织 | virtualorg | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_entityorg | 对应实体组织 | pk_entityorg | varchar(20) |  | 组织 (org) |
| 16 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |