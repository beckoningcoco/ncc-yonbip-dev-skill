# |<<

**应付运费结算单主实体 (dm_apsettle / nc.vo.dm.apsettle.entity.ApSettleHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apsettle | 应付运费结算单主实体 | pk_apsettle | char(20) | √ | 主键 (UFID) |
| 2 | cdelivbillhid | 运输单主实体 | cdelivbillhid | varchar(20) |  | 运输单主表 (delivbill) |
| 3 | vdelivbillcode | 运输单号 | vdelivbillcode | varchar(40) |  | 字符串 (String) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | pk_org_v | 物流组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 6 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | ddelivdate | 运输日期 | ddelivdate | char(19) |  | 日期 (UFDate) |
| 9 | ctrantypeid | 运输类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | crouteid | 运输路线 | crouteid | varchar(20) |  | 运输路线 (dm_route) |
| 11 | csendtypeid | 运输方式 | csendtypeid | varchar(20) |  | 运输方式 (transporttype) |
| 12 | ccarrierid | 承运商 | ccarrierid | varchar(20) |  | 承运商定义 (dm_carrier) |
| 13 | capcustid | 开票方 | capcustid | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | cvehicletypeid | 车型 | cvehicletypeid | varchar(20) |  | 车型定义 (dm_vehicletype) |
| 15 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (billstatus) |  | -1=自由; |