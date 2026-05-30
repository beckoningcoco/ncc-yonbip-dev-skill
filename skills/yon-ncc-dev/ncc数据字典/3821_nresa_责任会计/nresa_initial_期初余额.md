# |<<

**期初余额 (nresa_initial / nc.vo.nresa.initset.InitialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3877.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initial | 主键 | pk_initial | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_manageorg | 管理组织 | pk_manageorg | varchar(20) |  | 组织 (org) |
| 4 | pk_book | 责任核算账簿 | pk_book | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 5 | pk_profitorg | 利润中心 | pk_profitorg | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 6 | accperiod | 会计期间 | accperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 7 | fiyear | 会计年度 | fiyear | varchar(20) |  | 年度信息 (workcalendaryear) |
| 8 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 9 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 10 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 11 | isbuild | 是否建账 | isbuild | char(1) |  | 布尔类型 (UFBoolean) | N |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |