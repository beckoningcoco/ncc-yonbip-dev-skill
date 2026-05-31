# |<<

**库存计划 (invp_plan / nc.vo.invp.plan.entity.PlanHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan | 主键 | pk_plan | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | pk_scheme | 库存计划方案 | pk_scheme | varchar(20) |  | 库存计划方案 (PlanSchemeMainVO) |
| 9 | fmethod | 库存计划方法 | fmethod | int |  | 库存计划方法 (PlanMethodEnum) |  | 1=再订货点; |