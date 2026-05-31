# |<<

**批量分级 (prm_batchlevel / nc.vo.price.batchlevel.entity.BatchlevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchlevel | 批量分级表主键 | pk_batchlevel | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_channeltype | 渠道类型 | pk_channeltype | varchar(20) |  | 渠道类型 (channeltype) |
| 5 | pk_custclass | 客户分类 | pk_custclass | varchar(20) |  | 客户基本分类 (custclass) |
| 6 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 7 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 8 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 9 | pk_marsaleclass | 物料销售分类 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 10 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | pk_unit | 计量单位 | pk_unit | varchar(20) | √ | 计量单位 (measdoc) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | dbegindate | 有效期从 | dbegindate | varchar(19) | √ | 日期(开始) (UFDateBegin) |
| 14 | denddate | 有效期至 | denddate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 15 | nnumber1 | >数量1 | nnumber1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | npricefactor1 | 价格指数1(%) | npricefactor1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | npriceadd1 | 价格加成1 | npriceadd1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nnumber2 | >数量2 | nnumber2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | npricefactor2 | 价格指数2(%) | npricefactor2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | npriceadd2 | 价格加成2 | npriceadd2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nnumber3 | >数量3 | nnumber3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | npricefactor3 | 价格指数3(%) | npricefactor3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | npriceadd3 | 价格加成3 | npriceadd3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nnumber4 | >数量4 | nnumber4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | npricefactor4 | 价格指数4(%) | npricefactor4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | npriceadd4 | 价格加成4 | npriceadd4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | caskunicode | 询价优先码 | caskunicode | char(27) |  | 字符串 (String) |
| 28 | materialinnercode | 物料内部码 | materialinnercode | varchar(230) |  | 字符串 (String) |
| 29 | customerinnercode | 客户内部码 | customerinnercode | varchar(230) |  | 字符串 (String) |
| 30 | areaclinnercode | 地区分类内部码 | areaclinnercode | varchar(230) |  | 字符串 (String) |