# |<<

**医疗执行_部门_医技 (uh_ex_dept_mt / com.yonyou.yh.nhis.ex.mt.vo.DeptMTApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptmt | 医疗执行部门医技主键 | pk_deptmt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_exdepttype | 部门医疗执行类型 | pk_exdepttype | varchar(20) |  | 医疗执行_部门类型(自定义档案) (Defdoc-120200) |
| 7 | dt_exdepttype | 部门医疗执行类型编码 | dt_exdepttype | varchar(50) |  | 字符串 (String) |
| 8 | code_ex | 医疗执行部门医技编码 | code_ex | varchar(50) |  | 字符串 (String) |
| 9 | name_ex | 医疗执行部门医技名称 | name_ex | varchar(50) |  | 字符串 (String) |
| 10 | pk_org_appl | 医疗申请机构 | pk_org_appl | varchar(50) |  | 字符串 (String) |
| 11 | pk_dept_appl | 医疗申请部门 | pk_dept_appl | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_psn_appl | 医疗申请人员 | pk_psn_appl | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | name_psn_appl | 医疗申请人员名称 | name_psn_appl | varchar(256) |  | 字符串 (String) |
| 14 | date_appl | 医疗申请日期 | date_appl | char(19) |  | 日期时间 (UFDateTime) |
| 15 | flag_ex | 已医疗执行标志 | flag_ex | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_org_ex | 医疗执行机构 | pk_org_ex | varchar(50) |  | 字符串 (String) |
| 17 | pk_dept_ex | 医疗执行部门 | pk_dept_ex | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_psn_ex | 医疗执行人员 | pk_psn_ex | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | name_psn_ex | 医疗执行人员名称 | name_psn_ex | varchar(256) |  | 字符串 (String) |
| 20 | date_ex | 医疗执行日期 | date_ex | char(19) |  | 日期时间 (UFDateTime) |
| 21 | flag_canc | 医疗执行取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | pk_org_canc | 医疗执行取消机构 | pk_org_canc | varchar(50) |  | 字符串 (String) |
| 23 | pk_dept_canc | 医疗执行取消部门 | pk_dept_canc | varchar(20) |  | 组织_部门 (dept) |
| 24 | pk_psn_canc | 医疗执行取消人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | name_psn_canc | 医疗执行取消人员名称 | name_psn_canc | varchar(256) |  | 字符串 (String) |
| 26 | date_canc | 医疗执行取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 27 | flag_cg | 医疗执行记费标志 | flag_cg | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | pk_cg | 记费 | pk_cg | varchar(50) |  | 字符串 (String) |
| 29 | eu_status | 部门医技执行状态 | eu_status | int |  | 医疗执行部门医技状态 (deptmtappstatus) |  | 0=申请; |