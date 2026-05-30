# |<<

**支付指令 (ebank_paylog / nc.vo.obm.ebankpaylog.EBankPayLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1774.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_paylog | 记录PK | pk_ebank_paylog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织所属版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | srcsystem | 来源系统 | srcsystem | varchar(30) |  | 字符串 (String) |
| 6 | srcpkid | 来来源单据PK | srcpkid | varchar(30) |  | 字符串 (String) |
| 7 | yurref | 支付参考号 | yurref | varchar(30) |  | 字符串 (String) |
| 8 | headpackageid | 指令主包流水号 | headpackageid | varchar(30) |  | 字符串 (String) |
| 9 | pk_ebank_paylog_h | 记录主信息PK | pk_ebank_paylog_h | varchar(30) |  | 字符串 (String) |
| 10 | state | 受理状态 | state | int |  | 记录受理状态 (stateEnum) |  | -1=未补录; |