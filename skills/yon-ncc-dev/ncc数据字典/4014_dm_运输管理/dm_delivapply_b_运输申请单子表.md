# |<<

**运输申请单子表 (dm_delivapply_b / nc.vo.dm.m4802.entity.DelivapplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1718.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | capplybill_bid | 运输申请单子表主键 | capplybill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | cinventoryid | 物料版本信息 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cinventoryvid | 物料 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nprice | 主单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nvolumn | 体积 | nvolumn | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | pk_batchcode | 批次档案 | pk_batchcode | varchar(40) |  | 字符串 (String) |
| 16 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 17 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 18 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 19 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 20 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 21 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 24 | csendstoreorgid | 发货库存组织版本信息 | csendstoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 25 | csendstoreorgvid | 发货库存组织 | csendstoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 26 | csendstoreid | 发货仓库 | csendstoreid | varchar(20) |  | 仓库 (stordoc) |
| 27 | csendareaid | 发货地区 | csendareaid | varchar(20) |  | 地区分类 (areaclass) |
| 28 | csendaddrdocid | 发货地点 | csendaddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 29 | csendaddrid | 发货地址 | csendaddrid | varchar(20) |  | 地址簿 (address) |
| 30 | csendvendorid | 发货供应商 | csendvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 31 | vsender | 发货联系人 | vsender | varchar(20) |  | 人员基本信息 (psndoc) |
| 32 | vsenderphone | 发货联系电话 | vsenderphone | varchar(28) |  | 字符串 (String) |
| 33 | creceivestoreorgid | 收货库存组织版本信息 | creceivestoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 34 | creceivestoreorgvid | 收货库存组织 | creceivestoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 35 | creceivestoreid | 收货仓库 | creceivestoreid | varchar(20) |  | 仓库 (stordoc) |
| 36 | creceiveareaid | 收货地区 | creceiveareaid | varchar(20) |  | 地区分类 (areaclass) |
| 37 | creceiveaddrdocid | 收货地点 | creceiveaddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 38 | creceiveaddrid | 收货地址 | creceiveaddrid | varchar(20) |  | 地址簿 (address) |
| 39 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 40 | vreceiver | 收货联系人 | vreceiver | varchar(20) |  | 人员基本信息 (psndoc) |
| 41 | vreceivephone | 收货联系电话 | vreceivephone | varchar(28) |  | 字符串 (String) |
| 42 | dplansenddate | 计划发货日期 | dplansenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 43 | drequiredate | 要求收货日期 | drequiredate | char(19) |  | 日期(结束) (UFDateEnd) |
| 44 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 45 | nsendnum | 累计运输主数量 | nsendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | bsendendflag | 运输关闭 | bsendendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 47 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 48 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 50 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 51 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 52 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 53 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 54 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 55 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 56 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 57 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 58 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |