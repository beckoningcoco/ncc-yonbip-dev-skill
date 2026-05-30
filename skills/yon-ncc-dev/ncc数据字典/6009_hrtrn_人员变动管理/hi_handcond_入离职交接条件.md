# |<<

**入离职交接条件 (hi_handcond / nccloud.dto.hryf.handitemset.HandCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2543.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handcond | 入离职交接条件主键 | pk_handcond | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 人力资源组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | pk_adminorg | 合同主体 | pk_adminorg | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 5 | pk_psncl | 人员类别 | pk_psncl | varchar(20) |  | 人员类别 (psncl) |
| 6 | type | 入离职状态 | type | int |  | 入离职状态 (handitemtype) |  | 1=入职; |