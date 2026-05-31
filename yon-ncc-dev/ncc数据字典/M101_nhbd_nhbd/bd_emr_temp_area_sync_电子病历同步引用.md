# |<<

**电子病历同步引用 (bd_emr_temp_area_sync / com.yonyou.yh.nhis.bd.ecd.vo.EmrTempAreaSyncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempareasync | 主键 | pk_emrtempareasync | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | name_emrtemp_s | 源模板名称 | name_emrtemp_s | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 5 | desc_emrtemp_s | 源模版名称描述 | desc_emrtemp_s | varchar(50) |  | 字符串 (String) |
| 6 | code_emrtemp_s | 源模板编码 | code_emrtemp_s | varchar(50) |  | 字符串 (String) |
| 7 | code_phase_s | 源段落编码 | code_phase_s | varchar(50) |  | 字符串 (String) |
| 8 | code_area_s | 源结构化区域 | code_area_s | varchar(50) |  | 字符串 (String) |
| 9 | name_emrtemp_t | 目标模板名称 | name_emrtemp_t | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 10 | desc_emrtemp_t | 目标模版名称描述 | desc_emrtemp_t | varchar(50) |  | 字符串 (String) |
| 11 | code_emrtemp_t | 目标模板编码 | code_emrtemp_t | varchar(50) |  | 字符串 (String) |
| 12 | code_phase_t | 目标段落编码 | code_phase_t | varchar(50) |  | 字符串 (String) |
| 13 | code_area_t | 目标结构化区域 | code_area_t | varchar(50) |  | 字符串 (String) |
| 14 | upd_auto | 自动更新 | upd_auto | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | ref_seq | 引用顺序 | ref_seq | varchar(2) |  | 字符串 (String) |
| 16 | desc_phase_s | 源段落描述 | desc_phase_s | varchar(50) |  | 字符串 (String) |
| 17 | desc_phase_t | 目标段落描述 | desc_phase_t | varchar(50) |  | 字符串 (String) |
| 18 | desc_area_s | 源结构化区域描述 | desc_area_s | varchar(50) |  | 字符串 (String) |
| 19 | desc_area_t | 目标结构化区域描述 | desc_area_t | varchar(50) |  | 字符串 (String) |