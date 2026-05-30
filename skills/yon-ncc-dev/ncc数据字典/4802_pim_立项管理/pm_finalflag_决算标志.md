# |<<

**决算标志 (pm_finalflag / nc.vo.pbm.finalflag.FinalFlagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4468.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_finalflag | 决算标志主键 | pk_finalflag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 6 | flag_value | 决算标志 | flag_value | int |  | 决算标志Enum (final_flag) |  | 1=未决算; |