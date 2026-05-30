# |<<

**结算路径子表 (to_settlepath_b / nc.vo.to.settlepath.entity.SettlePathBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5816.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettlepath_bid | 子表主键 | csettlepath_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cupfinanceorgid | 上游财务组织 | cupfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | cupcostregionid | 上游成本域 | cupcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | cdownfinanceorgid | 下游财务组织 | cdownfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | cdowncostregionid | 下游成本域 | cdowncostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | ccurrencyid | 结算币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 8 | ndiscountrate | 折扣率 | ndiscountrate | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |