# |<<

**标准产品成本 (sca_stdcost / nc.vo.sca.stdcostcalc.StdProdCostHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdcostid | 标准产品成本表 | cstdcostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | nnumber | 数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 9 | itype | 属性 | itype | int |  | 标准产品成本产品属性 (StdProdTypeEnum) |  | 1=主产品; |