# |<<

**客户收款单 (ar_gatherbill / nc.vo.arap.gathering.GatheringBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatherbill | 收款单标识 | pk_gatherbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 收款财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_fiorg | 废弃财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_org_v | 收款财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_fiorg_v | 废弃财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | isreded | 是否红冲过 | isreded | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | outbusitype | 外系统业务类型 | outbusitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 12 | payman | 支付人 | payman | varchar(20) |  | 用户 (user) |
| 13 | paydate | 支付日期 | paydate | char(19) |  | 日期 (UFDate) |
| 14 | isonlinepay | 是否网上支付 | isonlinepay | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | officialprintuser | 正式打印人 | officialprintuser | varchar(20) |  | 用户 (user) |
| 16 | officialprintdate | 正式打印日期 | officialprintdate | char(19) |  | 日期 (UFDate) |
| 17 | settlenum | 结算号 | settlenum | varchar(30) |  | 字符串 (String) |
| 18 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 19 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) | √ | 字符串 (String) |
| 20 | ismandatepay | 提交资金组织结算 | ismandatepay | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | custdelegate | 代垫单位 | custdelegate | char(20) |  | 主键 (UFID) |
| 22 | pk_corp | 单位编码 | pk_corp | char(20) |  | 主键 (UFID) |
| 23 | pk_tradetype | 收款类型code | pk_tradetype | varchar(20) | √ | 字符串 (String) |
| 24 | pk_tradetypeid | 收款类型 | pk_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | billclass | 单据大类 | billclass | varchar(2) | √ | 单据大类 (billclass) | sk | ys=应收单; |