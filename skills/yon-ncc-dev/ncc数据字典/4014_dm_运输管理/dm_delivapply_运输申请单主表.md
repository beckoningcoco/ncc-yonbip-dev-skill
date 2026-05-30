# |<<

**运输申请单主表 (dm_delivapply / nc.vo.dm.m4802.entity.DelivapplyHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | capplybill_hid | 运输申请单主键 | capplybill_hid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | vtrantypecode | 运输类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | pk_org_v | 物流组织 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 6 | pk_org | 物流组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 7 | cconsignid | 委托单位 | cconsignid | varchar(20) |  | 客户基本信息 (customer) |
| 8 | vconsigner | 委托人 | vconsigner | varchar(28) |  | 多语文本 (MultiLangText) |
| 9 | vconsignphone | 委托人电话 | vconsignphone | varchar(28) |  | 字符串 (String) |
| 10 | ctakefeeid | 运费承担单位 | ctakefeeid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | csendtypeid | 运输方式 | csendtypeid | varchar(20) |  | 运输方式 (transporttype) |
| 12 | crouteid | 运输路线 | crouteid | varchar(20) |  | 运输路线 (dm_route) |
| 13 | badvfeeflag | 代垫运费 | badvfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 15 | ntotalastnum | 总数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ntotalorigmny | 总金额 | ntotalorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ntotalweight | 总重量 | ntotalweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ntotalvolume | 总体积 | ntotalvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ntotalpiece | 总件数 | ntotalpiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 21 | fstatusflag | 单据状态 | fstatusflag | smallint |  | 单据状态 (fstatusflag) |  | 0=自由; |