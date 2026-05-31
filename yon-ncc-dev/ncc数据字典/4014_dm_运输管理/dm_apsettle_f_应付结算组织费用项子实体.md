# |<<

**应付结算组织费用项子实体 (dm_apsettle_f / nc.vo.dm.apsettle.entity.ApSettleFVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1711.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apsettle_f | 应付结算组织费用项子实体 | pk_apsettle_f | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | csettlefinorgvid | 结算财务组织 | csettlefinorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | csettlefinorgid | 结算财务组织版本信息 | csettlefinorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | cfeeitemid | 费用项 | cfeeitemid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | nfeemny | 运费金额 | nfeemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ntotalverifymny | 累计核销金额 | ntotalverifymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ccosignid | 委托单位 | ccosignid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | ctakefeeid | 运费承担单位 | ctakefeeid | varchar(20) |  | 客户基本信息 (customer) |
| 13 | csendstoreorgvid | 发货库存组织 | csendstoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 14 | csendstoreorgid | 发货库存组织版本信息 | csendstoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | csendstoreid | 发货仓库 | csendstoreid | varchar(20) |  | 仓库 (stordoc) |
| 16 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 17 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | creceivestoreorgvid | 收货库存组织 | creceivestoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 19 | creceivestoreorgid | 收货库存组织版本信息 | creceivestoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 20 | creceivestoreid | 收货仓库 | creceivestoreid | varchar(20) |  | 仓库 (stordoc) |
| 21 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |