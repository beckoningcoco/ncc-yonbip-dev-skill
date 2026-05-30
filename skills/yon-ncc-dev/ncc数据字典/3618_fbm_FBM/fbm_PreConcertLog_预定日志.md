# |<<

**预定日志 (fbm_PreConcertLog / nc.vo.fbm.preconcert.PreConcertLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2143.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_preconcertlog | 主键 | pk_preconcertlog | char(20) | √ | 主键 (UFID) |
| 2 | preconcertdate | 预定日期 | preconcertdate | char(19) |  | 日期 (UFDate) |
| 3 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 4 | preconcertuser | 预定人 | preconcertuser | varchar(20) |  | 用户 (user) |
| 5 | preconcertsystem | 预定系统 | preconcertsystem | varchar(50) |  | 字符串 (String) |
| 6 | voperator | 操作人 | voperator | varchar(20) |  | 用户 (user) |
| 7 | operatetype | 操作类型 | operatetype | varchar(50) |  | 字符串 (String) |
| 8 | fbmbillno | 私票据编号 | fbmbillno | varchar(100) |  | 字符串 (String) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |