# |<<

**抵销模板对应方案 (ufoc_dxrela_scheme / nc.vo.hbbb.dxrelation.DXRelaSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5874.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme | 方案主键 | pk_scheme | char(20) | √ | 主键 (UFID) |
| 2 | code | 方案编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 5 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifier | 修改者 | modifier | varchar(20) |  | 用户 (user) |
| 7 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |