# |<<

**临床_医疗记录 (uh_cn_emr / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emr | 医疗记录主键 | pk_emr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pati | 患者 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 7 | pk_pv | 就诊编码 | pk_pv | varchar(50) |  | 字符串 (String) |
| 8 | pk_emrtype | 医疗记录类型 | pk_emrtype | varchar(20) |  | 问卷 (uh_qs_form) |
| 9 | pk_emrtemp | 医疗记录模板 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 10 | code_emr | 医疗记录编码 | code_emr | varchar(30) |  | 字符串 (String) |
| 11 | name_emr | 医疗记录名称 | name_emr | varchar(60) |  | 字符串 (String) |
| 12 | pk_editor | 医疗记录编辑器 | pk_editor | varchar(20) |  | 医疗记录编辑器 (EMREditorVO) |
| 13 | func_edtor_argu | 编辑器启动函数参数 | func_edtor_argu | varchar(4000) |  | 字符串 (String) |
| 14 | eu_fsmode | 数据流存储方式 | eu_fsmode | int |  | 整数 (Integer) |
| 15 | pk_dept_emr | 医疗记录科室 | pk_dept_emr | varchar(20) |  | 组织_部门 (dept) |
| 16 | date_entry | 医疗记录制作日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 17 | pk_psn_entry | 医疗记录医师 | pk_psn_entry | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | name_psn_entry | 医疗记录医师名称 | name_psn_entry | varchar(50) |  | 字符串 (String) |
| 19 | date_sign | 医疗记录审核日期 | date_sign | char(19) |  | 日期时间 (UFDateTime) |
| 20 | pk_psn_sign | 审核医师 | pk_psn_sign | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | name_psn_sign | 审核医师名称 | name_psn_sign | varchar(50) |  | 字符串 (String) |
| 22 | date_chk | 确认日期 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 23 | pk_psn_chk | 确认医师 | pk_psn_chk | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | name_psn_chk | 确认医师名称 | name_psn_chk | varchar(50) |  | 字符串 (String) |
| 25 | grade_qa | 最近质控分数 | grade_qa | decimal(14, 2) |  | 数值 (UFDouble) |
| 26 | pk_cnet | 临床事件 | pk_cnet | varchar(50) |  | 字符串 (String) |
| 27 | eu_status | 状态 | eu_status | int |  | 医疗记录状态 (医疗记录状态) |  | 0=建立; |