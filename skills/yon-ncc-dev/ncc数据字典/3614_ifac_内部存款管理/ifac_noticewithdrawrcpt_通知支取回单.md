# |<<

**通知支取回单 (ifac_noticewithdrawrcpt / nc.vo.ifac.noticewithdrawrcpt.NoticeWithdrawRcptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3111.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticewithdrawrcpt | 单据ID | pk_noticewithdrawrcpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vbillcode | 回单编号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 8 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 10 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 11 | billstate | 单据状态 | billstate | varchar(50) |  | 单据状态 (enum) |  | N=未记账; |