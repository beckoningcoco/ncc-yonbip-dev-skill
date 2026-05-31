# |<<

**医疗记录模板段落数据元 (bd_emr_temp_sec_de / com.yonyou.yh.nhis.bd.emr.vo.EmrTmplSecDeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempsecde | 医疗记录模板段落数据元主键 | pk_emrtempsecde | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrtempsec | 医疗记录模板段落 | pk_emrtempsec | varchar(20) |  | 医疗记录模板段落 (emrtmplsec) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_de | 数据元 | pk_de | varchar(20) |  | 数据元管理 (phdm) |
| 7 | code | 数据元编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | name | 数据元名称 | name | varchar(50) |  | 字符串 (String) |
| 9 | describe | 数据元描述 | describe | varchar(256) |  | 字符串 (String) |
| 10 | flag_active | 数据元启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |