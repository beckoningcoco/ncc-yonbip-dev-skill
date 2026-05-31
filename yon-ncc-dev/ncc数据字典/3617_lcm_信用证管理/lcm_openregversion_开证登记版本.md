# |<<

**开证登记版本 (lcm_openregversion / nc.vo.lcm.open.regversion.OpenRegVeisionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3573.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openmodify | 开证修改主键 | pk_openmodify | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | lcstatus | 信用证状态 | lcstatus | int |  | 信用证状态 (LCStatus) |  | 1=在登记; |