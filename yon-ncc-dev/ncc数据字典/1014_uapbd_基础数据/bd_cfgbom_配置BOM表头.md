# |<<

**配置BOM表头 (bd_cfgbom / nc.vo.bd.bom.bom0204.CfgBomVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccfgbomid | 配置BOM | ccfgbomid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cmaterialname | 物料名称 | cmaterialname | varchar(50) |  | 字符串 (String) |
| 8 | bdefault | 默认版本 | bdefault | char(1) |  | 布尔类型 (UFBoolean) | Y |