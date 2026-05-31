# |<<

**供应商付款单行 (ap_payitem / nc.vo.arap.pay.PayBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payitem | 付款单行标识 | pk_payitem | char(20) | √ | 主键 (UFID) |
| 2 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org | 付款财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pu_org | 业务组织 | pu_org | varchar(20) |  | 组织 (org) |
| 7 | pu_org_v | 业务组织版本主键 | pu_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | sett_org_v | 结算财务组织版本主键 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_pcorg_v | 利润中心版本主键 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 10 | pk_org_v | 付款财务组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 11 | pk_fiorg_v | 财务组织版本主键 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | pu_psndoc | 业务人员 | pu_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | pu_deptid | 业务部门 | pu_deptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | pu_deptid_v | 业务部门版本 | pu_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | prepay | 付款性质 | prepay | int |  | 付款性质 (prepay) |  | 0=应付款; |