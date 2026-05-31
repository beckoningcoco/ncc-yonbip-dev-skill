# |<<

**成本BOM多产出产品子项明细 (sca_bom_extra / nc.vo.sca.costbom.entity.CostBomExtraVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbomextraid | 成本BOM多产出产品子项明细 | cbomextraid | char(20) | √ | 主键 (UFID) |
| 2 | ccmbomid | 成本BOM | ccmbomid | char(20) |  | 主键 (UFID) |
| 3 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 4 | cproducetype | 产出类型 | cproducetype | int |  | 材料类型 (stuffTypeEnum) | 2 | 2=联产品; |