# |<<

**通知支取申请单 (ifac_noticeWithdrawApply / nc.vo.ifac.noticewithdrawapply.NoticeWithdrawApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3110.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nwithdrawapply | 单据ID | pk_nwithdrawapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | applydate | 申请日期 | applydate | char(19) |  | 日期(结束) (UFDateEnd) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 7 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 10 | pk_noticeacc | 通知账户 | pk_noticeacc | varchar(20) |  | 内部账户 (bd_accid) |
| 11 | pk_depositreceipt | 通知存单 | pk_depositreceipt | varchar(20) |  | 通知存单 (NoticeDeposit) |
| 12 | depositcode | 存单号 | depositcode | varchar(101) |  | 字符串 (String) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | depositdate | 存款日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | depostbalmnt | 存单余额 | depostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_varieties | 通知业务品种 | pk_varieties | varchar(20) |  | 通知品种设置 (NoticeVarietiesVO) |
| 17 | noticeperiod | 期限(天) | noticeperiod | int |  | 整数 (Integer) |
| 18 | pk_depostrate | 通知利率 | pk_depostrate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 19 | pk_aiacrate | 活期利率 | pk_aiacrate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 20 | redeposittype | 转存类型 | redeposittype | varchar(50) |  | 转存类型 (RedepositTypeEnum) |  | NONE=不转存; |