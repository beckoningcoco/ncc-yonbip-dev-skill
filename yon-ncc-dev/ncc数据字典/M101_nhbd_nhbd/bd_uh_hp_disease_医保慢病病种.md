# |<<

**医保慢病病种 (bd_uh_hp_disease / com.yonyou.yh.nhis.bd.hpdisease.vo.HpDiseaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1034.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disease | 病种主键 | pk_disease | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | name_disease | 病种名称 | name_disease | varchar(256) |  | 字符串 (String) |
| 5 | pk_hp | 医保计划主键 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 6 | amount | 月报销额度 | amount | decimal(14, 2) |  | 数值 (UFDouble) |
| 7 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 8 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 9 | pk_diag | 诊断主键 | pk_diag | varchar(50) |  | 字符串 (String) |
| 10 | flag_active | 是否启用 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 12 | sortnum | 序号 | sortnum | int |  | 整数 (Integer) |
| 13 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 14 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 15 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 16 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 17 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |
| 18 | def6 | def6 | def6 | varchar(50) |  | 字符串 (String) |
| 19 | def7 | def7 | def7 | varchar(50) |  | 字符串 (String) |
| 20 | def8 | def8 | def8 | varchar(50) |  | 字符串 (String) |
| 21 | def9 | def9 | def9 | varchar(50) |  | 字符串 (String) |
| 22 | creator | 创建者 | creator | char(20) |  | 字符串 (String) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 25 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |