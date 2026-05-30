# |<<

**完工成本子表 (scaba_prodcost_b / nc.vo.scaba.costprocess.entity.ProdcostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5091.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cprodcost_bid | 完工成本明细 | cprodcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | cprodcostid | 完工成本 | cprodcostid | char(20) |  | 主键 (UFID) |
| 3 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nmoney | 金额-合计 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmoney_this | 金额-本层 | nmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nmoney_up | 金额-上层 | nmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 13 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 14 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 15 | ichildtype | 子项类型 | ichildtype | int |  | 整数 (Integer) |
| 16 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 17 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 20 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 22 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 23 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 24 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 25 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 26 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 27 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 28 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 29 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 30 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 31 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 32 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |