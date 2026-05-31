# |<<

**定期支取单 (ifac_fixedDateWithdraw / nc.vo.ifac.fixeddatewithdraw.FixedDateWithdrawVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3085.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixeddatewithdraw | 单据ID | pk_fixeddatewithdraw | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 8 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 10 | pk_depositorg | 存款单位 | pk_depositorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | depositorgname | 存款单位名称 | depositorgname | varchar(200) |  | 字符串 (String) |
| 12 | pk_depositacc | 定期账户 | pk_depositacc | varchar(20) |  | 内部账户 (bd_accid) |
| 13 | pk_depositreceipt | 定期存单 | pk_depositreceipt | varchar(20) |  | 定期存单 (DepositReceipt) |
| 14 | depositcode | 存单号 | depositcode | varchar(101) |  | 字符串 (String) |
| 15 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 16 | depositdate | 存款日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | pk_varieties | 定期业务品种 | pk_varieties | varchar(20) |  | 定期品种设置 (DepositVarietiesVO) |
| 18 | intervalunit | 期间单位 | intervalunit | varchar(50) |  | 期间单位 (periodunit) |  | Y=年; |