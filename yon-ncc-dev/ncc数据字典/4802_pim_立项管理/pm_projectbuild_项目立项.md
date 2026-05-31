# |<<

**项目立项 (pm_projectbuild / nc.vo.ppm.projectbuild.ProjectBuildHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4509.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectbuild | 项目立项单主键 | pk_projectbuild | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 单据编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 3 | pk_operuser | 申请人 | pk_operuser | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | pk_operdept | 申请部门 | pk_operdept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_operdept_v | 申请部门版本 | pk_operdept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 6 | oper_date | 申请日期 | oper_date | char(19) |  | 日期 (UFDate) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | builfreason | 立项说明 | builfreason | varchar(200) |  | 字符串 (String) |
| 9 | description | 项目描述 | description | varchar(200) |  | 字符串 (String) |
| 10 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 11 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 12 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 14 | project_name | 项目名称 | project_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 15 | project_sh_name | 项目简称 | project_sh_name | varchar(40) |  | 字符串 (String) |
| 16 | pk_projectclass | 项目类型 | pk_projectclass | varchar(20) |  | 项目类型 (projectclass) |
| 17 | pk_duty_dept | 责任部门1 | pk_duty_dept | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_duty_dept_v | 责任部门 | pk_duty_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 19 | pk_dutier | 项目经理 | pk_dutier | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | plan_start_date | 立项日期 | plan_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 21 | plan_finish_date | 计划完成日期 | plan_finish_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 22 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 23 | billmaketime | 制单日期 | billmaketime | char(19) |  | 日期 (UFDate) |
| 24 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |