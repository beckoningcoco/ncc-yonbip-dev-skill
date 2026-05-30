# |<<

**担保物权 (gpmc_guaproperty / nc.vo.gpmc.gpm.guaproperty.GuaPropertyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2532.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guaproperty | 主键 | pk_guaproperty | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillno | 物权编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | propertyname | 物权名称 | propertyname | varchar(200) |  | 字符串 (String) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 8 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (BillStatusEnum) |  | -1=FREE; |