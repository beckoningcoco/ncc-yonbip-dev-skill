# |<<

**运输单主表 (dm_delivbill / nc.vo.dm.m4804.entity.DelivBillHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1719.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdelivbill_hid | 运输单主键 | cdelivbill_hid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | pk_org_v | 物流组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 5 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 6 | csendtypeid | 运输方式 | csendtypeid | varchar(20) |  | 运输方式 (transporttype) |
| 7 | crouteid | 运输路线 | crouteid | varchar(20) |  | 运输路线 (dm_route) |
| 8 | vtrantypecode | 运输类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | badvfeeflag | 代垫费用 | badvfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ccarrierid | 承运商 | ccarrierid | varchar(20) |  | 承运商定义 (dm_carrier) |
| 11 | capcustid | 应付开票方 | capcustid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 13 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 14 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 15 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 16 | taudittime | 审批日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 17 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (fstatusflag) |  | 0=自由; |