# |<<

**请购单子表 (po_praybill_b / nc.vo.pu.m20.entity.PraybillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_praybill_b | 请购单子表 | pk_praybill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_srcmaterial | 物料信息 | pk_srcmaterial | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | pk_material | 物料最新版本 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_reqdept | 需求部门最新版本 | pk_reqdept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_reqdept_v | 需求部门 | pk_reqdept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | dreqdate | 需求日期 | dreqdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | dsuggestdate | 建议订货日期 | dsuggestdate | varchar(19) |  | 日期(开始) (UFDateBegin) |
| 19 | pk_purchaseorg | 采购组织最新版本 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 20 | pk_purchaseorg_v | 采购组织 | pk_purchaseorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 21 | bcanpurchaseorgedit | 采购组织可编辑 | bcanpurchaseorgedit | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | cordertrantypecode | 订单类型 | cordertrantypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 23 | pk_suggestsupplier | 建议供应商 | pk_suggestsupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | pk_reqstor | 需求仓库 | pk_reqstor | varchar(20) |  | 仓库 (stordoc) |
| 25 | csourcetypecode | 来源单据类型 | csourcetypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | csourceid | 来源单据标识 | csourceid | varchar(20) |  | 主键 (UFID) |
| 27 | csourcebid | 来源单据分录标识 | csourcebid | varchar(20) |  | 主键 (UFID) |
| 28 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 29 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 30 | vsrctrantypecode | 来源交易类型 | vsrctrantypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 31 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | cfirstid | 源头单据标识 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 33 | cfirstbid | 源头单据分录标识 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 34 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 35 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 36 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 37 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 38 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 39 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 40 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 41 | pk_employee | 采购员 | pk_employee | varchar(20) |  | 人员基本信息 (psndoc) |
| 42 | vbmemo | 备注 | vbmemo | varchar(181) |  | 字符串 (String) |
| 43 | naccumulatenum | 累计订货主数量 | naccumulatenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | ngenct | 生成合同次数 | ngenct | int |  | 整数 (Integer) |
| 45 | npriceauditbill | 生成价格审批单次数 | npriceauditbill | int |  | 整数 (Integer) |
| 46 | nquotebill | 生成询报价单次数 | nquotebill | int |  | 整数 (Integer) |
| 47 | pk_product | 产品 | pk_product | varchar(20) |  | 物料基本信息 (material_v) |
| 48 | pk_product_v | 产品版本 | pk_product_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 49 | browclose | 行关闭 | browclose | char(1) |  | 布尔类型 (UFBoolean) |
| 50 | dbilldate | 请购日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 51 | bpublishtoec | 发布到电子商务 | bpublishtoec | char(1) |  | 布尔类型 (UFBoolean) |
| 52 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 53 | cprojecttaskid | 项目任务 | cprojecttaskid | varchar(20) |  | 项目任务 (WBS) |
| 54 | bisgensaorder | 已生成总括订单 | bisgensaorder | char(1) |  | 布尔类型 (UFBoolean) | N |
| 55 | pk_reqstoorg_v | 原始需求库存组织 | pk_reqstoorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 56 | pk_reqstoorg | 原始需求库存组织最新版本 | pk_reqstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 57 | bisarrange | 已安排 | bisarrange | char(1) |  | 布尔类型 (UFBoolean) |
| 58 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 59 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 60 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 61 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 62 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 63 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 64 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 65 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 66 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 67 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 68 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 69 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 114 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 115 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |