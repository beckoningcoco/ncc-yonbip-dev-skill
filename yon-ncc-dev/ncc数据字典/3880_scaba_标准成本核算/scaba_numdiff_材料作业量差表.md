# |<<

**材料作业量差表 (scaba_numdiff / nc.vo.scaba.costprocess.entity.NumdiffVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cnumdiffid | 材料作业量差 | cnumdiffid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | closeperiod | 订单关闭期间 | closeperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vmocode | 订单号 | vmocode | varchar(50) |  | 字符串 (String) |
| 8 | crcid | 工序 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 9 | chmaterialid | 产品 | chmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | chmaterialvid | 产品版本 | chmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | chmarcostclassid | 产品成本分类 | chmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 12 | chprojectid | 产品项目 | chprojectid | varchar(20) |  | 项目 (project) |
| 13 | chcustomerid | 产品客户 | chcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | chvendorid | 产品供应商 | chvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | chproductorid | 产品生产厂商 | chproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 16 | vhfree1 | 产品自由辅助属性1 | vhfree1 | varchar(50) |  | 字符串 (String) |
| 17 | vhfree2 | 产品自由辅助属性2 | vhfree2 | varchar(50) |  | 字符串 (String) |
| 18 | vhfree3 | 产品自由辅助属性3 | vhfree3 | varchar(50) |  | 字符串 (String) |
| 19 | vhfree4 | 产品自由辅助属性4 | vhfree4 | varchar(50) |  | 字符串 (String) |
| 20 | vhfree5 | 产品自由辅助属性5 | vhfree5 | varchar(50) |  | 字符串 (String) |
| 21 | vhfree6 | 产品自由辅助属性6 | vhfree6 | varchar(50) |  | 字符串 (String) |
| 22 | vhfree7 | 产品自由辅助属性7 | vhfree7 | varchar(50) |  | 字符串 (String) |
| 23 | vhfree8 | 产品自由辅助属性8 | vhfree8 | varchar(50) |  | 字符串 (String) |
| 24 | vhfree9 | 产品自由辅助属性9 | vhfree9 | varchar(50) |  | 字符串 (String) |
| 25 | vhfree10 | 产品自由辅助属性10 | vhfree10 | varchar(50) |  | 字符串 (String) |
| 26 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 27 | cbmaterialid | 材料 | cbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 28 | cbmaterialvid | 材料版本 | cbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 29 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 30 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 31 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 32 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 33 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 34 | nunitnum | 单位标准数量 | nunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nhinnum | 累计入库主数量 | nhinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nstdnum | 目标数量 | nstdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nallnum | 实际累计数量 | nallnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nexnum | 超标数量 | nexnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nstdprice | 标准单价 | nstdprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nstdmoney | 目标成本 | nstdmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nstdmoney_this | 目标成本-本层 | nstdmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nstdmoney_up | 目标成本-上层 | nstdmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | reldiffmoney | 替代差异 | reldiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | reldiffmoney_this | 替代差异-本层 | reldiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | reldiffmoney_up | 替代差异-上层 | reldiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | nnumdiffmoney | 投入量差 | nnumdiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | nnumdiffmoney_this | 投入量差-本层 | nnumdiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | nnumdiffmoney_up | 投入量差-上层 | nnumdiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | chmeasureid | 计量单位-产品 | chmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 50 | cbmeasureid | 计量单位 | cbmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 51 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 52 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 53 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 54 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 55 | orderclosed | 订单是否已关闭 | orderclosed | char(1) |  | 布尔类型 (UFBoolean) |
| 56 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 57 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 58 | fproducttype | 产品类型 | fproducttype | int |  | 产品类型 (ProductTypeEnum) |  | 1=主产品; |