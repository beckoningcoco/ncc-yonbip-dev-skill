# |<<

**组织_部门版本信息 (org_dept_v / nc.vo.vorg.DeptVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | char(0) |  | 组织_部门 (dept) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 6 | pk_fatherorg | 上级部门 | pk_fatherorg | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | depttype | 部门类型 | depttype | smallint |  | 部门类型 (depttype) | 0 | 0=普通部门; |