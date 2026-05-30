# |<<

**付款计划与下拨单关系表 (ps_plantofund / nc.vo.ps.plantofund.PlantoFundVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plantofund | 主键 | pk_plantofund | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 下拨组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 付款组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_fundorg | 被下拨组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_fundorg_v | 被下拨组织版本主键 | pk_fundorg_v | varchar(20) |  | 字符串 (String) |
| 7 | pk_plan | 计划主键 | pk_plan | varchar(20) |  | 主键 (UFID) |
| 8 | money | 此次下拨金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | olcmoney | 此次下拨本币（组织） | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcmoney | 此次下拨本币（集团） | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | gllcmoney | 此次下拨本币（全局） | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_fund | 生成下拨单主键 | pk_fund | varchar(20) |  | 主键 (UFID) |
| 13 | pk_fund_b | 生成下拨单表体主键 | pk_fund_b | varchar(20) |  | 主键 (UFID) |
| 14 | action | 业务动作类型 | action | varchar(50) |  | 生成下拨单类型 (genetype) |  | GATHER=合并; |