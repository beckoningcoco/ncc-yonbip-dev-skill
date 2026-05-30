# |<<

**工程变更单明细 (mm_eco_b / nc.vo.ecn.eco.entity.EcoItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eco_b | 工程变更单明细 | pk_eco_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | hcmaterialid | 物料 | hcmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | hcmaterialvid | 物料版本 | hcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | hcmeasureid | 主单位 | hcmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | hcassmeasureid | 单位 | hcassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | hfbomcategory | BOM类别 | hfbomcategory | int |  | BOM类别 (bomcategory) | 1 | 1=标准BOM; |