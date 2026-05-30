# |<<

**感染病例上报记录 (uh_pv_infect_rpt / nc.vo.nhcn.infectrpt.InfectRptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6231.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infect_rpt | 主键 | pk_infect_rpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_pv | 就诊主键 | pk_pv | char(20) |  | 主键 (UFID) |
| 6 | pk_pati | 患者主键 | pk_pati | char(20) |  | 主键 (UFID) |
| 7 | pk_psn_report | 报告人主键 | pk_psn_report | char(20) |  | 主键 (UFID) |
| 8 | name_psn_report | 报告人 | name_psn_report | varchar(50) |  | 字符串 (String) |
| 9 | pk_dept_report | 报告科室主键 | pk_dept_report | char(20) |  | 主键 (UFID) |
| 10 | name_dept_report | 报告科室 | name_dept_report | varchar(50) |  | 字符串 (String) |
| 11 | date_infect | 感染日期 | date_infect | varchar(50) |  | 字符串 (String) |
| 12 | pk_dept_infect | 感染科室主键0 | pk_dept_infect | char(20) |  | 主键 (UFID) |
| 13 | name_dept_infect | 感染科室 | name_dept_infect | varchar(50) |  | 字符串 (String) |
| 14 | pk_diag_infect | 感染诊断主键 | pk_diag_infect | char(20) |  | 主键 (UFID) |
| 15 | name_diag_infect | 感染诊断 | name_diag_infect | varchar(50) |  | 字符串 (String) |
| 16 | pk_infect_type | 感染类型主键 | pk_infect_type | char(20) |  | 主键 (UFID) |
| 17 | dt_infect_type | 感染类型编码 | dt_infect_type | varchar(50) |  | 字符串 (String) |
| 18 | pk_report_type | 上报类型主键 | pk_report_type | char(20) |  | 主键 (UFID) |
| 19 | dt_report_type | 上报类型编码 | dt_report_type | varchar(50) |  | 字符串 (String) |
| 20 | date_diagnosis | 确诊日期 | date_diagnosis | varchar(50) |  | 字符串 (String) |
| 21 | pk_device_infection | 器械相关性感染主键 | pk_device_infection | char(20) |  | 主键 (UFID) |
| 22 | dt_device_infection | 器械相关性感染 | dt_device_infection | varchar(50) |  | 字符串 (String) |
| 23 | pk_infect_outcome | 感染转归主键 | pk_infect_outcome | char(20) |  | 主键 (UFID) |
| 24 | dt_infect_outcome | 感染转归编码 | dt_infect_outcome | varchar(50) |  | 字符串 (String) |
| 25 | date_outcome | 转归日期 | date_outcome | char(50) |  | 字符串 (String) |
| 26 | pk_operation | 手术主键 | pk_operation | char(20) |  | 主键 (UFID) |
| 27 | name_operation | 手术名称 | name_operation | varchar(50) |  | 字符串 (String) |
| 28 | pk_incision_type | 切口类型主键 | pk_incision_type | char(20) |  | 主键 (UFID) |
| 29 | dt_incision_type | 切口类型编码 | dt_incision_type | varchar(50) |  | 字符串 (String) |
| 30 | pk_infect_death | 感染与死亡关系主键 | pk_infect_death | char(20) |  | 主键 (UFID) |
| 31 | dt_infect_death | 感染与死亡关系编码 | dt_infect_death | varchar(50) |  | 字符串 (String) |
| 32 | flag_ee | 病原学检查 | flag_ee | char(50) |  | 字符串 (String) |
| 33 | specimen_name | 标本名称 | specimen_name | varchar(50) |  | 字符串 (String) |
| 34 | pk_pathogen | 病原体主键 | pk_pathogen | char(20) |  | 主键 (UFID) |
| 35 | name_pathogen | 病原体名称 | name_pathogen | varchar(50) |  | 字符串 (String) |
| 36 | exam_status | 审核状态 | exam_status | varchar(50) |  | 字符串 (String) |
| 37 | reason | 删卡退卡原因 | reason | varchar(50) |  | 字符串 (String) |
| 38 | exam_psn | 审核人 | exam_psn | varchar(50) |  | 字符串 (String) |
| 39 | exam_date | 审核日期 | exam_date | varchar(50) |  | 字符串 (String) |
| 40 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 41 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 42 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 43 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 44 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 45 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 46 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 47 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 48 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |