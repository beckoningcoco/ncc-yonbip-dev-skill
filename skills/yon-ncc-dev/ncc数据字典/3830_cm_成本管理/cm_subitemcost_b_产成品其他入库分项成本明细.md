# |<<

**产成品其他入库分项成本明细 (cm_subitemcost_b / nc.vo.cm.subitemcost.entity.SubitemcostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1515.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csubitemcost_bid | 产成品其他入库分项成本明细 | csubitemcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | csubitemcostid | 产成品其他入库分项成本 | csubitemcostid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | nnumber | 数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | voutstockcode | 出库单单据号 | voutstockcode | varchar(40) |  | 字符串 (String) |
| 14 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 15 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 16 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 20 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 21 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 22 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 23 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 24 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 25 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 26 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 27 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 28 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |