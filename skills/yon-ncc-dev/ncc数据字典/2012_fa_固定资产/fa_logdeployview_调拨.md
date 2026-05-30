# |<<

**调拨 (fa_logdeployview / nc.vo.fa.asset.LogdeployViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2040.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deploy | 主键 | pk_deploy | char(20) | √ | 主键 (UFID) |
| 2 | pk_bill | 调出单主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 3 | pk_org_out | 调出组织 | pk_org_out | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | bill_code_out | 调出单号 | bill_code_out | varchar(40) |  | 字符串 (String) |
| 5 | pk_card_out | 调出卡片 | pk_card_out | varchar(20) |  | 资产卡片 (asset) |
| 6 | out_date | 调出日期 | out_date | char(19) |  | 日期 (UFDate) |
| 7 | pk_bill_in | 调入单主键 | pk_bill_in | varchar(20) |  | 字符串 (String) |
| 8 | pk_org_in | 调入组织 | pk_org_in | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | bill_code_in | 调入单号 | bill_code_in | varchar(40) |  | 字符串 (String) |
| 10 | pk_card_in | 调入卡片 | pk_card_in | varchar(20) |  | 资产卡片 (asset) |
| 11 | in_date | 调入日期 | in_date | char(19) |  | 日期 (UFDate) |
| 12 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 13 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |