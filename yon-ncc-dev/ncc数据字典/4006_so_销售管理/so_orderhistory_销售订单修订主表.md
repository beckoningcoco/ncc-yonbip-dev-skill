# |<<

**销售订单修订主表 (so_orderhistory / nc.vo.so.m30.revise.entity.SaleOrderHistoryHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | corderhistoryid | 销售订单修订主表id | corderhistoryid | char(20) | √ | 主键 (UFID) |
| 2 | csaleorderid | 销售订单主实体 | csaleorderid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 5 | pk_org_v | 销售组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 6 | ctrantypeid | 订单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vtrantypecode | 订单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 10 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | bfreecustflag | 是否散户 | bfreecustflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | cfreecustid | 散户 | cfreecustid | varchar(20) |  | 散户 (freecustom) |
| 14 | cdeptid | 部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 15 | cdeptvid | 部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | corigcurrencyid | 原币 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 18 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | ccustbankid | 开户银行 | ccustbankid | varchar(20) |  | 银行档案 (bankdoc) |
| 20 | ccustbankaccid | 开户银行账户 | ccustbankaccid | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 21 | cchanneltypeid | 销售渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 22 | cpaytermid | 收款协议 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 23 | ctransporttypeid | 运输方式 | ctransporttypeid | varchar(20) |  | 运输方式 (transporttype) |
| 24 | ndiscountrate | 整单折扣 | ndiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vcreditnum | 信用证号 | vcreditnum | varchar(20) |  | 字符串 (String) |
| 26 | cbalancetypeid | 结算方式 | cbalancetypeid | varchar(20) |  | 结算方式 (balatype) |
| 27 | badvfeeflag | 代垫运费 | badvfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | npreceiverate | 订单收款比例 | npreceiverate | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | npreceivequota | 订单收款限额 | npreceivequota | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | bpreceiveflag | 收款限额控制预收 | bpreceiveflag | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | npreceivemny | 实际预收款金额 | npreceivemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nreceivedmny | 实际收款金额 | nreceivedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | ntotalweight | 合计重量 | ntotalweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | ntotalvolume | 合计体积 | ntotalvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | ntotalpiece | 总件数 | ntotalpiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | ntotalorigmny | 价税合计 | ntotalorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | ntotalorigsubmny | 费用冲抵金额 | ntotalorigsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | boffsetflag | 是否冲抵 | boffsetflag | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | vcooppohcode | 对方订单号 | vcooppohcode | varchar(40) |  | 字符串 (String) |
| 41 | bpocooptomeflag | 由采购订单协同生成 | bpocooptomeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | bcooptopoflag | 已协同生成采购订单 | bcooptopoflag | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (billstatus) |  | 1=自由; |