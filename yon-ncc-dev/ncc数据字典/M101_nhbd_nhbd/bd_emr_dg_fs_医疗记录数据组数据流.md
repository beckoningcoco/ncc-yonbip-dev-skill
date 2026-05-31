# |<<

**医疗记录数据组数据流 (bd_emr_dg_fs / com.yonyou.yh.nhis.bd.emr.vo.EmrDgFsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrdgfs | 医疗数据组数据流主键 | pk_emrdgfs | char(20) | √ | 主键 (UFID) |
| 2 | pk_emrdg | 医疗记录数据组 | pk_emrdg | varchar(20) |  | 医疗记录数据组 (emrdg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | emrdgfs | 医疗记录数据组流数据 | emrdgfs | image |  | BLOB (BLOB) |