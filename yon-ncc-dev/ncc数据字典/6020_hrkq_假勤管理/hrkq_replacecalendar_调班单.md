# |<<

**调班单 (hrkq_replacecalendar / nccloud.vo.hrkq.replacecalendar.ReplacecalendarVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2719.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replacecalendar | 主键 | pk_replacecalendar | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_psndoc | 申请人 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_shift | 申请人班次 | pk_shift | varchar(20) |  | 班次 (ts_shift) |
| 8 | pk_replace_psndoc | 调班人 | pk_replace_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_replace_shift | 调班人班次 | pk_replace_shift | varchar(20) |  | 班次 (ts_shift) |
| 10 | pk_replace_add_shift | 调班人班次的替班班次 | pk_replace_add_shift | varchar(20) |  | 班次 (ts_shift) |
| 11 | pk_replace_org | 调班人组织 | pk_replace_org | varchar(20) |  | 组织 (org) |
| 12 | pk_replace_dept | 调班人部门 | pk_replace_dept | varchar(20) |  | 组织_部门 (dept) |
| 13 | type | 调班类型 | type | varchar(50) |  | 调班类型 (type) |  | 0=换班; |