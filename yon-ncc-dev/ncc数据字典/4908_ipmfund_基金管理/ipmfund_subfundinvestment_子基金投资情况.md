# |<<

**子基金投资情况 (ipmfund_subfundinvestment / nc.vo.ipmfund.subfundinvestment.SubFundInvestmentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sunfundinvestment | 子基金投资情况主键 | pk_sunfundinvestment | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | fundlid_name | 基金名称 | fundlid_name | varchar(500) |  | 字符串 (String) |
| 8 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 9 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 12 | nexchangerate | 组织本位币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | dbilldate | 编制日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 16 | pk_psndoc | 编制人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 19 | investdate | 出资日期 | investdate | char(19) |  | 日期 (UFDate) |
| 20 | vmemo | 备注 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 21 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |