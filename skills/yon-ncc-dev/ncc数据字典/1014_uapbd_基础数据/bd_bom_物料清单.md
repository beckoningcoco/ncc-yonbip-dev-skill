# |<<

**物料清单 (bd_bom / nc.vo.bd.bom.bom0202.entity.BomVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/369.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbomid | 物料清单 | cbomid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | hcmaterialid | 物料 | hcmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | hcmaterialvid | 物料版本 | hcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | hbisfeature | 特征件 | hbisfeature | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | hcfeatureclassid | 特征类 | hcfeatureclassid | varchar(20) |  | 特征类 (bd_fclass) |
| 9 | hcfeaturecode | 特征码 | hcfeaturecode | varchar(20) |  | 特征码档案 (bd_ffile) |
| 10 | hcmeasureid | 主单位 | hcmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | hcassmeasureid | 单位 | hcassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | fbomtype | BOM类型 | fbomtype | int | √ | BOM类型 (bomtype) | 1 | 1=生产BOM; |