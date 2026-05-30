# |<<

**成本还原明细实体 (cm_ctrevert_b / nc.vo.cm.costrevert.CtRevertItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctrevert_b | 子表ID | pk_ctrevert_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_ctrevert | 主表ID | pk_ctrevert | char(20) |  | 主键 (UFID) |
| 3 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | beforenumber | 还原前-耗量 | beforenumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | beforecost | 还原前-成本 | beforecost | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | processnumber | 还原过程-耗量 | processnumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | processcost | 还原过程-成本 | processcost | decimal(20, 8) |  | 数值 (UFDouble) |
| 13 | subcost | 还原后下阶-成本 | subcost | decimal(20, 8) |  | 数值 (UFDouble) |
| 14 | subnumber | 还原后下阶-耗量 | subnumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 15 | thiscost | 还原后本阶-成本 | thiscost | decimal(20, 8) |  | 数值 (UFDouble) |
| 16 | thisnumber | 还原后本阶-耗量 | thisnumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 17 | aftercost | 还原后总计-成本 | aftercost | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | afternumber | 还原后总计-耗量 | afternumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 19 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 21 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 24 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 25 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 26 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 27 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 28 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 29 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 30 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 31 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 32 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 33 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |