# |<<

**运输包装单 (dm_packbill / nc.vo.dm.m4804.entity.DelivBillPackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1736.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpackbillid | 包装单子表主键 | cpackbillid | char(20) | √ | 主键 (UFID) |
| 2 | cdelivbill_hid | 运输单主表主键 | cdelivbill_hid | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | cpackid | 包装分类 | cpackid | varchar(20) |  | 包装分类档案 (PackingTypeVO) |
| 6 | vmark | 唛头 | vmark | varchar(120) |  | 字符串 (String) |
| 7 | npacknum | 包装件数 | npacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | npackweight | 包装重量 | npackweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | npackvolume | 包装体积 | npackvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cpackrowno | 行号 | cpackrowno | varchar(20) |  | 字符串 (String) |
| 11 | csettlefinorgvid | 结算财务组织 | csettlefinorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | csettlefinorgid | 结算财务组织版本信息 | csettlefinorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | csendstoreorgid | 发货库存组织版本信息 | csendstoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 14 | csendstoreorgvid | 发货库存组织 | csendstoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 15 | csendstoreid | 发货仓库 | csendstoreid | varchar(20) |  | 仓库 (stordoc) |
| 16 | csendareaid | 发货地区 | csendareaid | varchar(20) |  | 地区分类 (areaclass) |
| 17 | csendaddrdocid | 发货地点 | csendaddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 18 | csendvendorid | 发货供应商 | csendvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | csendaddrid | 发货地址 | csendaddrid | varchar(20) |  | 地址簿 (address) |
| 20 | vsender | 发货联系人 | vsender | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | vsenderphone | 发货联系电话 | vsenderphone | varchar(28) |  | 字符串 (String) |
| 22 | creceivestoreorgid | 收货库存组织版本信息 | creceivestoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 23 | creceivestoreorgvid | 收货库存组织 | creceivestoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 24 | creceivestoreid | 收货仓库 | creceivestoreid | varchar(20) |  | 仓库 (stordoc) |
| 25 | creceiveareaid | 收货地区 | creceiveareaid | varchar(20) |  | 地区分类 (areaclass) |
| 26 | creceiveaddrdocid | 收货地点 | creceiveaddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 27 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 28 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | creceiveaddrid | 收货地址 | creceiveaddrid | varchar(20) |  | 地址簿 (address) |
| 30 | vreceiver | 收货联系人 | vreceiver | varchar(20) |  | 人员基本信息 (psndoc) |
| 31 | vreceivephone | 收货联系电话 | vreceivephone | varchar(28) |  | 字符串 (String) |
| 32 | dsenddate | 发货日期 | dsenddate | varchar(19) |  | 日期 (UFDate) |
| 33 | drequiredate | 要求收货日期 | drequiredate | varchar(19) |  | 日期 (UFDate) |
| 34 | nroutemile | 起到点间里程 | nroutemile | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nspecialmile1 | 特殊路线1里程 | nspecialmile1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nspecialmile2 | 特殊路线2里程 | nspecialmile2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nspecialmile3 | 特殊路线3里程 | nspecialmile3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nspecialmile4 | 特殊路线4里程 | nspecialmile4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | ccosignid | 委托单位 | ccosignid | varchar(20) |  | 客户基本信息 (customer) |
| 40 | ctakefeeid | 运费承担单位 | ctakefeeid | varchar(20) |  | 客户基本信息 (customer) |
| 41 | nsignpacknum | 签收包装件数 | nsignpacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nsignpackvolumn | 签收包装体积 | nsignpackvolumn | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nsignpackweight | 签收包装重量 | nsignpackweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | csignerid | 签收人 | csignerid | varchar(20) |  | 用户 (user) |
| 45 | dsigndate | 签收日期 | dsigndate | varchar(19) |  | 日期 (UFDate) |
| 46 | vpacknote | 备注 | vpacknote | varchar(181) |  | 字符串 (String) |
| 47 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 48 | bpapflag | 已生成代垫或应付运费发票 | bpapflag | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | bparflag | 已生成应收运费发票 | bparflag | char(1) |  | 布尔类型 (UFBoolean) |
| 50 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |