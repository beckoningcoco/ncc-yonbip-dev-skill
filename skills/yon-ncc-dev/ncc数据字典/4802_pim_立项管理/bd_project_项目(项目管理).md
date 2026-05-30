# |<<

**项目(项目管理) (bd_project / nc.vo.pim.project.ProjectHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_project | 项目主键 | pk_project | char(20) | √ | 主键 (UFID) |
| 2 | project_name | 项目名称 | project_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 项目组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 6 | pk_duty_org | 责任组织 | pk_duty_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 7 | pk_duty_org_v | 责任组织多版本 | pk_duty_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 8 | pk_duty_dept | 责任部门 | pk_duty_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_duty_dept_v | 责任部门多版本 | pk_duty_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | pk_dutier | 项目经理 | pk_dutier | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | project_code | 项目编码 | project_code | varchar(40) |  | 字符串 (String) |
| 12 | project_sh_name | 项目简称 | project_sh_name | varchar(80) |  | 字符串 (String) |
| 13 | project_ot_name | 项目曾用名 | project_ot_name | varchar(200) |  | 字符串 (String) |
| 14 | pk_projectclass | 项目类型 | pk_projectclass | varchar(20) |  | 项目类型 (projectclass) |
| 15 | pk_wbstemplate | WBS模板 | pk_wbstemplate | varchar(20) |  | WBS模板 (wbstemplet) |
| 16 | pk_eps | 项目基本分类 | pk_eps | varchar(20) |  | 项目基本分类 (EpsVO) |
| 17 | enablestate | 启用状态 | enablestate | int |  | 启用状态(项目管理) (pmEnablestate) |  | 1=未启用; |