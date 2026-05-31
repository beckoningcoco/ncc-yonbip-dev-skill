# |<<

**医疗记录模板段落数据组 (bd_emr_temp_sec_dg / com.yonyou.yh.nhis.bd.emr.vo.EmrTmplSecDgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/831.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempsecdg | 医疗记录模板段落数据组主键 | pk_emrtempsecdg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrtempsec | 医疗记录模板段落 | pk_emrtempsec | varchar(20) |  | 医疗记录模板段落 (emrtmplsec) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_emrdg | 数据组 | pk_emrdg | varchar(50) |  | 字符串 (String) |