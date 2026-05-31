# |<<

**随访计划 (uh_pv_flup / com.yonyou.yh.nhis.pv.fp.vo.PVFlupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvflup | 随访计划主键 | pk_pvflup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | code_flup | 计划编码 | code_flup | varchar(50) |  | 字符串 (String) |
| 6 | name_flup | 计划名称 | name_flup | varchar(50) |  | 字符串 (String) |
| 7 | datetime_flup_begin | 计划开始日期 | datetime_flup_begin | char(19) |  | 日期时间 (UFDateTime) |
| 8 | datetime_flup_end | 计划结束日期 | datetime_flup_end | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_org_flup | 随访机构 | pk_org_flup | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 10 | pk_dept_flup | 随访部门 | pk_dept_flup | varchar(20) |  | 组织_部门 (dept) |
| 11 | pk_wg_flup | 随访医疗组 | pk_wg_flup | varchar(20) |  | 医疗组 (uhworkgrp) |
| 12 | pk_psn_flup_plan | 计划随访人员 | pk_psn_flup_plan | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | name_psn_flup_plan | 计划随访人员姓名 | name_psn_flup_plan | varchar(50) |  | 字符串 (String) |
| 14 | pk_emrtemp | 随访记录模板 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 15 | datetime_flup_exec | 随访日期 | datetime_flup_exec | char(19) |  | 日期时间 (UFDateTime) |
| 16 | pk_psn_flup_exec | 随访人员 | pk_psn_flup_exec | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | name_psn_flup_exec | 随访人员姓名 | name_psn_flup_exec | varchar(50) |  | 字符串 (String) |
| 18 | pk_emr_exec | 随访记录 | pk_emr_exec | varchar(20) |  | 字符串 (String) |
| 19 | eu_mode_flup | 随访方式 | eu_mode_flup | int |  | 随访方式 (FlupModeEnum) |  | 0=电话随访; |