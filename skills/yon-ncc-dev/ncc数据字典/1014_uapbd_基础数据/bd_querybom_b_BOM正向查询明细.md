# |<<

**BOM正向查询明细 (bd_querybom_b / nc.vo.bd.bom.query.BomQueryBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/948.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cquerybombid | BOM正向查询明细 | cquerybombid | varchar(50) | √ | 字符串 (String) |
| 2 | vlevelno | 层码 | vlevelno | varchar(50) |  | 字符串 (String) |
| 3 | cbomid | 物料清单 | cbomid | char(20) |  | 主键 (UFID) |
| 4 | hcmaterialid | 父项物料 | hcmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | pk_horg | 父项BOM计划组织 | pk_horg | varchar(20) |  | 组织 (org) |
| 6 | hcmaterialvid | 父项物料多版本 | hcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | hcmeasureid | 父项主单位 | hcmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | hcassmeasureid | 父项单位 | hcassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | fbomtype | 父项BOM类型 | fbomtype | int |  | BOM类型 (bomtype) |  | 1=生产BOM; |