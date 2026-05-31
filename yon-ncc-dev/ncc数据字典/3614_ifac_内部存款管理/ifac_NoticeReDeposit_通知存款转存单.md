# |<<

**通知存款转存单 (ifac_NoticeReDeposit / nc.vo.ifac.noticeredeposit.NoticeReDepositVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticeredeposit | 主键 | pk_noticeredeposit | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 3 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 7 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 8 | depositcode | 存单号 | depositcode | varchar(20) |  | 通知存单 (NoticeDeposit) |
| 9 | pk_depositorg | 存款单位 | pk_depositorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | redeposittype | 转存类型 | redeposittype | varchar(50) |  | 转存类型 (RedepositTypeEnum) |  | AMOUNT=到期本金转存; |