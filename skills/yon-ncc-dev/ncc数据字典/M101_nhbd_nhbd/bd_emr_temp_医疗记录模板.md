# |<<

**医疗记录模板 (bd_emr_temp / com.yonyou.yh.nhis.bd.emr.vo.EmrTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtemp | 医疗记录模板主键 | pk_emrtemp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrtype | 所属医疗记录类型 | pk_emrtype | varchar(20) |  | 问卷 (uh_qs_form) |
| 5 | code | 医疗记录模板编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | code_std | 对应国家标准编码 | code_std | varchar(50) |  | 字符串 (String) |
| 7 | name | 医疗记录模板名称 | name | varchar(100) |  | 字符串 (String) |
| 8 | show_name | 医疗记录模板显示名称 | show_name | varchar(100) |  | 字符串 (String) |
| 9 | emrtempverno | 医疗记录模板版本 | emrtempverno | varchar(50) |  | 字符串 (String) |
| 10 | pk_editor | 医疗记录编辑器 | pk_editor | varchar(20) |  | 医疗记录编辑器 (EMREditorVO) |
| 11 | func_editor_argu | 编辑器启动函数参数 | func_editor_argu | varchar(4000) |  | 字符串 (String) |
| 12 | pk_pvtype | 适用就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 13 | eu_applyto | 适用范围 | eu_applyto | int |  | 适用范围 (emrtempapplytoenum) |  | 1=临床病历; |