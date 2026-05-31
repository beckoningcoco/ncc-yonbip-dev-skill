# |<<

**计划明细 (ps_plandetail / nc.vo.ps.plan.PlandetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plandetail | 主键 | pk_plandetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 付款组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 付款组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_acceptorg | 付款申请组织 | pk_acceptorg | varchar(20) |  | 组织 (org) |
| 5 | pk_acceptorg_v | 付款申请组织版本 | pk_acceptorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | vbillno | 计划编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | billname | 单据描述 | billname | varchar(181) |  | 字符串 (String) |
| 9 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 11 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 客商 (custsupplier) |
| 12 | pk_planitem | 资金计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 13 | applydate | 申请付款日期 | applydate | char(19) |  | 日期(结束) (UFDateEnd) |
| 14 | pk_applyperiod | 申请付款期间 | pk_applyperiod | varchar(20) |  | 计划期间 (period) |
| 15 | pk_fundtype | 货币形态 | pk_fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 16 | pk_planperiod | 计划付款期间 | pk_planperiod | varchar(20) |  | 计划期间 (period) |
| 17 | isprepay | 预付 | isprepay | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | isqualitymy | 质保金 | isqualitymy | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 20 | paytype | 付款方式 | paytype | int |  | 付款方式 (paytype) |  | 1=付款财务组织支付; |