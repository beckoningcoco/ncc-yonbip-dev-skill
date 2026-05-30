# |<<

**费用结算单主实体 (to_feesettle / nc.vo.to.m4552.entity.FeeSettleBillHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 费用结算单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | btoiaflag | 是否已传成本 | btoiaflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 9 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |