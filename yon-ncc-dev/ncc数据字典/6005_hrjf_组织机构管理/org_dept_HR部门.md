# |<<

**HR部门 (org_dept / nc.vo.om.hrdept.HRDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dept | 部门主键 | pk_dept | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级部门 | pk_fatherorg | varchar(20) |  | HR部门 (hrdept) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 8 | depttype | 部门类型 | depttype | smallint | √ | 部门类型 (depttype) | 0 | 0=普通部门; |