# |<<

**结算清单主实体 (to_settlelist / nc.vo.to.m5f.entity.SettleListHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5810.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 主表主键 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 结算财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 结算财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | ctargetfiorgid | 结算目的财务组织最新版本 | ctargetfiorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | ctargetfiorgvid | 结算目的财务组织 | ctargetfiorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillStatus) |  | 1=自由态; |