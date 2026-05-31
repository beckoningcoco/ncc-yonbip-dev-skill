# |<<

**工程变更分析表头 (mm_eca / nc.vo.ecn.eco.eca.entity.EcaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3670.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eca | 工程变更分析主键 | pk_eca | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_eco | 工程变更主键 | pk_eco | char(20) |  | 主键 (UFID) |
| 6 | vbillcode | 工程变更单号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 7 | pk_eco_b | 工程变更明细 | pk_eco_b | char(20) |  | 主键 (UFID) |
| 8 | vgroupno | 组号 | vgroupno | varchar(50) |  | 字符串 (String) |
| 9 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | hfbomcategory | BOM类别 | hfbomcategory | int |  | BOM类别 (bomcategory) | 1 | 1=标准BOM; |