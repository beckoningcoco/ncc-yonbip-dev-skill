# |<<

**客户应收单 (ar_recbill / nc.vo.arap.receivable.ReceivableBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recbill | 应收单标识 | pk_recbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 应收财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_fiorg | 废弃财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_v | 应收财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_fiorg_v | 废弃财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 9 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | isreded | 是否红冲过 | isreded | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | outbusitype | 外系统业务类型 | outbusitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 12 | officialprintuser | 正式打印人 | officialprintuser | varchar(20) |  | 用户 (user) |
| 13 | officialprintdate | 正式打印日期 | officialprintdate | char(19) |  | 日期 (UFDate) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 15 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) | √ | 字符串 (String) |
| 16 | custdelegate | 代垫单位 | custdelegate | char(20) |  | 主键 (UFID) |
| 17 | pk_corp | 单位编码 | pk_corp | char(20) |  | 主键 (UFID) |
| 18 | pk_tradetype | 应收类型code | pk_tradetype | varchar(20) | √ | 字符串 (String) |
| 19 | pk_tradetypeid | 应收类型 | pk_tradetypeid | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 20 | billclass | 单据大类 | billclass | varchar(2) | √ | 单据大类 (billclass) | ys | ys=应收单; |