# |<<

**标准成本还原明细 (sca_costrevert_b / nc.vo.sca.costrevert.entity.StdCostRevertItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costrevert_b | 标准成本还原明细 | pk_costrevert_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_costrevert | 标准成本还原 | pk_costrevert | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 10 | beforenumber | 还原前-耗量 | beforenumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | beforecost | 还原前-成本 | beforecost | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | processnumber | 还原过程-耗量 | processnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | processcost | 还原过程-成本 | processcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | subcost | 还原后下阶-成本 | subcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | subnumber | 还原后下阶-耗量 | subnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | thiscost | 还原后本阶-成本 | thiscost | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | thisnumber | 还原后本阶-耗量 | thisnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | aftercost | 还原后总计-成本 | aftercost | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | afternumber | 还原后总计-耗量 | afternumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 22 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 23 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 24 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 25 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自定义项 (Custom) |