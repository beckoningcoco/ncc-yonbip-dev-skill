# |<<

**自动下拨日志 (sf_allocatelog_h / nc.vo.sf.allocatelog.AllocateLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocatelog_h | 下拨日志标识 | pk_allocatelog_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_allocate_h | 下拨单主表主键 | pk_allocate_h | varchar(50) |  | 字符串 (String) |
| 5 | pk_allocaterule_h | 下拨规则主表主键 | pk_allocaterule_h | varchar(50) |  | 字符串 (String) |
| 6 | rulecode | 下拨规则编码 | rulecode | varchar(50) |  | 字符串 (String) |
| 7 | rulename | 下拨规则名称 | rulename | varchar(50) |  | 字符串 (String) |
| 8 | pk_bankacc_p | 下拨账号 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | accbalance_p | 下拨账户余额 | accbalance_p | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | bankname_p | 下拨银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 11 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 12 | allocatebillno | 下拨单单号 | allocatebillno | varchar(50) |  | 字符串 (String) |
| 13 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 14 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vuserdef4 | 自定义项4 | vuserdef4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vuserdef5 | 自定义项5 | vuserdef5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |