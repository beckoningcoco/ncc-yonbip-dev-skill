# |<<

**医疗记录数据组数据元 (bd_emr_dg_de / com.yonyou.yh.nhis.bd.emr.vo.EmrDgDeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/816.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrdgde | 医疗记录数据组数据元主键 | pk_emrdgde | char(20) | √ | 主键 (UFID) |
| 2 | pk_emrdg | 医疗记录数据组 | pk_emrdg | varchar(20) |  | 医疗记录数据组 (emrdg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_de | 数据元 | pk_de | varchar(20) |  | 数据元管理 (phdm) |
| 6 | code | 数据元编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 数据元名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | describe | 数据元描述 | describe | varchar(256) |  | 字符串 (String) |
| 9 | flag_active | 数据元启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |