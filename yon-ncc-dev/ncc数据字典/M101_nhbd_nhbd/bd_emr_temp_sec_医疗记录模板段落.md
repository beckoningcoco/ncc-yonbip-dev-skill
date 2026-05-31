# |<<

**医疗记录模板段落 (bd_emr_temp_sec / com.yonyou.yh.nhis.bd.emr.vo.EmrTmplSecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempsec | 医疗记录模板段落主键 | pk_emrtempsec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrtemp | 医疗记录模板 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_emrsectype | 段落类型 | pk_emrsectype | varchar(20) |  | 文书段落类型(自定义档案) (Defdoc-060305) |
| 7 | dt_emrsectype | 段落类型编码 | dt_emrsectype | varchar(50) |  | 字符串 (String) |
| 8 | code_sec | 段落编码 | code_sec | varchar(50) |  | 字符串 (String) |
| 9 | name_sec | 段落名称 | name_sec | varchar(50) |  | 字符串 (String) |
| 10 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |