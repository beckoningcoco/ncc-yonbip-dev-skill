# |<<

**消耗单明细 (scaba_stuff_b / nc.vo.scaba.stuff.entity.StuffItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5093.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstuff_bid | 物料消耗单明细 | cstuff_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cstuffid | 物料消耗单 | cstuffid | char(20) |  | 主键 (UFID) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | nplanprice | 标准单价 | nplanprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | nplanmoney | 标准金额-合计 | nplanmoney | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | nplanmoney_this | 标准金额-本层 | nplanmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nplanmoney_up | 标准金额-上层 | nplanmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nprice | 实际单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nmoney | 实际金额-合计 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nmoney_this | 实际金额-本层 | nmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nmoney_up | 实际金额-上层 | nmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ndiff | 差异 | ndiff | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ndiff_this | 差异-本层 | ndiff_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ndiff_up | 差异-上层 | ndiff_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 22 | csourcebillid | 来源单据 | csourcebillid | char(20) |  | 主键 (UFID) |
| 23 | csourcebill_bid | 来源单据明细 | csourcebill_bid | char(20) |  | 主键 (UFID) |
| 24 | cdetailledgerid | 单据明细表主键 | cdetailledgerid | char(20) |  | 字符串 (String) |
| 25 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 26 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 27 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 28 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 29 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 30 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 31 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 32 | csrccostdomainid | 来源成本域 | csrccostdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 33 | fetchpricetime | 取价生效时间 | fetchpricetime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 35 | vbdef20 | 自定义20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef19 | 自定义19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef18 | 自定义18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef17 | 自定义17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef16 | 自定义16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef15 | 自定义15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef14 | 自定义14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef13 | 自定义13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef12 | 自定义12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef11 | 自定义11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef10 | 自定义10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef9 | 自定义9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef8 | 自定义8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef7 | 自定义7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef6 | 自定义6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef5 | 自定义5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef4 | 自定义4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef3 | 自定义3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef1 | 自定义1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef2 | 自定义2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 56 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 57 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 58 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 59 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 60 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 61 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 62 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 63 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 64 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |