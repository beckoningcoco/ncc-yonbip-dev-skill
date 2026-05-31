# |<<

**结算路径主表 (to_settlepath / nc.vo.to.settlepath.entity.SettlePathHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5815.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettlepathid | 主表主键 | csettlepathid | char(20) | √ | 主键 (UFID) |
| 2 | vpathcode | 结算路径编码 | vpathcode | varchar(40) |  | 字符串 (String) |
| 3 | vpathname | 结算路径名称 | vpathname | varchar(30) |  | 多语文本 (MultiLangText) |
| 4 | coutfinanceorgid | 调出财务组织 | coutfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | cinfinanceorgid | 调入财务组织 | cinfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | bdefaultflag | 是否默认 | bdefaultflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bdiscountflag | 按结算价乘折扣率得价格 | bdiscountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | iversion | 版本号 | iversion | int |  | 整数 (Integer) |
| 9 | creviserid | 修订人 | creviserid | varchar(20) |  | 用户 (user) |
| 10 | trevisetime | 修订时间 | trevisetime | varchar(19) |  | 日期时间 (UFDateTime) |
| 11 | corigbillid | 原始表头ID | corigbillid | varchar(20) |  | 主键 (UFID) |
| 12 | blatestflag | 是否最新版本 | blatestflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |