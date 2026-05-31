# |<<

**银行定期通知利息管理 (fac_centerinterestmanage / nc.vo.fac.centerinterestmanage.CenterinterestmanageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2077.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | depositcode | 存单号 | depositcode | varchar(20) |  | 银行定期存单 (depositreceipt) |
| 5 | depositdate | 存入日期 | depositdate | char(19) |  | 日期 (UFDate) |
| 6 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 7 | redeposittype | 转存类型 | redeposittype | varchar(50) |  | 转存类型 (RedepositTypeEnum) |  | AMOUNT=到期本金转存; |