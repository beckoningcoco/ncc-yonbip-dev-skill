# |<<

**核销明细 (dm_verifydetail / nc.vo.dm.m4812.entity.ApVerifyDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cverify_detailid | 运费发票核销明细 | cverify_detailid | char(20) | √ | 主键 (UFID) |
| 2 | cinvoice_bid | 运费发票子表 | cinvoice_bid | varchar(20) |  | 字符串 (String) |
| 3 | coperatorid | 核销人 | coperatorid | varchar(20) |  | 用户 (user) |
| 4 | tveritytime | 核销时间 | tveritytime | varchar(19) |  | 日期时间 (UFDateTime) |
| 5 | iverifyorder | 核销记录顺序号 | iverifyorder | int |  | 整数 (Integer) |
| 6 | cdelivbill_hid | 运输单 | cdelivbill_hid | varchar(20) |  | 运输单主表 (delivbill) |
| 7 | vdelivbillcode | 运输单号 | vdelivbillcode | varchar(40) |  | 字符串 (String) |
| 8 | csettlebill_bid | 运费结算单子表 | csettlebill_bid | varchar(20) |  | 字符串 (String) |
| 9 | cfeeinvid | 费用项 | cfeeinvid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | cinexitemid | 收支项目 | cinexitemid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 11 | nverifymny | 核销金额 | nverifymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_org | 运费财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | capsettle_fid | 结算组织费用项子表 | capsettle_fid | varchar(20) |  | 应付结算组织费用项子实体 (apsettle_f) |
| 15 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |