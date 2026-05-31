# |<<

**库存计划物料范围 (invp_scheme_inv / nc.vo.invp.plan.entity.PlanSchemeInvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme_inv | 主键 | pk_scheme_inv | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | cmabaseclassid | 物料分类编码 | cmabaseclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 5 | vmarclassincode | 物料基本分类内部编码 | vmarclassincode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |