# |<<

**费用管理期初 (er_init / nc.vo.erm.erminit.ErminitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1901.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_init | 主键 | pk_init | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | close_status | 关闭状态 | close_status | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | closeman | 关闭人 | closeman | varchar(20) |  | 用户 (user) |
| 5 | closedate | 关闭日期 | closedate | char(19) |  | 日期 (UFDate) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | uncloseman | 反关闭人 | uncloseman | varchar(20) |  | 用户 (user) |
| 8 | unclosedate | 反关闭日期 | unclosedate | char(19) |  | 日期 (UFDate) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |