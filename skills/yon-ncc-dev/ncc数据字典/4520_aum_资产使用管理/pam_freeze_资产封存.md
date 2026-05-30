# |<<

**资产封存 (pam_freeze / nc.vo.aum.freeze.FreezeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freeze | 表头主键 | pk_freeze | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_recorder | 经办人 | pk_recorder | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | bill_date | 封存日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 7 | bill_code | 封存单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 8 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |