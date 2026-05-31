# |<<

**股权投资多方案 (org_stockinvestscheme / nc.vo.vorg.StockInvestSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4177.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockinvestscheme | 股权投资多方案主键 | pk_stockinvestscheme | varchar(50) | √ | 字符串 (String) |
| 2 | serialnumber | 序号 | serialnumber | int |  | 整数 (Integer) |
| 3 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |