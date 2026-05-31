# |<<

**组织其它_组织模块启用期间 (org_moduleperiod / nc.vo.org.OrgModulePeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4097.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_moduleperiod | 启用主键 | pk_moduleperiod | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | moduleid | 模块号 | moduleid | varchar(20) |  | 模块信息 (module) |
| 4 | pk_accperiod | 会计期间 | pk_accperiod | varchar(101) |  | 自定义项 (Custom) |