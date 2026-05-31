# |<<

**客户收款单行 (ar_gatheritem / nc.vo.arap.gathering.GatheringBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheritem | 收款单行标识 | pk_gatheritem | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 收款财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 8 | pk_org_v | 收款财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_fiorg_v | 财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | so_org | 业务组织 | so_org | varchar(20) |  | 组织 (org) |
| 11 | so_org_v | 业务组织版本 | so_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | so_transtype | 销售渠道类型 | so_transtype | varchar(20) |  | 渠道类型 (channeltype) |
| 13 | so_ordertype | 销售订单类型 | so_ordertype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 14 | so_psndoc | 业务人员 | so_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | so_deptid | 业务部门 | so_deptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | so_deptid_v | 业务部门版本 | so_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | prepay | 收款性质 | prepay | int |  | 收款性质 (prepay) |  | 0=应收款; |