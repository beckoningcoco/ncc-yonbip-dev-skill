# |<<

**结算清单金税发票主实体 (to_goldentax / nc.vo.to.m4551.entity.GoldenTaxHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5796.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 结算清单金税发票 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | csettlelistid | 结算清单 | csettlelistid | varchar(20) |  | 结算清单主实体 (to_settlelist) |
| 5 | vsettlelistcode | 结算清单单据号 | vsettlelistcode | varchar(40) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 销售财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_org_v | 销售财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | cupcorpid | 销售公司 | cupcorpid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 10 | cupcorpvid | 销售公司版本 | cupcorpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cdownfinanceorgid | 采购财务组织 | cdownfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | cdownfinanceorgvid | 采购财务组织版本 | cdownfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 14 | cdowncorpid | 采购公司 | cdowncorpid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 15 | cdowncorpvid | 采购公司版本 | cdowncorpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 16 | bgoldentaxflag | 是否已传金税 | bgoldentaxflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | tgoldentaxtime | 传金税时间 | tgoldentaxtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | vgoldentaxcode | 金税税票号 | vgoldentaxcode | varchar(50) |  | 字符串 (String) |
| 19 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 20 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 21 | saga_btxid | 事务分支id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 22 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) |