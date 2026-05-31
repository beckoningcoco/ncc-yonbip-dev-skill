# |<<

**订单收款核销主实体 (so_balance / nc.vo.so.m30.sobalance.entity.SoBalanceHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csobalanceid | 订单收款核销主实体 | csobalanceid | char(20) | √ | 主键 (UFID) |
| 2 | csaleorderid | 销售订单主实体 | csaleorderid | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_org_v | 销售组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | ccustomerid | 订单客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 8 | vbillcode | 订单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | ntotalorigtaxmny | 价税合计 | ntotalorigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ntotalpaymny | 订单实际收款金额 | ntotalpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ntotalorigbalmny | 订单收款核销金额(财务核销金额) | ntotalorigbalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cpaytermid | 收款协议 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 14 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | carorgid | 应收组织 | carorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 17 | vtrantypecode | 销售订单类型 | vtrantypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | cchanneltypeid | 销售渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 19 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 20 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 21 | saga_btxid | 子事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 22 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 23 | saga_status | Saga事务状态 | saga_status | int |  | 整数 (Integer) | 0 |