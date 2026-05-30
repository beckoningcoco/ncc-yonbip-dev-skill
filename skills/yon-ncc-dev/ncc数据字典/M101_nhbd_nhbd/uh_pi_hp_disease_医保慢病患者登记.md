# |<<

**医保慢病患者登记 (uh_pi_hp_disease / com.yonyou.yh.nhis.bd.hpdisease.vo.PatiHpDiseaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pi_disease | 患者病种主键 | pk_pi_disease | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | idno | 身份证号 | idno | varchar(50) |  | 字符串 (String) |
| 5 | name | 姓名 | name | varchar(50) |  | 字符串 (String) |
| 6 | pk_disease | 病种主键 | pk_disease | varchar(20) |  | 医保慢病病种 (HpDiseaseVO) |
| 7 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 8 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 9 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 10 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 11 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |
| 12 | def6 | def6 | def6 | varchar(50) |  | 字符串 (String) |
| 13 | def7 | def7 | def7 | varchar(50) |  | 字符串 (String) |
| 14 | def8 | def8 | def8 | varchar(50) |  | 字符串 (String) |
| 15 | def9 | def9 | def9 | varchar(50) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 19 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |