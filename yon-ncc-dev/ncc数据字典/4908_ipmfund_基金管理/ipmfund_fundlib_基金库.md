# |<<

**基金库 (ipmfund_fundlib / nc.vo.ipmfund.ipmfundlib.IPMFundLibVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3307.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundlib | 基金库主键 | pk_fundlib | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 基金编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | code | 基金编码2 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 基金名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | investtooutband | 对外投资标的 | investtooutband | varchar(50) |  | 标的公司 (OutBandEnum) |  | 1=是; |