# |<<

**账户收付限额设置 (ebank_quota / nc.vo.obm.ebankquotaconfig.EbankQuotaConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1781.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 主键 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_banktype | 银行类型 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 6 | accountcode | 银行账号 | accountcode | varchar(50) |  | 字符串 (String) |
| 7 | bank | 银行代码 | bank | varchar(50) |  | 字符串 (String) |
| 8 | accountname | 单位名称(由银行账号带出) | accountname | varchar(100) |  | 字符串 (String) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | trsamt | 限额 | trsamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | userid | 操作员 | userid | varchar(20) |  | 用户 (user) |
| 12 | func | 限额类型 | func | varchar(10) |  | 支付类型(对公/对私) (FileFuncEnum) |  | zf=对公支付; |