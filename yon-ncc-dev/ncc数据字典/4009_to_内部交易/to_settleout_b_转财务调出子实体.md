# |<<

**转财务调出子实体 (to_settleout_b / nc.vo.to.m5f.entity.STranFinOutItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 子表主键 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | char(0) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | cinventoryid | 物料主键 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料版本主键 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | cunitid | 主计量单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |