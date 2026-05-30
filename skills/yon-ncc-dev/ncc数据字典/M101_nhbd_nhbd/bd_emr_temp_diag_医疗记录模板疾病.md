# |<<

**医疗记录模板疾病 (bd_emr_temp_diag / com.yonyou.yh.nhis.bd.emr.vo.EmrTmplDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempdiag | 病历模板疾病关系主键 | pk_emrtempdiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrtemp | 医疗记录模板 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 5 | pk_diag | 疾病诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 6 | note | 适用说明 | note | varchar(4000) |  | 字符串 (String) |