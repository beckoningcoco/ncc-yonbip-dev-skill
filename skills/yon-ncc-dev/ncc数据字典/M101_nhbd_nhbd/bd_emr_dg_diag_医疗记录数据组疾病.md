# |<<

**医疗记录数据组疾病 (bd_emr_dg_diag / com.yonyou.yh.nhis.bd.emr.vo.EmrDgDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/817.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrdgdiag | 医疗记录数据组疾病主键 | pk_emrdgdiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_emrdg | 医疗记录数据组 | pk_emrdg | varchar(20) |  | 医疗记录数据组 (emrdg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_diag | 疾病诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 6 | note | 适用说明 | note | varchar(4000) |  | 字符串 (String) |