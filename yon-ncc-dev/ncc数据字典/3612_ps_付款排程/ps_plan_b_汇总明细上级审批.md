# |<<

**汇总明细上级审批 (ps_plan_b / nc.vo.ps.plan.PlanSVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan_b | 主键 | pk_plan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 付款组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 付款组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | billname | 单据描述 | billname | varchar(181) |  | 字符串 (String) |
| 7 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 8 | pk_billtype | 交易类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | pk_planperiod | 计划付款期间 | pk_planperiod | varchar(20) |  | 计划期间 (period) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | vbillstatus | 单据状态 | vbillstatus | int |  | 计划表状态 (planbillstatus) |  | 1=已汇总; |