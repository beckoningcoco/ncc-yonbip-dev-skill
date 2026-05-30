# |<<

**定期支取申请单 (ifac_fixedDateWithdrawApply / nc.vo.ifac.fixeddatewithdrawapply.FixedDateWithdrawApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3086.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fwithdrawapply | 单据ID | pk_fwithdrawapply | varchar(20) | √ | 字符串 (String) |
| 2 | pk_org | 所属财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 6 | applydate | 申请日期 | applydate | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 8 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_depositacc | 定期账户 | pk_depositacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 10 | pk_depositreceipt | 定期存单 | pk_depositreceipt | varchar(20) |  | 定期存单 (DepositReceipt) |
| 11 | depositcode | 存单号 | depositcode | varchar(101) |  | 字符串 (String) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | depositdate | 存款日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 14 | pk_varieties | 定期业务品种 | pk_varieties | varchar(20) |  | 定期品种设置 (DepositVarietiesVO) |
| 15 | intervalunit | 期间单位 | intervalunit | varchar(50) |  | 期间单位 (periodunit) |  | Y=年; |