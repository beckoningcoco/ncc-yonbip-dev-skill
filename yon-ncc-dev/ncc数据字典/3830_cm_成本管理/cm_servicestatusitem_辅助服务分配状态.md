# |<<

**辅助服务分配状态 (cm_servicestatusitem / nc.vo.cm.servicealloc.CMServiceStatusItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1509.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_servicestatus_b | 辅助服务分配状态明细 | pk_servicestatus_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_servicestatus | 辅助服务分配状态 | pk_servicestatus | char(20) | √ | 主键 (UFID) |
| 3 | pk_period | 会计期间 | pk_period | varchar(20) | √ | 会计期间档案 (accperiod) |
| 4 | cstatus | 状态 | cstatus | varchar(1) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |