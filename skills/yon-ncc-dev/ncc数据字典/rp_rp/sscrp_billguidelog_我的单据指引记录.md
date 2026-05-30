# |<<

**我的单据指引记录 (sscrp_billguidelog / nc.vo.sscrp.rpbill.BillGuideLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5608.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billguidelog | 主键 | pk_billguidelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |
| 3 | isfirst | 首次标识 | isfirst | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 5 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 7 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |