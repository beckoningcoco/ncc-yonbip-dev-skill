# |<<

**供应商应付单 (ap_payablebill / nc.vo.arap.payable.PayableBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payablebill | 应付单标识 | pk_payablebill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 应付财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 3 | pk_fiorg_v | 废弃财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_org | 应付财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | isreded | 是否红冲过 | isreded | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | outbusitype | 外系统业务类型 | outbusitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 11 | officialprintuser | 正式打印人 | officialprintuser | varchar(20) |  | 用户 (user) |
| 12 | officialprintdate | 正式打印日期 | officialprintdate | char(19) |  | 日期 (UFDate) |
| 13 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 14 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) | √ | 字符串 (String) |
| 15 | pk_tradetype | 应付类型code | pk_tradetype | varchar(20) | √ | 字符串 (String) |
| 16 | pk_tradetypeid | 应付类型 | pk_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | billclass | 单据大类 | billclass | varchar(2) | √ | 单据大类 (billclass) | yf | ys=应收单; |