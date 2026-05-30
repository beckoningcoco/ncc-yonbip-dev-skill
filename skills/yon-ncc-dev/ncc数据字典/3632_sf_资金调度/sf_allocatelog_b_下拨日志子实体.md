# |<<

**下拨日志子实体 (sf_allocatelog_b / nc.vo.sf.allocatelog.AllocateLogBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5253.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocatelog_b | 下拨日志子实体标识 | pk_allocatelog_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 收款单位 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_financeorg_v | 收款单位版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_bankacc_r | 收款账号 | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | accbalance_r | 收款账户余额 | accbalance_r | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | bankname_r | 收款银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 7 | remainmoney | 备用金限额 | remainmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | allocaterate | 下拨比率 | allocaterate | decimal(4, 2) |  | 数值 (UFDouble) |
| 9 | leastamount | 最小下拨金额 | leastamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | base | 取整基数 | base | int |  | 整数 (Integer) |
| 11 | allocatedate | 下拨日期 | allocatedate | char(19) |  | 日期 (UFDate) |
| 12 | allocatetime | 下拨时间 | allocatetime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | amount | 下拨金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | allocateresult | 下拨日志 | allocateresult | image |  | BLOB (BLOB) |
| 15 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 16 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 18 | pk_allocate_b | 下拨单表体PK | pk_allocate_b | varchar(20) |  | 字符串 (String) |
| 19 | pk_allocaterule_b | 下拨规则表体PK | pk_allocaterule_b | varchar(20) |  | 字符串 (String) |
| 20 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vuserdef4 | 自定义项4 | vuserdef4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vuserdef5 | 自定义项5 | vuserdef5 | varchar(101) |  | 自定义项 (Custom) |