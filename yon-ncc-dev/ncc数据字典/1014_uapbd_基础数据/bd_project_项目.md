# |<<

**项目 (bd_project / nc.vo.pmpub.project.ProjectHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/930.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_project | 项目主键 | pk_project | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 管理组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_duty_dept | 责任部门 | pk_duty_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_dutier | 责任人 | pk_dutier | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | project_code | 项目编码 | project_code | varchar(40) |  | 字符串 (String) |
| 7 | project_name | 项目名称 | project_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | project_sh_name | 项目简称 | project_sh_name | varchar(80) |  | 字符串 (String) |
| 9 | project_ot_name | 项目曾用名 | project_ot_name | varchar(80) |  | 字符串 (String) |
| 10 | pk_projectclass | 项目类型 | pk_projectclass | varchar(20) |  | 项目类型 (projectclass) |
| 11 | pk_eps | 项目基本分类 | pk_eps | varchar(20) |  | 项目基本分类 (EpsVO) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |