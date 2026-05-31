# |<<

**标准产品成本明细 (sca_stdcost_b / nc.vo.sca.stdcostcalc.StdProdCostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdcost_bid | 标准产品成本表明细 | cstdcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | cstdcostid | 标准产品成本表 | cstdcostid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂组织 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | ichildtype | 子项类型 | ichildtype | int |  | 标准产品成本子项类型 (StdProdChildTypeEnum) |  | 1=材料; |