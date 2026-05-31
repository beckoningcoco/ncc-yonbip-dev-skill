# |<<

**预订记录 (fbm_booklog / nc.vo.fbm.booklog.BookLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_booklog | 主键 | pk_booklog | char(20) | √ | 主键 (UFID) |
| 2 | bookuser | 操作人 | bookuser | varchar(20) |  | 用户 (user) |
| 3 | bookdate | 操作日期 | bookdate | char(19) |  | 日期 (UFDate) |
| 4 | fbmbillno | 票据编号 | fbmbillno | varchar(100) |  | 字符串 (String) |
| 5 | pk_register | 票据登记 | pk_register | varchar(20) |  | 字符串 (String) |
| 6 | booksystem | 预订系统 | booksystem | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | bookactiontype | 动作类型 | bookactiontype | varchar(50) |  | 动作类型 (type) |  | book=预订; |