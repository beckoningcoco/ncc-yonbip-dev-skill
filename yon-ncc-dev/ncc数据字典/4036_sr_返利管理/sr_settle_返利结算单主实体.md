# |<<

**返利结算单主实体 (sr_settle / nc.vo.sr.settle.entity.SettleHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5480.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle | 返利结算单主实体 | pk_settle | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 返利计算组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | vbatchprcscode | 批处理号 | vbatchprcscode | varchar(40) |  | 字符串 (String) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | cpolicyid | 返利政策 | cpolicyid | varchar(20) |  | 返利政策主实体 (plcy) |
| 7 | cpolicyorgid | 返利政策销售组织 | cpolicyorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 8 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 9 | csettleorgid | 财务组织 | csettleorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | cordercustid | 订单客户 | cordercustid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cordertypeid | 订单类型 | cordertypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 13 | cperiodid | 返利期间 | cperiodid | varchar(20) |  | 返利期间子实体 (plcy_period) |
| 14 | dprdbegindate | 返利期间开始日期 | dprdbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | dprdenddate | 返利期间结束日期 | dprdenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 16 | dcashfromdate | 兑付日期从 | dcashfromdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | dcashtodate | 兑付日期到 | dcashtodate | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | ntotalmny | 返利金额 | ntotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ccurrencyid | 币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 20 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (billstatus) |  | 0=自由; |