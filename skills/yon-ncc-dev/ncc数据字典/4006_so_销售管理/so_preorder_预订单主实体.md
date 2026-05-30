# |<<

**预订单主实体 (so_preorder / nc.vo.so.m38.entity.PreOrderHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpreorderid | 预订单主实体 | cpreorderid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_org_v | 销售组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | ctrantypeid | 预订单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vtrantypecode | 预订单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | cdeptvid | 销售部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | cdeptid | 销售部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cchanneltypeid | 销售渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 13 | cpaytermid | 收款协议 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 14 | ndiscountrate | 整单折扣 | ndiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 16 | ctransporttypeid | 运输方式 | ctransporttypeid | varchar(20) |  | 运输方式 (transporttype) |
| 17 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 18 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nheadsummny | 价税合计 | nheadsummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | dbilldate | 订货日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 21 | dabatedate | 失效日期 | dabatedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 22 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (billstatus) | 1 | 1=自由; |