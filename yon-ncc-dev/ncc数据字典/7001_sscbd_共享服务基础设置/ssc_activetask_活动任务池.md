# |<<

**活动任务池 (ssc_activetask / nc.vo.ssc.task.pool.ActiveTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_activetask | 实体标识 | pk_activetask | char(20) | √ | 主键 (UFID) |
| 2 | pk_ssctask | 任务主键 | pk_ssctask | varchar(20) |  | 任务 (ssctask) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | src_system | 来源系统 | src_system | varchar(50) |  | 字符串 (String) |
| 7 | barcode | 条码 | barcode | varchar(200) |  | 字符串 (String) |
| 8 | exigencelevel | 紧急程度 | exigencelevel | varchar(50) |  | 紧急程度 (exigencestate) |  | exigence=紧急; |