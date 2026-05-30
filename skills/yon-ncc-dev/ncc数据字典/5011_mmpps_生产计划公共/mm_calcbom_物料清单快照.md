# |<<

**物料清单快照 (mm_calcbom / nc.vo.mmpps.bomsnap.entity.BomSnapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3636.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsbomid | 物料清单快照 | cppsbomid | char(36) | √ | 主键 (UFID) |
| 2 | cppsmaterialid | 物料范围主键 | cppsmaterialid | char(36) |  | 字符串 (String) |
| 3 | computecode | 运算号 | computecode | varchar(50) |  | 字符串 (String) |
| 4 | schemeid | 计划方案 | schemeid | varchar(20) |  | 计划方案 (mm_ps) |
| 5 | cbomid | 物料清单 | cbomid | varchar(20) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | hcmaterialid | 物料最新版本 | hcmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | hcmaterialvid | 物料 | hcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | hcassmeasureid | 单位 | hcassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | hcmeasureid | 主单位 | hcmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | hvchangerate | 换算率 | hvchangerate | varchar(50) |  | 字符串 (String) |
| 14 | fbomtype | BOM类型 | fbomtype | int |  | BOM类型 (bomtype) |  | 1=生产BOM; |