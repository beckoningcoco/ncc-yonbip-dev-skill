# |<<

**通知支取单 (ifac_noticeWithdraw / nc.vo.ifac.noticewithdraw.NoticeWithdrawVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticewithdraw | 单据ID | pk_noticewithdraw | char(20) | √ | 主键 (UFID) |
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
| 12 | pk_noticeacc | 通知账户 | pk_noticeacc | varchar(20) |  | 内部账户 (bd_accid) |
| 13 | pk_depositreceipt | 通知存单 | pk_depositreceipt | varchar(20) |  | 通知存单 (NoticeDeposit) |
| 14 | depositcode | 存单号 | depositcode | varchar(101) |  | 字符串 (String) |
| 15 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 16 | depositdate | 存款日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | pk_varieties | 通知业务品种 | pk_varieties | varchar(20) |  | 通知品种设置 (NoticeVarietiesVO) |
| 18 | depostbalmnt | 存单余额 | depostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | noticeperiod | 期限(天) | noticeperiod | int |  | 整数 (Integer) |
| 20 | pk_depostrate | 通知利率 | pk_depostrate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 21 | pk_aiacrate | 活期利率 | pk_aiacrate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 22 | redeposittype | 转存类型 | redeposittype | varchar(50) |  | 转存类型 (RedepositTypeEnum) |  | NONE=不转存; |