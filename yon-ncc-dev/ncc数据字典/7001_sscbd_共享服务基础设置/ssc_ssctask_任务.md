# |<<

**任务 (ssc_ssctask / nc.vo.ssc.task.task.SSCTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5524.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ssctask | 实体标识 | pk_ssctask | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | src_system | 来源系统 | src_system | varchar(50) |  | 字符串 (String) |
| 6 | barcode | 任务条码 | barcode | varchar(200) |  | 字符串 (String) |
| 7 | exigencelevel | 紧急程度 | exigencelevel | varchar(50) |  | 紧急程度 (exigencestate) |  | exigence=紧急; |