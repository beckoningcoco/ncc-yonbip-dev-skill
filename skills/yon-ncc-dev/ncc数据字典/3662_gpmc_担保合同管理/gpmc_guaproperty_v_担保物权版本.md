# |<<

**担保物权版本 (gpmc_guaproperty_v / nc.vo.gpmc.gpm.guaproperty.GuapropertyVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2533.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本pk | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_guaproperty | 主键 | pk_guaproperty | varchar(20) | √ | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 物权编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | propertyname | 物权名称 | propertyname | varchar(200) |  | 字符串 (String) |
| 8 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 9 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (BillStatusEnum) |  | -1=FREE; |