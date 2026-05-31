# |<<

**销售费用单主表实体 (so_arsub / nc.vo.so.m35.entity.ArsubHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | carsubid | 销售费用单主键 | carsubid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | ctrantypeid | 销售费用单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vtrantypecode | 销售费用单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | csaleorgid | 销售组织最新版本 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 10 | csaleorgvid | 销售组织 | csaleorgvid | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 11 | cordercustid | 订单客户 | cordercustid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cchanneltypeid | 渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 13 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | cdeptid | 销售部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 15 | cdeptvid | 销售部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 17 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 18 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (billstatus) | 1 | 1=自由; |