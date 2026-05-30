# |<<

**物料清单使用组织快照 (mm_calcbomuseorg / nc.vo.mmpps.bomsnap.entity.BomUseOrgSnapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3640.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsbom_useorgid | 使用组织主键 | cppsbom_useorgid | char(36) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_v | 所属组织（多版本） | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | pk_useorg | 使用组织 | pk_useorg | varchar(20) |  | 组织 (org) |
| 5 | pk_useorg_v | 使用组织（多版本） | pk_useorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | computecode | 运算号 | computecode | varchar(40) |  | 字符串 (String) |
| 7 | pk_schema | 计划方案 | pk_schema | varchar(20) |  | 计划方案 (mm_ps) |
| 8 | cbomid | 物料清单主键 | cbomid | varchar(20) |  | 字符串 (String) |