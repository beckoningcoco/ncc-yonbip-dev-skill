# |<<

**发货单主实体 (so_delivery / nc.vo.so.m4331.entity.DeliveryHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdeliveryid | 发货单主实体 | cdeliveryid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | pk_org_v | 物流组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 7 | ctrantypeid | 发货类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vtrantypecode | 发货类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | csendemployeeid | 发货计划员 | csendemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | csenddeptid | 发货部门最新版本 | csenddeptid | varchar(20) |  | 组织_部门 (dept) |
| 12 | csenddeptvid | 发货部门 | csenddeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | ctransporttypeid | 运输方式 | ctransporttypeid | varchar(20) |  | 运输方式 (transporttype) |
| 14 | ctradewordid | 贸易术语 | ctradewordid | varchar(20) |  | 贸易术语 (incoterm) |
| 15 | ctransportrouteid | 运输路线 | ctransportrouteid | varchar(20) |  | 运输路线 (dm_route) |
| 16 | ntotalastnum | 总数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ntotalweight | 总重量 | ntotalweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ntotalvolume | 总体积 | ntotalvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ntotalpiece | 总件数 | ntotalpiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (billstatus) | 1 | 1=自由; |