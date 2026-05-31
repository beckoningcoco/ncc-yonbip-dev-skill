# |<<

**自动上收日志 (sf_deliverylog_h / nc.vo.sf.deliverylog.DeliveryLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5263.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliverylog_h | 上收日志标识 | pk_deliverylog_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pd_delivery_h | 上收单主表主键 | pd_delivery_h | varchar(50) |  | 字符串 (String) |
| 5 | pk_deliveryrule_h | 上收规则主表主键 | pk_deliveryrule_h | varchar(50) |  | 字符串 (String) |
| 6 | rulecode | 上收规则编码 | rulecode | varchar(50) |  | 字符串 (String) |
| 7 | rulename | 上收规则名称 | rulename | varchar(50) |  | 字符串 (String) |
| 8 | pk_bankacc_r | 上收帐号 | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | bankname_r | 上收银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 12 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | deliverybillno | 上收单号 | deliverybillno | varchar(50) |  | 字符串 (String) |
| 14 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vuserdef4 | 自定义项4 | vuserdef4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vuserdef5 | 自定义项5 | vuserdef5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |