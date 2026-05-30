# |<<

**辅助服务分配数据 (cm_ServiceAllocVO / nc.vo.cm.servicealloc.AllocServiceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1507.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | sourcebillitemkey | 来源单据行 | sourcebillitemkey | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 工厂 | pk_org | varchar(0) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | pk_center | 成本中心 | pk_center | varchar(20) |  | 成本中心 (resacostcenter) |
| 5 | pk_material | 受益产品 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_co | 受益成本对象 | pk_co | varchar(20) |  | 成本对象 (cm_costobject) |
| 7 | pk_usedmaterial | 被消耗产品 | pk_usedmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_usedco | 被消耗成本对象 | pk_usedco | varchar(20) |  | 成本对象 (cm_costobject) |
| 9 | pk_usedcenter | 被消耗成本中心 | pk_usedcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 11 | cynum | 差异承担数量 | cynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | usenum | 受益量 | usenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | centernum | 成本中心消耗量 | centernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | sumnum | 产量 | sumnum | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 15 | price | 实际单价 | price | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 16 | factcost | 实际成本 | factcost | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 17 | plancost | 计划成本 | plancost | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 18 | beforecost | 分配前成本 | beforecost | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | diffcost | 差异 | diffcost | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 20 | numscale | 数量精度 | numscale | int |  | 整数 (Integer) | 8 |
| 21 | pricescale | 单价精度 | pricescale | int |  | 整数 (Integer) | 8 |
| 22 | moneyscale | 金额精度 | moneyscale | int |  | 整数 (Integer) | 8 |
| 23 | sourcebillkey | 来源单据 | sourcebillkey | char(20) |  | 主键 (UFID) |
| 24 | servicecode | 产品编码 | servicecode | varchar(50) |  | 字符串 (String) |
| 25 | servicename | 产品名称 | servicename | varchar(50) |  | 字符串 (String) |
| 26 | measdocname | 计量单位名称 | measdocname | varchar(50) |  | 字符串 (String) |