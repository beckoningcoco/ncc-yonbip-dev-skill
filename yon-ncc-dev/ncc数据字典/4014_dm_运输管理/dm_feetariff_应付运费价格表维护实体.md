# |<<

**应付运费价格表维护实体 (dm_feetariff / nc.vo.dm.tariff.entity.FeeTariffDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariff | 应付运费价格表维护实体 | pk_tariff | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | pk_org_v | 物流组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 5 | ctariffdid | 价格表定义主实体 | ctariffdid | varchar(20) |  | 应付运费价格表主实体 (feetariffdef) |
| 6 | ccarrierid | 承运商 | ccarrierid | varchar(20) |  | 承运商定义 (dm_carrier) |
| 7 | csendtypeid | 运输方式 | csendtypeid | varchar(20) |  | 运输方式 (transporttype) |
| 8 | vtotalformula | 运费公式 | vtotalformula | varchar(500) |  | 字符串 (String) |
| 9 | ctranstypeid | 运输类型 | ctranstypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | crouteid | 运输路线 | crouteid | varchar(20) |  | 运输路线 (dm_route) |
| 11 | cvehicletypeid | 车型 | cvehicletypeid | varchar(20) |  | 车型定义 (dm_vehicletype) |
| 12 | csendaddrid | 发货地点 | csendaddrid | varchar(20) |  | 地点档案 (addressdoc) |
| 13 | creceiveaddrid | 收货地点 | creceiveaddrid | varchar(20) |  | 地点档案 (addressdoc) |
| 14 | bbatflag | 批量分级维护 | bbatflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | vnote1 | 表头备注1 | vnote1 | varchar(181) |  | 字符串 (String) |
| 16 | vnote2 | 表头备注2 | vnote2 | varchar(181) |  | 字符串 (String) |
| 17 | vnote3 | 表头备注3 | vnote3 | varchar(181) |  | 字符串 (String) |
| 18 | vnote4 | 表头备注4 | vnote4 | varchar(181) |  | 字符串 (String) |
| 19 | vnote5 | 表头备注5 | vnote5 | varchar(181) |  | 字符串 (String) |
| 20 | vbnote1 | 表体备注1 | vbnote1 | varchar(181) |  | 字符串 (String) |
| 21 | vbnote2 | 表体备注2 | vbnote2 | varchar(181) |  | 字符串 (String) |
| 22 | vbnote3 | 表体备注3 | vbnote3 | varchar(181) |  | 字符串 (String) |
| 23 | vbnote4 | 表体备注4 | vbnote4 | varchar(181) |  | 字符串 (String) |
| 24 | vbnote5 | 表体备注5 | vbnote5 | varchar(181) |  | 字符串 (String) |
| 25 | nprice1 | 价格项1 | nprice1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nprice2 | 价格项2 | nprice2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nprice3 | 价格项3 | nprice3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nprice4 | 价格项4 | nprice4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nprice5 | 价格项5 | nprice5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nprice6 | 价格项6 | nprice6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nprice7 | 价格项7 | nprice7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nprice8 | 价格项8 | nprice8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nprice9 | 价格项9 | nprice9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nprice10 | 价格项10 | nprice10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nprice11 | 价格项11 | nprice11 | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nprice12 | 价格项12 | nprice12 | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nprice13 | 价格项13 | nprice13 | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nprice14 | 价格项14 | nprice14 | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nprice15 | 价格项15 | nprice15 | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nprice16 | 价格项16 | nprice16 | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nprice17 | 价格项17 | nprice17 | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nprice18 | 价格项18 | nprice18 | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nprice19 | 价格项19 | nprice19 | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | nprice20 | 价格项20 | nprice20 | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | cmarbasclassid | 物料基本分类 | cmarbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 46 | materialinnercode | 物料内码 | materialinnercode | varchar(230) |  | 字符串 (String) |
| 47 | dbegindate | 开始日期 | dbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 48 | denddate | 结束日期 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 49 | ccurrencyid | 币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 50 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 51 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 52 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 53 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |