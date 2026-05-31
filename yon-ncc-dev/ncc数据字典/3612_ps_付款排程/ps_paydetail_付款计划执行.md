# |<<

**付款计划执行 (ps_paydetail / nc.vo.ps.paybill.PayBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paydetail | 主键 | pk_paydetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_plandetail | 计划明细主键 | pk_plandetail | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 付款组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 付款组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 执行明细编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 8 | pk_billtype | 交易类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 9 | executedate | 计划执行日期 | executedate | char(19) |  | 日期 (UFDate) |
| 10 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 11 | paytype | 付款方式 | paytype | int |  | 付款方式 (paytype) |  | 1=付款财务组织支付; |