# |<<

**标准成本计算 (sca_stdcostlevel / nc.vo.sca.stdcostlevel.StdCostLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdcostlevelid | 标准成本计算 | cstdcostlevelid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | pk_costtype | 成本类型 | pk_costtype | varchar(20) |  | 成本类型 (mapub_costtype) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | ncostlevel | 成本低阶码 | ncostlevel | int |  | 整数 (Integer) |
| 9 | icalcstatus | 计算状态 | icalcstatus | int |  | 计算状态 (CalcStatusEnum) | 1 | 1=未计算; |